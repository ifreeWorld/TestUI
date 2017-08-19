(function($){
	$.demo = function(arg){
		// 私有
		var main = function(){
			console.log(11);
		};
		// 公有
		this.hehe = "11";
	};
	
	
})(jQuery);
var demo = new $.demo();
