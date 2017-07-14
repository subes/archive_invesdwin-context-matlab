package de.invesdwin.context.matlab.runtime.javaoctave;

import javax.annotation.concurrent.NotThreadSafe;
import javax.inject.Inject;

import org.junit.Test;

import de.invesdwin.context.matlab.runtime.contract.InputsAndResultsTests;
import de.invesdwin.context.test.ATest;

@NotThreadSafe
public class JavaOctaveScriptTaskRunnerRTest extends ATest {

    @Inject
    private JavaOctaveScriptTaskRunnerR runner;

    @Test
    public void test() {
        new InputsAndResultsTests(runner).test();
    }

    @Test
    public void testParallel() {
        new InputsAndResultsTests(runner).testParallel();
    }

}
