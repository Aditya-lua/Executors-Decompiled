
undefined8 FUN_0073e498(void)

{
  long unaff_x19;
  long unaff_x22;
  long in_stack_00000028;
  
  *(byte *)(unaff_x22 + 0x28) = *(byte *)(unaff_x22 + 0x28) | 1;
  if ((*(char *)(in_stack_00000028 + 3) < '\0') &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b560)))) {
    func_0x0073ce84();
  }
  return 0;
}

