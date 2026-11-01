
void FUN_00420e84(undefined4 param_1)

{
  undefined2 in_w8;
  undefined4 in_w9;
  long in_x10;
  undefined4 in_w12;
  undefined8 in_x13;
  undefined4 in_w14;
  undefined4 *unaff_x19;
  
  unaff_x19[1] = param_1;
  *(ulong *)(unaff_x19 + 2) = in_x10 << 0x10 | 1;
  *(undefined8 *)(unaff_x19 + 4) = in_x13;
  unaff_x19[6] = in_w14;
  unaff_x19[7] = in_w9;
  unaff_x19[8] = in_w12;
  *(undefined2 *)(unaff_x19 + 9) = in_w8;
  *unaff_x19 = 0;
  return;
}

