/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4a944
 */

void gf_add(ulong *param_1,long *param_2,long *param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  long lVar14;
  
  uVar1 = *param_3 + *param_2;
  *param_1 = uVar1;
  uVar2 = param_3[1] + param_2[1];
  param_1[1] = uVar2;
  uVar3 = param_3[2] + param_2[2];
  param_1[2] = uVar3;
  uVar4 = (uVar3 & 0xffffffffffffff) + (uVar2 >> 0x38);
  uVar5 = param_3[3] + param_2[3];
  param_1[3] = uVar5;
  lVar9 = param_2[4];
  lVar10 = param_3[4];
  uVar3 = (uVar5 & 0xffffffffffffff) + (uVar3 >> 0x38);
  uVar2 = (uVar2 & 0xffffffffffffff) + (uVar1 >> 0x38);
  param_1[4] = lVar10 + lVar9;
  uVar6 = param_3[5] + param_2[5];
  param_1[5] = uVar6;
  uVar7 = param_3[6] + param_2[6];
  param_1[6] = uVar7;
  lVar13 = param_2[7];
  lVar14 = param_3[7];
  param_1[2] = (uVar4 & 0xffffffffffffff) + (uVar2 >> 0x38);
  param_1[3] = (uVar3 & 0xffffffffffffff) + (uVar4 >> 0x38);
  uVar11 = (ulong)(lVar14 + lVar13) >> 0x38;
  uVar4 = (uVar7 & 0xffffffffffffff) + (uVar6 >> 0x38);
  uVar8 = uVar11 + lVar10 + lVar9;
  uVar7 = (lVar14 + lVar13 & 0xffffffffffffffU) + (uVar7 >> 0x38);
  uVar6 = (uVar6 & 0xffffffffffffff) + (uVar8 >> 0x38);
  uVar11 = uVar11 + (uVar1 & 0xffffffffffffff);
  uVar12 = uVar7 >> 0x38;
  uVar1 = (uVar8 & 0xffffffffffffff) + (uVar5 >> 0x38) + uVar12;
  param_1[6] = (uVar4 & 0xffffffffffffff) + (uVar6 >> 0x38);
  param_1[7] = (uVar7 & 0xffffffffffffff) + (uVar4 >> 0x38);
  param_1[4] = (uVar1 & 0xffffffffffffff) + (uVar3 >> 0x38);
  param_1[5] = (uVar6 & 0xffffffffffffff) + (uVar1 >> 0x38);
  *param_1 = (uVar11 & 0xffffffffffffff) + uVar12;
  param_1[1] = (uVar2 & 0xffffffffffffff) + (uVar11 >> 0x38);
  return;
}

