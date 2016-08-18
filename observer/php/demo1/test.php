<?php
namespace DesignPattern\ObServer;

require "ObServer.php";
require "Subject.php";
require "ConcreteObserver.php";
require "ConcreteSubject.php";

$subject = new ConcreteSubject();
$observer1 = new ConcreteObserver();
$observer1->setName("observer1");
$subject->attach($observer1);

$observer2 = new ConcreteObserver();
$observer2->setName("observer2");
$subject->attach($observer2);

$subject->setContent(" test observer !");
