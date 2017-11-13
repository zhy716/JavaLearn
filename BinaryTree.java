class Person implements Cloneable{
    private String name;
    public Person(String n){
        name=n;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String toString(){
        return "Name: "+this.getName();
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;
    private float score;
    public Student(String name,int age,float score){
        this.name=name;
        this.age=age;
        this.score=score;
    }
    public String toString(){
        return this.name+"\t\t"+this.age+"\t\t"+this.score;
    }
    public int compareTo(Student stu){
        if(this.score>stu.score){
            return -1;
        }else if(this.score<stu.score){
            return 1;
        }else{
            if(this.age>stu.age){
                return -1;
            }else if(this.age<stu.age){
                return 1;
            }else{
                return 0;
            }
        }
    }
}

class BinaryTree{
    class Node{
        private Comparable data;
        private Node left;
        private Node right;
        public void addNode(Node newNode){
            if(this.data.compareTo(newNode.data)>=0){
                if(this.left!=null){
                    this.left.addNode(newNode);
                }else{
                    this.left=newNode;
                }
            }else{
                if(this.right!=null){
                    this.right.addNode(newNode);
                }else{
                    this.right=newNode;
                }
            }
        }
        
        public void printNode(){
            if(this.left!=null){
                this.left.printNode();
            }
            System.out.print(this.data+"\t");
            if(this.right!=null){
                this.right.printNode();
            }
        }
    }
    private Node root;
    public void add(Comparable data){
        Node newNode=new Node();
        newNode.data=data;
        if(root==null){
            root=newNode;
        }else{
            root.addNode(newNode);
        }
    }
    public void print(){
        this.root.printNode();
    }
}
public class Test{
    public static void main(String args[]) throws Exception{
        BineryTree bt=new BineryTree();
        bt.add(8);
        bt.add(3);
        bt.add(3);
        bt.add(10);
        bt.add(9);
        bt.add(1);
        bt.add(5);
        bt.add(5);
        bt.print();
    }
}
