<?php
namespace DesignPattern\ObServer;

class ConcreteObserver implements ObServer
{
    private $_name = null;

    public function setName($name)
    {
        $this->_name = $name;
    }

    public function update($content)
    {
        echo "name: {$this->_name}, content:{$content} \n";
    }
}
