# Java Queue Interface

## FIFO

## Deque
### deque supports add and delete from both side
### Deque is an acronym for double ended queue.

## Method 	Description
### boolean add(object) 	It is used to insert the specified element into this deque and return true upon success.
### boolean offer(object) 	It is used to insert the specified element into this deque.
### Object remove() 	It is used to retrieve and removes the head of this deque.
### Object poll() 	It is used to retrieve and removes the head of this deque, or returns null if this deque is empty.
### Object element() 	It is used to retrieve, but does not remove, the head of this deque.
### Object peek() 	It is used to retrieve, but does not remove, the head of this deque, or returns null if this deque is empty.
### Object peekFirst() 	The method returns the head element of the deque. The method does not remove any element from the deque. Null is returned by this method, when the deque is empty.
### Object peekLast() 	The method returns the last element of the deque. The method does not remove any element from the deque. Null is returned by this method, when the deque is empty.
### Boolean offerFirst(e) 	Inserts the element e at the front of the queue. If the insertion is successful, true is returned; otherwise, false.
### Object offerLast(e) 	Inserts the element e at the tail of the queue. If the insertion is successful, true is returned; otherwise, false.
