package com.quadcubedstudios.games.tunehacker.scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;

public class SplashScreen implements Screen {

    Texture studio;
    SpriteBatch batch;
    FreeTypeFontGenerator generator;
    BitmapFont silkscreen;

    @Override
    public void show() {
        studio = new Texture(Gdx.files.internal("images/QuadCubed.jpg"));
        batch = new SpriteBatch();
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 12;
        generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/silkscr.ttf"));
        silkscreen = generator.generateFont(parameter);
    }

    @Override
    public void render(float delta) {
        batch.begin();
        batch.draw(studio, (800 - 70), (480 - 70));
        silkscreen.draw(batch, "A game by Technohacker & RaghuAllTheTime", 10, 470);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
