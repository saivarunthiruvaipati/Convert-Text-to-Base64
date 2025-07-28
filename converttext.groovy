def text = message.getBody(String)
def encoded = text.bytes.encodeBase64().toString()
message.setBody(encoded)
return message
