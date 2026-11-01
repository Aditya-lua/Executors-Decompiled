
undefined8 FUN_002dda1c(undefined1 param_1 [16],undefined1 param_2 [16],int param_3)

{
  long lVar1;
  undefined8 unaff_x19;
  undefined4 *unaff_x21;
  undefined8 *unaff_x22;
  undefined4 unaff_w23;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000088;
  
  unaff_x22[1] = param_1._8_8_;
  *unaff_x22 = param_1._0_8_;
  unaff_x22[3] = param_2._8_8_;
  unaff_x22[2] = param_2._0_8_;
  if (param_3 == 0) {
    unaff_w23 = 0;
  }
  if (unaff_x21 != (undefined4 *)0x0) {
    *unaff_x21 = unaff_w23;
  }
  func_0x0036e464(&uStack0000000000000088,0x2a0);
  func_0x0036e464(&uStack0000000000000008,0x80);
  if (param_3 == 0) {
    func_0x0036e464();
    unaff_x19 = 0;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return unaff_x19;
  }
  lVar1 = ___stack_chk_fail();
  if (*(char *)(lVar1 + 0x298) == '\x01' || *(char *)(lVar1 + 0x298) == '\x04') {
    *(undefined1 *)(lVar1 + 0x298) = 4;
    return 1;
  }
  func_0x0028f83c(0x1c,0,0x68,"/aws-lc/crypto/fipsmodule/hmac/hmac.c",500);
  return 0;
}

