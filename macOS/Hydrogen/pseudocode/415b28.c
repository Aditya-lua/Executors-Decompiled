
void FUN_00415b28(long param_1)

{
  long *unaff_x20;
  long unaff_x21;
  undefined1 auVar1 [16];
  long lStack0000000000000010;
  long in_stack_00000018;
  
  lStack0000000000000010 = param_1;
  auVar1 = func_0x0041e6c8();
  if ((auVar1._0_8_ & 1) == 0) {
    unaff_x20[1] = lStack0000000000000010;
    *unaff_x20 = unaff_x21;
    unaff_x20[2] = in_stack_00000018;
  }
  else {
    *unaff_x20 = -0x8000000000000000;
    unaff_x20[1] = auVar1._8_8_;
    if (unaff_x21 != 0) {
      func_0x00187bd4(lStack0000000000000010,unaff_x21,1);
    }
  }
  _close();
  return;
}

