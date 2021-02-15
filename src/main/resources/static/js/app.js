var app = (function () {

    var tableConstructor = function(error, data) {
        if (error != null) {
            alert("Ocurrio un error al cargar los datos");
            return;
        }
        var stringTable = table(data);
        $("#idTable").html(stringTable);
    }

    var table = function(dataTable) {
		var tabla = "<center> <table class='table table-bordered table-dark' style = 'width:50%; text-align: center;'" +
						"<thead>" +
							"<tr>" +
								"<th scope='col'> Marca </th>" +
								"<th scope='col'> Nombre </th>" +
								"<th scope='col'> Numero </th>" +
							"</tr>" +
						"</thead>" +
                        "<tbody>";
            dataTable.forEach(function(animal) {
                tabla += "<tr>" +
                            "<td>" + animal.marca + "</td>" +
                            "<td>" + animal.nombre + "</td>" +
                            "<td>" + animal.numero + "</td>" +
                        "</tr>";
            });
        
        tabla += "</tbody> </table> </center>";
        return tabla;    
    }

    var createAnimal = function() {
        var marca = $("#idMarca").val();
        var nombre = $("#idNombre").val();
        var numero = $("#idNumero").val();
        console.log(numero);
        if (marca == "" || nombre == "" || numero == "") {
            alert("Todos los campos son obligatorios");
            return;
        }

        var jsonAnimal = {"animal": marca, "nombre": nombre, "edad": numero};
        console.log(jsonAnimal);
        console.log(JSON.stringify(jsonAnimal));
        flag = false;
        apiclient.addAnimal(jsonAnimal, showAll);
        if (flag == true) return;
        showAll(null, "");
    }

    var flag;
    var showAll = function(error, datos) {
        if(error != null){
            alert("Error, verifique que la entrada tiene el formato establecido.");
            flag = true;
            return;
        }
        apiclient.loadDataAnimals(tableConstructor);
        refresAll();
    }

    var refresAll = function() {
        $("#idMarca").val("");
        $("#idNombre").val("");
        $("#idNumero").val("");
    }


    return {
        loadTableAnimals: function() {
            apiclient.loadDataAnimals(tableConstructor);
        },
        addAnimal: function() {
            createAnimal();
        }
    }
})();