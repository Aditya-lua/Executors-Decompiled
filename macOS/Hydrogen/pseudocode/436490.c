
ulong FUN_00436490(void)

{
  bool bVar1;
  ulong uVar2;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long lVar3;
  long unaff_x29;
  undefined8 *puStack0000000000000028;
  undefined8 uStack0000000000000070;
  undefined *in_stack_00000078;
  
  puStack0000000000000028 = &uStack0000000000000070;
  uVar2 = func_0x0046849c();
  if ((uVar2 & 1) == 0) {
    if (unaff_x22 * 0x10 == 0x10) {
      unaff_x21 = 0;
    }
    else {
      lVar3 = unaff_x22 * 0x10 + -0x20;
      do {
        unaff_x23 = unaff_x23 + 0x10;
        *(long *)(unaff_x29 + -0x90) = unaff_x23;
        in_stack_00000078 = &DAT_003f3f90;
        puStack0000000000000028 = &uStack0000000000000070;
        uStack0000000000000070 = unaff_x29 + -0x90;
        unaff_x21 = func_0x0046849c();
        if ((unaff_x21 & 1) != 0) {
          return unaff_x21;
        }
        bVar1 = lVar3 != 0;
        lVar3 = lVar3 + -0x10;
      } while (bVar1);
    }
  }
  return unaff_x21;
}

