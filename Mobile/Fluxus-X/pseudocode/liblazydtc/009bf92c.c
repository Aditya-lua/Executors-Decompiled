/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bf92c
 */

char * SSL_alert_desc_string_long(int value)

{
  char *pcVar1;
  
  pcVar1 = "close notify";
  switch(value & 0xff) {
  case 0:
    goto switchD_009bf954_caseD_0;
  default:
    pcVar1 = "unknown";
switchD_009bf954_caseD_0:
    return pcVar1;
  case 10:
    return "unexpected_message";
  case 0x14:
    return "bad record mac";
  case 0x15:
    return "decryption failed";
  case 0x16:
    return "record overflow";
  case 0x1e:
    return "decompression failure";
  case 0x28:
    return "handshake failure";
  case 0x29:
    return "no certificate";
  case 0x2a:
    return "bad certificate";
  case 0x2b:
    return "unsupported certificate";
  case 0x2c:
    return "certificate revoked";
  case 0x2d:
    return "certificate expired";
  case 0x2e:
    return "certificate unknown";
  case 0x2f:
    return "illegal parameter";
  case 0x30:
    return "unknown CA";
  case 0x31:
    return "access denied";
  case 0x32:
    return "decode error";
  case 0x33:
    return "decrypt error";
  case 0x3c:
    return "export restriction";
  case 0x46:
    return "protocol version";
  case 0x47:
    return "insufficient security";
  case 0x50:
    return "internal error";
  case 0x5a:
    return "user canceled";
  case 100:
    return "no renegotiation";
  case 0x6e:
    return "unsupported extension";
  case 0x6f:
    return "certificate unobtainable";
  case 0x70:
    return "unrecognized name";
  case 0x71:
    return "bad certificate status response";
  case 0x72:
    return "bad certificate hash value";
  case 0x73:
    return "unknown PSK identity";
  case 0x78:
    return "no application protocol";
  }
}

