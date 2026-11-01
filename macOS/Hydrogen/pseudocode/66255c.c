
void FUN_0066255c(long param_1,undefined8 param_2)

{
  long lVar1;
  ulong uVar2;
  ulong unaff_x21;
  long unaff_x29;
  
  (**(code **)(param_1 + (unaff_x21 & 0xffffffff)))(param_2,unaff_x29 + -0x50);
  *(undefined **)(unaff_x29 + -0x50) = &UNK_009f5d60;
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

