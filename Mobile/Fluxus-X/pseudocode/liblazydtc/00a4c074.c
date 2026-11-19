/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4c074
 */

void ossl_curve448_scalar_add(long *param_1,ulong *param_2,ulong *param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  
  uVar1 = *param_2;
  uVar4 = *param_3;
  *param_1 = uVar1 + uVar4;
  uVar2 = param_2[1];
  uVar5 = param_3[1];
  uVar1 = (ulong)CARRY8(uVar1,uVar4);
  uVar4 = uVar1 + uVar2;
  param_1[1] = uVar4 + uVar5;
  uVar3 = param_2[2];
  uVar6 = param_3[2];
  uVar2 = (ulong)CARRY8(uVar1,uVar2) + (ulong)CARRY8(uVar4,uVar5);
  uVar1 = uVar2 + uVar3;
  param_1[2] = uVar1 + uVar6;
  uVar4 = param_2[3];
  uVar5 = param_3[3];
  uVar6 = (ulong)CARRY8(uVar2,uVar3) + (ulong)CARRY8(uVar1,uVar6);
  uVar1 = uVar6 + uVar4;
  param_1[3] = uVar1 + uVar5;
  uVar2 = param_2[4];
  uVar3 = param_3[4];
  uVar6 = (ulong)CARRY8(uVar6,uVar4) + (ulong)CARRY8(uVar1,uVar5);
  uVar1 = uVar6 + uVar2;
  param_1[4] = uVar1 + uVar3;
  uVar4 = param_2[5];
  uVar5 = param_3[5];
  uVar6 = (ulong)CARRY8(uVar6,uVar2) + (ulong)CARRY8(uVar1,uVar3);
  uVar1 = uVar6 + uVar4;
  param_1[5] = uVar1 + uVar5;
  uVar2 = param_2[6];
  uVar3 = param_3[6];
  uVar4 = (ulong)CARRY8(uVar6,uVar4) + (ulong)CARRY8(uVar1,uVar5);
  uVar1 = uVar4 + uVar2;
  param_1[6] = uVar1 + uVar3;
  FUN_00a4bee0(param_1,param_1,&DAT_00765f28,CARRY8(uVar4,uVar2) + CARRY8(uVar1,uVar3));
  return;
}

