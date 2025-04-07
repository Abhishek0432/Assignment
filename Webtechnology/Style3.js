
const images = [
  "https://i.pinimg.com/736x/0c/6d/55/0c6d5577453cddbb2deff3ba8de9b015.jpg",
  "https://i.pinimg.com/236x/4a/dc/71/4adc71795a72fcc8ce2055ac9373c828.jpg",
  "https://i.pinimg.com/736x/b5/3f/8d/b53f8d842ddef855998227ec26bf15a7.jpg",
  "https://i.pinimg.com/736x/f6/b8/6a/f6b86a82540926ce94305dbe45f7f5aa.jpg"
];

let currentIndex = 0;

const sliderImage = document.getElementById("sliderImage");

function showImage(index) {
  sliderImage.src = images[index];
}

function nextImage() {
  currentIndex = (currentIndex + 1) % images.length;
  showImage(currentIndex);
}

function prevImage() {
  currentIndex = (currentIndex - 1 + images.length) % images.length;
  showImage(currentIndex);
}

showImage(currentIndex);
