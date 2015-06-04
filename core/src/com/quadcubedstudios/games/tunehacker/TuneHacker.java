package com.quadcubedstudios.games.tunehacker;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.quadcubedstudios.games.tunehacker.scenes.SplashScreen;

public class TuneHacker extends Game {

	Screen currentScreen;
	OrthographicCamera camera;

	@Override
	public void create () {
		camera = new OrthographicCamera(800, 480);
		camera.update();
		currentScreen = new SplashScreen();
		setScreen(currentScreen);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}
}
