/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fb0cc
 */

/* cpr::Error::getErrorCodeForCurlError(int) */

int cpr::Error::getErrorCodeForCurlError(int param_1)

{
  switch(param_1) {
  case 0:
    goto switchD_008fb0e8_caseD_0;
  case 1:
    return 0xf;
  default:
    param_1 = 4;
switchD_008fb0e8_caseD_0:
    return param_1;
  case 3:
    return 5;
  case 5:
    return 9;
  case 6:
    return 3;
  case 7:
    return 1;
  case 0x17:
  case 0x2a:
    return 0x10;
  case 0x1c:
    return 8;
  case 0x23:
    return 10;
  case 0x2f:
    return 0x11;
  case 0x34:
    return 2;
  case 0x35:
  case 0x36:
    return 0xe;
  case 0x37:
    return 7;
  case 0x38:
    return 6;
  case 0x3a:
    return 0xb;
  case 0x3b:
    return 0xe;
  case 0x3c:
    return 0xc;
  case 0x40:
  case 0x42:
    return 0xe;
  case 0x4d:
    return 0xd;
  case 0x50:
    return 0xe;
  case 0x52:
  case 0x53:
    return 0xd;
  }
}

