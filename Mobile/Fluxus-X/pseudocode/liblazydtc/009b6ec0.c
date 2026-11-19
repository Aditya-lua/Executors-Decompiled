/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6ec0
 */

char * ssl_protocol_to_string(int param_1)

{
  char *pcVar1;
  
  if (param_1 < 0xfefd) {
    pcVar1 = "TLSv1.3";
    switch(param_1) {
    case 0x300:
      return "SSLv3";
    case 0x301:
      return "TLSv1";
    case 0x302:
      return "TLSv1.1";
    case 0x303:
      return "TLSv1.2";
    case 0x304:
      goto switchD_009b6ef0_caseD_304;
    default:
      if (param_1 == 0x100) {
        return "DTLSv0.9";
      }
    }
  }
  else {
    if (param_1 == 0xfefd) {
      return "DTLSv1.2";
    }
    if (param_1 == 0xfeff) {
      return "DTLSv1";
    }
  }
  pcVar1 = "unknown";
switchD_009b6ef0_caseD_304:
  return pcVar1;
}

