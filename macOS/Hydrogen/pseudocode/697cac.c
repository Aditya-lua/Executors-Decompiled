
ulong thunk_FUN_00697cc0(void)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  long *plVar4;
  undefined1 uStack0000000000000040;
  undefined *apuStack_50 [2];
  ulong uStack_40;
  ulong uStack_38;
  long lStack_30;
  
  func_0x00087574();
  func_0x0003e9ec(&uStack0000000000000040);
  lVar3 = __Unwind_Resume();
  plVar4 = (long *)(**(code **)(*(long *)(lVar3 + 0x10) + 0x10))();
  (**(code **)(*plVar4 + 0x10))(apuStack_50);
  iVar2 = func_0x00602288(apuStack_50);
  apuStack_50[0] = &UNK_009f5d60;
  if (uStack_38 <= uStack_40) {
    uStack_40 = uStack_38;
  }
  if (lStack_30 != 0) {
    if (uStack_40 != 0) {
      do {
        *(undefined8 *)(lStack_30 + -8 + uStack_40 * 8) = 0;
        uStack_40 = uStack_40 - 1;
      } while (uStack_40 != 0);
    }
    func_0x00611644();
  }
  uVar1 = 0;
  if (iVar2 != 0) {
    uVar1 = iVar2 - 1;
  }
  return (ulong)uVar1 + 7 >> 3;
}

