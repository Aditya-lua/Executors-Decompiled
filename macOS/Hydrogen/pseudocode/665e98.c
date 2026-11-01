
void FUN_00665e98(void)

{
  long lVar1;
  byte bVar2;
  byte bVar3;
  ulong uVar4;
  long unaff_x21;
  long unaff_x29;
  
  func_0x00690ec4();
  func_0x005ffccc();
  *(long *)(unaff_x29 + -0x98) = unaff_x21 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x78);
  uVar4 = *(ulong *)(unaff_x29 + -0x88);
  if (*(ulong *)(unaff_x29 + -0x80) <= *(ulong *)(unaff_x29 + -0x88)) {
    uVar4 = *(ulong *)(unaff_x29 + -0x80);
  }
  if (lVar1 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  bVar2 = *(byte *)(unaff_x29 + -0x31);
  bVar3 = func_0x005ffe3c();
  if (((bVar3 ^ (bVar2 & 1) == 0) & 1) == 0) {
    func_0x00607398(unaff_x29 + -0x98,unaff_x29 + -0x68);
    func_0x005ffccc();
    func_0x00087574(unaff_x29 + -0x98);
  }
  *(long *)(unaff_x29 + -0x68) = unaff_x21 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x48);
  uVar4 = *(ulong *)(unaff_x29 + -0x58);
  if (*(ulong *)(unaff_x29 + -0x50) <= *(ulong *)(unaff_x29 + -0x58)) {
    uVar4 = *(ulong *)(unaff_x29 + -0x50);
  }
  if (lVar1 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  return;
}

