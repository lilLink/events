//  MODALS LOGIC
var modalClose = document.querySelector('.modal__close');
var eventReg = document.querySelector('.news__reg-btn'),
eventModal = document.querySelector('.modal-news-reg');


function getModal(modal) {
    modal.style.display = "flex";
};

eventReg.addEventListener('click', function() {
    getModal(eventModal);
});

modalClose.addEventListener('click', function() {
    eventModal.style.display = "none";
});

window.onclick = function (event) {
    if (event.target == eventModal) {
        eventModal.style.display = "none";
    }
}


// FORMS LOGIC

var newsComment = document.querySelector('.news__comment-item'),
newsBtn= document.querySelector('.news__comment-btn');

// newsComment.mouseeneter = function() {
//     newsComment.style.height = "100px";
// }   

// newsComment.addEventListener('mouseenter', function() {
//     newsComment.style.height = "100px";
// });

// newsComment.addEventListener('mouseleave', function() {
//     newsComment.style.height = "30px";
// });

