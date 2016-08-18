<?php
namespace DesignPattern\Strategy;

require_once "Strategy.php";
require_once "BicycleStrategy.php";
require_once "BusStrategy.php";
require_once "SubwayStrategy.php";
require_once "Person.php";

$person = new Person();

$bicycleStrategy = new BicycleStrategy();
$person->setStrategy($bicycleStrategy);
$person->go();

$busStrategy = new BusStrategy();
$person->setStrategy($busStrategy);
$person->go();

$subwayStrategy = new SubwayStrategy();
$person->setStrategy($subwayStrategy);
$person->go();

