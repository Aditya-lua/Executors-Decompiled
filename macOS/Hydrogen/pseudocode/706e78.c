
void FUN_00706e78(undefined8 *param_1,undefined8 *param_2,undefined8 param_3,undefined8 param_4,
                 undefined1 param_5,undefined8 *param_6)

{
  undefined4 in_w8;
  undefined8 uVar1;
  
  *param_1 = &UNK_00a1de48;
  *(undefined4 *)(param_1 + 1) = in_w8;
  uVar1 = *param_2;
  *(undefined8 *)((long)param_1 + 0x14) = param_2[1];
  *(undefined8 *)((long)param_1 + 0xc) = uVar1;
  *(undefined1 *)((long)param_1 + 0x1c) = 0;
  *param_1 = &UNK_00a1d130;
  param_1[4] = param_3;
  param_1[5] = param_4;
  *(undefined1 *)(param_1 + 6) = param_5;
  uVar1 = *param_6;
  *(undefined8 *)((long)param_1 + 0x3c) = param_6[1];
  *(undefined8 *)((long)param_1 + 0x34) = uVar1;
  return;
}

