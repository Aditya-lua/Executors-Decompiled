
void FUN_00426f58(undefined8 param_1)

{
  long lVar1;
  long in_x9;
  long unaff_x29;
  ulong uStack0000000000000000;
  ulong uStack0000000000000020;
  undefined8 uStack0000000000000040;
  
  if (in_x9 == 0) {
    param_1 = 0;
  }
  uStack0000000000000000 = (ulong)(in_x9 != 0);
  uStack0000000000000020 = uStack0000000000000000;
  uStack0000000000000040 = param_1;
  func_0x004015e4(unaff_x29 + -0x38);
  lVar1 = *(long *)(unaff_x29 + -0x38);
  while (lVar1 != 0) {
    lVar1 = lVar1 + *(long *)(unaff_x29 + -0x28) * 0x18;
    if (*(long *)(lVar1 + 8) != 0) {
      func_0x00187bd4(*(undefined8 *)(lVar1 + 0x10),*(long *)(lVar1 + 8),1);
    }
    if ((*(ulong *)(lVar1 + 0x110) | 0x8000000000000000) != 0x8000000000000000) {
      func_0x00187bd4(*(undefined8 *)(lVar1 + 0x118),*(ulong *)(lVar1 + 0x110),1);
    }
    func_0x004015e4(unaff_x29 + -0x38);
    lVar1 = *(long *)(unaff_x29 + -0x38);
  }
  return;
}

