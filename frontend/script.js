document.getElementById('fetchPlayers').addEventListener('click', async () => {
    const response = await fetch('/api/players');
    const players = await response.json();
    const playerList = document.getElementById('playerList');
    playerList.innerHTML = players.map(player => `<div>${player.name}</div>`).join('');
});

document.getElementById('serverStatus').addEventListener('click', async () => {
    const response = await fetch('/api/server/status');
    const status = await response.text();
    const statusDiv = document.getElementById('status');
    statusDiv.innerHTML = `Server Status: ${status}`;
});

document.getElementById('updateConfig').addEventListener('click', async () => {
    const newConfig = { maxPlayers: 200 };
    await fetch('/api/server/update', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(newConfig),
    });
});
