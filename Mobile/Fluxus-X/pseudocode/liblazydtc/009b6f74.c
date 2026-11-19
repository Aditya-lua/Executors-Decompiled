/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6f74
 */

char * SSL_get_version(SSL *s)

{
  int iVar1;
  char *pcVar2;
  
  iVar1 = s->version;
  if (iVar1 < 0xfefd) {
    pcVar2 = "TLSv1.3";
    switch(iVar1) {
    case 0x300:
      return "SSLv3";
    case 0x301:
      return "TLSv1";
    case 0x302:
      return "TLSv1.1";
    case 0x303:
      return "TLSv1.2";
    case 0x304:
      goto switchD_009b6fa8_caseD_304;
    default:
      if (iVar1 == 0x100) {
        return "DTLSv0.9";
      }
    }
  }
  else {
    if (iVar1 == 0xfefd) {
      return "DTLSv1.2";
    }
    if (iVar1 == 0xfeff) {
      return "DTLSv1";
    }
  }
  pcVar2 = "unknown";
switchD_009b6fa8_caseD_304:
  return pcVar2;
}

