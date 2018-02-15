<?php

require("Dessinable.php");
require("Sphere.php");
require("Pave.php");

abstract class Figure implements Dessinable
{
	abstract class dessiner();
	abstract class calculerSurface();
}