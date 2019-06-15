package com.p3arl;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * Custom Deserializer for boolean values in the DTO, will accept true, false, 0 and 1
 * @author P3arl
 *
 */
public class BooleanDeserializer extends JsonDeserializer<Boolean> {

	@Override
	public Boolean deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException {
		JsonToken token = parser.currentToken();
		if (token.isBoolean()) {
			return parser.getBooleanValue();
		} else if (token.isNumeric()) {
			int value = parser.getIntValue();
			if (value == 1) {
				return true;
			} else if (value == 0) {
				return false;
			}
		}
		throw new IOException(parser.currentName());
	}
}
