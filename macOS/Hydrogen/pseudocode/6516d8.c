
undefined8 FUN_006516d8(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long unaff_x19;
  undefined8 uVar4;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  func_0x006517b4(param_1);
  func_0x0065139c();
  uVar4 = *(undefined8 *)(unaff_x19 + 8);
  lVar2 = in_stack_00000018 + 0xa0;
  while (lVar2 != in_stack_00000010) {
    *(undefined **)(lVar2 + -0x30) = &UNK_009f5d60;
    lVar1 = *(long *)(lVar2 + -0x10);
    uVar3 = *(ulong *)(lVar2 + -0x20);
    if (*(ulong *)(lVar2 + -0x18) <= *(ulong *)(lVar2 + -0x20)) {
      uVar3 = *(ulong *)(lVar2 + -0x18);
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
    func_0x0064f6d0(lVar2 + -0xa0);
    lVar2 = lVar2 + -0xa0;
  }
  if (in_stack_00000008 != 0) {
    __ZdlPv();
  }
  return uVar4;
}

