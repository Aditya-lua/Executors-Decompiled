
void FUN_00690f10(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x29;
  
  func_0x006072ac(unaff_x29 + -0xb8);
  func_0x00609b98(unaff_x29 + -0x88,unaff_x29 + -0xb8,4);
  func_0x0060a860();
  *(undefined **)(unaff_x29 + -0x88) = &UNK_009f5d60;
  lVar1 = *(long *)(unaff_x29 + -0x68);
  uVar2 = *(ulong *)(unaff_x29 + -0x78);
  if (*(ulong *)(unaff_x29 + -0x70) <= *(ulong *)(unaff_x29 + -0x78)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x70);
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
  *(undefined **)(unaff_x29 + -0xb8) = &UNK_009f5d60;
  lVar1 = *(long *)(unaff_x29 + -0x98);
  uVar2 = *(ulong *)(unaff_x29 + -0xa8);
  if (*(ulong *)(unaff_x29 + -0xa0) <= *(ulong *)(unaff_x29 + -0xa8)) {
    uVar2 = *(ulong *)(unaff_x29 + -0xa0);
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
  *(undefined **)(unaff_x29 + -0xe8) = &UNK_009f5d60;
  lVar1 = *(long *)(unaff_x29 + -200);
  uVar2 = *(ulong *)(unaff_x29 + -0xd8);
  if (*(ulong *)(unaff_x29 + -0xd0) <= *(ulong *)(unaff_x29 + -0xd8)) {
    uVar2 = *(ulong *)(unaff_x29 + -0xd0);
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
  return;
}

