<?php
namespace DesignPattern\ObServer;

class Subject
{
    private $_observer = [];

    public function attach(ObServer $observer)
    {
        array_push($this->_observer, $observer);
    }

    public function dettach(ObServer $observer)
    {
        if ($index = array_search($observer, $this->_observer)) {
            unset($this->_observer[$index]);
        }
    }

    public function notify($content)
    {
        foreach ($this->_observer as $observer) {
            $observer->update($content);
        }
    }
}
