$(document).ready(function(){
	$("#zolty #main-menu ul").html('');
	$( "#content .section-cart" ).each(function(  ) {
		$("#zolty #main-menu ul").append('<li><a href="#" data-section="' + $( this ).attr("id") + '" title="' + $( this ).attr("data-title") + '">' + $( this ).attr("data-title") + '</a></li>');
	});
	$("#zolty #main-menu ul li").on("click", function(){
		var section = $(this).find("a").attr("data-section");
		$("#content .section-cart").hide();
		$("#content #" + section).show();
		console.log("#content #" + section);
		return false;
	});
});