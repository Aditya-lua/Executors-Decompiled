
void FUN_005387c8(undefined8 *param_1,long param_2)

{
  long in_x9;
  long in_x10;
  undefined4 in_w13;
  
  *(long *)(param_2 + 0x20) = (in_x10 - in_x9) + *(long *)(param_2 + 0x20);
  param_1[1] = 0;
  *(undefined4 *)(param_1 + 2) = in_w13;
  *param_1 = 1;
  return;
}

