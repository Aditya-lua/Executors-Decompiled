
void FUN_00706758(long *param_1,undefined8 *param_2,undefined4 param_3,long param_4,long param_5)

{
  undefined4 in_w8;
  long in_x9;
  undefined8 uVar1;
  
  *param_1 = in_x9 + 0xe48;
  *(undefined4 *)(param_1 + 1) = in_w8;
  uVar1 = *param_2;
  *(undefined8 *)((long)param_1 + 0x14) = param_2[1];
  *(undefined8 *)((long)param_1 + 0xc) = uVar1;
  *param_1 = (long)&UNK_00a1cf70;
  *(undefined4 *)((long)param_1 + 0x1c) = param_3;
  param_1[4] = param_4;
  param_1[5] = param_5;
  return;
}

