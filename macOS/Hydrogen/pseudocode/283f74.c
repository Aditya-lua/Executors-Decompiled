
undefined8 FUN_00283f74(long param_1,long *param_2,long *param_3)

{
  ulong in_x9;
  ulong in_x10;
  
  if (in_x9 < in_x10) {
    return 0;
  }
  *param_2 = param_1 + in_x10;
  param_2[1] = in_x9 - in_x10;
  *param_3 = param_1;
  param_3[1] = in_x10;
  return 1;
}

