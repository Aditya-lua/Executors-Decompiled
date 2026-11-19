/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7b534
 */

void FUN_00b7b534(uint *param_1,long param_2,long param_3,int param_4)

{
  uint uVar1;
  ulong uVar2;
  uint uVar3;
  uint uVar4;
  ulong uVar5;
  uint *puVar6;
  uint uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  
  uVar9 = (ulong)param_1[8];
  uVar10 = (ulong)param_1[9];
  uVar12 = (ulong)param_1[10];
  uVar14 = (ulong)param_1[0xb];
  uVar7 = param_1[0xc];
  if (param_2 != 0) {
    uVar1 = param_1[2];
    uVar3 = param_1[3];
    uVar2 = (ulong)*param_1;
    uVar4 = param_1[1];
    uVar5 = (ulong)uVar4;
    uVar16 = (ulong)(uVar3 + (uVar3 >> 2));
    uVar17 = (ulong)(uVar1 + (uVar1 >> 2));
    uVar18 = (ulong)(uVar4 + (uVar4 >> 2));
    puVar6 = (uint *)(param_3 + 8);
    do {
      param_2 = param_2 + -1;
      uVar9 = (ulong)puVar6[-2] + (uVar9 & 0xffffffff);
      uVar10 = (ulong)puVar6[-1] + (uVar10 & 0xffffffff) + (uVar9 >> 0x20);
      uVar9 = uVar9 & 0xffffffff;
      uVar12 = (ulong)*puVar6 + (uVar12 & 0xffffffff) + (uVar10 >> 0x20);
      uVar10 = uVar10 & 0xffffffff;
      uVar14 = (ulong)puVar6[1] + (uVar14 & 0xffffffff) + (uVar12 >> 0x20);
      uVar12 = uVar12 & 0xffffffff;
      uVar15 = uVar14 & 0xffffffff;
      uVar7 = uVar7 + param_4 + (int)(uVar14 >> 0x20);
      uVar11 = (ulong)uVar7;
      uVar13 = uVar9 * uVar2 + uVar10 * uVar16 + uVar12 * uVar17 + uVar15 * uVar18;
      uVar8 = uVar9 * uVar5 + uVar10 * uVar2 + uVar12 * uVar16 + uVar15 * uVar17 + (uVar13 >> 0x20)
              + uVar11 * uVar18;
      uVar14 = uVar9 * uVar1 + uVar10 * uVar5 + uVar12 * uVar2 + uVar15 * uVar16 + uVar11 * uVar17 +
               (uVar8 >> 0x20);
      uVar11 = uVar9 * uVar3 + uVar10 * uVar1 + uVar12 * uVar5 + uVar15 * uVar2 + uVar11 * uVar16 +
               (uVar14 >> 0x20);
      uVar7 = (int)(uVar11 >> 0x20) + uVar7 * *param_1;
      uVar9 = (ulong)(uVar7 >> 2) + (uVar13 & 0xffffffff) + (ulong)(uVar7 & 0xfffffffc);
      uVar10 = (uVar9 >> 0x20) + (uVar8 & 0xffffffff);
      uVar12 = (uVar10 >> 0x20) + (uVar14 & 0xffffffff);
      uVar14 = (uVar12 >> 0x20) + (uVar11 & 0xffffffff);
      uVar7 = (uVar7 & 3) + (int)(uVar14 >> 0x20);
      puVar6 = puVar6 + 4;
    } while (param_2 != 0);
  }
  param_1[8] = (uint)uVar9;
  param_1[9] = (uint)uVar10;
  param_1[10] = (uint)uVar12;
  param_1[0xb] = (uint)uVar14;
  param_1[0xc] = uVar7;
  return;
}

