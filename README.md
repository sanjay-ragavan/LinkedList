# Linked List Implementation in Java

This project contains an implementation of a singly linked list in Java. It provides methods to insert, delete, find, and display elements in the list. The linked list supports operations such as adding elements at the beginning, end, and any position, as well as removing elements from the beginning, end, or any position.

## Features

- **Insert First**: Adds a new node at the beginning of the list.
- **Insert Last**: Adds a new node at the end of the list.
- **Insert at Index**: Inserts a new node at a specified index in the list.
- **Delete First**: Removes the first node from the list.
- **Delete Last**: Removes the last node from the list.
- **Delete at Index**: Removes a node at a specified index.
- **Find**: Finds a node with a specific value.
- **Display**: Displays the contents of the linked list.
- **Reverse**: Reverses the order of nodes in the linked list.

## Methods

### 1. `insertFirst(int data)`
Adds a node with the specified data at the beginning of the list.

### 2. `insertLast(int data)`
Adds a node with the specified data at the end of the list.

### 3. `insert(int index, int data)`
Inserts a node with the specified data at a given index.

### 4. `deleteFirst()`
Removes the first node from the list and returns its data.

### 5. `deleteLast()`
Removes the last node from the list and returns its data.

### 6. `delete(int index)`
Removes a node at a specified index and returns its data.

### 7. `get(int index)`
Returns the node at the specified index.

### 8. `find(int value)`
Finds and returns the node that contains the specified value.

### 9. `reverse()`
Reverses the order of nodes in the list.

### 10. `display()`
Displays all the nodes in the linked list.



## Class Structure

### `LL` Class
The `LL` class is the main class for the linked list implementation. It contains the following private attributes:
- `head`: The first node of the list.
- `tail`: The last node of the list.
- `size`: The size of the linked list.

### `Node` Class
The `Node` class is a nested class used to represent each element in the list. It has the following attributes:
- `data`: The value of the node.
- `next`: A reference to the next node in the list.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        LL linkedList = new LL();

        // Insert elements
        linkedList.insertFirst(10);
        linkedList.insertFirst(20);
        linkedList.insertLast(30);

        // Display the list
        linkedList.display();

        // Delete elements
        linkedList.delete(1); // Deletes the second node
        linkedList.deleteLast(); // Deletes the last node

        // Display the list again
        linkedList.display();
    }
}
