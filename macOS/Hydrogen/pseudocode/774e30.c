
undefined8 FUN_00774e30(void)

{
  undefined8 uVar1;
  uint in_w8;
  long unaff_x19;
  long unaff_x24;
  long unaff_x25;
  
  if ((in_w8 >> 6 & 1) == 0) {
    if (*(long **)(unaff_x24 + 8) == (long *)0x0) {
      uVar1 = 0x17;
    }
    else {
      uVar1 = (**(code **)(**(long **)(unaff_x24 + 8) + 0x18))();
    }
    if ((unaff_x19 != 0) && (*(char *)(unaff_x25 + 3) < '\0')) {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) {
        if (iRam0000000000a2b560 < 1) {
          return uVar1;
        }
      }
      else if (*(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b560 < 1) {
        return uVar1;
      }
      func_0x0073ce84();
    }
  }
  else {
    uVar1 = 0;
  }
  return uVar1;
}

