<?php

require("Figure.php");

class Dessin implements IteratorAggregate{
	
	private $figure = array();
	
	public function ajouterFigure($fig){
		array_push($this->figure, $fig);
		echo "Le dessin $f est ajouter";
	}
	
	public function getIterator(){
		return new ArrayIterator($this->figure);
	}
	
	public function dessiner(){
		echo "Voici un dessin";
	}
}