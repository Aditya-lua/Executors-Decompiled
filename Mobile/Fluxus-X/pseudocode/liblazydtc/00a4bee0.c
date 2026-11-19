/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4bee0
 */

void FUN_00a4bee0(ulong *param_1,ulong *param_2,ulong *param_3,long param_4)

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
  
  uVar2 = *param_2;
  uVar3 = *param_3;
  uVar5 = uVar2 - uVar3;
  *param_1 = uVar5;
  uVar4 = param_2[1];
  uVar6 = param_3[1];
  uVar3 = -(ulong)(uVar2 < uVar3);
  uVar2 = uVar3 + uVar4;
  uVar11 = uVar2 - uVar6;
  param_1[1] = uVar11;
  uVar7 = param_2[2];
  uVar8 = param_3[2];
  uVar3 = (((long)uVar3 >> 0x3f) + (ulong)CARRY8(uVar3,uVar4)) - (ulong)(uVar2 < uVar6);
  uVar2 = uVar3 + uVar7;
  uVar1 = uVar2 - uVar8;
  param_1[2] = uVar1;
  uVar4 = param_2[3];
  uVar6 = param_3[3];
  uVar3 = (((long)uVar3 >> 0x3f) + (ulong)CARRY8(uVar3,uVar7)) - (ulong)(uVar2 < uVar8);
  uVar2 = uVar3 + uVar4;
  uVar7 = uVar2 - uVar6;
  param_1[3] = uVar7;
  uVar9 = param_2[4];
  uVar10 = param_3[4];
  uVar3 = (((long)uVar3 >> 0x3f) + (ulong)CARRY8(uVar3,uVar4)) - (ulong)(uVar2 < uVar6);
  uVar2 = uVar3 + uVar9;
  uVar8 = uVar2 - uVar10;
  param_1[4] = uVar8;
  uVar4 = param_2[5];
  uVar6 = param_3[5];
  uVar3 = (((long)uVar3 >> 0x3f) + (ulong)CARRY8(uVar3,uVar9)) - (ulong)(uVar2 < uVar10);
  uVar2 = uVar3 + uVar4;
  uVar9 = uVar2 - uVar6;
  param_1[5] = uVar9;
  uVar10 = param_3[6];
  uVar2 = (((long)uVar3 >> 0x3f) + (ulong)CARRY8(uVar3,uVar4)) - (ulong)(uVar2 < uVar6);
  uVar3 = uVar2 + param_2[6];
  uVar4 = ((((long)uVar2 >> 0x3f) + (ulong)CARRY8(uVar2,param_2[6])) - (ulong)(uVar3 < uVar10)) +
          param_4;
  uVar2 = (ulong)CARRY8(uVar5,uVar4 & 0x2378c292ab5844f3);
  uVar6 = uVar2 + uVar11;
  uVar11 = (ulong)CARRY8(uVar2,uVar11) + (ulong)CARRY8(uVar6,uVar4 & 0x216cc2728dc58f55);
  *param_1 = uVar5 + (uVar4 & 0x2378c292ab5844f3);
  param_1[1] = uVar6 + (uVar4 & 0x216cc2728dc58f55);
  uVar2 = uVar11 + uVar1;
  uVar5 = (ulong)CARRY8(uVar11,uVar1) + (ulong)CARRY8(uVar2,uVar4 & 0xc44edb49aed63690);
  uVar6 = uVar5 + uVar7;
  uVar5 = (ulong)CARRY8(uVar5,uVar7) + (ulong)CARRY8(uVar6,uVar4 & 0xffffffff7cca23e9);
  param_1[2] = uVar2 + (uVar4 & 0xc44edb49aed63690);
  param_1[3] = uVar6 + (uVar4 & 0xffffffff7cca23e9);
  uVar2 = uVar5 + uVar8;
  uVar5 = (ulong)CARRY8(uVar5,uVar8) + (ulong)CARRY8(uVar2,uVar4);
  uVar6 = uVar5 + uVar9;
  param_1[4] = uVar2 + uVar4;
  param_1[5] = uVar6 + uVar4;
  param_1[6] = (uVar4 & 0x3fffffffffffffff) +
               (ulong)CARRY8(uVar5,uVar9) + (ulong)CARRY8(uVar6,uVar4) + (uVar3 - uVar10);
  return;
}

