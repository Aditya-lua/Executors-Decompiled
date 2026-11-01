
undefined8 FUN_002dda48(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000088;
  
  func_0x0028f83c(param_1,0,0x68,param_4,500);
  func_0x0036e464(&uStack0000000000000088,0x2a0);
  func_0x0036e464(&uStack0000000000000008,0x80);
  func_0x0036e464();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return 0;
  }
  lVar1 = ___stack_chk_fail();
  if (*(char *)(lVar1 + 0x298) == '\x01' || *(char *)(lVar1 + 0x298) == '\x04') {
    *(undefined1 *)(lVar1 + 0x298) = 4;
    return 1;
  }
  func_0x0028f83c(0x1c,0,0x68,"/aws-lc/crypto/fipsmodule/hmac/hmac.c",500);
  return 0;
}

