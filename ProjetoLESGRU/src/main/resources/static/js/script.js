const path = window.location.pathname;
const navLinks = document.querySelectorAll('.nav-link');

navLinks.forEach(link => {
  // Remove a classe 'active' de todos os links
  link.classList.remove('active');

  // Verifica se o href do link está contido no caminho atual
  if (path.includes(link.getAttribute('href'))) {
    link.classList.add('active');
  }
});