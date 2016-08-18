<?php
namespace DesignPattern\Strategy;

class BicycleStrategy implements Strategy
{
    public function algorithm()
    {
        echo "go to work by bicycle! \n";
    }
}
