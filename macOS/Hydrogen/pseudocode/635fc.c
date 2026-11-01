
void FUN_000635fc(undefined8 *param_1,long *param_2,undefined8 *param_3)

{
  ulong in_x9;
  ulong in_x10;
  undefined8 *in_x11;
  undefined8 in_x12;
  undefined8 in_x14;
  ulong in_x15;
  
  if ((in_x15 & in_x10) != in_x9) {
    *(undefined8 **)(*param_2 + (in_x15 & in_x10) * 8) = in_x11;
    in_x14 = *param_3;
  }
  *in_x11 = in_x14;
  *param_3 = 0;
  param_2[3] = param_2[3] + -1;
  *param_1 = param_3;
  param_1[1] = in_x12;
  *(undefined1 *)(param_1 + 2) = 1;
  return;
}

