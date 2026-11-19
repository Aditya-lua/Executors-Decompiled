/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b730b8
 */

uint mbedtls_ct_memcmp(long param_1,long param_2,ulong param_3)

{
  ulong uVar1;
  uint uVar2;
  ulong uVar3;
  byte *pbVar4;
  byte *pbVar5;
  ulong uVar6;
  long lVar7;
  
  if (param_3 < 4) {
    uVar2 = 0;
    uVar6 = 0;
    if (param_3 == 0) goto LAB_00b73138;
  }
  else {
    uVar2 = 0;
    uVar3 = 0;
    do {
      uVar6 = uVar3 + 4;
      uVar1 = uVar3 + 8;
      uVar2 = *(uint *)(param_2 + uVar3) ^ *(uint *)(param_1 + uVar3) | uVar2;
      uVar3 = uVar6;
    } while (uVar1 <= param_3);
    if (param_3 <= uVar6) goto LAB_00b73138;
  }
  lVar7 = param_3 - uVar6;
  pbVar4 = (byte *)(param_1 + uVar6);
  pbVar5 = (byte *)(param_2 + uVar6);
  do {
    lVar7 = lVar7 + -1;
    uVar2 = uVar2 | *pbVar5 ^ *pbVar4;
    pbVar4 = pbVar4 + 1;
    pbVar5 = pbVar5 + 1;
  } while (lVar7 != 0);
LAB_00b73138:
  return uVar2 & 0xffff | uVar2 >> 0x10;
}

