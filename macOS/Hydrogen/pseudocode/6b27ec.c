
undefined8 FUN_006b27ec(void)

{
  long unaff_x19;
  ulong *unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  
  *unaff_x21 = unaff_x22 & 0xffffffff | unaff_x23 << 0x20;
  *(ulong **)(unaff_x19 + 0x90) = unaff_x21 + 1;
  return 1;
}

