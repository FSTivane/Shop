    var slideIndex = 1;
    showSlides(slideIndex);

    function plusSlides(n) {
        showSlides(slideIndex += n);
    }

    function currentSlide(n) {
        showSlides(slideIndex = n);
    }

    function showSlides(n) {
        var i;
        var slides = document.getElementsByClassName("mySlides");
        var dots = document.getElementsByClassName("dot");

        if (n > slides.length) {
            slideIndex = 1;
        }
        if (n < 1) {
            slideIndex = slides.length;
        }
        for (i = 0; i < slides.length; i++) {
            slides[i].style.display = "none";
        }
        for (i = 0; i < dots.length; i++) {
            dots[i].className = dots[i].className.replace(" active", "");
        }
        slides[slideIndex - 1].style.display = "block";
        dots[slideIndex - 1].className += " active";
    }

const stars = document.querySelectorAll(".star");
const ratingValue = document.getElementById("rating-value");

stars.forEach((star) => {
    star.addEventListener("click", () => {
        const value = parseInt(star.getAttribute("data-value"));
        ratingValue.textContent = value;
        stars.forEach((s, index) => {
            if (index < value) {
                s.classList.add("active");
            } else {
                s.classList.remove("active");
            }
        });
    });
});

function mostrarTela(tela) {
    const telas = document.querySelectorAll('.tela');
    telas.forEach(function(t) {
        t.style.display = 'none';
    });

    const telaVisivel = document.getElementById(tela);
    if (telaVisivel) {
        telaVisivel.style.display = 'block';
    }
}

