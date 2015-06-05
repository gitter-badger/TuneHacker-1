package com.quadcubedstudios.games.tunehacker.scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.quadcubedstudios.games.tunehacker.TuneHacker;

public class Splash implements Screen {
    private Texture logo;
    private SpriteBatch spriteBatch;
    private TuneHacker game;
    private BitmapFont orbitron;

    public Splash(TuneHacker game) {
        this.game = game;
    }

    @Override
    public void show() {
        logo = new Texture(Gdx.files.internal("images/QuadCubed.png"));
        spriteBatch = new SpriteBatch();
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/orbitron-light.otf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 32;
        parameter.characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ&.";
        orbitron = generator.generateFont(parameter);
        orbitron.setColor(Color.WHITE);
        generator.dispose();
    }

    @Override
    public void render(float delta) {
        handleInput();
        GL20 gl = Gdx.graphics.getGL20();
        gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
        spriteBatch.draw(logo, 320, 160);
        orbitron.draw(spriteBatch, "A game by Technohacker & RaghuAllTheTime", 50, 460);
        orbitron.draw(spriteBatch, "STUDIOS", 365, 180);
        orbitron.draw(spriteBatch, "LOADING...", 363, 40);
        spriteBatch.end();
    }

    private void handleInput() {
        if (Gdx.input.justTouched()) {
            //game.setScreen(new LevelOne(game));
        }
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
    }
}