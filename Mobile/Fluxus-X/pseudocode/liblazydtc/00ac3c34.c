/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac3c34
 */

void FUN_00ac3c34(uint *param_1,uint *param_2,ulong param_3,int param_4)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  uint uVar7;
  ulong uVar8;
  uint uVar9;
  uint uVar10;
  ulong uVar11;
  uint uVar12;
  ulong uVar13;
  uint uVar14;
  ulong uVar15;
  ulong uVar16;
  uint uVar17;
  uint uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  uint uVar22;
  uint uVar23;
  
  uVar14 = *param_1;
  uVar18 = param_1[1];
  uVar12 = param_1[2];
  uVar17 = param_1[3];
  uVar22 = param_1[4];
  if (0xf < param_3) {
    uVar7 = param_1[6];
    uVar8 = (ulong)uVar7;
    uVar9 = param_1[7];
    uVar10 = param_1[8];
    uVar21 = (ulong)param_1[5];
    uVar7 = uVar7 + (uVar7 >> 2);
    uVar1 = uVar9 + (uVar9 >> 2);
    uVar2 = uVar10 + (uVar10 >> 2);
    uVar11 = (ulong)uVar2;
    do {
      uVar4 = ((ulong)*param_2 + (ulong)uVar14 >> 0x20) + (ulong)uVar18 + (ulong)param_2[1];
      uVar15 = (ulong)*param_2 + (ulong)uVar14 & 0xffffffff;
      uVar19 = uVar4 & 0xffffffff;
      uVar4 = (uVar4 >> 0x20) + (ulong)uVar12 + (ulong)param_2[2];
      uVar16 = uVar4 & 0xffffffff;
      uVar4 = (uVar4 >> 0x20) + (ulong)uVar17 + (ulong)param_2[3];
      uVar13 = uVar4 & 0xffffffff;
      iVar3 = uVar22 + param_4 + (int)(uVar4 >> 0x20);
      uVar20 = uVar15 * uVar21 + uVar19 * uVar11 + uVar16 * uVar1 + uVar13 * uVar7;
      uVar4 = uVar15 * uVar8 + uVar19 * uVar21 + uVar16 * uVar11 + uVar13 * uVar1 + (uVar20 >> 0x20)
              + (ulong)(iVar3 * uVar7);
      uVar5 = uVar15 * uVar9 + uVar19 * uVar8 + uVar16 * uVar21 + uVar13 * uVar11 +
              (ulong)(iVar3 * uVar1) + (uVar4 >> 0x20);
      lVar6 = uVar15 * uVar10 + uVar19 * uVar9 + uVar16 * uVar8 + uVar13 * uVar21 +
              (ulong)(iVar3 * uVar2) + (uVar5 >> 0x20);
      uVar22 = (int)((ulong)lVar6 >> 0x20) + iVar3 * param_1[5];
      uVar18 = (uVar22 & 0xfffffffc) + (uVar22 >> 2);
      uVar17 = (uint)uVar20;
      uVar14 = uVar18 + uVar17;
      uVar12 = (uint)uVar4;
      uVar18 = uVar12 - ((int)((uVar14 ^ uVar18 | uVar18 ^ uVar17) ^ uVar14) >> 0x1f);
      uVar17 = (uint)uVar5;
      uVar12 = uVar17 - ((int)(uVar12 & (uVar18 ^ 0xffffffff)) >> 0x1f);
      uVar23 = (uint)lVar6;
      uVar17 = uVar23 - ((int)(uVar17 & (uVar12 ^ 0xffffffff)) >> 0x1f);
      param_3 = param_3 - 0x10;
      uVar22 = (uVar22 & 3) - ((int)(uVar23 & (uVar17 ^ 0xffffffff)) >> 0x1f);
      param_2 = param_2 + 4;
    } while (0xf < param_3);
  }
  *param_1 = uVar14;
  param_1[1] = uVar18;
  param_1[2] = uVar12;
  param_1[3] = uVar17;
  param_1[4] = uVar22;
  return;
}

