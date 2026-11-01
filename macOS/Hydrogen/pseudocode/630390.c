
void FUN_00630390(long param_1)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  
  *(long *)(unaff_x19 + 0x60) = param_1 + 0xd60;
  lVar1 = *(long *)(unaff_x19 + 0x80);
  uVar2 = *(ulong *)(unaff_x19 + 0x70);
  if (*(ulong *)(unaff_x19 + 0x78) <= *(ulong *)(unaff_x19 + 0x70)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x78);
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
  *(undefined **)(unaff_x19 + 8) = &UNK_00a09a70;
  lVar1 = *(long *)(unaff_x19 + 0x48);
  uVar2 = *(ulong *)(unaff_x19 + 0x38);
  if (*(ulong *)(unaff_x19 + 0x40) <= *(ulong *)(unaff_x19 + 0x38)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x40);
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
  lVar1 = *(long *)(unaff_x19 + 0x28);
  uVar2 = *(ulong *)(unaff_x19 + 0x18);
  if (*(ulong *)(unaff_x19 + 0x20) <= *(ulong *)(unaff_x19 + 0x18)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x20);
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

