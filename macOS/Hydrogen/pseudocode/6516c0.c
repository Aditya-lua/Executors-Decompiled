
undefined8 FUN_006516c0(void)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long unaff_x19;
  undefined8 uVar4;
  long lVar5;
  long unaff_x21;
  long unaff_x22;
  long lStack0000000000000008;
  long lStack0000000000000010;
  long lStack0000000000000018;
  long lStack0000000000000020;
  
  lStack0000000000000010 = unaff_x21 * 0xa0;
  lStack0000000000000008 = 0;
  lStack0000000000000020 = unaff_x22 * 0xa0;
  lStack0000000000000018 = lStack0000000000000010;
  func_0x006517b4(lStack0000000000000010);
  lStack0000000000000018 = lStack0000000000000018 + 0xa0;
  func_0x0065139c();
  lVar2 = lStack0000000000000010;
  uVar4 = *(undefined8 *)(unaff_x19 + 8);
  while (lStack0000000000000018 != lVar2) {
    lVar5 = lStack0000000000000018 + -0xa0;
    *(undefined **)(lStack0000000000000018 + -0x30) = &UNK_009f5d60;
    lVar1 = *(long *)(lStack0000000000000018 + -0x10);
    uVar3 = *(ulong *)(lStack0000000000000018 + -0x20);
    if (*(ulong *)(lStack0000000000000018 + -0x18) <= *(ulong *)(lStack0000000000000018 + -0x20)) {
      uVar3 = *(ulong *)(lStack0000000000000018 + -0x18);
    }
    lStack0000000000000018 = lVar5;
    if (lVar1 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    func_0x0064f6d0(lVar5);
  }
  if (lStack0000000000000008 != 0) {
    __ZdlPv();
  }
  return uVar4;
}

