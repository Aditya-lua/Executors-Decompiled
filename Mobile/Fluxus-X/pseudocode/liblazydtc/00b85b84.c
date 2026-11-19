/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b85b84
 */

ulong mbedtls_asn1_write_tagged_string
                (ulong *param_1,ulong param_2,undefined1 param_3,void *param_4,ulong param_5)

{
  uint uVar1;
  ulong uVar2;
  ulong uVar3;
  int iVar4;
  
  uVar2 = *param_1;
  if ((param_2 <= uVar2) && (param_5 <= uVar2 - param_2)) {
    *param_1 = uVar2 - param_5;
    memcpy((void *)(uVar2 - param_5),param_4,param_5);
    iVar4 = (int)param_5;
    if (iVar4 < 0) goto LAB_00b85bbc;
    uVar2 = (ulong)iVar4;
    if (uVar2 >> 0x20 != 0) {
      param_5 = 0xffffff9c;
      goto LAB_00b85bbc;
    }
    uVar1 = 1;
    if (0x7f < uVar2) {
      uVar3 = uVar2;
      do {
        uVar3 = uVar3 >> 8;
        uVar1 = uVar1 + 1;
      } while (uVar3 != 0);
    }
    uVar3 = *param_1;
    if ((long)(ulong)uVar1 <= (long)(uVar3 - param_2)) {
      *param_1 = uVar3 - 1;
      *(char *)(uVar3 - 1) = (char)param_5;
      while (uVar2 >> 8 != 0) {
        uVar3 = *param_1;
        *param_1 = uVar3 - 1;
        *(char *)(uVar3 - 1) = (char)(uVar2 >> 8);
        uVar2 = uVar2 >> 8;
      }
      if (1 < uVar1) {
        uVar2 = *param_1;
        *param_1 = uVar2 - 1;
        *(char *)(uVar2 - 1) = (char)uVar1 + '\x7f';
      }
      uVar2 = *param_1;
      if (0 < (long)(uVar2 - param_2)) {
        param_5 = (ulong)(iVar4 + uVar1 + 1);
        *param_1 = uVar2 - 1;
        *(undefined1 *)(uVar2 - 1) = param_3;
        goto LAB_00b85bbc;
      }
    }
  }
  param_5 = 0xffffff94;
LAB_00b85bbc:
  return param_5 & 0xffffffff;
}

