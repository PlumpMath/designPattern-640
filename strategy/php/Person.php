<?php
namespace DesignPattern\Strategy;

class Person
{
    private $_strategy;

    public function setStrategy(Strategy $strategy)
    {
        $this->_strategy = $strategy;
    }

    public function go()
    {
        $this->_strategy->algorithm();
    }
}