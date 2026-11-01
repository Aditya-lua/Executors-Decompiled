
undefined8 FUN_0072fa54(void)

{
  long unaff_x19;
  long unaff_x20;
  ulong uStack0000000000000000;
  long lStack0000000000000008;
  ulong uStack0000000000000010;
  long *in_stack_00000018;
  
  if (((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
      (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))) && (in_stack_00000018 != (long *)0x0))))
     && (0 < *(int *)(*in_stack_00000018 + 0xc))) {
    lStack0000000000000008 = unaff_x20 + 0xca;
    uStack0000000000000000 = (ulong)*(uint *)(unaff_x20 + 0x98);
    uStack0000000000000010 = (ulong)*(uint *)(unaff_x20 + 0xfc);
    func_0x0073cbdc();
  }
  return 0;
}

