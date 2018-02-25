/*
 * Created by SharpDevelop.
 * User: GameBase
 * Date: 25/02/2018
 * Time: 17:56
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace Dpo_project
{
	/// <summary>
	/// Description of Rectangle.
	/// </summary>
	public class Rectangle : AFigure
	{
		private int width;
		private int len;
		private float x;
		private float y;
		private float z;
		

		public Rectangle()
		{
		}
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
		
		public void setlen(int len) {
			this.len = len;
		}
		
		public void setWidth(int width) {
			this.width = width;
		}
		
		public override void dessiner(){
			
		}
		
		public override void calculerSurface() {
			
		}
	}
}
