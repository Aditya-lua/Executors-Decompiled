
long * FUN_00667334(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  long lVar5;
  long *plVar6;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000030;
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  undefined *apuStack_60 [2];
  ulong uStack_50;
  ulong uStack_48;
  long lStack_40;
  
  func_0x00087574(&uStack0000000000000030);
  uVar3 = __Unwind_Resume(param_1);
  func_0x00087574();
  func_0x00087574(&uStack0000000000000030);
  auVar7 = __Unwind_Resume(uVar3);
  lVar5 = auVar7._8_8_;
  plVar4 = auVar7._0_8_;
  if (*(char *)(lVar5 + 0x68) == '\0') {
    lVar1 = lVar5 + 0x38;
    uVar3 = (**(code **)(*(long *)plVar4[2] + 0x18))();
    iVar2 = func_0x00609ec8(lVar1,uVar3);
    if (iVar2 != 0) {
      lVar5 = lVar5 + 8;
      uVar3 = (**(code **)(*(long *)plVar4[2] + 0x90))((long *)plVar4[2],lVar5);
      func_0x005fe0b4(apuStack_60,uVar3);
      plVar6 = (long *)plVar4[2];
      uVar3 = (**(code **)(*plVar6 + 0x38))(plVar6,apuStack_60);
      uVar3 = (**(code **)(*plVar6 + 0x20))(plVar6,uVar3,apuStack_60);
      uVar3 = (**(code **)(*plVar6 + 0x20))(plVar6,uVar3,plVar4 + 3);
      func_0x005ffccc(apuStack_60,uVar3);
      plVar6 = (long *)plVar4[2];
      uVar3 = (**(code **)(*plVar6 + 0x38))(plVar6,lVar1);
      uVar3 = (**(code **)(*plVar6 + 0x98))(plVar6,apuStack_60,uVar3);
      func_0x005ffccc(apuStack_60,uVar3);
      plVar6 = (long *)plVar4[2];
      uVar3 = (**(code **)(*plVar6 + 0x90))(plVar6,apuStack_60);
      uVar3 = (**(code **)(*plVar6 + 0x40))(plVar6,uVar3,lVar5);
      uVar3 = (**(code **)(*plVar6 + 0x40))(plVar6,uVar3,lVar5);
      func_0x005fe0b4(apuStack_90,uVar3);
      plVar6 = (long *)plVar4[2];
      uVar3 = (**(code **)(*plVar6 + 0x40))(plVar6,lVar5,apuStack_90);
      uVar3 = (**(code **)(*plVar6 + 0x80))(plVar6,apuStack_60,uVar3);
      uVar3 = (**(code **)(*plVar6 + 0x40))(plVar6,uVar3,lVar1);
      func_0x005ffccc(plVar4 + 0x16,uVar3);
      func_0x00600180(plVar4 + 0x10,apuStack_90);
      *(undefined1 *)(plVar4 + 0x1c) = 0;
      apuStack_90[0] = &UNK_009f5d60;
      if (uStack_78 <= uStack_80) {
        uStack_80 = uStack_78;
      }
      if (lStack_70 != 0) {
        if (uStack_80 != 0) {
          do {
            *(undefined8 *)(lStack_70 + -8 + uStack_80 * 8) = 0;
            uStack_80 = uStack_80 - 1;
          } while (uStack_80 != 0);
        }
        func_0x00611644();
      }
      apuStack_60[0] = &UNK_009f5d60;
      if (uStack_48 <= uStack_50) {
        uStack_50 = uStack_48;
      }
      if (lStack_40 != 0) {
        if (uStack_50 != 0) {
          do {
            *(undefined8 *)(lStack_40 + -8 + uStack_50 * 8) = 0;
            uStack_50 = uStack_50 - 1;
          } while (uStack_50 != 0);
        }
        func_0x00611644();
      }
      return plVar4 + 0xf;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x006673a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  plVar4 = (long *)(**(code **)(*plVar4 + 0x18))(plVar4);
  return plVar4;
}

