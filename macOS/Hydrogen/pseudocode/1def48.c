
void thunk_FUN_001df0f4(undefined1 param_1 [16],undefined8 param_2)

{
  undefined1 in_w8;
  undefined1 in_w9;
  undefined8 *unaff_x20;
  undefined1 uStack0000000000000030;
  
  unaff_x20[1] = param_1._8_8_;
  *unaff_x20 = param_1._0_8_;
  unaff_x20[2] = param_2;
  unaff_x20[3] = 1;
  *(undefined1 *)(unaff_x20 + 4) = in_w8;
  *(undefined1 *)((long)unaff_x20 + 0x21) = in_w9;
  func_0x001d50f8(&uStack0000000000000030);
  func_0x001d5eb4();
  func_0x00187bd4();
  return;
}

