/*
 * Created by SharpDevelop.
 * User: GameBase
 * Date: 25/02/2018
 * Time: 15:24
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace Dpo_project
{
	/// <summary>
	/// Description of Interface1.
	/// </summary>
	public interface IDessinable : IPositionnable, IColoriable
	{
		void dessiner();
	}
}
