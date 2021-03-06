package com.jared.waves;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jared.waves.units.Wave;
import com.jared.waves.units.barriers.Barrier;
import com.jared.waves.units.barriers.Goal;

public class Level 
{
	private ArrayList<Barrier> barriers;
	private Wave wave;
	private Goal goal;
	
	public Level()
	{
		barriers = new ArrayList<Barrier>();
		wave = new Wave();
	}
	
	public void createGoal(Goal g)
	{
		goal = new Goal(g);
	}
	
	public void addBarrier(Barrier b)
	{
		barriers.add(b);
	}
		
	public void initialDraw(SpriteBatch batch)
	{
		for(int i = 0; i < barriers.size(); i++)
			barriers.get(i).draw(batch);
	}
	
	public void draw(SpriteBatch batch)
	{
		wave.draw(batch);
	}
	
	public boolean isDone()
	{
		if(wave.hitsObject(goal))
			return true;
		return false;
	}
}
