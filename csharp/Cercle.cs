﻿/*
 * Created by SharpDevelop.
 * User: GameBase
 * Date: 25/02/2018
 * Time: 17:50
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace Dpo_project
{
	/// <summary>
	/// Description of Cercle.
	/// </summary>
	public class Cercle : AFigure
	{
		private int centre;
		private int rayon;
		private float x;
		private float y;
		private float z;
		
		public Cercle()
		{}
		
		public override void getColor() {}
		public override void setColor() {}
		public override void set() {}
		
		public void setAttr(float x, float y, float z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		public override float getX() {
			return x;
		}
		public override float getY() {			
			return y;
		}
		public override float getZ() {
			return z;
		}
		
		public void setCentre(int centre) {
			this.centre = centre;
		}
		
		public void setRayon(int rayon) {
			this.rayon = rayon;
		}
		
		public override void dessiner(){
			
		}
		
		public override void calculerSurface() {
			
		}
	}
}
