let loginBtn = document.querySelector(".login-btn");
let dropLogin = document.querySelector(".drop-login");
let header = document.querySelector("header");

let menu = document.querySelector(".menu-icon");
let navbar = document.querySelector(".navbar");

window.addEventListener("scroll", () => {
  header.classList.toggle("shadow", window.scrollY > 0);
});

window.onscroll = () => {
  menu.classList.remove("move");
  navbar.classList.remove("open-menu");
  // dropLogin.classList.remove("drop-login-open");
};

// loginBtn.addEventListener("click", () => {
//   dropLogin.classList.toggle("drop-login-open");
// });

menu.addEventListener("click", () => {
  menu.classList.toggle("move");
  navbar.classList.toggle("open-menu");
});



// navigation: {
//   nextEl: ".swiper-button-next",
//   prevEl: ".swiper-button-prev",
// },

/* Controller Swiper  */
var swiper = new Swiper(".control-images", {
  spaceBetween: 30,
  centeredSlides: true,
  autoplay: {
    delay: 7500,
    disableOnInteraction: false,
  },
  pagination: {
    el: ".swiper-pagination",
    clickable: true,
  },
  navigation: {
    nextEl: ".swiper-button-next",
    prevEl: ".swiper-button-prev",
  },
});

// $(document).ready(function(){
//   // Change the body background color to light blue
//   $('body').css('background-color', 'red');

// });
