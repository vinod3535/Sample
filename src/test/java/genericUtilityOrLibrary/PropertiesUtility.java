package genericUtilityOrLibrary;

import java.io.FileInputStream;

import java.util.Properties;

/**
 * this is generic class for properties
 * @author saikumar
 */
public class PropertiesUtility {

	/**
	 * this is genetic method for read data from properties
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public String getDataFromProperties(String data) throws Exception {
		FileInputStream fis=new FileInputStream(IconstantUtility.Propertiespath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String DATA = pobj.getProperty(data);
		return DATA;
	}

}
