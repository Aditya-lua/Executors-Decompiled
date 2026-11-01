
void FUN_00706044(undefined8 param_1,undefined8 *param_2,undefined8 param_3,undefined8 *param_4,
                 undefined4 param_5)

{
  undefined8 uVar1;
  
  *param_2 = param_1;
  uVar1 = *param_4;
  param_2[5] = param_4[1];
  param_2[4] = uVar1;
  *(undefined4 *)(param_2 + 6) = param_5;
  return;
}

