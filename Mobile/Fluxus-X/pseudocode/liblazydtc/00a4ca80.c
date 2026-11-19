/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4ca80
 */

void ossl_curve448_scalar_halve(ulong *param_1,ulong *param_2)

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
  
  uVar4 = *param_2;
  uVar6 = -(uVar4 & 1);
  uVar1 = uVar4 + (uVar6 & 0x2378c292ab5844f3);
  *param_1 = uVar1;
  uVar5 = param_2[1];
  uVar4 = (ulong)CARRY8(uVar4,uVar6 & 0x2378c292ab5844f3);
  uVar2 = uVar4 + uVar5;
  uVar3 = uVar2 + (uVar6 & 0x216cc2728dc58f55);
  param_1[1] = uVar3;
  uVar7 = param_2[2];
  uVar5 = (ulong)CARRY8(uVar4,uVar5) + (ulong)CARRY8(uVar2,uVar6 & 0x216cc2728dc58f55);
  uVar4 = uVar5 + uVar7;
  uVar2 = uVar4 + (uVar6 & 0xc44edb49aed63690);
  param_1[2] = uVar2;
  uVar9 = param_2[3];
  uVar8 = (ulong)CARRY8(uVar5,uVar7) + (ulong)CARRY8(uVar4,uVar6 & 0xc44edb49aed63690);
  uVar5 = uVar8 + uVar9;
  uVar7 = uVar5 + (uVar6 & 0xffffffff7cca23e9);
  param_1[3] = uVar7;
  uVar10 = param_2[4];
  uVar9 = (ulong)CARRY8(uVar8,uVar9) + (ulong)CARRY8(uVar5,uVar6 & 0xffffffff7cca23e9);
  uVar5 = uVar9 + uVar10;
  uVar8 = uVar5 + uVar6;
  param_1[4] = uVar8;
  uVar11 = param_2[5];
  uVar10 = (ulong)CARRY8(uVar9,uVar10) + (ulong)CARRY8(uVar5,uVar6);
  uVar5 = uVar10 + uVar11;
  uVar9 = uVar5 + uVar6;
  param_1[5] = uVar9;
  uVar12 = param_2[6];
  uVar5 = (ulong)CARRY8(uVar10,uVar11) + (ulong)CARRY8(uVar5,uVar6);
  *param_1 = uVar1 >> 1 | uVar3 << 0x3f;
  param_1[1] = uVar3 >> 1 | uVar4 << 0x3f;
  uVar4 = uVar5 + uVar12;
  uVar1 = uVar4 + (uVar6 & 0x3fffffffffffffff);
  param_1[2] = uVar2 >> 1 | uVar7 << 0x3f;
  param_1[3] = uVar7 >> 1 | uVar8 << 0x3f;
  param_1[4] = uVar8 >> 1 | uVar9 << 0x3f;
  param_1[5] = uVar9 >> 1 | uVar1 << 0x3f;
  param_1[6] = uVar1 >> 1 |
               (ulong)CARRY8(uVar5,uVar12) + (ulong)CARRY8(uVar4,uVar6 & 0x3fffffffffffffff) << 0x3f
  ;
  return;
}

