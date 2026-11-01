
void FUN_00633820(long param_1)

{
  ulong uVar1;
  ulong in_x9;
  long lVar2;
  long unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x29;
  
  while( true ) {
    uVar1 = *(ulong *)(unaff_x19 + -0x20);
    if (in_x9 <= *(ulong *)(unaff_x19 + -0x20)) {
      uVar1 = in_x9;
    }
    if (param_1 != 0) {
      if (uVar1 != 0) {
        do {
          *(undefined8 *)(param_1 + -8 + uVar1 * 8) = 0;
          uVar1 = uVar1 - 1;
        } while (uVar1 != 0);
      }
      func_0x00611644();
    }
    lVar2 = unaff_x19 + -0xa0;
    func_0x0064f6d0(lVar2);
    if (lVar2 == unaff_x21) break;
    *(undefined8 *)(unaff_x19 + -0xd0) = unaff_x20;
    in_x9 = *(ulong *)(unaff_x19 + -0xb8);
    param_1 = *(long *)(unaff_x19 + -0xb0);
    unaff_x19 = lVar2;
  }
  *(long *)(unaff_x29 + -0x40) = unaff_x21;
  __ZdlPv(*(undefined8 *)(unaff_x29 + -0x48));
  return;
}

