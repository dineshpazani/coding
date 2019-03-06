#Binary search tree

class Node:
    def __init__(self, data):

        self.data = data
        self.leftNode = None
        self.rightNode = None


class Bst:
    def __init__(self):
        self.root = None


    def add(self, data):
        if self.root is None:
            self.root = Node(data)
        else:
           self.insert(data, self.root)

    def insert(self, data, current_node):
        if data <  current_node.data:
            if current_node.leftNode is None:
                current_node.leftNode = Node(data)
            else:
                self.insert(data, current_node.leftNode)
        else:
            if current_node.rightNode is None:
                current_node.rightNode = Node(data)
            else:
                self.insert(data, current_node.rightNode)


    def printBst(self):
        if self.root is not None:
            self.printTree(self.root)


    def printTree(self, currentNode):
        if currentNode is not None:
            self.printTree(currentNode.leftNode)
            print(currentNode.data)
            self.printTree(currentNode.rightNode)



class  App:

    bst = Bst()
    bst.add(10)
    bst.add(90)
    bst.add(30)
    bst.add(20)
    bst.add(50)
    bst.add(10)


    bst.printBst()




