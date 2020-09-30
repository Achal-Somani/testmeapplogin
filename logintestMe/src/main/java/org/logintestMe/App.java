package org.logintestMe;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
  pragma solidity >=0.4.22 <0.7.0;

contract Token {
    uint public cost=2;
    address public caller_addr;
    bool public status=true;
    uint public amount;
    address payable public _to;
    uint public bal;
    uint public nonce;
    uint public rand;
  
   mapping (address => uint256) public balanceOf; 
    function getSenderAddress( ) public returns (address) {   //addres who is processing transaction
      caller_addr = msg.sender;  
       return caller_addr;  
    } 

    function balanceCheck( ) public  returns (uint balance) { //balance 
         bal= caller_addr.balance;
         return bal;
     }
    
    function statusCheck() public 
    {
        if(status==true)    
        {
            "do the reansaction";
        }
        else
        {
            revert();
        }
    }
      
    function setAmount( uint time) public returns (uint)  // amount to be paid
    {
        amount=cost*time;
        return amount;
    }
    
     function transfer(address payable _to ) public payable{
        //require(balanceOf[msg.sender] >= amount);// Check if the sender has enough amount
       // require(msg.value==amount);
       //  _to.transfer(amount);
        require(msg.value==amount);
      //  require(address(_to).call.value(amount).gas(35000)());
      // Check for overflows
       // balanceOf[msg.sender] -= amount;                    // Subtract from the sender
        //balanceOf[_to] += amount;                           // Add the same to the recipient
                _to.transfer(msg.value);
    }
     
    function confirm() public returns (bool success) { //to confirm if transaction is successful
        require(balanceOf[msg.sender] <= bal);
        if(balanceOf[msg.sender]<bal)
        {
        status=false;
        return true;
        }
        else
        {
            status=true;
            return false;
        }
    }
    
    function _randModulus(uint mod) public returns(uint) { //to generate random number
        //bool checkif=confirm();
        return uint(keccak256(abi.encodePacked(
            now, 
            block.difficulty, 
            msg.sender)
        )) % mod;
        nonce++;
     return rand;
    }
    function random() public 
    {
        rand=_randModulus(10000);
    }
}



