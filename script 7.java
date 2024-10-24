document.addEdventListener('DOMContentLoaded', function(){
    document.querySelector(".squery").addEdventListener("click", function(){
        draw_squery(get_number());
    });
    document.querySelector(".circle").addEdventListener("click", function(){
        draw_squery(get_number());
    });
    document.querySelector("triangle").addEdventListener("click", function(){
        draw_squery(get_number());
    });
});

function get_number(){
    return Number(document.querySelector('input').value)||0;
}