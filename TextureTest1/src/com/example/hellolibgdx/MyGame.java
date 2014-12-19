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
		Gdx.gl.glClearColor(1, 1, 1, 1);// 设置背景为白色
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// 清屏
		
		batch.begin();//开始绘制
		
		/**
		 * draw(Texture texture, float x, float y, float width, float height)函数的5个参数的意义分别为:
		 * texture:需要画出来的纹理(暂时可以理解为需要画出来的图片)
		 * x:图片在X轴的坐标
		 * y:图片在Y轴的坐标
		 * width:画出来的图片的width
		 * height:画出来的图片的height
		 */
		batch.draw(texture, 100, 100,100,100);//调用draw方法进行绘制
		batch.end();//结束绘制
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
