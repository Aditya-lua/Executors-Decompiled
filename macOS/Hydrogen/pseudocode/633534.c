
void FUN_00633534(void)

{
  long lVar1;
  ulong uVar2;
  undefined8 unaff_x19;
  long unaff_x29;
  
  *(undefined8 *)(unaff_x29 + -0x88) = unaff_x19;
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
  return;
}

