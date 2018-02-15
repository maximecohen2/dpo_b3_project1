<?php

require("Figure.php");

class Sphere extends Figure
{
	$centreX = null;
	$centreY = null;
	$centreZ = null;
	$rayon = null;
	
	public function dessiner(){
		echo "Voici une Sphere de centreX $centreX, de centreY $centreY, de centreZ $centreZ et de rayon $rayon";
	}
	
	public function calculerSphere($rayon)
	{
		$volume = ((4 * M_PI * ($rayon * 3)) / 3);
		echo "Le volume de la sphere est de $volume";
	}
}