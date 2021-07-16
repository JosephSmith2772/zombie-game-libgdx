package net.hollowbit.platformerturtorial;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

import net.hollowbit.platformerturtorial.world.GameMap;
import net.hollowbit.platformerturtorial.world.TileType;
import net.hollowbit.platformerturtorial.world.TiledGameMap;

public class PlatformerGame extends ApplicationAdapter {
	SpriteBatch batch;

	OrthographicCamera cam;
	
	GameMap gameMap;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		
		
		cam = new OrthographicCamera();
		cam.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		cam.update();
		gameMap = new TiledGameMap();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		gameMap.render(cam);
	
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	
	}
}
