
void FUN_0064c2a0(undefined8 param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  if (unaff_x21 != param_2) {
    do {
      *(undefined **)(unaff_x21 + -0x30) = &UNK_009f5d60;
      lVar1 = *(long *)(unaff_x21 + -0x10);
      uVar2 = *(ulong *)(unaff_x21 + -0x20);
      if (*(ulong *)(unaff_x21 + -0x18) <= *(ulong *)(unaff_x21 + -0x20)) {
        uVar2 = *(ulong *)(unaff_x21 + -0x18);
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
      *(undefined **)(unaff_x21 + -0x60) = &UNK_009f5d60;
      lVar1 = *(long *)(unaff_x21 + -0x40);
      uVar2 = *(ulong *)(unaff_x21 + -0x50);
      if (*(ulong *)(unaff_x21 + -0x48) <= *(ulong *)(unaff_x21 + -0x50)) {
        uVar2 = *(ulong *)(unaff_x21 + -0x48);
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
      unaff_x21 = unaff_x21 + -0x60;
    } while (unaff_x21 != unaff_x19);
  }
  *(long *)(unaff_x20 + 8) = unaff_x19;
  return;
}

