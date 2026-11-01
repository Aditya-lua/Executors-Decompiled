
undefined8 FUN_00426eb4(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  
  uVar1 = param_1 + unaff_x20;
  uVar2 = uVar1;
  if (uVar1 <= *(ulong *)(unaff_x19 + 0x18)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x18);
  }
  *(ulong *)(unaff_x19 + 0x10) = uVar1;
  *(ulong *)(unaff_x19 + 0x18) = uVar2;
  return 0;
}

