package com.quadcubedstudios.games.tunehacker;

import com.badlogic.gdx.Game;
import com.quadcubedstudios.games.tunehacker.scenes.Splash;

public class TuneHacker extends Game {
	public static int WIDTH;
	public static int HEIGHT;

	@Override
	public void create() {
		WIDTH = 800;
		HEIGHT = 480;
		setScreen(new Splash(this));
	}
}
