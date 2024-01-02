

struct Node<T> { 
    value: T, 
    next: Option<Box<Node<T>>, 
}

impl<T> Node<T> { 
    
    fn new(value: T) -> Node<T> { 
        Node { value, next: None }
    }
    
}

fn main() {
    println!("Hello, world!");
}
