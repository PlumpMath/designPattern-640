<?php
namespace DesignPattern\Strategy;

class SubwayStrategy implements Strategy
{
    public function algorithm()
    {
        echo "go to work by subway! \n";
    }
}