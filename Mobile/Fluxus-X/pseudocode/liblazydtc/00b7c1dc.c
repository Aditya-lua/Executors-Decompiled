/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7c1dc
 */

undefined4 mbedtls_asn1_get_tag(long *param_1,long param_2,ulong *param_3,uint param_4)

{
  uint uVar1;
  undefined4 uVar2;
  byte *pbVar3;
  ulong uVar4;
  byte *pbVar5;
  int iVar6;
  
  pbVar3 = (byte *)*param_1;
  if (param_2 - (long)pbVar3 < 1) {
    return 0xffffffa0;
  }
  if (*pbVar3 != param_4) {
    return 0xffffff9e;
  }
  pbVar5 = pbVar3 + 1;
  *param_1 = (long)pbVar5;
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
    uVar4 = 0;
    pbVar5 = pbVar3 + 3;
    iVar6 = -uVar1;
    *param_3 = 0;
    *param_1 = (long)(pbVar3 + 2);
    do {
      iVar6 = iVar6 + 1;
      uVar4 = (ulong)pbVar5[-1] | uVar4 << 8;
      *param_3 = uVar4;
      *param_1 = (long)pbVar5;
      pbVar5 = pbVar5 + 1;
    } while (iVar6 != 0);
    pbVar5 = pbVar3 + (ulong)(uVar1 - 1) + 3;
  }
  else {
    pbVar5 = pbVar3 + 2;
    *param_1 = (long)pbVar5;
    uVar4 = (ulong)pbVar3[1];
    *param_3 = uVar4;
  }
  uVar2 = 0xffffffa0;
  if (uVar4 <= (ulong)(param_2 - (long)pbVar5)) {
    uVar2 = 0;
  }
  return uVar2;
}

