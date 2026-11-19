/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7c3d8
 */

undefined8 mbedtls_asn1_get_int(long *param_1,long param_2,uint *param_3)

{
  byte *pbVar1;
  byte *pbVar2;
  ulong uVar3;
  byte bVar4;
  char *pcVar5;
  uint uVar6;
  int iVar7;
  
  pcVar5 = (char *)*param_1;
  if (param_2 - (long)pcVar5 < 1) {
    return 0xffffffa0;
  }
  if (*pcVar5 != '\x02') {
    return 0xffffff9e;
  }
  pbVar1 = (byte *)(pcVar5 + 1);
  *param_1 = (long)pbVar1;
  if (param_2 - (long)pbVar1 < 1) {
    return 0xffffffa0;
  }
  if ((char)*pbVar1 < '\0') {
    uVar6 = *pbVar1 & 0x7f;
    if (3 < uVar6 - 1) {
      return 0xffffff9c;
    }
    if (param_2 - (long)pbVar1 <= (long)(ulong)uVar6) {
      return 0xffffffa0;
    }
    uVar3 = 0;
    iVar7 = -uVar6;
    *param_1 = (long)(pcVar5 + 2);
    pbVar1 = (byte *)(pcVar5 + 2);
    do {
      pbVar2 = pbVar1 + 1;
      iVar7 = iVar7 + 1;
      uVar3 = (ulong)*pbVar1 | uVar3 << 8;
      *param_1 = (long)pbVar2;
      pbVar1 = pbVar2;
    } while (iVar7 != 0);
    pbVar1 = (byte *)(pcVar5 + (ulong)(uVar6 - 1) + 3);
  }
  else {
    pbVar2 = (byte *)(pcVar5 + 2);
    *param_1 = (long)pbVar2;
    uVar3 = (ulong)(byte)pcVar5[1];
    pbVar1 = pbVar2;
  }
  if ((ulong)(param_2 - (long)pbVar1) < uVar3) {
    return 0xffffffa0;
  }
  if (uVar3 == 0) {
    return 0xffffff9c;
  }
  bVar4 = *pbVar2;
  if ((char)bVar4 < '\0') {
    return 0xffffff9c;
  }
  if (bVar4 == 0) {
    do {
      pbVar2 = pbVar2 + 1;
      uVar3 = uVar3 - 1;
      *param_1 = (long)pbVar2;
      if (uVar3 == 0) {
        *param_3 = 0;
        return 0;
      }
      bVar4 = *pbVar2;
    } while (bVar4 == 0);
  }
  if (4 < uVar3) {
    return 0xffffff9c;
  }
  if ((uVar3 == 4) && ((char)bVar4 < '\0')) {
    return 0xffffff9c;
  }
  uVar6 = 0;
  *param_3 = 0;
  do {
    uVar3 = uVar3 - 1;
    uVar6 = (uint)*pbVar2 | uVar6 << 8;
    *param_3 = uVar6;
    *param_1 = (long)(pbVar2 + 1);
    pbVar2 = pbVar2 + 1;
  } while (uVar3 != 0);
  return 0;
}

