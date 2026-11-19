/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baa2a0
 */

int mbedtls_oid_get_numeric_string(char *param_1,ulong param_2,long param_3)

{
  byte bVar1;
  bool bVar2;
  int iVar3;
  uint param4;
  uchar param3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong __maxlen;
  ulong uVar7;
  
  if (param_2 >> 0x1f == 0) {
    uVar4 = *(ulong *)(param_3 + 8);
    if (uVar4 != 0) {
      uVar7 = 0;
      uVar5 = 0;
      __maxlen = param_2;
      do {
        if (uVar5 >> 0x19 != 0) {
          return -0x68;
        }
        bVar1 = *(byte *)(*(long *)(param_3 + 0x10) + uVar7);
        if (((int)uVar5 == 0) && (bVar1 == 0x80)) {
          return -0x68;
        }
        param4 = bVar1 & 0x7f | (int)uVar5 << 7;
        uVar5 = (ulong)param4;
        if (-1 < (char)bVar1) {
          if (__maxlen == param_2) {
            if (param4 < 0x50) {
              param3 = '0';
              if (0x27 < param4) {
                param3 = '1';
                param4 = param4 - 0x28;
              }
            }
            else {
              param3 = '2';
              param4 = param4 - 0x50;
            }
            iVar3 = snprintf(param_1,param_2,"%c.%u",param3,param4);
          }
          else {
            iVar3 = snprintf(param_1,__maxlen,".%u");
          }
          if (iVar3 < 2) {
            return -0xb;
          }
          uVar6 = (ulong)iVar3;
          bVar2 = __maxlen < uVar6;
          __maxlen = __maxlen - uVar6;
          if (bVar2 || __maxlen == 0) {
            return -0xb;
          }
          uVar4 = *(ulong *)(param_3 + 8);
          uVar5 = 0;
          param_1 = param_1 + uVar6;
        }
        uVar7 = uVar7 + 1;
      } while (uVar7 < uVar4);
      if ((int)uVar5 == 0) {
        return (int)param_2 - (int)__maxlen;
      }
    }
    iVar3 = -0x60;
  }
  else {
    iVar3 = -100;
  }
  return iVar3;
}

