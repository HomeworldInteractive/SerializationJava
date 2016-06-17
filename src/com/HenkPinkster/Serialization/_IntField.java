package com.HenkPinkster.Serialization;

import static com.HenkPinkster.Serialization._SerializationWriter.*;

public class _IntField extends _Field {
	
	public _IntField(String name, int value){
		setName(name);
		type = _Type.INT;
		data = new byte[_Type.getSize(_Type.INT)];
		writeBytes(data, 0, value);
	}
}
