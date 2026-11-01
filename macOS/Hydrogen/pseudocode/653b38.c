
undefined8 * FUN_00653b38(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  ulong uVar4;
  long unaff_x19;
  undefined1 auVar5 [16];
  
  *(long *)(unaff_x19 + 0x80) = param_1 + 0xd60;
  lVar1 = *(long *)(unaff_x19 + 0xa0);
  uVar4 = *(ulong *)(unaff_x19 + 0x90);
  if (*(ulong *)(unaff_x19 + 0x98) <= *(ulong *)(unaff_x19 + 0x90)) {
    uVar4 = *(ulong *)(unaff_x19 + 0x98);
  }
  if (lVar1 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  func_0x00087574();
  func_0x00087574();
  if (*(long **)(unaff_x19 + 0x10) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x19 + 0x10) + 8))();
  }
  uVar2 = __Unwind_Resume();
  __ZdlPv();
  auVar5 = __Unwind_Resume(uVar2);
  puVar3 = auVar5._0_8_;
  puVar3[2] = puVar3;
  *puVar3 = &UNK_009f5de0;
  puVar3[1] = &UNK_009f66a8;
  func_0x005fe0b4(puVar3 + 3);
  func_0x005ffad0(puVar3 + 9,0,*(undefined8 *)(auVar5._8_8_ + 0x18));
  func_0x005fdd18(puVar3 + 0xf);
  return puVar3;
}

