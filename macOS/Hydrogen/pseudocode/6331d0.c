
void FUN_006331d0(undefined8 param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  undefined8 uVar2;
  long *plVar3;
  long lVar4;
  undefined8 extraout_x8;
  ulong uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long unaff_x29;
  undefined1 auVar9 [16];
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000048;
  undefined1 uStack00000000000000e8;
  undefined *puStack_138;
  undefined *puStack_130;
  ulong uStack_120;
  ulong uStack_118;
  long lStack_110;
  undefined *puStack_100;
  ulong uStack_f0;
  ulong uStack_e8;
  long lStack_e0;
  undefined *apuStack_c8 [2];
  ulong uStack_b8;
  ulong uStack_b0;
  long lStack_a8;
  undefined *apuStack_98 [2];
  ulong uStack_88;
  ulong uStack_80;
  long lStack_78;
  
  func_0x00087574(unaff_x29 + -0x88);
  uVar2 = __Unwind_Resume();
  func_0x006338bc(&uStack0000000000000048);
  func_0x00087574(&uStack0000000000000018);
  func_0x00087574(&uStack00000000000000e8);
  func_0x00087574(unaff_x29 + -0xb8);
  func_0x00087574(unaff_x29 + -0x88);
  auVar9 = __Unwind_Resume(uVar2);
  lVar4 = auVar9._8_8_;
  plVar3 = auVar9._0_8_;
  lVar7 = (param_3 - lVar4 >> 5) * -0x3333333333333333;
  if (lVar7 - 2U == 0) {
                    /* WARNING: Could not recover jumptable at 0x00633338. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*plVar3 + 0x60))(extraout_x8,plVar3,lVar4,lVar4 + 0x70,lVar4 + 0xa0,lVar4 + 0x110);
    return;
  }
  if (lVar7 == 1) {
                    /* WARNING: Could not recover jumptable at 0x006332f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*plVar3 + 0x58))(extraout_x8,plVar3,lVar4,lVar4 + 0x70);
    return;
  }
  func_0x005fdd18(apuStack_98);
  func_0x005fdd18(apuStack_c8);
  if (0xa0 < param_3 - lVar4) {
    uVar5 = lVar7 - 2U >> 1;
    lVar6 = uVar5 + 1;
    lVar8 = lVar4 + uVar5 * 0xa0;
    do {
      func_0x0065c198(lVar4,&puStack_138,lVar7,lVar8);
      lVar8 = lVar8 + -0xa0;
      lVar6 = lVar6 + -1;
    } while (lVar6 != 0);
  }
  func_0x0065c4d4(lVar4,param_3,&puStack_138,lVar7);
  lVar6 = param_3 + -0xa0;
  lVar8 = param_3 + -0x30;
  while (uVar5 = func_0x005ffc7c(lVar4 + 0x70), (uVar5 & 1) == 0) {
    func_0x005ffccc(apuStack_c8,lVar8);
    func_0x00608f38(lVar8,apuStack_98,apuStack_c8,lVar4 + 0x70);
    uVar2 = func_0x00604ce4();
    iVar1 = func_0x00609ec8(apuStack_98,uVar2);
    if (iVar1 == 0) {
      (**(code **)(*plVar3 + 0x48))(plVar3,lVar4,lVar6);
    }
    else {
      (**(code **)(*plVar3 + 0x58))(&puStack_138,plVar3,lVar6,apuStack_98);
      (**(code **)(*plVar3 + 0x48))(plVar3,lVar4,&puStack_138);
      puStack_138 = &UNK_00a09a40;
      puStack_100 = &UNK_009f5d60;
      uVar5 = uStack_f0;
      if (uStack_e8 <= uStack_f0) {
        uVar5 = uStack_e8;
      }
      if (lStack_e0 != 0) {
        if (uVar5 != 0) {
          do {
            *(undefined8 *)(lStack_e0 + -8 + uVar5 * 8) = 0;
            uVar5 = uVar5 - 1;
          } while (uVar5 != 0);
        }
        func_0x00611644();
      }
      puStack_130 = &UNK_009f5d60;
      uVar5 = uStack_120;
      if (uStack_118 <= uStack_120) {
        uVar5 = uStack_118;
      }
      if (lStack_110 != 0) {
        if (uVar5 != 0) {
          do {
            *(undefined8 *)(lStack_110 + -8 + uVar5 * 8) = 0;
            uVar5 = uVar5 - 1;
          } while (uVar5 != 0);
        }
        func_0x00611644();
      }
    }
    func_0x0065c81c(lVar4,param_3,&puStack_138,lVar7);
    func_0x0065c4d4(lVar4,param_3,&puStack_138,lVar7);
  }
  (**(code **)(*plVar3 + 0x58))(extraout_x8,plVar3,lVar6,lVar8);
  apuStack_c8[0] = &UNK_009f5d60;
  if (uStack_b0 <= uStack_b8) {
    uStack_b8 = uStack_b0;
  }
  if (lStack_a8 != 0) {
    if (uStack_b8 != 0) {
      do {
        *(undefined8 *)(lStack_a8 + -8 + uStack_b8 * 8) = 0;
        uStack_b8 = uStack_b8 - 1;
      } while (uStack_b8 != 0);
    }
    func_0x00611644();
  }
  apuStack_98[0] = &UNK_009f5d60;
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
  return;
}

