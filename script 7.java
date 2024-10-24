document.addEventListener('DOMContentLoaded', function () {
    document.querySelector(".square").addEventListener("click", function () {
        draw_square(get_number());
    });
    document.querySelector(".triangle").addEventListener("click", function () {
        draw_triangle(get_number());
    });
    document.querySelector(".circle").addEventListener("click", function () {
        draw_circle(get_number());
    });
});

function get_number() {
    return Number(document.querySelector('input').value) || 0;
}

function draw_square(number) {
    const drawField = document.querySelector('.draw-field');

    for (let i = 0; i < number; i++) {
        const square = document.createElement('div');
        square.classList.add('square');

        const size = Math.random() * (300 - 50) ; // Размер от 50 до 300
        const x = Math.random() * (1800 - size);
        const y = (Math.random() * (800 - size));

        square.style.position = 'absolute';
        square.style.left = x + 'px';
        square.style.top = y + 'px';
        square.style.width = size + 'px';
        square.style.height = size + 'px';
        square.style.backgroundColor = '#FF1A1A';
        let isFirstClick = true; // Флаг для отслеживания первого клика

        square.addEventListener('click', function () {
            if (isFirstClick) {
                square.style.backgroundColor = '#FFFF1A';
                isFirstClick = false;
            } else {
                square.remove();
            }
        });

        
    }
}

