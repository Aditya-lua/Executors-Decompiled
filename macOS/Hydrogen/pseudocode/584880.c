
void FUN_00584880(undefined8 *param_1)

{
  undefined4 uVar1;
  undefined8 in_x9;
  undefined8 in_x10;
  undefined4 in_w11;
  long *in_x12;
  
  if (*in_x12 == -0x8000000000000000) {
    *param_1 = in_x9;
    param_1[1] = in_x10;
    *(undefined4 *)(param_1 + 2) = in_w11;
    *(undefined4 *)((long)param_1 + 0x14) = 0xffffffff;
    *(undefined4 *)(param_1 + 3) = in_w11;
    return;
  }
  uVar1 = *(undefined4 *)((long)in_x12 + 0x1c);
  *param_1 = in_x9;
  param_1[1] = in_x10;
  *(undefined4 *)(param_1 + 2) = in_w11;
  *(undefined4 *)((long)param_1 + 0x14) = uVar1;
  *(undefined4 *)(param_1 + 3) = in_w11;
  return;
}

