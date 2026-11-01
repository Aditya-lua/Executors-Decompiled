
void FUN_0066a028(long param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  long unaff_x20;
  long unaff_x21;
  long lVar3;
  long unaff_x22;
  long lVar4;
  long lStack0000000000000008;
  long lStack0000000000000020;
  
  lStack0000000000000020 = param_2 + unaff_x22 * param_1;
  lVar4 = unaff_x20 * 0xa0;
  lVar1 = unaff_x21 + lVar4;
  lVar3 = unaff_x21;
  lStack0000000000000008 = param_2;
  do {
    func_0x0066a134(lVar3);
    lVar3 = lVar3 + 0xa0;
    lVar4 = lVar4 + -0xa0;
  } while (lVar4 != 0);
  func_0x0065139c();
  while (lVar1 != unaff_x21) {
    *(undefined **)(lVar1 + -0x30) = &UNK_009f5d60;
    lVar3 = *(long *)(lVar1 + -0x10);
    uVar2 = *(ulong *)(lVar1 + -0x20);
    if (*(ulong *)(lVar1 + -0x18) <= *(ulong *)(lVar1 + -0x20)) {
      uVar2 = *(ulong *)(lVar1 + -0x18);
    }
    if (lVar3 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(lVar3 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    func_0x0064f6d0(lVar1 + -0xa0);
    lVar1 = lVar1 + -0xa0;
  }
  if (lStack0000000000000008 == 0) {
    return;
  }
  __ZdlPv();
  return;
}

