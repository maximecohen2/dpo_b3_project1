<?php

require ('Dessin.php');
require ('Coloriable.php');
require ('Allumable.php');
class Lumiere implements Allumable, Coloriable
{
	public function allumer()
	{
		echo "La lumière est allumé";
	}
	
	public function eteindre()
	{
		echo "La lumière est éteinte";
	}
	
	public function get($r, $v, $b)
	{
		echo "La couleur de la lumière est constitué de $r % rouge, $v % de verte et de $b % de bleu";
	}
	
	public function set($r, $v, $b)
	{
		echo "La couleur qui vont constitué la lumière sont $r % rouge, $v % de verte et de $b % de bleu";
	}
}