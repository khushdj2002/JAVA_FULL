# Java HashSet
## Java HashSet class is used to create a collection that uses a hash table for storage.

### allows null value
### Here they are inserted in ascending oeder

SN 	Modifier & Type 	Method 	Description
1) 	boolean 	add(E e) 	It is used to add the specified element to this set if it is not already present.
2) 	void 	clear() 	It is used to remove all of the elements from the set.
3) 	object 	clone() 	It is used to return a shallow copy of this HashSet instance: the elements themselves are not cloned.
4) 	boolean 	contains(Object o) 	It is used to return true if this set contains the specified element.
5) 	boolean 	isEmpty() 	It is used to return true if this set contains no elements.
6) 	Iterator<E> 	iterator() 	It is used to return an iterator over the elements in this set.
7) 	boolean 	remove(Object o) 	It is used to remove the specified element from this set if it is present.
8) 	int 	size() 	It is used to return the number of elements in the set.
9) 	Spliterator<E> 	spliterator() 	It is used to create a late-binding and fail-fast Spliterator over the elements in the set.


# LinkedHashSet 
## It maintains the order of insertion

# TreeSet
## retrival is fast
## doesn't allow null element
## maintain ascending order

## Method 	Description
### boolean add(E e) 	It is used to add the specified element to this set if it is not already present.
### boolean addAll(Collection<? extends E> c) 	It is used to add all of the elements in the specified collection to this set.
### E ceiling(E e) 	It returns the equal or closest greatest element of the specified element from the set, or null there is no such element.
### Comparator<? super E> comparator() 	It returns a comparator that arranges elements in order.
### Iterator descendingIterator() 	It is used to iterate the elements in descending order.
### NavigableSet descendingSet() 	It returns the elements in reverse order.
### E floor(E e) 	It returns the equal or closest least element of the specified element from the set, or null there is no such element.
### SortedSet headSet(E toElement) 	It returns the group of elements that are less than the specified element.
### NavigableSet headSet(E toElement, boolean inclusive) 	It returns the group of elements that are less than or equal to(if, inclusive is true) the specified element.
### E higher(E e) 	It returns the closest greatest element of the specified element from the set, or null there is no such element.
### Iterator iterator() 	It is used to iterate the elements in ascending order.
### E lower(E e) 	It returns the closest least element of the specified element from the set, or null there is no such element.
### E pollFirst() 	It is used to retrieve and remove the lowest(first) element.
### E pollLast() 	It is used to retrieve and remove the highest(last) element.
### Spliterator spliterator() 	It is used to create a late-binding and fail-fast spliterator over the elements.
### NavigableSet subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) 	It returns a set of elements that lie between the given range.
### SortedSet subSet(E fromElement, E toElement)) 	It returns a set of elements that lie between the given range which includes fromElement and excludes toElement.
### SortedSet tailSet(E fromElement) 	It returns a set of elements that are greater than or equal to the specified element.
### NavigableSet tailSet(E fromElement, boolean inclusive) 	It returns a set of elements that are greater than or equal to (if, inclusive is true) the specified element.
### boolean contains(Object o) 	It returns true if this set contains the specified element.
### boolean isEmpty() 	It returns true if this set contains no elements.
### boolean remove(Object o) 	It is used to remove the specified element from this set if it is present.
### void clear() 	It is used to remove all of the elements from this set.
### Object clone() 	It returns a shallow copy of this TreeSet instance.
### E first() 	It returns the first (lowest) element currently in this sorted set.
### E last() 	It returns the last (highest) element currently in this sorted set.
### int size() 	It returns the number of elements in this set.