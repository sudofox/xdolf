package com.darkcart.xcheat.mods;

import java.awt.Color;

import org.lwjgl.input.Keyboard;

import com.darkcart.xcheat.Client;
import com.darkcart.xcheat.Module;
import com.darkcart.xcheat.util.RenderUtil;

import net.minecraft.entity.Entity;

public class EntityESP extends Module {

	@Override
	public void enable() {
		
	}

	@Override
	public void disable() {
		
	}

	@Override
	public void tick() {
		
	}

	@Override
	public int getKeyCode() {
		return Keyboard.KEY_G;
	}
	
	public void render() {
		for (Entity e: Client.mc.world.loadedEntityList) {
			String entityPackage = e.getClass().getPackage().getName();
			if (entityPackage.equals("net.minecraft.entity.monster")) {
				RenderUtil.entityESPBox(e, Color.red);
			}
			if (entityPackage.equals("net.minecraft.entity.passive")) {
				RenderUtil.entityESPBox(e, Color.green);
			}
			if (entityPackage.equals("net.minecraft.entity.item")) {
				RenderUtil.entityESPBox(e, Color.white);
			}
		}
	}
}