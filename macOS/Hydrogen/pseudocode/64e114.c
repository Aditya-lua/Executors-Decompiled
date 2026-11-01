
void FUN_0064e114(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  
  lVar1 = *(long *)(unaff_x19 + 0x30);
  uVar2 = *(ulong *)(unaff_x19 + 0x20);
  if (*(ulong *)(unaff_x19 + 0x28) <= *(ulong *)(unaff_x19 + 0x20)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x28);
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

