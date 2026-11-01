
undefined4 FUN_0074b56c(void)

{
  uint in_w8;
  undefined4 uVar1;
  long unaff_x19;
  ulong uStack0000000000000000;
  undefined8 in_stack_00000010;
  
  if (((in_w8 >> 7 & 1) != 0) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    uStack0000000000000000 = (ulong)in_stack_00000010._4_4_;
    func_0x0073cab8();
  }
  uVar1 = 10;
  if ((int)in_stack_00000010._4_4_ < 400) {
    uVar1 = 8;
  }
  return uVar1;
}

