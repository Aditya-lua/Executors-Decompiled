
void FUN_007058dc(undefined8 param_1,undefined8 *param_2,undefined8 param_3,undefined4 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  *param_2 = param_1;
  *(undefined4 *)((long)param_2 + 0x1c) = param_4;
  param_2[4] = param_5;
  param_2[5] = param_6;
  param_2[6] = param_7;
  return;
}

