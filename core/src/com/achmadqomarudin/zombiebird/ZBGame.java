package com.achmadqomarudin.zombiebird;

import com.achmadqomarudin.screens.SplashScreen;
import com.achmadqomarudin.zbhelpers.AssetLoader;
import com.badlogic.gdx.Game;

public class ZBGame extends Game {
	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}
