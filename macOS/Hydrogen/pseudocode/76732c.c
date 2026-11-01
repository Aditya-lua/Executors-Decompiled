
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0076732c(undefined8 param_1,undefined8 param_2,undefined4 *param_3)

{
  long extraout_x1;
  long unaff_x19;
  long unaff_x22;
  long unaff_x23;
  long unaff_x29;
  long in_stack_00000020;
  undefined4 uStack0000000000000028;
  
  if ((int)param_1 == 0) {
    if (in_stack_00000020 == 0) {
      if ((*(char *)(unaff_x23 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
        param_1 = 0x12;
      }
      else {
        param_1 = 0x12;
      }
    }
    else {
      param_3 = &uStack0000000000000028;
      param_1 = func_0x007738a0();
      if ((int)param_1 == 0) {
        in_stack_00000020 = *(long *)(unaff_x22 + 0x10) - in_stack_00000020;
        *(long *)(unaff_x22 + 0x10) = in_stack_00000020;
        param_1 = 0;
        if (in_stack_00000020 == 0) {
          *(undefined8 *)(*(long *)(unaff_x19 + 0x18) + 1000) = _UNK_008cd898;
        }
      }
    }
  }
  else if ((int)param_1 == 0x51) {
    if ((*(char *)(unaff_x23 + 3) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
      param_1 = 0x51;
    }
    else {
      param_1 = 0x51;
    }
  }
  if ((int)param_1 == 0x51) {
    param_1 = 0;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return param_1;
  }
  ___stack_chk_fail();
  *param_3 = *(undefined4 *)(extraout_x1 + 0x238);
  return 1;
}

