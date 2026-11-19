/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7c2bc
 */

undefined8 mbedtls_asn1_get_bool(long *param_1,long param_2,uint *param_3)

{
  uint uVar1;
  char *pcVar2;
  byte *pbVar3;
  byte *pbVar4;
  ulong uVar5;
  int iVar6;
  
  pcVar2 = (char *)*param_1;
  if (param_2 - (long)pcVar2 < 1) {
    return 0xffffffa0;
  }
  if (*pcVar2 != '\x01') {
    return 0xffffff9e;
  }
  pbVar3 = (byte *)(pcVar2 + 1);
  *param_1 = (long)pbVar3;
  if (param_2 - (long)pbVar3 < 1) {
    return 0xffffffa0;
  }
  if ((char)*pbVar3 < '\0') {
    uVar1 = *pbVar3 & 0x7f;
    if (3 < uVar1 - 1) {
      return 0xffffff9c;
    }
    if (param_2 - (long)pbVar3 <= (long)(ulong)uVar1) {
      return 0xffffffa0;
    }
    uVar5 = 0;
    iVar6 = -uVar1;
    *param_1 = (long)(pcVar2 + 2);
    pbVar3 = (byte *)(pcVar2 + 2);
    do {
      pbVar4 = pbVar3 + 1;
      iVar6 = iVar6 + 1;
      uVar5 = (ulong)*pbVar3 | uVar5 << 8;
      *param_1 = (long)pbVar4;
      pbVar3 = pbVar4;
    } while (iVar6 != 0);
    pbVar3 = (byte *)(pcVar2 + (ulong)(uVar1 - 1) + 3);
  }
  else {
    pbVar3 = (byte *)(pcVar2 + 2);
    *param_1 = (long)pbVar3;
    uVar5 = (ulong)(byte)pcVar2[1];
    pbVar4 = pbVar3;
  }
  if ((ulong)(param_2 - (long)pbVar3) < uVar5) {
    return 0xffffffa0;
  }
  if (uVar5 == 1) {
    *param_3 = (uint)(*pbVar4 != 0);
    *param_1 = (long)(pbVar4 + 1);
    return 0;
  }
  return 0xffffff9c;
}

