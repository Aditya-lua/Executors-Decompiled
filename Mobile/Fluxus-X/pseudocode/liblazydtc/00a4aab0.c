/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4aab0
 */

ulong gf_deserialize(long param_1,long param_2,int param_3,uint param_4)

{
  ulong *puVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  uint uVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  
  uVar6 = 0;
  uVar7 = 0;
  uVar8 = 0;
  uVar12 = 0;
  lVar10 = 0;
  uVar13 = 0;
  uVar9 = 0;
  do {
    if ((uVar8 < 0x38) && ((uint)uVar7 < 0x38)) {
      uVar7 = uVar7 & 0xffffffff;
      do {
        uVar4 = ~param_4;
        if (uVar7 != 0x37) {
          uVar4 = 0xffffffff;
        }
        uVar11 = (ulong)uVar8;
        uVar4 = *(byte *)(param_2 + uVar7) & uVar4;
        uVar5 = uVar11 - 0x40;
        uVar3 = 0;
        if (uVar11 != 0) {
          uVar3 = (ulong)(uVar4 >> (0x40 - uVar11 & 0x3f));
        }
        uVar8 = uVar8 + 8;
        uVar2 = (ulong)uVar4 << (uVar5 & 0x3f);
        if ((long)uVar5 < 0) {
          uVar2 = uVar3;
        }
        uVar3 = 0;
        if ((long)uVar5 < 0) {
          uVar3 = (ulong)uVar4 << (uVar11 & 0x3f);
        }
        uVar9 = uVar2 | uVar9;
        uVar13 = uVar3 | uVar13;
        uVar7 = uVar7 + 1;
      } while ((uVar8 < 0x38) && (uVar7 < 0x38));
    }
    uVar3 = uVar13 & 0xffffffffffffff;
    if (6 < uVar6) {
      uVar3 = uVar13;
    }
    *(ulong *)(param_1 + uVar6 * 8) = uVar3;
    puVar1 = &DAT_00760a40 + uVar6;
    uVar6 = uVar6 + 1;
    uVar12 = (lVar10 + (ulong)CARRY8(uVar3,uVar12)) - (ulong)(uVar3 + uVar12 < *puVar1);
    uVar8 = uVar8 - 0x38;
    uVar13 = uVar13 >> 0x38 | uVar9 << 8;
    uVar9 = uVar9 >> 0x38;
    lVar10 = (long)uVar12 >> 0x3f;
  } while (uVar6 != 8);
  if (param_3 == 0) {
    uVar7 = gf_hibit();
    uVar7 = ~uVar7;
  }
  else {
    uVar7 = 0xffffffffffffffff;
  }
  return (long)(uVar13 - 1 & (uVar13 ^ 0xffffffffffffffff)) >> 0x3f &
         ((long)(uVar12 - 1 & (uVar12 ^ 0xffffffffffffffff)) >> 0x3f ^ 0xffffffffffffffffU) & uVar7;
}

