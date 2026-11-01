
void FUN_0064ac78(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  
  while (unaff_x23 != *(long **)(unaff_x19 + 0x20)) {
    unaff_x23[6] = unaff_x22;
    lVar1 = unaff_x23[10];
    uVar2 = unaff_x23[8];
    if ((ulong)unaff_x23[9] <= (ulong)unaff_x23[8]) {
      uVar2 = unaff_x23[9];
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
    *unaff_x23 = unaff_x21 + 0x10;
    lVar1 = unaff_x23[4];
    uVar2 = unaff_x23[2];
    if ((ulong)unaff_x23[3] <= (ulong)unaff_x23[2]) {
      uVar2 = unaff_x23[3];
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
    unaff_x23 = (long *)(*(long *)(unaff_x20 + 0x20) + 0x70);
    *(long **)(unaff_x20 + 0x20) = unaff_x23;
  }
  return;
}

