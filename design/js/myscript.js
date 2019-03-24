$(function () {
    $(".Tweet-actionButton").on("click", function () {
        $(this)
            .next(".dagashi_menu")
            .fadeIn();
    });

    $("#menu1 .umaibo").on("click", function () {

        var thisclick = $(".dagashi_menu .umaibo img");
        var rep = $("rep1");

        var timeLine = new TimelineMax();

        timeLine.to(thisclick, 0, {
            opacity: '1',

        })
            .to(thisclick, 0, {
                opacity: '0'
            })
            .to(thisclick, 0, {
                opacity: '0'

            })
            .to(rep, 0, {
                onComplete: compFunc
            });

        function compFunc() {
            jQuery('#rep1').css('display', 'block');
            jQuery('#menu1').css('display', 'none');
            $(thisclick).css('opacity', '1');
        };



    });


});