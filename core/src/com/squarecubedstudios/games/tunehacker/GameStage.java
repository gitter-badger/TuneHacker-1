package com.squarecubedstudios.games.tunehacker;

import com.uwsoft.editor.renderer.Overlap2DStage;
import com.uwsoft.editor.renderer.resources.ResourceManager;

public class GameStage extends Overlap2DStage{

    private ResourceManager rm;

    public GameStage(ResourceManager rm){
        super();
        this.rm = rm;
        initSceneLoader(rm);
        sceneLoader.loadScene("MainScene");
        addActor(sceneLoader.getRoot());
    }
}
