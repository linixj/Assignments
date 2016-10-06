/*
 Scenario : Pay tuition

Description : A student wants to pay his tuition through myneu account.

	Objects (with Behaviors and State): 
		Object : Student
			State : MyNEUusername, MyNEUpassword
			Behavior : visitMyneuWebsite(), loginInMyneuAccount(), findMakePaymentLinks(), payMoneyToLinks()
	
		
		Object : myneu website
			State : numerous funtional links
			Behavior : displayMakepaymentLink(), acceptMoneyFromStudent()
		
		Object: bill
		    State:name, price, link
		    Behavior:getName(), getPrice()
		
		Object : Money
			state : amount	

 */

class Student{
		String MyNEUusername;
		String MyNEUpassword;
		void visitMyneuWebsite(MyneuWebsite mw){}
		void loginInMyneuAccount((String myNEUusername, String myNEUpassword){}
		MyneuWebsite findMakePaymentlinks(tution[]){}
		void payMoneyToLinks(tution){}
		Money payMoneyToLinks(MyneuWebsite mw){}
		
		}
		
	

	class Bills{
		String link;
		Float price;
		Float getPrice(){}
	}
    
    class MyneuWebsite{
		Bills[] displayMakepaymentLinks(){}
		void acceptMoneyFromStudent(Student s, Money money){}
	}


	class Money{
		fixed amount;
	}

	class Paytution{
		public static void main(String args[]){
			MyneuWebsite MyNEU = new MyneuWebsite();

			Student jojo = new Student();
			jojo.MyNEUusername = "linixj";
			jojo.MyNEUpassword = "linixjjojo";
			
			jojo.visitMyneuWebsite(MyNEU);
			jojo.loginInMyneuAccount(jojo.MyNEUusername, jojo.MyNEUpassword;
			jojo.findMakePaymentLink(link);
			
			Bill.2016fall = new Bill();
			bill.name = "2016fall"
			Bill.price = 15548.00
			
			Money money = jojo.payMoneyToLinks(MyNEU);
			MyNEU.acceptMoneyFromStudent(jojo, money);
		}

	}

