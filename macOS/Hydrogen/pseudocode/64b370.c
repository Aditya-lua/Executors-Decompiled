
void FUN_0064b370(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
  do {
    *(long *)(unaff_x21 + -0x40) = unaff_x22 + 0xd60;
    lVar1 = *(long *)(unaff_x21 + -0x20);
    uVar2 = *(ulong *)(unaff_x21 + -0x30);
    if (*(ulong *)(unaff_x21 + -0x28) <= *(ulong *)(unaff_x21 + -0x30)) {
      uVar2 = *(ulong *)(unaff_x21 + -0x28);
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
    *(long *)(unaff_x21 + -0x70) = unaff_x22 + 0xd60;
    lVar1 = *(long *)(unaff_x21 + -0x50);
    uVar2 = *(ulong *)(unaff_x21 + -0x60);
    if (*(ulong *)(unaff_x21 + -0x58) <= *(ulong *)(unaff_x21 + -0x60)) {
      uVar2 = *(ulong *)(unaff_x21 + -0x58);
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
    unaff_x21 = unaff_x21 + -0x70;
  } while (unaff_x21 != unaff_x19);
  *(long *)(unaff_x20 + 8) = unaff_x19;
  return;
}

