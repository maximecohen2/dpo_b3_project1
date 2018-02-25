/*
 * Created by SharpDevelop.
 * User: GameBase
 * Date: 25/02/2018
 * Time: 17:43
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace Dpo_project
{
	/// <summary>
	/// Description of Camera.
	/// </summary>
	public class Camera : IAllumable, IPositionnable
	{
		private float x;
		private float y;
		private float z;
		
		public Camera()
		{
		}
		
		public void deplacer() {}
		public void allumer() {}
		public void eteindre() {}
		
		public void calculerSurface() {}
		public void set() {}
		public void setAttr(float x, float y, float z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		public float getX() {
			return x;
		}
		public float getY() {			
			return y;
		}
		public float getZ() {
			return z;
		}
	}
}
