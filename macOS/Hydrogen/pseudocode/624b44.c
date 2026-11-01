
void FUN_00624b44(long param_1,long param_2)

{
  long lVar1;
  bool in_CY;
  ulong uVar2;
  long in_x9;
  long unaff_x25;
  long unaff_x29;
  
  if (in_CY) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0xb0) = unaff_x25 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x90);
  uVar2 = *(ulong *)(unaff_x29 + -0xa0);
  if (*(ulong *)(unaff_x29 + -0x98) <= *(ulong *)(unaff_x29 + -0xa0)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x98);
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
  *(long *)(unaff_x29 + -0x80) = unaff_x25 + 0x10;
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
  return;
}

