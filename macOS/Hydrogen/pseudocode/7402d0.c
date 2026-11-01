
long FUN_007402d0(long param_1,undefined8 param_2,long param_3,undefined8 param_4)

{
  int iVar1;
  int in_w8;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long unaff_x26;
  long unaff_x29;
  undefined1 auVar2 [16];
  
  do {
    if ((*(char *)(unaff_x26 + 3) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x20 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x20 + 0x18) + 8))))) {
      func_0x00740a58(unaff_x22);
      param_1 = func_0x0073cab8();
      in_w8 = *(int *)(unaff_x19 + 0x268);
    }
    unaff_x23 = unaff_x23 + 1;
    unaff_x22 = unaff_x22 + 0x20;
  } while (unaff_x23 < in_w8);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return param_1;
  }
  auVar2 = ___stack_chk_fail();
  param_3 = param_3 * auVar2._8_8_;
  iVar1 = func_0x0074075c(param_4,auVar2._0_8_,param_3);
  if (iVar1 != 0) {
    param_3 = 0;
  }
  return param_3;
}

