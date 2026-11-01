
void FUN_007076f4(undefined8 *param_1,undefined8 *param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  
  uVar1 = *param_2;
  *(undefined8 *)((long)param_1 + 0x14) = param_2[1];
  *(undefined8 *)((long)param_1 + 0xc) = uVar1;
  *(undefined1 *)((long)param_1 + 0x1c) = 0;
  *param_1 = &UNK_00a1d3d0;
  param_1[4] = param_3;
  param_1[5] = param_4;
  return;
}

