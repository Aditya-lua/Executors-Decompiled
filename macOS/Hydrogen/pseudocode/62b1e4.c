
void FUN_0062b1e4(void)

{
  long lVar1;
  ulong uVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  do {
    lVar1 = *(long *)(unaff_x21 + -8);
    uVar2 = *(ulong *)(unaff_x21 + -0x18);
    if (*(ulong *)(unaff_x21 + -0x10) <= *(ulong *)(unaff_x21 + -0x18)) {
      uVar2 = *(ulong *)(unaff_x21 + -0x10);
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
    unaff_x21 = unaff_x21 + -0x20;
  } while (unaff_x21 != unaff_x20);
  unaff_x19[1] = unaff_x20;
  __ZdlPv(*unaff_x19);
  return;
}

