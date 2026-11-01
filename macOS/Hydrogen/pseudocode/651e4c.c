
void FUN_00651e4c(long param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 extraout_x8;
  long unaff_x19;
  undefined *puStack_40;
  long lStack_38;
  long lStack_30;
  
  *(long *)(unaff_x19 + 0x80) = param_1 + 0xd60;
  lVar1 = *(long *)(unaff_x19 + 0xa0);
  uVar2 = *(ulong *)(unaff_x19 + 0x90);
  if (*(ulong *)(unaff_x19 + 0x98) <= *(ulong *)(unaff_x19 + 0x90)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x98);
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  func_0x00087574();
  func_0x00087574();
  if (*(long **)(unaff_x19 + 0x10) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x19 + 0x10) + 8))();
  }
  __Unwind_Resume();
  func_0x00653278(&puStack_40);
  func_0x00610060(extraout_x8,&puStack_40,0x12d);
  puStack_40 = &UNK_009f6678;
  if (lStack_38 != 0) {
    lStack_30 = lStack_38;
    __ZdlPv();
  }
  return;
}

