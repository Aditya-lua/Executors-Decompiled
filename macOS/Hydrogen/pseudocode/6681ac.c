
void FUN_006681ac(void)

{
  long lVar1;
  ulong uVar2;
  undefined8 unaff_x19;
  long unaff_x22;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  undefined8 unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined1 uStack00000000000000f0;
  
  do {
    func_0x00611644();
    do {
      unaff_x24 = unaff_x24 + 1;
      if (unaff_x24 == unaff_x25) {
        func_0x00653f88(&uStack00000000000000f0);
        return;
      }
      func_0x00668cd8(unaff_x29 + -0xd8);
      func_0x005ffccc(unaff_x28 + unaff_x24 * unaff_x26 + 8);
      func_0x005ffccc(unaff_x28 + unaff_x24 * unaff_x26 + 0x38);
      *(undefined1 *)(unaff_x28 + unaff_x24 * unaff_x26 + 0x68) = *(undefined1 *)(unaff_x29 + -0x70)
      ;
      *(undefined8 *)(unaff_x29 + -0xd8) = unaff_x19;
      *(undefined8 *)(unaff_x29 + -0xa0) = unaff_x27;
      lVar1 = *(long *)(unaff_x29 + -0x80);
      uVar2 = *(ulong *)(unaff_x29 + -0x90);
      if (*(ulong *)(unaff_x29 + -0x88) <= *(ulong *)(unaff_x29 + -0x90)) {
        uVar2 = *(ulong *)(unaff_x29 + -0x88);
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
      *(long *)(unaff_x29 + -0xd0) = unaff_x22 + 0x10;
      lVar1 = *(long *)(unaff_x29 + -0xb0);
      uVar2 = *(ulong *)(unaff_x29 + -0xc0);
      if (*(ulong *)(unaff_x29 + -0xb8) <= *(ulong *)(unaff_x29 + -0xc0)) {
        uVar2 = *(ulong *)(unaff_x29 + -0xb8);
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

