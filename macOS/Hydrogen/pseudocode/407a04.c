
void FUN_00407a04(undefined8 *param_1,long param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  undefined1 in_w8;
  long in_x9;
  long in_x10;
  undefined1 in_w11;
  undefined8 in_x12;
  undefined2 in_w13;
  long in_x14;
  undefined8 in_x16;
  undefined8 in_x17;
  
  *(long *)(param_2 + 0x10) = (in_x10 + in_x9) - in_x14;
  *param_1 = 0;
  param_1[1] = in_x10;
  param_1[2] = 1;
  param_1[3] = in_x16;
  param_1[4] = param_5;
  param_1[5] = param_3;
  param_1[6] = param_4;
  param_1[7] = in_x12;
  param_1[8] = in_x17;
  *(undefined1 *)(param_1 + 9) = in_w8;
  *(undefined1 *)((long)param_1 + 0x49) = in_w11;
  *(undefined2 *)((long)param_1 + 0x4a) = in_w13;
  return;
}

