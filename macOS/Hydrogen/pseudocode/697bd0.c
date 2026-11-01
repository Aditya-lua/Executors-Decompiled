
ulong FUN_00697bd0(void)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  long *plVar4;
  undefined8 unaff_x20;
  uint unaff_w21;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000040;
  undefined8 in_stack_00000090;
  long in_stack_000000a0;
  undefined *apuStack_50 [2];
  ulong uStack_40;
  ulong uStack_38;
  long lStack_30;
  undefined8 uStack_20;
  
  if (in_stack_000000a0 < 0) {
    __ZdlPv(in_stack_00000090);
    unaff_w21 = unaff_w21 & 1;
  }
  if (unaff_w21 != 0) {
    ___cxa_free_exception();
    __Unwind_Resume();
    func_0x0001753c();
    func_0x0001753c();
    func_0x0001753c();
    unaff_x20 = func_0x0001753c();
    func_0x00087574(&uStack0000000000000010);
    func_0x0003e9ec(&uStack0000000000000040);
  }
  lVar3 = __Unwind_Resume(unaff_x20);
  uStack_20 = unaff_x20;
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

