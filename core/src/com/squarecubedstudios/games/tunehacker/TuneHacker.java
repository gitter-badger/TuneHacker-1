package com.squarecubedstudios.games.tunehacker;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.uwsoft.editor.renderer.resources.ResourceManager;

public class TuneHacker extends ApplicationAdapter {

	private GameStage stage;
	private ResourceManager rm;

	@Override
	public void create () {
		rm = new ResourceManager();
		rm.initAllResources();
		stage = new GameStage(rm);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act();
		stage.draw();
	}
}
