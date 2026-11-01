
void FUN_000dc988(long param_1,undefined1 param_2 [16],int param_3)

{
  undefined1 in_w9;
  long in_x10;
  long in_x11;
  long in_x12;
  
  ((undefined8 *)(in_x10 + in_x12))[1] = param_2._8_8_;
  *(undefined8 *)(in_x10 + in_x12) = param_2._0_8_;
  *(undefined4 *)(param_1 + 0x38) = *(undefined4 *)(in_x11 + 0x198);
  if (param_3 < 0) {
    *(undefined4 *)(param_1 + 0x3c) = *(undefined4 *)(param_1 + 0x40);
    *(undefined4 *)(param_1 + 0x30) = 0x7f7fffff;
    *(undefined1 *)(param_1 + 0x34) = in_w9;
    return;
  }
  *(int *)(param_1 + 0x3c) = param_3;
  *(undefined4 *)(param_1 + 0x30) = 0x7f7fffff;
  *(undefined1 *)(param_1 + 0x34) = in_w9;
  return;
}

