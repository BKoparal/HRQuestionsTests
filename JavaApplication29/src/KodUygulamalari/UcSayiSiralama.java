/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KodUygulamalari;

/**
 *
 * @author xyz
 */
public class UcSayiSiralama {

    public static void main(String[] args) {
        int a,b,c,temp;
        
        a=5;b=4;c=9;
        
        //a ile b den küçüğü bulup a'ya atayalım
        if (a>b){
            temp=a;
            a=b;
            b=temp;}// şimdi a da a ile b arasında küçük olan var
        
        //ikinci if
        if(a>c){
            temp=a;
            a=c;
            c=temp;} // artık a da kesinlikle en küçük sayı var
        //işimiz artık çok kolay sadece b ile c den küçük olanı bulacağız
        
        if(b>c){
            temp=b;
            b=c;
            c=temp;}
        
        //ve bitti sadece yazdır
        System.out.println(a+""+b+""+c);
    }
}
