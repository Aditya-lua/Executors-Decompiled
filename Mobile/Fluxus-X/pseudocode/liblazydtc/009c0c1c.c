/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c0c1c
 */

ulong tls1_alert_code(ulong param_1)

{
  switch(param_1 & 0xffffffff) {
  case 0:
  case 10:
  case 0x14:
  case 0x15:
  case 0x16:
  case 0x1e:
  case 0x28:
  case 0x2a:
  case 0x2b:
  case 0x2c:
  case 0x2d:
  case 0x2e:
  case 0x2f:
  case 0x30:
  case 0x31:
  case 0x32:
  case 0x33:
  case 0x3c:
  case 0x46:
  case 0x47:
  case 0x50:
  case 0x56:
  case 0x5a:
  case 100:
  case 0x6e:
  case 0x6f:
  case 0x70:
  case 0x71:
  case 0x72:
  case 0x73:
  case 0x78:
    return param_1;
  default:
    return 0xffffffff;
  case 0x6d:
  case 0x74:
    return 0x28;
  }
}

