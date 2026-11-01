
void FUN_005fd1c8(ulong param_1)

{
  ulong in_x9;
  long in_x10;
  long in_x11;
  ulong in_x12;
  ulong uVar1;
  long unaff_x19;
  ulong unaff_x28;
  
  while( true ) {
    uVar1 = in_x12 >> (unaff_x28 & 0x3f) | param_1;
    param_1 = in_x12 << (in_x9 & 0x3f);
    *(ulong *)(in_x10 + in_x11) = uVar1;
    unaff_x19 = unaff_x19 + -1;
    if (unaff_x19 == 0) break;
    in_x11 = unaff_x19 * 8;
    in_x12 = *(ulong *)(in_x10 + in_x11);
  }
  return;
}

