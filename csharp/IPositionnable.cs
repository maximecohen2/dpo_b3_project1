/*
 * Created by SharpDevelop.
 * User: GameBase
 * Date: 25/02/2018
 * Time: 15:40
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace Dpo_project
{
	/// <summary>
	/// Description of Positionnable.
	/// </summary>
	public interface IPositionnable
	{
		void calculerSurface();
		void set();
		float getX();
		float getY();
		float getZ();
	}
}