/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b85ed8
 */

ulong mbedtls_asn1_write_ia5_string(ulong *param_1,ulong param_2,void *param_3,ulong param_4)

{
  uint uVar1;
  ulong uVar2;
  ulong uVar3;
  int iVar4;
  
  uVar2 = *param_1;
  if ((param_2 <= uVar2) && (param_4 <= uVar2 - param_2)) {
    *param_1 = uVar2 - param_4;
    memcpy((void *)(uVar2 - param_4),param_3,param_4);
    iVar4 = (int)param_4;
    if (iVar4 < 0) goto LAB_00b85f0c;
    uVar2 = (ulong)iVar4;
    if (uVar2 >> 0x20 != 0) {
      param_4 = 0xffffff9c;
      goto LAB_00b85f0c;
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
      *(char *)(uVar3 - 1) = (char)param_4;
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
        param_4 = (ulong)(iVar4 + uVar1 + 1);
        *param_1 = uVar2 - 1;
        *(undefined1 *)(uVar2 - 1) = 0x16;
        goto LAB_00b85f0c;
      }
    }
  }
  param_4 = 0xffffff94;
LAB_00b85f0c:
  return param_4 & 0xffffffff;
}

