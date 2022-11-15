$( document ).ready(function() {
	
	$('input').each(function() {
		var attr = $(this).attr('required');	
		
		if (typeof attr !== 'undefined' && attr !== false) {
			$(this).addClass('required');
		}
	});

	$('textarea').each(function() {
    		var attr = $(this).attr('required');

    		if (typeof attr !== 'undefined' && attr !== false) {
    			$(this).addClass('required');
    		}
    	});
	
	$('input[type=submit]').click(function(){
		
		$('.required').not('.druglist').each(function() {
			if($(this).val() == '') {
				$(this).addClass('has-danger');
				$(this).parent().parent().find('.error_message').css( "display", "inline-block" );
			}else{
				$(this).removeClass('has-danger');
				$(this).parent().parent().find('.error_message').css( "display", "none" );
			}
		});

	});

	$('input').not('.druglist').on('keydown', function () {
		if($(this).val() == '') {
           $(this).addClass('has-danger');
		   $(this).parent().parent().find('.error_message').css( "display", "inline-block" );
        }else{
			$(this).removeClass('has-danger');
			$(this).parent().parent().find('.error_message').css( "display", "none" );
		}
	});

	$('textarea').not('.druglist').on('keydown', function () {
    		if($(this).val() == '') {
               $(this).addClass('has-danger');
    		   $(this).parent().find('.error_message').css( "display", "inline-block" );
            }else{
    			$(this).removeClass('has-danger');
    			$(this).parent().find('.error_message').css( "display", "none" );
    		}
    	});



});