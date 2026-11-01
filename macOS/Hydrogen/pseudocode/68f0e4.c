
undefined8 FUN_0068f0e4(void)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  long *unaff_x20;
  undefined8 unaff_x21;
  int unaff_w22;
  undefined8 unaff_x23;
  long unaff_x26;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  
  while( true ) {
    *(undefined8 *)(unaff_x29 + -0x88) = unaff_x23;
    lVar1 = *(long *)(unaff_x29 + -0x68);
    uVar3 = *(ulong *)(unaff_x29 + -0x78);
    if (*(ulong *)(unaff_x29 + -0x70) <= *(ulong *)(unaff_x29 + -0x78)) {
      uVar3 = *(ulong *)(unaff_x29 + -0x70);
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
    if ((unaff_w22 != 0) && (uVar3 = func_0x0068d674(), (uVar3 & 1) != 0)) break;
    do {
      unaff_x21 = func_0x0068e4e8(&uStack0000000000000010);
      if ((int)unaff_x21 == 0) goto code_r0x0068f124;
    } while ((unaff_x20 != (long *)0x0) && (iVar2 = (**(code **)(*unaff_x20 + 0x10))(), iVar2 == 0))
    ;
    func_0x005fe1e8(unaff_x29 + -0x88,2);
    unaff_w22 = func_0x0068b85c();
  }
code_r0x0068f124:
  func_0x00694398(&uStack0000000000000010);
  *(long *)(unaff_x29 + -0xb8) = unaff_x26 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x98);
  uVar3 = *(ulong *)(unaff_x29 + -0xa8);
  if (*(ulong *)(unaff_x29 + -0xa0) <= *(ulong *)(unaff_x29 + -0xa8)) {
    uVar3 = *(ulong *)(unaff_x29 + -0xa0);
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
  return unaff_x21;
}

