/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b73144
 */

uint mbedtls_ct_memcmp_partial(long param_1,long param_2,long param_3,long param_4,long param_5)

{
  byte *pbVar1;
  byte *pbVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  
  uVar7 = 0;
  if (param_3 != 0) {
    lVar8 = 0;
    do {
      pbVar1 = (byte *)(param_1 + lVar8);
      pbVar2 = (byte *)(param_2 + lVar8);
      uVar5 = (uint)((ulong)param_4 >> 0x20);
      uVar4 = (uint)((ulong)lVar8 >> 0x20);
      uVar3 = uVar5 ^ uVar4;
      lVar9 = lVar8 - param_4;
      uVar6 = (uint)((ulong)(param_3 - param_5) >> 0x20);
      uVar4 = uVar6 ^ uVar4;
      lVar10 = lVar8 - (param_3 - param_5);
      lVar8 = lVar8 + 1;
      uVar7 = (int)((uint)((ulong)lVar10 >> 0x20) & (uVar4 ^ 0xffffffff) | uVar4 & uVar6) >> 0x1f &
              ((int)((uint)((ulong)lVar9 >> 0x20) & (uVar3 ^ 0xffffffff) | uVar3 & uVar5) >> 0x1f ^
              0xffffffffU) & (uint)(*pbVar2 ^ *pbVar1) | uVar7;
    } while (param_3 != lVar8);
  }
  return uVar7;
}

