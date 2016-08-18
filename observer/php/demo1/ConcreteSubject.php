<?php
namespace DesignPattern\ObServer;

class ConcreteSubject extends Subject
{
    private $_content;

    public function setContent($content)
    {
        $this->_content = $content;
        $this->notify($content);
    }

}
