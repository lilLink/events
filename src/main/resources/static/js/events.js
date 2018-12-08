var events = [];

$(document).ready(function() {
    $.get("http://localhost:8080/allEvents", function(data, status){
        events = data;
        console.log(events);

        var newLi = document.createElement('li');
        var newsDesc = document.createElement('div');
        var newsCaption = document.createElement('h4');
        var news = document.querySelector('.news');

        newsDesc.className = "news__desc";
        newsCaption.className = "news__caption";

        newLi.innerHTML = events[0]["eventName"];
        newLi.className = "news__item";
        newLi.innerHTML = newsDesc;
        news.appendChild(newLi);
    });
});





