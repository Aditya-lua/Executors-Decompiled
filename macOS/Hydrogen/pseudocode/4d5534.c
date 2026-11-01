
void FUN_004d5534(undefined8 *param_1,long param_2)

{
  undefined4 in_w9;
  undefined8 *in_x10;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  *(undefined4 *)((long)in_x10 + 0x2c) = 0xffffffff;
  *(undefined4 *)(param_2 + 0x44) = in_w9;
  *(long *)(param_2 + 0x38) = *(long *)(param_2 + 0x38) + -1;
  uVar1 = *in_x10;
  uVar3 = in_x10[3];
  uVar2 = in_x10[2];
  param_1[1] = in_x10[1];
  *param_1 = uVar1;
  param_1[3] = uVar3;
  param_1[2] = uVar2;
  *in_x10 = 0x8000000000000000;
  return;
}

