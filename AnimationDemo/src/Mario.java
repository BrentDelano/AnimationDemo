

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;


	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
		super.moveByAmount(dir, 0);
	}

	public void jump() {
		double velocity = -20.0;
		super.moveByAmount(0, velocity);
		velocity += 0.001;
	}

	public void act(ArrayList<Shape> obstacles) {
		// FALL (and stop when a platform is hit)
		boolean isFalling = true;
		for(Shape s: obstacles)
		{
			if(s.intersects(this)) {
				isFalling = false;
			}
		}
		if(isFalling)
		{
			super.moveByAmount(0, 3);
		}
		
	}


}
