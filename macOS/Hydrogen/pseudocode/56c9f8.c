
undefined8 FUN_0056c9f8(void)

{
  ulong unaff_x26;
  ulong in_stack_00000008;
  undefined8 uStack0000000000000040;
  long in_stack_000001c8;
  undefined8 in_stack_000001d0;
  
  if (in_stack_000001c8 != 0) {
    func_0x00187bd4(in_stack_000001d0,in_stack_000001c8 * 0x28,8);
  }
  if ((unaff_x26 & 1) != 0) {
    if (uStack0000000000000040 == 2) {
      if ((in_stack_00000008 & 1) != 0) {
        func_0x005656ec((ulong)&uStack0000000000000040 | 8);
      }
    }
    else if (uStack0000000000000040 == 3) {
      if ((in_stack_00000008 & 0x100000000) != 0) {
        func_0x00565938((ulong)&uStack0000000000000040 | 8);
      }
    }
    else {
      func_0x005649d4(&uStack0000000000000040);
    }
  }
  return 1;
}

