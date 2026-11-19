/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009570f8
 */

undefined8 FUN_009570f8(byte param_1)

{
  if (((byte)((param_1 & 0xdf) + 0xbf) < 0x1a) || ((byte)(param_1 - 0x30) < 10)) {
switchD_00957148_caseD_21:
    return 1;
  }
  switch(param_1) {
  case 0x21:
  case 0x24:
  case 0x25:
  case 0x26:
  case 0x27:
  case 0x28:
  case 0x29:
  case 0x2a:
  case 0x2b:
  case 0x2c:
  case 0x2d:
  case 0x2e:
  case 0x2f:
  case 0x3a:
  case 0x3d:
  case 0x40:
  case 0x5f:
  case 0x7e:
    goto switchD_00957148_caseD_21;
  default:
    return 0;
  }
}

