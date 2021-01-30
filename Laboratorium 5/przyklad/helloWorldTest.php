<?php
use PHPUnit\Framework\TestCase;

class helloWorldTest extends TestCase
{
    public function testHello()
    {
        $this->assertNotEmpty('Hello world!');
    }
}
