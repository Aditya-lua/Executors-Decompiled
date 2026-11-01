
undefined8 FUN_007520e8(void)

{
  long unaff_x20;
  
  if ((*(byte *)(unaff_x20 + 0xa1a) & 1) != 0) {
    return 0;
  }
  if ((long)(ulong)*(uint *)(unaff_x20 + 0x120) <
      (long)(*(long *)(unaff_x20 + 0xf8) + (ulong)*(uint *)(unaff_x20 + 0x118))) {
    return 0;
  }
  func_0x0073c9e4();
  func_0x00734f74();
  return 0x34;
}

