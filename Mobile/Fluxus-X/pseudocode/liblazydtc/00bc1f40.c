/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc1f40
 */

void ZSTD_XXH64_copyState(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  uVar3 = *param_2;
  uVar2 = param_2[3];
  uVar1 = param_2[2];
  param_1[1] = param_2[1];
  *param_1 = uVar3;
  param_1[3] = uVar2;
  param_1[2] = uVar1;
  uVar6 = param_2[7];
  uVar5 = param_2[6];
  uVar2 = param_2[9];
  uVar1 = param_2[8];
  uVar4 = param_2[5];
  uVar3 = param_2[4];
  param_1[10] = param_2[10];
  param_1[7] = uVar6;
  param_1[6] = uVar5;
  param_1[9] = uVar2;
  param_1[8] = uVar1;
  param_1[5] = uVar4;
  param_1[4] = uVar3;
  return;
}

