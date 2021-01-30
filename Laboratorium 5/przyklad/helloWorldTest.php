<?php
use PHPUnit\Framework\TestCase;

class SampleTest extends TestCase
{
    public function testHello()
    {
        $this->assertNotEmpty('Hello world!');
    }
}