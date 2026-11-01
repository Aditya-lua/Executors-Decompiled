
undefined8 FUN_006516b8(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  long unaff_x19;
  undefined8 uVar6;
  long unaff_x21;
  
  lVar3 = __Znwm();
  lVar4 = lVar3 + unaff_x21 * 0xa0;
  func_0x006517b4(lVar4);
  func_0x0065139c();
  uVar6 = *(undefined8 *)(unaff_x19 + 8);
  lVar2 = lVar4 + 0xa0;
  while (lVar2 != lVar4) {
    *(undefined **)(lVar2 + -0x30) = &UNK_009f5d60;
    lVar1 = *(long *)(lVar2 + -0x10);
    uVar5 = *(ulong *)(lVar2 + -0x20);
    if (*(ulong *)(lVar2 + -0x18) <= *(ulong *)(lVar2 + -0x20)) {
      uVar5 = *(ulong *)(lVar2 + -0x18);
    }
    if (lVar1 != 0) {
      if (uVar5 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar5 * 8) = 0;
          uVar5 = uVar5 - 1;
        } while (uVar5 != 0);
      }
      func_0x00611644();
    }
    func_0x0064f6d0(lVar2 + -0xa0);
    lVar2 = lVar2 + -0xa0;
  }
  if (lVar3 != 0) {
    __ZdlPv();
  }
  return uVar6;
}

