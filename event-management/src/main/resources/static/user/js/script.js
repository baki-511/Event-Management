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

// Service Dropdown js
const dropdowns = document.querySelectorAll(".dropdown");

dropdowns.forEach((dropdown) => {
  const select = dropdown.querySelector(".select");
  const caret = dropdown.querySelector(".caret");
  const menu = dropdown.querySelector(".menu");
  const options = dropdown.querySelector(".menu li");
  const selected = dropdown.querySelector(".selected");

  select.addEventListener("click", () => {
    select.classList.toggle("select-clicked");
    caret.classList.toggle("caret-rotate");
    menu.classList.toggle("menu-open");
  });

  options.forEach((option) => {
    option.addEventListener("click", () => {
      selected.innertext = option.innerText;
      selected.classList.remove("select-clicked");
      caret.classList.remove("caret-rotate");
      menu.classList.remove("menu-open");

      options.forEach((option) => {
        option.classList.remove("active");
      });

      option.classList.add("active");
    });
  });
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
