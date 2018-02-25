/*
 * Created by SharpDevelop.
 * User: GameBase
 * Date: 25/02/2018
 * Time: 15:55
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace Dpo_project
{
	/// <summary>
	/// Description of aFigure.
	/// </summary>
	public abstract class AFigure : IDessinable
	{
		abstract public void dessiner();
		abstract public void calculerSurface();
		abstract public void set();
		abstract public float getX();
		abstract public float getY();
		abstract public float getZ();
		abstract public void getColor();
		abstract public void setColor();
	}
}
