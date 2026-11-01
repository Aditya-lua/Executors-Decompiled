
void FUN_0066a304(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  undefined8 unaff_x20;
  
  *(undefined8 *)(unaff_x19 + 0x98) = unaff_x20;
  lVar1 = *(long *)(unaff_x19 + 0xb8);
  uVar2 = *(ulong *)(unaff_x19 + 0xa8);
  if (*(ulong *)(unaff_x19 + 0xb0) <= *(ulong *)(unaff_x19 + 0xa8)) {
    uVar2 = *(ulong *)(unaff_x19 + 0xb0);
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
  func_0x00669d7c(unaff_x19 + 8);
  return;
}

