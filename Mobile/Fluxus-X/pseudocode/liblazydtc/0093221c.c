/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093221c
 */

undefined8 FUN_0093221c(ulong param_1,undefined8 param_2)

{
  char *pcVar1;
  ulong uVar2;
  ulong uVar3;
  
  if ((long)param_1 < 100000) {
    pcVar1 = "%5ld";
  }
  else if ((long)param_1 < 0x9c4000) {
    param_1 = param_1 >> 10 & 0x3fffff;
    pcVar1 = "%4ldk";
  }
  else {
    if ((long)param_1 < 0x6400000) {
      uVar2 = param_1 >> 0x14 & 0xfff;
      uVar3 = (ulong)((uint)param_1 & 0xfffff) / 0x19999;
      pcVar1 = "%2ld.%0ldM";
LAB_00932300:
      curl_msnprintf(param_2,6,pcVar1,uVar2,uVar3);
      return param_2;
    }
    if ((long)param_1 < 0x271000000) {
      param_1 = param_1 >> 0x14;
      pcVar1 = "%4ldM";
    }
    else {
      if ((long)param_1 < 0x1900000000) {
        uVar2 = param_1 >> 0x1e;
        uVar3 = (ulong)((uint)param_1 >> 1 & 0x1fffffff) / 0x3333333;
        pcVar1 = "%2ld.%0ldG";
        goto LAB_00932300;
      }
      if ((long)param_1 < 0x9c400000000) {
        param_1 = param_1 >> 0x1e;
        pcVar1 = "%4ldG";
      }
      else if ((long)param_1 < 0x27100000000000) {
        param_1 = param_1 >> 0x28;
        pcVar1 = "%4ldT";
      }
      else {
        param_1 = param_1 >> 0x32;
        pcVar1 = "%4ldP";
      }
    }
  }
  curl_msnprintf(param_2,6,pcVar1,param_1);
  return param_2;
}

