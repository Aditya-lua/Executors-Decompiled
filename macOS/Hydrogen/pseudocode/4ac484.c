
void FUN_004ac484(long param_1,undefined8 param_2,undefined8 *param_3)

{
  undefined8 *puVar1;
  long in_x9;
  long in_x10;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  puVar1 = (undefined8 *)(in_x9 + in_x10 * 0x40);
  uVar2 = *param_3;
  uVar4 = param_3[3];
  uVar3 = param_3[2];
  puVar1[1] = param_3[1];
  *puVar1 = uVar2;
  puVar1[3] = uVar4;
  puVar1[2] = uVar3;
  uVar2 = param_3[4];
  uVar4 = param_3[7];
  uVar3 = param_3[6];
  puVar1[5] = param_3[5];
  puVar1[4] = uVar2;
  puVar1[7] = uVar4;
  puVar1[6] = uVar3;
  *(long *)(param_1 + 8) = in_x10 + 1;
  return;
}

