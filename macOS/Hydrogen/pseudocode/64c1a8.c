
void FUN_0064c1a8(void)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  undefined1 auVar5 [16];
  
  func_0x0001753c();
  auVar5 = func_0x0001753c();
  lVar2 = auVar5._0_8_;
  lVar4 = *(long *)(lVar2 + 0x10);
  while (lVar4 != auVar5._8_8_) {
    *(long *)(lVar2 + 0x10) = lVar4 + -0x60;
    *(undefined **)(lVar4 + -0x30) = &UNK_009f5d60;
    lVar1 = *(long *)(lVar4 + -0x10);
    uVar3 = *(ulong *)(lVar4 + -0x20);
    if (*(ulong *)(lVar4 + -0x18) <= *(ulong *)(lVar4 + -0x20)) {
      uVar3 = *(ulong *)(lVar4 + -0x18);
    }
    if (lVar1 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    *(undefined **)(lVar4 + -0x60) = &UNK_009f5d60;
    lVar1 = *(long *)(lVar4 + -0x40);
    uVar3 = *(ulong *)(lVar4 + -0x50);
    if (*(ulong *)(lVar4 + -0x48) <= *(ulong *)(lVar4 + -0x50)) {
      uVar3 = *(ulong *)(lVar4 + -0x48);
    }
    if (lVar1 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    lVar4 = *(long *)(lVar2 + 0x10);
  }
  return;
}

