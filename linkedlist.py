#single linkedlist
class Node:

    def __init__(self, data):

        self.data = data
        self.nextnode = None

class LinkedList:

    def __init__(self):

        self.head = None


    def insert(self, data):

        if self.head is None:
            self.head = Node(data)
        else:
            node = self.head
            while node.nextnode is not None:
                node = node.nextnode
            node.nextnode = Node(data)

    def printList(self):

        node = self.head

        while node is not None:
            print(node.data)
            node = node.nextnode

    def insertat(self, data, at):

        node = self.head
        i = 0
        temp = Node(data)
        while node is not None:
            if i == at:
                temp.nextnode = node.nextnode
                node.nextnode = temp
                break
            i += 1
            node = node.nextnode

    def remove(self, data):

        node = self.head
        pri = None
        while node.data != data:
            pri = node
            node = node.nextnode
        pri.nextnode = node.nextnode

    def insertfirst(self, data):
        first = Node(data)
        first.nextnode = self.head
        self.head = first

class App:

    ll = LinkedList()
    ll.insert(10)
    ll.insert(20)
    ll.insertfirst(200)
    ll.insert(30)
    ll.insert(40)
    ll.insert(50)

    ll.insertat(25, 1)

    ll.remove(30)
    ll.insertfirst(100)

    ll.printList()

