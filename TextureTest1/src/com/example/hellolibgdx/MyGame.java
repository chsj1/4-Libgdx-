package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGame implements ApplicationListener {

	Texture texture;
	SpriteBatch batch;
	
	
	@Override
	public void create() {
		
		texture = new Texture(Gdx.files.internal("data/test1.jpg"));
		batch = new SpriteBatch();
		
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}
	
	
	
	
	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);// ���ñ���Ϊ��ɫ
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// ����
		
		batch.begin();//��ʼ����
		
		/**
		 * draw(Texture texture, float x, float y, float width, float height)������5������������ֱ�Ϊ:
		 * texture:��Ҫ������������(��ʱ�������Ϊ��Ҫ��������ͼƬ)
		 * x:ͼƬ��X�������
		 * y:ͼƬ��Y�������
		 * width:��������ͼƬ��width
		 * height:��������ͼƬ��height
		 */
		batch.draw(texture, 100, 100,100,100);//����draw�������л���
		batch.end();//��������
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
