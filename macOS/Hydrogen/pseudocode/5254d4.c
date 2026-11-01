
void FUN_005254d4(undefined8 *param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined8 *param_4)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  param_1[5] = param_2._8_8_;
  param_1[4] = param_2._0_8_;
  param_1[7] = param_3._8_8_;
  param_1[6] = param_3._0_8_;
  uVar1 = *param_4;
  uVar3 = param_4[3];
  uVar2 = param_4[2];
  param_1[1] = param_4[1];
  *param_1 = uVar1;
  param_1[3] = uVar3;
  param_1[2] = uVar2;
  uVar1 = param_4[8];
  uVar3 = param_4[0xb];
  uVar2 = param_4[10];
  param_1[9] = param_4[9];
  param_1[8] = uVar1;
  param_1[0xb] = uVar3;
  param_1[10] = uVar2;
  return;
}

