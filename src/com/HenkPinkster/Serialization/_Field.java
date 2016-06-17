package com.HenkPinkster.Serialization;

import static com.HenkPinkster.Serialization._SerializationWriter.*;

public class _Field {
	
	public final byte CONTAINER_TYPE = _ContainerType.FIELD;
	public short nameLength;
	public byte[] name;
	public byte type;
	public byte[] data;
	
	public void setName(String name){
		assert(name.length() < Short.MAX_VALUE);
		
		nameLength = (short)name.length();
		this.name = name.getBytes();
	}
	
	public int getBytes(byte[] dest, int pointer) {
		pointer = writeBytes(dest, pointer, CONTAINER_TYPE);
		pointer = writeBytes(dest, pointer, nameLength);
		pointer = writeBytes(dest, pointer, name);
		pointer = writeBytes(dest, pointer, type);
		pointer = writeBytes(dest, pointer, data);
		return pointer;
	}
}
