
undefined8 FUN_00777bfc(ulong param_1)

{
  ulong uVar1;
  long unaff_x19;
  
  uVar1 = *(ulong *)(unaff_x19 + 0xa1a);
  *(ulong *)(unaff_x19 + 0xa1a) =
       uVar1 & 0xffc0000000000000 | uVar1 & 0x1fffffffffffff | (param_1 & 1) << 0x35;
  return 0;
}

