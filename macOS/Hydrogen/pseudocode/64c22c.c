
void FUN_0064c22c(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  
  do {
    func_0x00611644();
    do {
      *(long *)(unaff_x23 + -0x60) = unaff_x21 + 0x10;
      lVar1 = *(long *)(unaff_x23 + -0x40);
      uVar2 = *(ulong *)(unaff_x23 + -0x50);
      if (*(ulong *)(unaff_x23 + -0x48) <= *(ulong *)(unaff_x23 + -0x50)) {
        uVar2 = *(ulong *)(unaff_x23 + -0x48);
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
      unaff_x23 = *(long *)(unaff_x20 + 0x10);
      if (unaff_x23 == unaff_x19) {
        return;
      }
      *(long *)(unaff_x20 + 0x10) = unaff_x23 + -0x60;
      *(undefined8 *)(unaff_x23 + -0x30) = unaff_x22;
      lVar1 = *(long *)(unaff_x23 + -0x10);
      uVar2 = *(ulong *)(unaff_x23 + -0x20);
      if (*(ulong *)(unaff_x23 + -0x18) <= *(ulong *)(unaff_x23 + -0x20)) {
        uVar2 = *(ulong *)(unaff_x23 + -0x18);
      }
    } while (lVar1 == 0);
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
  } while( true );
}

