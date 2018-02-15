<?php

require("Figure.php");

class Pave extends Figure
{
	$Longueur = null;
	$Largeur = null;
	$Hauteur = null;
	$Coin = null;
	
	public function dessiner(){
		echo "Voici un Pave de longueur $Longueur, de largeur $Largeur, hauteur $Hauteur et qui possede $Coin coins";
	}
	
	public function calculerSurface()
	{
		$aire = $Longueur * $Largeur;
		echo "L'aire du pavé est de $aire";
	}
}