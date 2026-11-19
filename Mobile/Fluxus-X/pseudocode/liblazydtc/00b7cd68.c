/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7cd68
 */

undefined4 mbedtls_asn1_get_alg(long *param_1,long param_2,uint *param_3,uint *param_4)

{
  uint uVar1;
  byte bVar2;
  undefined4 uVar3;
  byte *pbVar5;
  byte *pbVar4;
  ulong uVar6;
  long lVar7;
  char *pcVar8;
  ulong uVar9;
  int iVar10;
  byte *pbVar11;
  
  pcVar8 = (char *)*param_1;
  if (param_2 - (long)pcVar8 < 1) {
    return 0xffffffa0;
  }
  if (*pcVar8 != '0') {
    return 0xffffff9e;
  }
  pbVar5 = (byte *)(pcVar8 + 1);
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
    uVar6 = 0;
    iVar10 = -uVar1;
    *param_1 = (long)(pcVar8 + 2);
    pbVar5 = (byte *)(pcVar8 + 2);
    do {
      pbVar4 = pbVar5 + 1;
      iVar10 = iVar10 + 1;
      uVar6 = (ulong)*pbVar5 | uVar6 << 8;
      *param_1 = (long)pbVar4;
      pbVar5 = pbVar4;
    } while (iVar10 != 0);
    pbVar5 = (byte *)(pcVar8 + (ulong)(uVar1 - 1) + 3);
  }
  else {
    pbVar4 = (byte *)(pcVar8 + 2);
    *param_1 = (long)pbVar4;
    uVar6 = (ulong)(byte)pcVar8[1];
    pbVar5 = pbVar4;
  }
  if ((ulong)(param_2 - (long)pbVar5) < uVar6) {
    return 0xffffffa0;
  }
  if (param_2 - (long)pbVar4 < 1) {
    return 0xffffffa0;
  }
  *param_3 = (uint)*pbVar4;
  if ((long)uVar6 < 1) {
    return 0xffffffa0;
  }
  if (*pbVar4 != 6) {
    return 0xffffff9e;
  }
  *param_1 = (long)(pbVar4 + 1);
  if ((long)(uVar6 - 1) < 1) {
    return 0xffffffa0;
  }
  bVar2 = pbVar4[1];
  if ((char)bVar2 < '\0') {
    uVar1 = bVar2 & 0x7f;
    if (3 < uVar1 - 1) {
      return 0xffffff9c;
    }
    if ((long)(uVar6 - 1) <= (long)(ulong)uVar1) {
      return 0xffffffa0;
    }
    uVar9 = 0;
    iVar10 = -uVar1;
    param_3[2] = 0;
    param_3[3] = 0;
    *param_1 = (long)(pbVar4 + 2);
    pbVar5 = pbVar4 + 2;
    do {
      pbVar11 = pbVar5 + 1;
      iVar10 = iVar10 + 1;
      uVar9 = (ulong)*pbVar5 | uVar9 << 8;
      *(ulong *)(param_3 + 2) = uVar9;
      *param_1 = (long)pbVar11;
      pbVar5 = pbVar11;
    } while (iVar10 != 0);
    pbVar5 = pbVar4 + (ulong)(uVar1 - 1) + 3;
  }
  else {
    pbVar11 = pbVar4 + 2;
    *param_1 = (long)pbVar11;
    uVar9 = (ulong)pbVar4[1];
    *(ulong *)(param_3 + 2) = uVar9;
    pbVar5 = pbVar11;
  }
  pbVar4 = pbVar4 + uVar6;
  if ((ulong)((long)pbVar4 - (long)pbVar5) < uVar9) {
    return 0xffffffa0;
  }
  *(byte **)(param_3 + 4) = pbVar11;
  lVar7 = *param_1;
  pbVar5 = (byte *)(lVar7 + uVar9);
  *param_1 = (long)pbVar5;
  if (pbVar5 == pbVar4) {
    mbedtls_platform_zeroize(param_4,0x18);
    return 0;
  }
  pbVar11 = pbVar5 + 1;
  *param_4 = (uint)*pbVar5;
  *param_1 = (long)pbVar11;
  if ((long)pbVar4 - (long)pbVar11 < 1) {
    return 0xffffffa0;
  }
  if ((char)*pbVar11 < '\0') {
    uVar1 = *pbVar11 & 0x7f;
    if (3 < uVar1 - 1) {
      return 0xffffff9c;
    }
    if ((long)pbVar4 - (long)pbVar11 <= (long)(ulong)uVar1) {
      return 0xffffffa0;
    }
    uVar6 = 0;
    iVar10 = -uVar1;
    param_4[2] = 0;
    param_4[3] = 0;
    *param_1 = (long)(pbVar5 + 2);
    pbVar5 = pbVar5 + 2;
    do {
      pbVar11 = pbVar5 + 1;
      iVar10 = iVar10 + 1;
      uVar6 = (ulong)*pbVar5 | uVar6 << 8;
      *(ulong *)(param_4 + 2) = uVar6;
      *param_1 = (long)pbVar11;
      pbVar5 = pbVar11;
    } while (iVar10 != 0);
    pbVar5 = (byte *)(lVar7 + uVar9 + (uVar1 - 1) + 3);
  }
  else {
    pbVar5 = pbVar5 + 2;
    *param_1 = (long)pbVar5;
    uVar6 = (ulong)*pbVar11;
    *(ulong *)(param_4 + 2) = uVar6;
    pbVar11 = pbVar5;
  }
  if ((ulong)((long)pbVar4 - (long)pbVar5) < uVar6) {
    return 0xffffffa0;
  }
  *(byte **)(param_4 + 4) = pbVar11;
  lVar7 = *param_1;
  *param_1 = (long)(lVar7 + uVar6);
  uVar3 = 0;
  if ((byte *)(lVar7 + uVar6) != pbVar4) {
    uVar3 = 0xffffff9a;
  }
  return uVar3;
}

