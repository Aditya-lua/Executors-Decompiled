
void FUN_00630f08(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  long *plVar4;
  undefined8 extraout_x8;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined1 uStack0000000000000010;
  undefined *apuStack_98 [2];
  ulong uStack_88;
  ulong uStack_80;
  long lStack_78;
  ulong uStack_68;
  ulong uStack_60;
  long lStack_58;
  long lStack_48;
  long lStack_40;
  undefined8 uStack_38;
  
  func_0x006143a8();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return;
  }
  ___stack_chk_fail();
  uVar2 = __Unwind_Resume();
  func_0x006143a8(&uStack0000000000000010);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x006143a8(&uStack0000000000000010);
  auVar5 = __Unwind_Resume(uVar2);
  plVar4 = auVar5._8_8_;
  lVar3 = auVar5._0_8_;
  lStack_48 = 0;
  lStack_40 = 0;
  uStack_38 = 0;
  func_0x006310fc(&lStack_48,
                  (*(long *)(lVar3 + 0x98) - *(long *)(lVar3 + 0x90) >> 4) * -0x3333333333333333);
  func_0x0063120c(lVar3,plVar4,&lStack_48,param_3);
  uVar2 = (**(code **)(*plVar4 + 0x28))(plVar4);
  func_0x00631618(apuStack_98,uVar2,lStack_48,lStack_40);
  (**(code **)(*plVar4 + 0x20))(extraout_x8,plVar4,apuStack_98);
  apuStack_98[0] = &UNK_00a09a70;
  if (uStack_60 <= uStack_68) {
    uStack_68 = uStack_60;
  }
  if (lStack_58 != 0) {
    if (uStack_68 != 0) {
      do {
        *(undefined8 *)(lStack_58 + -8 + uStack_68 * 8) = 0;
        uStack_68 = uStack_68 - 1;
      } while (uStack_68 != 0);
    }
    func_0x00611644();
  }
  if (uStack_80 <= uStack_88) {
    uStack_88 = uStack_80;
  }
  if (lStack_78 != 0) {
    if (uStack_88 != 0) {
      do {
        *(undefined8 *)(lStack_78 + -8 + uStack_88 * 8) = 0;
        uStack_88 = uStack_88 - 1;
      } while (uStack_88 != 0);
    }
    func_0x00611644();
  }
  lVar1 = lStack_48;
  lVar3 = lStack_40;
  if (lStack_48 != 0) {
    for (; lVar3 != lVar1; lVar3 = func_0x00650db0(lVar3 + -0x80)) {
    }
    lStack_40 = lVar1;
    __ZdlPv(lStack_48);
  }
  return;
}

