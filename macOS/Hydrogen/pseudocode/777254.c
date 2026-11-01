
undefined8 FUN_00777254(void)

{
  bool in_ZR;
  ulong uVar1;
  long unaff_x19;
  
  uVar1 = *(ulong *)(unaff_x19 + 0xa1a);
  *(ulong *)(unaff_x19 + 0xa1a) = uVar1 & 0xffffffffffffff00 | uVar1 & 0x7f | (ulong)!in_ZR << 7;
  return 0;
}

