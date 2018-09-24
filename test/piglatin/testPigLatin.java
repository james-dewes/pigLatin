/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;
import org.junit.*;
/**
 *
 * @author james.dewes
 */
public class testPigLatin {
    @Test
    public void testConvertWord(){
        String result = PigLatin.convertWord("Pig");
        assert result.equals("igpay"):result ;
    }
    @Test
    public void testConvert(){
        String result = PigLatin.convert("Stupid pig!");
        assert result.equals("upidstay igpay!"):result ;
    }
}
