package linked;

class DNode{
	private int data;
	private DNode next;
	private DNode per;
	
	public DNode(int data) {
		this.data=data;
		this.next=null;
		this.per=null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data=data;
	}
	public DNode getNext() {
		return next;
	}
	public void setNext(DNode next) {
		this.next=next;
	}
	public DNode getPer() {
		return per;
	}
	public void setPer(DNode per) {
		this.per=per;
	}
	public void display() {
		System.out.println(data+" ");
	}
}


class linked{
	private DNode head;
	private int n;
	public linked(){
		this.head=null;
	}
	//增加节点
	public void add(int data) {
		DNode newNode=new DNode(data);
		newNode.setNext(newNode);
		newNode.setPer(newNode);
		if(head==null) {
			head=newNode;
		}
		else {
			DNode curNode=head;
			while(curNode.getNext()!=head) {
				curNode=curNode.getNext();
			}
			newNode.setNext(head);
			curNode.setNext(newNode);
			newNode.setPer(curNode);
			head.setPer(newNode);
			head=newNode;
		}
		n++;
	}
	//插入节点
	public void insert(int data,int index) {
		DNode newNode=new DNode(data);
		newNode.setNext(newNode);
		newNode.setPer(newNode);
		if(head==null) {
			head=newNode;
		}
		if(index>n+1||index<1) {
			System.out.println("该位置不存在");
		}
		else if(index==1){
			DNode curNode=head;
			while(curNode.getNext()!=head) {
				curNode=curNode.getNext();
			}
			newNode.setNext(head);
			curNode.setNext(newNode);
			newNode.setPer(curNode);
			head.setPer(newNode);
			head=newNode;
		}
		else {
			DNode perNode=head;
			int count=1;
			while(count<index-1) {
				perNode=perNode.getNext();
				count++;
			}
			DNode curNode=perNode.getNext();
			newNode.setNext(curNode);
			curNode.setPer(newNode);
			perNode.setNext(newNode);
			newNode.setPer(perNode);
		}
		n++;
	}
	//删除节点
	public void delete(int index) {
        if(index>n||index<1) {
            System.out.println("删除的节点不存在，可删除节点为1到"+n);
        }
        else if(index == 1) 
        {
            DNode curNode = head;
            while(curNode.getNext() != head) {
                curNode = curNode.getNext();
            }
            DNode temp =head.getNext();
            curNode.setNext(temp);
            temp.setPer(curNode);
            head =temp;
            n--;
        } 
        else
        {
            DNode perNode = head;
            int count = 1;
            while(count < index-1) {
                perNode = perNode.getNext();
                count++;
            }
            DNode curNode = perNode.getNext();
            DNode laterNode = curNode.getNext();
            perNode.setNext(laterNode);
            laterNode.setPer(perNode);
            n--;
        }
    }
	public void updata(int index, int data) {
        if(head == null){
            System.out.println("空表");
        }
        if(index>n||index<1) {
            System.out.println("结点不存在，可修改的位置为1到"+n);
        }
        else 
        {
            DNode curNode = head;
            int count =1;//while也可以用for循环方式解决
            while(count != index) {
                curNode =curNode.getNext();
                count++;
            }
            curNode.setData(data);
        }
    }
	public void print() {
        if(head == null) {
            System.out.println("空表");
        }
        DNode cur=head;
        while (cur!=null) {
            cur.display();
            cur = cur.getNext();
            if(cur==head) {
                break;
            }
        }
        System.out.println();
    }


}
public class link {
	public static void main(String[] args) {
		linked list=new linked();
		list.add(0);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		list.print();
		list.delete(2);//删除第二个节点
		list.updata(1,9);//删除第一个节点，变为9
		list.print();
	}

}
