
void FUN_0064c1b0(long param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x10);
  while (lVar3 != param_2) {
    *(long *)(param_1 + 0x10) = lVar3 + -0x60;
    *(undefined **)(lVar3 + -0x30) = &UNK_009f5d60;
    lVar1 = *(long *)(lVar3 + -0x10);
    uVar2 = *(ulong *)(lVar3 + -0x20);
    if (*(ulong *)(lVar3 + -0x18) <= *(ulong *)(lVar3 + -0x20)) {
      uVar2 = *(ulong *)(lVar3 + -0x18);
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
    *(undefined **)(lVar3 + -0x60) = &UNK_009f5d60;
    lVar1 = *(long *)(lVar3 + -0x40);
    uVar2 = *(ulong *)(lVar3 + -0x50);
    if (*(ulong *)(lVar3 + -0x48) <= *(ulong *)(lVar3 + -0x50)) {
      uVar2 = *(ulong *)(lVar3 + -0x48);
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
    lVar3 = *(long *)(param_1 + 0x10);
  }
  return;
}

