
void FUN_006a814c(undefined8 param_1)

{
  long lVar1;
  ulong uVar2;
  long unaff_x29;
  
  *(undefined8 *)(unaff_x29 + -0x50) = param_1;
  lVar1 = *(long *)(unaff_x29 + -0x30);
  uVar2 = *(ulong *)(unaff_x29 + -0x40);
  if (*(ulong *)(unaff_x29 + -0x38) <= *(ulong *)(unaff_x29 + -0x40)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x38);
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

