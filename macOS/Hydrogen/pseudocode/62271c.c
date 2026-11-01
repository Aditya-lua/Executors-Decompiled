
void FUN_0062271c(undefined8 param_1,undefined8 param_2,long param_3)

{
  bool bVar1;
  undefined8 uVar2;
  long *plVar3;
  long lVar4;
  undefined8 extraout_x8;
  ulong uVar5;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong uVar6;
  undefined8 unaff_x22;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000010;
  undefined *apuStack_78 [2];
  ulong uStack_68;
  ulong uStack_60;
  long lStack_58;
  long lStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  ulong uStack_28;
  
  func_0x00602890(param_1,&uStack0000000000000010);
  lVar4 = *(long *)(unaff_x20 + 0x70);
  if (*(long *)(unaff_x20 + 0x78) != lVar4) {
    unaff_x22 = 0x30;
    uVar5 = 0;
    uVar6 = 1;
    do {
      param_3 = lVar4 + uVar5 * 0x30;
      (**(code **)(*unaff_x19 + 0x38))();
      lVar4 = *(long *)(unaff_x20 + 0x70);
      unaff_x21 = (ulong)((int)uVar6 + 1);
      bVar1 = uVar6 < (ulong)((*(long *)(unaff_x20 + 0x78) - lVar4 >> 4) * -0x5555555555555555);
      uVar5 = uVar6;
      uVar6 = unaff_x21;
    } while (bVar1);
  }
  func_0x00612b0c(&uStack0000000000000010);
  func_0x006143a8(&uStack0000000000000010);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return;
  }
  ___stack_chk_fail();
  uVar2 = __Unwind_Resume();
  func_0x006143a8(&uStack0000000000000010);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x006143a8(&uStack0000000000000010);
  auVar7 = __Unwind_Resume(uVar2);
  plVar3 = auVar7._8_8_;
  lVar4 = auVar7._0_8_;
  lStack_48 = 0;
  uStack_40 = 0;
  uStack_38 = 0;
  uStack_30 = unaff_x22;
  uStack_28 = unaff_x21;
  func_0x00622930(&lStack_48,
                  (*(long *)(lVar4 + 0x78) - *(long *)(lVar4 + 0x70) >> 4) * -0x5555555555555555);
  func_0x00622a3c(lVar4,plVar3,&lStack_48,param_3);
  uVar2 = (**(code **)(*plVar3 + 0x28))(plVar3);
  func_0x0062315c(apuStack_78,uVar2,lStack_48,uStack_40);
  (**(code **)(*plVar3 + 0x20))(extraout_x8,plVar3,apuStack_78);
  apuStack_78[0] = &UNK_009f5d60;
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
  if (lStack_48 != 0) {
    func_0x0064c280(&lStack_48);
    __ZdlPv(lStack_48);
  }
  return;
}

