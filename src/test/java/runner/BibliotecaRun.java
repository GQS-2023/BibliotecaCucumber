/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 *
 * @author rafaelamoreira
 */


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/biblioteca.feature",
    glue = "classpath:steps"
)
public class BibliotecaRun {
    
}
