/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a11948
 */

undefined8 FUN_00a11948(char *param_1,int param_2,undefined4 *param_3,undefined4 *param_4)

{
  ulong uVar1;
  ulong uVar2;
  undefined4 uVar3;
  byte *local_38;
  
  if (param_1 == (char *)0x0) {
    return 0;
  }
  uVar1 = strtoul(param_1,(char **)&local_38,10);
  uVar2 = uVar1;
  if (((local_38 != (byte *)0x0) && (*local_38 != 0)) && (uVar2 = 0, param_1 + param_2 < local_38))
  {
    return 0;
  }
  if ((long)uVar1 < 0) {
    ERR_new(uVar2);
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x166,"parse_tagging");
    ERR_set_error(0xd,0xbb,0);
    return 0;
  }
  *param_3 = (int)uVar1;
  if ((local_38 == (byte *)0x0) || (((int)param_1 - (int)local_38) + param_2 == 0)) {
switchD_00a11a2c_caseD_43:
    uVar3 = 0x80;
  }
  else {
    switch(*local_38) {
    case 0x41:
      uVar3 = 0x40;
      break;
    default:
      ERR_new(uVar2);
      ERR_set_debug("crypto/asn1/asn1_gen.c",0x183,"parse_tagging");
      ERR_set_error(0xd,0xba,"Char=%c",*local_38);
      return 0;
    case 0x43:
      goto switchD_00a11a2c_caseD_43;
    case 0x50:
      uVar3 = 0xc0;
      break;
    case 0x55:
      *param_4 = 0;
      return 1;
    }
  }
  *param_4 = uVar3;
  return 1;
}

