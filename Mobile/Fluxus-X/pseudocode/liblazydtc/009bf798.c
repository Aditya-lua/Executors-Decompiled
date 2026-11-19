/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bf798
 */

char * SSL_alert_desc_string(int value)

{
  char *pcVar1;
  
  pcVar1 = "CN";
  switch(value & 0xff) {
  case 0:
    goto switchD_009bf7c0_caseD_0;
  default:
    pcVar1 = "UK";
switchD_009bf7c0_caseD_0:
    return pcVar1;
  case 10:
    return "UM";
  case 0x14:
    return "BM";
  case 0x15:
    return "DC";
  case 0x16:
    return "RO";
  case 0x1e:
    return "DF";
  case 0x28:
    return "HF";
  case 0x29:
    return "NC";
  case 0x2a:
    return "BC";
  case 0x2b:
    return "UC";
  case 0x2c:
    return "CR";
  case 0x2d:
    return "CE";
  case 0x2e:
    return "CU";
  case 0x2f:
    return "IP";
  case 0x30:
    return "CA";
  case 0x31:
    return "AD";
  case 0x32:
    return "DE";
  case 0x33:
    return "CY";
  case 0x3c:
    return "ER";
  case 0x46:
    return "PV";
  case 0x47:
    return "IS";
  case 0x50:
    return "IE";
  case 0x5a:
    return "US";
  case 100:
    return "NR";
  case 0x6e:
    return "UE";
  case 0x6f:
    return "CO";
  case 0x70:
    return "UN";
  case 0x71:
    return "BR";
  case 0x72:
    return "BH";
  case 0x73:
    return "UP";
  }
}

