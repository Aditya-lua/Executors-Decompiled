
void FUN_0064c260(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  long lVar3;
  
  do {
    func_0x00611644();
    do {
      lVar3 = *(long *)(unaff_x20 + 0x10);
      if (lVar3 == unaff_x19) {
        return;
      }
      *(long *)(unaff_x20 + 0x10) = lVar3 + -0x60;
      *(undefined8 *)(lVar3 + -0x30) = unaff_x22;
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
      *(long *)(lVar3 + -0x60) = unaff_x21 + 0x10;
      lVar1 = *(long *)(lVar3 + -0x40);
      uVar2 = *(ulong *)(lVar3 + -0x50);
      if (*(ulong *)(lVar3 + -0x48) <= *(ulong *)(lVar3 + -0x50)) {
        uVar2 = *(ulong *)(lVar3 + -0x48);
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

