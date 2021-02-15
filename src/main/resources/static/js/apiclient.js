var apiclient = (function(){
	var zelda = "http://localhost:36000";
    return {
        loadDataAnimals: function(callback) {
            var promise = $.get({
        		url: "/tenis"
            });
        	promise.then(function(data){
        		callback(null, JSON.parse(data));
        	}, function(error) {
        		callback(error, null);
        	});
		}, 
		addAnimal: function(jsonAnimal, callback) {
		
			var promise = $.post({
        		url: "/addtenis",
        		data: JSON.stringify(jsonAnimal)
            });
        	promise.then(function(data){
        		callback(null, JSON.parse(data));
        	}, function(error) {
        		callback(error, null);
			});			
		}
    }
})();