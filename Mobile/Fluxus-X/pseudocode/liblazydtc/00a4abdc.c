/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4abdc
 */

void gf_sub(ulong *param_1,long *param_2,long *param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  
  uVar3 = (*param_2 + 0x1fffffffffffffe) - *param_3;
  *param_1 = uVar3;
  uVar4 = (param_2[1] + 0x1fffffffffffffe) - param_3[1];
  param_1[1] = uVar4;
  uVar1 = (uVar4 & 0xffffffffffffff) + (uVar3 >> 0x38);
  uVar5 = (param_2[2] + 0x1fffffffffffffe) - param_3[2];
  param_1[2] = uVar5;
  uVar4 = (uVar5 & 0xffffffffffffff) + (uVar4 >> 0x38);
  uVar6 = (param_2[3] + 0x1fffffffffffffe) - param_3[3];
  param_1[3] = uVar6;
  uVar5 = (uVar6 & 0xffffffffffffff) + (uVar5 >> 0x38);
  uVar7 = (param_2[4] + 0x1fffffffffffffc) - param_3[4];
  param_1[4] = uVar7;
  uVar8 = (param_2[5] + 0x1fffffffffffffe) - param_3[5];
  param_1[5] = uVar8;
  uVar9 = (param_2[6] + 0x1fffffffffffffe) - param_3[6];
  param_1[6] = uVar9;
  uVar2 = (param_2[7] + 0x1fffffffffffffe) - param_3[7];
  param_1[2] = (uVar4 & 0xffffffffffffff) + (uVar1 >> 0x38);
  param_1[3] = (uVar5 & 0xffffffffffffff) + (uVar4 >> 0x38);
  uVar10 = uVar2 >> 0x38;
  uVar4 = (uVar9 & 0xffffffffffffff) + (uVar8 >> 0x38);
  uVar7 = uVar10 + uVar7;
  uVar2 = (uVar2 & 0xffffffffffffff) + (uVar9 >> 0x38);
  uVar8 = (uVar8 & 0xffffffffffffff) + (uVar7 >> 0x38);
  uVar9 = uVar2 >> 0x38;
  uVar10 = uVar10 + (uVar3 & 0xffffffffffffff);
  uVar7 = (uVar7 & 0xffffffffffffff) + (uVar6 >> 0x38) + uVar9;
  param_1[6] = (uVar4 & 0xffffffffffffff) + (uVar8 >> 0x38);
  param_1[7] = (uVar2 & 0xffffffffffffff) + (uVar4 >> 0x38);
  param_1[4] = (uVar7 & 0xffffffffffffff) + (uVar5 >> 0x38);
  param_1[5] = (uVar8 & 0xffffffffffffff) + (uVar7 >> 0x38);
  *param_1 = (uVar10 & 0xffffffffffffff) + uVar9;
  param_1[1] = (uVar1 & 0xffffffffffffff) + (uVar10 >> 0x38);
  return;
}

