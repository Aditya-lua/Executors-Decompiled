
void FUN_007073a0(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4,
                 undefined8 *param_5,undefined8 param_6,undefined1 param_7,undefined8 *param_8,
                 undefined1 param_9)

{
  undefined4 in_w9;
  undefined8 in_x10;
  undefined8 uVar1;
  
  *param_2 = in_x10;
  *(undefined4 *)(param_2 + 1) = in_w9;
  uVar1 = *param_3;
  *(undefined8 *)((long)param_2 + 0x14) = param_3[1];
  *(undefined8 *)((long)param_2 + 0xc) = uVar1;
  *(undefined1 *)((long)param_2 + 0x1c) = 0;
  *param_2 = &UNK_00a1d2f0;
  uVar1 = *param_4;
  param_2[5] = param_4[1];
  param_2[4] = uVar1;
  uVar1 = *param_5;
  param_2[7] = param_5[1];
  param_2[6] = uVar1;
  param_2[8] = param_6;
  *(undefined1 *)(param_2 + 9) = param_7;
  uVar1 = *param_8;
  *(undefined8 *)((long)param_2 + 0x54) = param_8[1];
  *(undefined8 *)((long)param_2 + 0x4c) = uVar1;
  *(undefined1 *)((long)param_2 + 0x5c) = param_9;
  uVar1 = *param_1;
  param_2[0xd] = param_1[1];
  param_2[0xc] = uVar1;
  return;
}

