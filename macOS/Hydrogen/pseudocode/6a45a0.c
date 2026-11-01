
/* WARNING: Possible PIC construction at 0x0060a8e0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0060a928: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0060a8e4) */
/* WARNING: Removing unreachable block (ram,0x0060a92c) */

undefined ** FUN_006a45a0(undefined **param_1)

{
  long *plVar1;
  long lVar2;
  bool in_ZR;
  undefined8 uVar3;
  undefined **ppuVar4;
  long *plVar5;
  long lVar6;
  undefined8 extraout_x8;
  long lVar7;
  undefined1 auVar8 [16];
  undefined *apuStack_238 [3];
  undefined *puStack_220;
  ulong uStack_210;
  ulong uStack_208;
  long lStack_200;
  undefined *puStack_1f0;
  ulong uStack_1e0;
  ulong uStack_1d8;
  long lStack_1d0;
  undefined *puStack_1c0;
  ulong uStack_1b0;
  ulong uStack_1a8;
  long lStack_1a0;
  undefined *puStack_160;
  undefined *puStack_158;
  long lStack_108;
  undefined *puStack_e0;
  undefined *puStack_d8;
  long lStack_88;
  undefined *puStack_60;
  undefined *puStack_58;
  long lStack_28;
  
  if (in_ZR) {
    return param_1;
  }
  ___stack_chk_fail();
  uVar3 = __Unwind_Resume();
  func_0x00613f64();
  auVar8 = __Unwind_Resume(uVar3);
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x00612940(&puStack_60,auVar8._8_8_,0x30);
  puStack_60 = &UNK_009f6498;
  puStack_58 = &UNK_009f6630;
  func_0x005ff0a4(auVar8._0_8_ + 0x10,&puStack_60);
  func_0x005ff0a4(auVar8._0_8_ + 0x40,&puStack_60);
  func_0x00612a40(&puStack_60);
  ppuVar4 = (undefined **)func_0x00613f64(&puStack_60);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
    return ppuVar4;
  }
  ___stack_chk_fail();
  uVar3 = __Unwind_Resume();
  func_0x00613f64(&puStack_60);
  auVar8 = __Unwind_Resume(uVar3);
  lStack_88 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x006129a4(&puStack_e0,auVar8._8_8_,0x30);
  puStack_e0 = &UNK_009f6108;
  puStack_d8 = &UNK_009f6298;
  func_0x00602890(auVar8._0_8_ + 0x18,&puStack_e0);
  func_0x00602890(auVar8._0_8_ + 0x48,&puStack_e0);
  func_0x00612b0c(&puStack_e0);
  ppuVar4 = (undefined **)func_0x006143a8(&puStack_e0);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_88) {
    return ppuVar4;
  }
  ___stack_chk_fail();
  uVar3 = __Unwind_Resume();
  func_0x006143a8(&puStack_e0);
  auVar8 = __Unwind_Resume(uVar3);
  lStack_108 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x006129a4(&puStack_160,auVar8._8_8_,0x30);
  puStack_160 = &UNK_009f6108;
  puStack_158 = &UNK_009f6298;
  func_0x00602890(auVar8._0_8_ + 0x10,&puStack_160);
  func_0x00602890(auVar8._0_8_ + 0x40,&puStack_160);
  func_0x00612b0c(&puStack_160);
  ppuVar4 = (undefined **)func_0x006143a8(&puStack_160);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_108) {
    return ppuVar4;
  }
  ___stack_chk_fail();
  uVar3 = __Unwind_Resume();
  func_0x006143a8(&puStack_160);
  auVar8 = __Unwind_Resume(uVar3);
  plVar5 = auVar8._0_8_;
  plVar1 = (long *)((long)plVar5 + *(long *)(*plVar5 + -0x18));
  uVar3 = func_0x005f007c();
  (**(code **)(*plVar1 + 0x28))(plVar1,uVar3,0);
  if ((int)plVar5[8] != 1) {
    if (*(long *)plVar5[7] == 0) {
      lVar6 = plVar5[6];
      do {
        if (lVar6 == 0) goto code_r0x0060a8f8;
        lVar7 = lVar6 + -1;
        lVar2 = lVar6 + -1;
        lVar6 = lVar7;
      } while (((long *)plVar5[7])[lVar2] == 0);
      if ((int)lVar7 == -1) {
code_r0x0060a8f8:
        uVar3 = ___cxa_allocate_exception(0x28);
        func_0x00608e48();
        ___cxa_throw(uVar3,&UNK_009f5db8,&DAT_00608eec);
        goto code_r0x0060d3b0;
      }
    }
  }
  func_0x0060d21c(apuStack_238,plVar5 + 3);
  func_0x0062141c(extraout_x8,apuStack_238,auVar8._8_8_,plVar5 + 9);
code_r0x0060d3b0:
  apuStack_238[0] = &UNK_009f5de0;
  puStack_1c0 = &UNK_009f5d60;
  if (uStack_1a8 <= uStack_1b0) {
    uStack_1b0 = uStack_1a8;
  }
  if (lStack_1a0 != 0) {
    if (uStack_1b0 != 0) {
      do {
        *(undefined8 *)(lStack_1a0 + -8 + uStack_1b0 * 8) = 0;
        uStack_1b0 = uStack_1b0 - 1;
      } while (uStack_1b0 != 0);
    }
    func_0x00611644();
  }
  puStack_1f0 = &UNK_009f5d60;
  if (uStack_1d8 <= uStack_1e0) {
    uStack_1e0 = uStack_1d8;
  }
  if (lStack_1d0 != 0) {
    if (uStack_1e0 != 0) {
      do {
        *(undefined8 *)(lStack_1d0 + -8 + uStack_1e0 * 8) = 0;
        uStack_1e0 = uStack_1e0 - 1;
      } while (uStack_1e0 != 0);
    }
    func_0x00611644();
  }
  puStack_220 = &UNK_009f5d60;
  if (uStack_208 <= uStack_210) {
    uStack_210 = uStack_208;
  }
  if (lStack_200 != 0) {
    if (uStack_210 != 0) {
      do {
        *(undefined8 *)(lStack_200 + -8 + uStack_210 * 8) = 0;
        uStack_210 = uStack_210 - 1;
      } while (uStack_210 != 0);
    }
    func_0x00611644();
  }
  return apuStack_238;
}

