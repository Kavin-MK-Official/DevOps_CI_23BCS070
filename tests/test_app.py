import sys
import os
sys.path.insert(0, os.path.join(os.path.dirname(__file__), "..", "src"))

from app import greet, add

def test_greet():
    assert greet("DevOps") == "Hello, DevOps!"
    assert greet() == "Hello, World!"

def test_add():
    assert add(2, 3) == 5
    assert add(-1, 1) == 0
