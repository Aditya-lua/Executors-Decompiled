
void FUN_007071a8(undefined1 param_1 [16],undefined8 *param_2,undefined8 param_3,undefined8 *param_4
                 ,undefined8 *param_5,undefined8 *param_6)

{
  undefined4 uVar1;
  undefined8 uVar2;
  
  *(long *)((long)param_2 + 0x14) = param_1._8_8_;
  *(long *)((long)param_2 + 0xc) = param_1._0_8_;
  *(undefined1 *)((long)param_2 + 0x1c) = 0;
  *param_2 = &UNK_00a1d280;
  uVar2 = *param_4;
  param_2[5] = param_4[1];
  param_2[4] = uVar2;
  uVar2 = *param_5;
  param_2[7] = param_5[1];
  param_2[6] = uVar2;
  uVar1 = *(undefined4 *)(param_6 + 2);
  uVar2 = *param_6;
  param_2[9] = param_6[1];
  param_2[8] = uVar2;
  *(undefined4 *)(param_2 + 10) = uVar1;
  return;
}

