<?php

interface Positionnable
{
	public function deplacer();
	
	public function get($x, $y, $z);
	
	public function set($x, $y, $z);
}