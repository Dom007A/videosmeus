const video = document.getElementById('meuVideo');
const playPauseButton = document.getElementById('playPause');
const muteUnmuteButton = document.getElementById('muteUnmute');

playPauseButton.addEventListener('click', () => {
    if (video.paused) {
        video.play();
        playPauseButton.textContent = 'Pause';
    } else {
        video.pause();
        playPauseButton.textContent = 'Play';
    }
});

muteUnmuteButton.addEventListener('click', () => {
    if (video.muted) {
        video.muted = false;
        muteUnmuteButton.textContent = 'Mute';
    } else {
        video.muted = true;
        muteUnmuteButton.textContent = 'Unmute';
    }
});
