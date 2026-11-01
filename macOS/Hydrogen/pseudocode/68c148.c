
uint FUN_0068c148(void)

{
  long lVar1;
  ulong uVar2;
  uint unaff_w22;
  long unaff_x23;
  long unaff_x29;
  
  *(long *)(unaff_x29 + -0x80) = unaff_x23 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x60);
  uVar2 = *(ulong *)(unaff_x29 + -0x70);
  if (*(ulong *)(unaff_x29 + -0x68) <= *(ulong *)(unaff_x29 + -0x70)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x68);
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
  return unaff_w22 & 1;
}

