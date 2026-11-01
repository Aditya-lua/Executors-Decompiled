
void FUN_006330e0(long param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  long unaff_x24;
  long unaff_x29;
  
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0xb8) = unaff_x24 + 0x10;
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
  *(long *)(unaff_x29 + -0x88) = unaff_x24 + 0x10;
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

