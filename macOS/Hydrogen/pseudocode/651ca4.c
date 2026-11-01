
undefined8 FUN_00651ca4(void)

{
  undefined8 uVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  long unaff_x19;
  undefined1 uStack0000000000000030;
  
  uVar1 = func_0x0001753c();
  *(undefined **)(unaff_x19 + 8) = &UNK_009f5d60;
  lVar3 = *(long *)(unaff_x19 + 0x28);
  uVar4 = *(ulong *)(unaff_x19 + 0x18);
  if (*(ulong *)(unaff_x19 + 0x20) <= *(ulong *)(unaff_x19 + 0x18)) {
    uVar4 = *(ulong *)(unaff_x19 + 0x20);
  }
  if (lVar3 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar3 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  func_0x00087574();
  func_0x00087574(&uStack0000000000000030);
  lVar2 = __Unwind_Resume(uVar1);
  func_0x00087574(&uStack0000000000000030);
  uVar1 = __Unwind_Resume(lVar2);
  *(undefined **)(lVar2 + 8) = &UNK_009f5d60;
  lVar3 = *(long *)(lVar2 + 0x28);
  uVar4 = *(ulong *)(lVar2 + 0x18);
  if (*(ulong *)(lVar2 + 0x20) <= *(ulong *)(lVar2 + 0x18)) {
    uVar4 = *(ulong *)(lVar2 + 0x20);
  }
  if (lVar3 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar3 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume(uVar1);
  lVar3 = func_0x0001753c();
  return *(undefined8 *)(lVar3 + 8);
}

