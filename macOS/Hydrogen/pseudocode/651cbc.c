
undefined8 FUN_00651cbc(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  ulong uVar4;
  undefined8 in_x9;
  undefined1 uStack0000000000000030;
  
  *(undefined8 *)(param_1 + 8) = in_x9;
  lVar3 = *(long *)(param_1 + 0x28);
  uVar4 = *(ulong *)(param_1 + 0x18);
  if (*(ulong *)(param_1 + 0x20) <= *(ulong *)(param_1 + 0x18)) {
    uVar4 = *(ulong *)(param_1 + 0x20);
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
  lVar1 = __Unwind_Resume();
  func_0x00087574(&uStack0000000000000030);
  uVar2 = __Unwind_Resume(lVar1);
  *(undefined **)(lVar1 + 8) = &UNK_009f5d60;
  lVar3 = *(long *)(lVar1 + 0x28);
  uVar4 = *(ulong *)(lVar1 + 0x18);
  if (*(ulong *)(lVar1 + 0x20) <= *(ulong *)(lVar1 + 0x18)) {
    uVar4 = *(ulong *)(lVar1 + 0x20);
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
  __Unwind_Resume(uVar2);
  lVar3 = func_0x0001753c();
  return *(undefined8 *)(lVar3 + 8);
}

