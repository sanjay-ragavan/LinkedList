# Singly Linked List Implementation in Java

## Overview

This project implements a **Singly Linked List (LL)** in Java. A singly linked list is a data structure where each node contains a reference to the next node, allowing unidirectional traversal. This implementation supports operations like inserting at the beginning, at the end, at a specific index, reversing the list, and deleting nodes.

---

## Features

1. **Insert First**: Adds a new node at the beginning of the list.  
2. **Insert Last**: Adds a new node at the end of the list.  
3. **Insert at Index**: Adds a new node at a specified index.  
4. **Delete First**: Removes the first node from the list.  
5. **Delete Last**: Removes the last node from the list.  
6. **Delete at Index**: Removes a node at a specified index.  
7. **Reverse**: Reverses the entire list.  
8. **Display**: Prints the elements in the list.  
9. **Search**: Finds a node with the specified value.  

---

## Code Structure

### **Classes**  
- **`LL`**: The core implementation of the singly linked list.  
- **`Node`**: Represents a single node in the singly linked list.  
- **`Main`**: Demonstrates the usage of the singly linked list.  

### **LL Class Methods**

| Method            | Description                                                                 |
|--------------------|-----------------------------------------------------------------------------|
| `insertFirst(int)` | Adds a node at the beginning of the list.                                  |
| `insertLast(int)`  | Adds a node at the end of the list.                                        |
| `insert(int, int)` | Adds a node at a specified index in the list.                              |
| `deleteFirst()`    | Removes the first node from the list.                                      |
| `deleteLast()`     | Removes the last node from the list.                                       |
| `delete(int)`      | Removes a node at a specified index in the list.                          |
| `reverse()`        | Reverses the list.                                                        |
| `display()`        | Displays all the nodes in the list.                                       |
| `find(int)`        | Finds a node with the specified value.                                    |

---

## How to Use

1. Clone this repository or copy the code.  
2. Compile and run the `Main` class.  
3. The `Main` class demonstrates inserting, deleting, and displaying nodes in the list.

### Example Usage (from `Main` class)

```java
public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);   // Insert 1 at the beginning
        list.insertLast(2);    // Insert 2 at the end
        list.insertLast(3);    // Insert 3 at the end
        list.insertLast(4);    // Insert 4 at the end
        list.display();        // Display the list
        list.deleteFist();     // Delete the first node
        list.display();        // Display the updated list
    }
}
```

---

## Sample Output

```
1 -> 2 -> 3 -> 4 -> End
2 -> 3 -> 4 -> End
```

---

## Customization

- Update the `Main` class to include more operations or test cases.
- Extend the `LL` class with additional functionalities like finding the size of the list or more advanced search features.

---
