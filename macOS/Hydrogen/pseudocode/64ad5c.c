
void FUN_0064ad5c(long param_1)

{
  long lVar1;
  ulong uVar2;
  ulong in_x9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  
  while( true ) {
    uVar2 = *(ulong *)(unaff_x23 + -0x30);
    if (in_x9 <= *(ulong *)(unaff_x23 + -0x30)) {
      uVar2 = in_x9;
    }
    if (param_1 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(param_1 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    *(long *)(unaff_x23 + -0x70) = unaff_x21 + 0x10;
    lVar1 = *(long *)(unaff_x23 + -0x50);
    uVar2 = *(ulong *)(unaff_x23 + -0x60);
    if (*(ulong *)(unaff_x23 + -0x58) <= *(ulong *)(unaff_x23 + -0x60)) {
      uVar2 = *(ulong *)(unaff_x23 + -0x58);
    }
    if (lVar1 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    unaff_x23 = *(long *)(unaff_x20 + 0x10);
    if (unaff_x23 == unaff_x19) break;
    *(long *)(unaff_x20 + 0x10) = unaff_x23 + -0x70;
    *(undefined8 *)(unaff_x23 + -0x40) = unaff_x22;
    in_x9 = *(ulong *)(unaff_x23 + -0x28);
    param_1 = *(long *)(unaff_x23 + -0x20);
  }
  return;
}

