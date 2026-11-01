
void FUN_00466bd4(long param_1,undefined8 param_2)

{
  long unaff_x20;
  undefined8 unaff_x21;
  long unaff_x29;
  undefined1 uStack0000000000000020;
  long lStack0000000000000028;
  undefined8 uStack0000000000000030;
  
  lStack0000000000000028 = param_1 + 0x4e9;
  uStack0000000000000030 = 3;
  *(undefined8 *)(unaff_x29 + -0x70) = 1;
  *(undefined8 *)(unaff_x29 + -0x68) = unaff_x21;
  *(undefined1 **)(unaff_x20 + 0x10) = &uStack0000000000000020;
  *(undefined8 *)(unaff_x20 + 0x18) = 1;
  func_0x00468db8(param_2,unaff_x29 + -0x70);
  return;
}

