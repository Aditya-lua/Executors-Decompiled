/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd87dc
 */

char * FUN_00bd87dc(uint param_1)

{
  char *pcVar1;
  
  pcVar1 = "we";
  switch(param_1 & 0xfffffffd) {
  case 1:
  case 0x11:
    return "ae";
  default:
    pcVar1 = (char *)0x0;
code_r0x00bd890c:
    return pcVar1;
  case 5:
  case 0x15:
    return "abe";
  case 8:
    return "re";
  case 9:
  case 0x19:
    return "a+e";
  case 0xc:
    return "rbe";
  case 0xd:
  case 0x1d:
    return "a+be";
  case 0x10:
  case 0x30:
    goto code_r0x00bd890c;
  case 0x14:
  case 0x34:
    return "wbe";
  case 0x18:
    return "r+e";
  case 0x1c:
    return "r+be";
  case 0x38:
    return "w+e";
  case 0x3c:
    return "w+be";
  case 0x50:
  case 0x70:
    return "wxe";
  case 0x54:
  case 0x74:
    return "wbxe";
  case 0x78:
    return "w+xe";
  case 0x7c:
    return "w+bxe";
  }
}

