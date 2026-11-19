/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4a620
 */

void gf_strong_reduce(ulong *param_1)

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
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  ulong uVar15;
  
  uVar13 = param_1[7] >> 0x38;
  uVar1 = (param_1[7] & 0xffffffffffffff) + (param_1[6] >> 0x38);
  uVar2 = (param_1[6] & 0xffffffffffffff) + (param_1[5] >> 0x38);
  uVar3 = (param_1[3] & 0xffffffffffffff) + (param_1[2] >> 0x38);
  uVar8 = (param_1[2] & 0xffffffffffffff) + (param_1[1] >> 0x38);
  uVar9 = (param_1[1] & 0xffffffffffffff) + (*param_1 >> 0x38);
  uVar11 = param_1[4] + uVar13;
  uVar13 = (*param_1 & 0xffffffffffffff) + uVar13;
  uVar7 = (param_1[5] & 0xffffffffffffff) + (uVar11 >> 0x38);
  uVar11 = (uVar11 & 0xffffffffffffff) + (param_1[3] >> 0x38);
  lVar14 = (ulong)(0xfffffffffffffe < uVar13) - 1;
  uVar5 = uVar13 + 0xff00000000000001 >> 0x38 | lVar14 * 0x100;
  uVar10 = uVar5 + uVar9;
  uVar4 = uVar10 + 0xff00000000000001;
  lVar14 = (lVar14 >> 0x38) + (ulong)CARRY8(uVar5,uVar9) + -1 + (ulong)(0xfffffffffffffe < uVar10);
  uVar5 = uVar4 >> 0x38 | lVar14 * 0x100;
  uVar9 = uVar5 + uVar8;
  uVar10 = uVar9 + 0xff00000000000001;
  lVar14 = (lVar14 >> 0x38) + (ulong)CARRY8(uVar5,uVar8) + -1 + (ulong)(0xfffffffffffffe < uVar9);
  uVar5 = uVar10 >> 0x38 | lVar14 * 0x100;
  uVar8 = uVar5 + uVar3;
  uVar9 = uVar8 + 0xff00000000000001;
  lVar14 = (lVar14 >> 0x38) + (ulong)CARRY8(uVar5,uVar3) + -1 + (ulong)(0xfffffffffffffe < uVar8);
  uVar5 = uVar9 >> 0x38 | lVar14 * 0x100;
  uVar3 = uVar5 + uVar11;
  uVar8 = uVar3 + 0xff00000000000002;
  lVar14 = (lVar14 >> 0x38) + (ulong)CARRY8(uVar5,uVar11) + -1 + (ulong)(0xfffffffffffffd < uVar3);
  uVar5 = uVar8 & 0xffffffffffffff;
  uVar11 = uVar8 >> 0x38 | lVar14 * 0x100;
  uVar3 = uVar11 + uVar7;
  uVar8 = uVar3 + 0xff00000000000001;
  lVar14 = (lVar14 >> 0x38) + (ulong)CARRY8(uVar11,uVar7) + -1 + (ulong)(0xfffffffffffffe < uVar3);
  uVar15 = uVar8 & 0xffffffffffffff;
  uVar11 = uVar8 >> 0x38 | lVar14 * 0x100;
  uVar3 = uVar11 + uVar2;
  uVar8 = uVar3 + 0xff00000000000001;
  lVar14 = (lVar14 >> 0x38) + (ulong)CARRY8(uVar11,uVar2) + -1 + (ulong)(0xfffffffffffffe < uVar3);
  uVar12 = uVar8 & 0xffffffffffffff;
  uVar8 = uVar8 >> 0x38 | lVar14 * 0x100;
  uVar2 = uVar8 + uVar1;
  uVar3 = uVar2 + 0xff00000000000001;
  uVar7 = uVar3 >> 0x38;
  uVar1 = ((lVar14 >> 0x38) + (ulong)CARRY8(uVar8,uVar1) + -1 + (ulong)(0xfffffffffffffe < uVar2)) *
          0x100;
  uVar6 = uVar7 | uVar1;
  uVar7 = uVar7 | uVar1 & 0xffffffffffffff;
  uVar1 = uVar7 + (uVar13 + 1 & 0xffffffffffffff);
  uVar2 = (uVar1 >> 0x38) + (uVar4 & 0xffffffffffffff) + uVar7;
  uVar10 = uVar10 & 0xffffffffffffff;
  uVar13 = uVar2 >> 0x38;
  uVar8 = uVar13 + uVar10;
  uVar11 = uVar8 + uVar7;
  uVar9 = uVar9 & 0xffffffffffffff;
  uVar8 = uVar11 >> 0x38 | ((ulong)CARRY8(uVar13,uVar10) + (ulong)CARRY8(uVar8,uVar7)) * 0x100;
  param_1[1] = uVar2 & 0xffffffffffffff;
  *param_1 = uVar1 & 0xffffffffffffff;
  uVar1 = uVar8 + uVar9;
  uVar2 = uVar1 + uVar7;
  uVar13 = uVar2 >> 0x38 | ((ulong)CARRY8(uVar8,uVar9) + (ulong)CARRY8(uVar1,uVar7)) * 0x100;
  uVar1 = uVar13 + uVar5;
  uVar9 = uVar6 & 0xfffffffffffffe;
  uVar8 = uVar1 + uVar9;
  uVar9 = uVar8 >> 0x38 | ((ulong)CARRY8(uVar13,uVar5) + (ulong)CARRY8(uVar1,uVar9)) * 0x100;
  param_1[3] = uVar2 & 0xffffffffffffff;
  param_1[2] = uVar11 & 0xffffffffffffff;
  uVar1 = uVar9 + uVar15;
  uVar2 = uVar1 + uVar7;
  uVar11 = uVar2 >> 0x38 | ((ulong)CARRY8(uVar9,uVar15) + (ulong)CARRY8(uVar1,uVar7)) * 0x100;
  uVar1 = uVar11 + uVar12;
  uVar9 = uVar1 + uVar7;
  param_1[5] = uVar2 & 0xffffffffffffff;
  param_1[4] = uVar8 & 0xffffffffffffff;
  param_1[7] = (ulong)(((uint7)(byte)(uVar9 >> 0x38) |
                       ((uint7)CARRY8(uVar11,uVar12) + (uint7)CARRY8(uVar1,uVar7)) * 0x100) +
                       (int7)uVar3 + (int7)uVar6);
  param_1[6] = uVar9 & 0xffffffffffffff;
  return;
}

