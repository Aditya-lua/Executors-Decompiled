/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7c13c
 */

undefined4 mbedtls_asn1_get_len(long *param_1,long param_2,ulong *param_3)

{
  uint uVar1;
  undefined4 uVar2;
  byte *pbVar3;
  int iVar4;
  byte *pbVar5;
  ulong uVar6;
  
  pbVar5 = (byte *)*param_1;
  if (param_2 - (long)pbVar5 < 1) {
    return 0xffffffa0;
  }
  if ((char)*pbVar5 < '\0') {
    uVar1 = *pbVar5 & 0x7f;
    if (3 < uVar1 - 1) {
      return 0xffffff9c;
    }
    if (param_2 - (long)pbVar5 <= (long)(ulong)uVar1) {
      return 0xffffffa0;
    }
    uVar6 = 0;
    iVar4 = -uVar1;
    *param_3 = 0;
    *param_1 = (long)(pbVar5 + 1);
    pbVar5 = pbVar5 + 1;
    do {
      pbVar3 = pbVar5 + 1;
      iVar4 = iVar4 + 1;
      uVar6 = (ulong)*pbVar5 | uVar6 << 8;
      *param_3 = uVar6;
      *param_1 = (long)pbVar3;
      pbVar5 = pbVar3;
    } while (iVar4 != 0);
  }
  else {
    pbVar3 = pbVar5 + 1;
    *param_1 = (long)pbVar3;
    uVar6 = (ulong)*pbVar5;
    *param_3 = uVar6;
  }
  uVar2 = 0xffffffa0;
  if (uVar6 <= (ulong)(param_2 - (long)pbVar3)) {
    uVar2 = 0;
  }
  return uVar2;
}

