<?php
namespace DesignPattern\Strategy;

class BusStrategy implements Strategy
{
    public function algorithm()
    {
        echo "go to work by bus! \n";
    }
}