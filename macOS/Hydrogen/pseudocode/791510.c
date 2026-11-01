
uint FUN_00791510(void)

{
  long lVar1;
  byte bVar2;
  long *unaff_x19;
  char *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x29;
  undefined8 in_stack_00000010;
  
  lVar1 = func_0x0079174c();
  if ((lVar1 < 1) || (lVar1 = func_0x0079174c(), lVar1 < 1)) {
    if (lVar1 == 0) {
      *unaff_x20 = '\x01';
      goto code_r0x00791564;
    }
    if (in_stack_00000010._4_4_ != 0x51) {
      if ((((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x21 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x21 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x19 + 0xc)))
      {
        func_0x0073cbdc();
      }
      goto code_r0x00791564;
    }
    *(undefined4 *)(unaff_x22 + 0xc4) = 1;
  }
  else {
code_r0x00791564:
    if (in_stack_00000010._4_4_ != 0) {
      bVar2 = 2;
      goto LAB_00791590;
    }
  }
  in_stack_00000010._4_4_ = 0;
  bVar2 = *unaff_x20 << 1;
LAB_00791590:
  *(byte *)((long)unaff_x19 + 0x24) = *(byte *)((long)unaff_x19 + 0x24) & 0xfd | bVar2;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return in_stack_00000010._4_4_;
  }
  lVar1 = ___stack_chk_fail(in_stack_00000010._4_4_);
  return *(byte *)(*(long *)(*(long *)(lVar1 + 0x10) + 0x40) + 0x18) & 1;
}

