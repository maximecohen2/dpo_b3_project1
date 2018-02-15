<?php

require('Dessin.php');
require('Positionnable.php');
require('Allumable.php');

class Camera Implements Allumable, Positionnable
{
	
	public function allumer()
	{
		echo "camera allumer";
	}
	
	public function eteindre()
	{
		echo "camera eteint";
	}
	
	public function deplacer()
	{
		echo "La camera est en mouvement"
	}
	
	public function get($x, $y, $z)
	{
		echo "La caméra se trouve aux coordonnnées $x, $y et $z";
	}
	
	public function set($x, $y, $z)
	{
		echo "La caméra est maintenant situé en $x, $y et $z";
	}
}