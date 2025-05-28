// Placeholder for future dynamic behaviors
console.log("Page loaded.");
let currentIndex = 0;
function slide(direction) {
    const slider = document.querySelector('.slider');
    const slides = slider.children.length;
    const slideWidth = 150; // 各スライドの幅（設定した幅に基づく）

    // 現在のインデックスを更新する
    if (direction === 'next') {
        currentIndex = (currentIndex + 1) % slides; // 次のスライドに回る
    } else {
        currentIndex = (currentIndex - 1 + slides) % slides; // 前のスライドに回る
    }

    // スライド位置を設定
    slider.style.transform = `translateX(-${currentIndex * slideWidth}px)`;
}

// イベントリスナーを追加
document.querySelector('.slider-button.left').addEventListener('click', function() {
    slide('prev');
});

document.querySelector('.slider-button.right').addEventListener('click', function() {
    slide('next');
});


