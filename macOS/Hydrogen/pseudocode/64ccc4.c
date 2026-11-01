
undefined1  [16] thunk_FUN_0064cccc(undefined8 param_1,undefined8 param_2,long *param_3)

{
  long lVar1;
  long lVar2;
  uint uVar3;
  undefined4 uVar4;
  uint uVar5;
  undefined8 uVar6;
  long *plVar7;
  long *plVar8;
  long *plVar9;
  long *plVar10;
  long lVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  long *plVar14;
  long lVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  long unaff_x29;
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 uStack0000000000000078;
  undefined *apuStack_118 [2];
  ulong uStack_108;
  ulong uStack_100;
  long lStack_f8;
  undefined *apuStack_e8 [2];
  ulong uStack_d8;
  ulong uStack_d0;
  long lStack_c8;
  undefined *apuStack_b8 [2];
  ulong uStack_a8;
  ulong uStack_a0;
  long lStack_98;
  undefined8 uStack_80;
  ulong uStack_78;
  long lStack_70;
  
  func_0x00087574(&uStack0000000000000078);
  func_0x0003e9ec(unaff_x29 + -0x78);
  uVar6 = __Unwind_Resume();
  func_0x0003e9ec(unaff_x29 + -0x78);
  uVar6 = __Unwind_Resume(uVar6);
  func_0x0003e9ec(unaff_x29 + -0x78);
  auVar19 = __Unwind_Resume(uVar6);
  plVar7 = auVar19._0_8_;
  plVar8 = (long *)(**(code **)(plVar7[1] + 0x30))();
  uVar6 = func_0x005f007c();
  (**(code **)(*plVar8 + 0x28))(plVar8,uVar6,0);
  plVar8 = (long *)(**(code **)(*plVar7 + 0x98))(plVar7);
  plVar14 = plVar7 + 2;
  plVar9 = (long *)(**(code **)(*plVar14 + 0x18))(plVar14);
  plVar9 = (long *)(**(code **)(*plVar9 + 0x10))();
  uVar6 = (**(code **)(*plVar14 + 0x18))(plVar14);
  plVar10 = (long *)(**(code **)(*plVar14 + 0x18))(plVar14);
  plVar10 = (long *)(**(code **)(*plVar10 + 0x10))();
  (**(code **)(*plVar10 + 0xa0))();
  uVar3 = func_0x00602288();
  uVar17 = (ulong)uVar3 + 7 >> 3;
  uStack_80 = 0xffffffffffffffff;
  uStack_78 = uVar17;
  if (uVar3 == 0) {
    lVar11 = 0;
  }
  else {
    lVar11 = func_0x006115d0(uVar17);
  }
  lStack_70 = lVar11;
  plVar10 = (long *)(**(code **)(*plVar7 + 0xa0))(plVar7);
  uVar12 = func_0x005f007c();
  lVar15 = param_3[3];
  lVar1 = param_3[4];
  uVar13 = (**(code **)(*param_3 + 0xa0))(param_3);
  auVar20 = (**(code **)(*plVar7 + 0xa8))(plVar7);
  lVar2 = param_3[0x1d];
  plVar14 = (long *)(**(code **)(*plVar14 + 0x18))(plVar14);
  plVar14 = (long *)(**(code **)(*plVar14 + 0x10))();
  (**(code **)(*plVar14 + 0xa0))();
  uVar4 = func_0x00602288();
  (**(code **)(*plVar10 + 0x38))
            (plVar10,uVar12,lVar1,lVar15,uVar13,auVar20._0_8_,auVar20._8_8_,(char)lVar2 != '\0',
             lVar11,uVar4);
  *(undefined1 *)(param_3 + 0x1d) = 1;
  func_0x005fef78(apuStack_b8,lVar11,uVar17,0,1);
  uVar5 = (**(code **)(*plVar9 + 0xc0))(plVar9,0);
  uVar18 = (ulong)uVar5;
  uVar16 = param_3[0xb];
  lVar15 = param_3[0xc];
  if (uVar16 != uVar18) {
    if (lVar15 != 0) {
      if (uVar16 != 0) {
        do {
          *(undefined1 *)(lVar15 + -1 + uVar16) = 0;
          uVar16 = uVar16 - 1;
        } while (uVar16 != 0);
      }
      func_0x00611644();
    }
    if (uVar5 == 0) {
      lVar15 = 0;
    }
    else {
      lVar15 = func_0x006115d0(uVar18);
    }
  }
  param_3[0xb] = uVar18;
  param_3[0xc] = lVar15;
  param_3[10] = -1;
  func_0x005fef78(apuStack_e8,param_3[0x10],param_3[0xf],0,1);
  (**(code **)(*plVar8 + 0x20))(apuStack_118,plVar8,plVar9,uVar6,apuStack_e8,param_3 + 0x17);
  func_0x00602560(apuStack_118,param_3[0xc],param_3[0xb],0);
  apuStack_118[0] = &UNK_009f5d60;
  if (uStack_100 <= uStack_108) {
    uStack_108 = uStack_100;
  }
  if (lStack_f8 != 0) {
    if (uStack_108 != 0) {
      do {
        *(undefined8 *)(lStack_f8 + -8 + uStack_108 * 8) = 0;
        uStack_108 = uStack_108 - 1;
      } while (uStack_108 != 0);
    }
    func_0x00611644();
  }
  plVar8 = (long *)(**(code **)(*plVar7 + 0xa0))(plVar7);
  uVar6 = (**(code **)(*param_3 + 0xa0))(param_3);
  auVar20 = (**(code **)(*plVar7 + 0xa8))(plVar7);
  auVar19 = (**(code **)(*plVar8 + 0x50))
                      (plVar8,uVar6,auVar20._0_8_,auVar20._8_8_,param_3[0xc],param_3[0xb],
                       param_3[0x10],param_3[0xf],auVar19._8_8_);
  apuStack_e8[0] = &UNK_009f5d60;
  if (uStack_d0 <= uStack_d8) {
    uStack_d8 = uStack_d0;
  }
  if (lStack_c8 != 0) {
    if (uStack_d8 != 0) {
      do {
        *(undefined8 *)(lStack_c8 + -8 + uStack_d8 * 8) = 0;
        uStack_d8 = uStack_d8 - 1;
      } while (uStack_d8 != 0);
    }
    func_0x00611644();
  }
  apuStack_b8[0] = &UNK_009f5d60;
  if (uStack_a0 <= uStack_a8) {
    uStack_a8 = uStack_a0;
  }
  if (lStack_98 != 0) {
    if (uStack_a8 != 0) {
      do {
        *(undefined8 *)(lStack_98 + -8 + uStack_a8 * 8) = 0;
        uStack_a8 = uStack_a8 - 1;
      } while (uStack_a8 != 0);
    }
    func_0x00611644();
  }
  if (lVar11 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined1 *)(lVar11 + -1 + uVar17) = 0;
        uVar17 = uVar17 - 1;
      } while (uVar17 != 0);
    }
    func_0x00611644(lVar11);
  }
  return auVar19;
}

