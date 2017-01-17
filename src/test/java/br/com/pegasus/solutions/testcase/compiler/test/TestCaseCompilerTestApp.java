package br.com.pegasus.solutions.testcase.compiler.test;

import org.junit.Test;

import br.com.pegasus.solutions.tc.impl.TestCaseCompiler;

public class TestCaseCompilerTestApp {

	@Test
	public void test() {
		TestCaseCompiler.getInstance().compile(this.getClass(), System.getProperty("user.dir"));
	}

}
