/* 7ff70c992990 FUN_7ff70c992990 */

void FUN_7ff70c992990(undefined8 *param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4,
                     undefined8 param_5)

{
  *param_1 = 0;
  param_1[1] = param_3;
  param_1[2] = param_4;
  param_1[3] = param_5;
  param_1[5] = 0;
  *(undefined4 *)(param_1 + 4) = param_2;
  return;
}


