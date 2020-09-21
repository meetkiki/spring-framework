package com.thoughtworks.parsebeandefinition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


public class TestImportSelect implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.thoughtworks.parsebeandefinition.CompentA"};
	}
}
