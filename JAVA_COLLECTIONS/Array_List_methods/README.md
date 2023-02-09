![Alt text](https://static.javatpoint.com/images/arraylist.png)

# Constructors of ArrayList
## Constructor 	Description
## ArrayList() 	It is used to build an empty array list.
## ArrayList(Collection<? extends E> c) 	It is used to build an array list that is initialized with the elements of the collection c.
## ArrayList(int capacity) 	It is used to build an array list that has the specified initial capacity. 

# Methods of ArrayList
## void add(int index, E element) 	It is used to insert the specified element at the specified position in a list.
## boolean add(E e) 	It is used to append the specified element at the end of a list.
## boolean addAll(Collection<? extends E> c) 	It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
## boolean addAll(int index, Collection<? extends E> c) 	It is used to append all the elements in the specified collection, starting at the specified position of the list.
## void clear() 	It is used to remove all of the elements from this list.
## void ensureCapacity(int requiredCapacity) 	It is used to enhance the capacity of an ArrayList instance.
## E get(int index) 	It is used to fetch the element from the particular position of the list.
## boolean isEmpty() 	It returns true if the list is empty, otherwise false.
## Iterator() 	
## listIterator() 	
## int lastIndexOf(Object o) 	It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
## Object[] toArray() 	It is used to return an array containing all of the elements in this list in the correct order.
## <T> T[] toArray(T[] a) 	It is used to return an array containing all of the elements in this list in the correct order.
## Object clone() 	It is used to return a shallow copy of an ArrayList.
## boolean contains(Object o) 	It returns true if the list contains the specified element.
## int indexOf(Object o) 	It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
## E remove(int index) 	It is used to remove the element present at the specified position in the list.
## boolean remove(Object o) 	It is used to remove the first occurrence of the specified element.
## boolean removeAll(Collection<?> c) 	It is used to remove all the elements from the list.
## boolean removeIf(Predicate<? super E> filter) 	It is used to remove all the elements from the list that satisfies the given predicate.
## protected void removeRange(int fromIndex, int toIndex) 	It is used to remove all the elements lies within the given range.
## void replaceAll(UnaryOperator<E> operator) 	It is used to replace all the elements from the list with the specified element.
## void retainAll(Collection<?> c) 	It is used to retain all the elements in the list that are present in the specified collection.
## E set(int index, E element) 	It is used to replace the specified element in the list, present at the specified position.
## void sort(Comparator<? super E> c) 	It is used to sort the elements of the list on the basis of the specified comparator.
## Spliterator<E> spliterator() 	It is used to create a spliterator over the elements in a list.
## List<E> subList(int fromIndex, int toIndex) 	It is used to fetch all the elements that lies within the given range.
## int size() 	It is used to return the number of elements present in the list.
## void trimToSize() 	It is used to trim the capacity of this ArrayList instance to be the list's current size.

# Ways to iterate the elements of the collection in Java
##  By Iterator interface.
## By for-each loop.
##  By ListIterator interface.
##  By for loop.
##  By forEach() method.
##  By forEachRemaining() method.

# Notes
## Capacity and size are two different thing size tells the amount present in it and capacity tells the amount it can hold.