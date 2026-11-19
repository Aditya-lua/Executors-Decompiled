/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7c800
 */

undefined4 mbedtls_asn1_get_bitstring(ulong *param_1,ulong param_2,ulong *param_3)

{
  uint uVar1;
  byte bVar2;
  undefined4 uVar3;
  char *pcVar4;
  byte *pbVar5;
  byte *pbVar6;
  ulong uVar7;
  ulong uVar8;
  int iVar9;
  
  pcVar4 = (char *)*param_1;
  if ((long)(param_2 - (long)pcVar4) < 1) {
    return 0xffffffa0;
  }
  if (*pcVar4 != '\x03') {
    return 0xffffff9e;
  }
  pbVar5 = (byte *)(pcVar4 + 1);
  *param_1 = (ulong)pbVar5;
  if ((long)(param_2 - (long)pbVar5) < 1) {
    return 0xffffffa0;
  }
  if ((char)*pbVar5 < '\0') {
    uVar1 = *pbVar5 & 0x7f;
    if (3 < uVar1 - 1) {
      return 0xffffff9c;
    }
    if ((long)(param_2 - (long)pbVar5) <= (long)(ulong)uVar1) {
      return 0xffffffa0;
    }
    uVar8 = 0;
    iVar9 = -uVar1;
    *param_3 = 0;
    *param_1 = (ulong)(pcVar4 + 2);
    pbVar5 = (byte *)(pcVar4 + 2);
    do {
      pbVar6 = pbVar5 + 1;
      iVar9 = iVar9 + 1;
      uVar8 = (ulong)*pbVar5 | uVar8 << 8;
      *param_3 = uVar8;
      *param_1 = (ulong)pbVar6;
      pbVar5 = pbVar6;
    } while (iVar9 != 0);
    pbVar5 = (byte *)(pcVar4 + (ulong)(uVar1 - 1) + 3);
  }
  else {
    pbVar5 = (byte *)(pcVar4 + 2);
    *param_1 = (ulong)pbVar5;
    uVar8 = (ulong)(byte)pcVar4[1];
    *param_3 = uVar8;
    pbVar6 = pbVar5;
  }
  uVar8 = uVar8 - 1;
  if (param_2 - (long)pbVar5 <= uVar8) {
    return 0xffffffa0;
  }
  *param_3 = uVar8;
  bVar2 = *pbVar6;
  *(byte *)(param_3 + 1) = bVar2;
  if (7 < bVar2) {
    return 0xffffff9c;
  }
  *param_1 = (ulong)(pbVar6 + 1);
  param_3[2] = (ulong)(pbVar6 + 1);
  uVar7 = *param_1;
  *param_1 = uVar7 + uVar8;
  uVar3 = 0;
  if (uVar7 + uVar8 != param_2) {
    uVar3 = 0xffffff9a;
  }
  return uVar3;
}

