package br.com.wjaa.sender;

import java.io.File;

import br.com.object2x.O2x;
import br.com.object2x.exception.O2xTransformException;
import br.com.object2x.impl.O2xBuilder;
import br.com.object2x.impl.O2xType;

/**
 * 
 * @author wagner
 *
 */
public class CvParamBuilder {

	private CvParamBuilder() {}
	
	public static CvParam build(String endJson) throws CvParamBuildException{
		File file = new File(endJson);
		if (!file.exists()){
			throw new CvParamBuildException("Arquivo não encontrado!");
		}
		
		O2xBuilder builder = new O2xBuilder(O2xType.JSON);
		O2x o2x = builder.createO2x();
		try {
			return o2x.deserialize(file, CvParam.class);
		} catch (O2xTransformException e) {
			throw new CvParamBuildException("Erro ao deserializar o json");
		}
		
	}
	
}
