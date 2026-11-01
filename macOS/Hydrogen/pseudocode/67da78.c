
void FUN_0067da78(void)

{
  long lVar1;
  ulong uVar2;
  undefined8 unaff_x19;
  long unaff_x22;
  long unaff_x29;
  
  func_0x00611644();
  *(undefined8 *)(unaff_x29 + -0x90) = unaff_x19;
  lVar1 = *(long *)(unaff_x29 + -0x70);
  uVar2 = *(ulong *)(unaff_x29 + -0x80);
  if (*(ulong *)(unaff_x29 + -0x78) <= *(ulong *)(unaff_x29 + -0x80)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x78);
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
  *(long *)(unaff_x29 + -0x60) = unaff_x22 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x40);
  uVar2 = *(ulong *)(unaff_x29 + -0x50);
  if (*(ulong *)(unaff_x29 + -0x48) <= *(ulong *)(unaff_x29 + -0x50)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x48);
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

