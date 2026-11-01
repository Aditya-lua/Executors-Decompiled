
void FUN_00707f88(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4,
                 undefined8 *param_5,undefined8 *param_6,undefined8 param_7)

{
  undefined4 in_w8;
  undefined8 uVar1;
  undefined8 uVar2;
  
  *(undefined4 *)(param_1 + 1) = in_w8;
  uVar1 = *param_2;
  *(undefined8 *)((long)param_1 + 0x14) = param_2[1];
  *(undefined8 *)((long)param_1 + 0xc) = uVar1;
  *param_1 = &UNK_00a1d5c8;
  param_1[4] = 0;
  param_1[5] = 0;
  uVar1 = *param_3;
  param_1[7] = param_3[1];
  param_1[6] = uVar1;
  uVar1 = *param_4;
  param_1[9] = param_4[1];
  param_1[8] = uVar1;
  uVar1 = param_5[2];
  uVar2 = *param_5;
  param_1[0xb] = param_5[1];
  param_1[10] = uVar2;
  param_1[0xc] = uVar1;
  uVar1 = *param_6;
  param_1[0xe] = param_6[1];
  param_1[0xd] = uVar1;
  param_1[0xf] = param_7;
  return;
}

