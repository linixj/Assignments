	class Student{
		String MyNEUusername;
		String MyNEUpassword;
		void visitMyneuWebsite(MyneuWebsite mw){}
		void loginInMyneuAccount(MyneuWebsite mw){}
		MyneuWebsite findMakePaymentlinks(Pay tution[]){}
		void payMoneyToLinks(Pay tution){}
		Money payMoneyToLinks(MyneuWebsite mw){}
		
	}

	class MyneuWebsite{
		Links[] displayMakepaymentLinks(){}
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
			jojo.loginInMyneuAccount(MyNEU);
			jojo.findMakePaymentLink(links , MyNEU);
			Money money = jojo.payMoneyToLinks(MyNEU);
			MyNEU.acceptMoneyFromStudent(jojo, money);
		}

	}
}
