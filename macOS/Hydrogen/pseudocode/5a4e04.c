
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005a4e04(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  ulong *extraout_x8;
  ulong *extraout_x8_00;
  ulong uVar11;
  long *plVar12;
  long *plVar13;
  ulong uVar14;
  long *unaff_x20;
  long *plVar15;
  ulong uVar16;
  undefined8 uVar17;
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  ulong uStack_e0;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  long lStack_c0;
  ulong *puStack_b8;
  undefined8 uStack_b0;
  ulong uStack_a8;
  
  func_0x0059cc30();
  auVar18 = __Unwind_Resume();
  auVar18._8_8_ = auVar18._8_8_;
  plVar15 = auVar18._0_8_;
  uVar16 = (long)auVar18._8_8_ - (long)plVar15;
  if (uVar16 < 0x7ffffffffffffff9) {
    if ((long)auVar18._8_8_ - (long)plVar15 == 0) {
      uVar16 = 0;
      uVar11 = 0;
      uVar10 = 8;
LAB_005a4f1c:
      *extraout_x8 = uVar16;
      extraout_x8[1] = uVar10;
      extraout_x8[2] = uVar11;
      return;
    }
    uVar17 = 8;
    uVar10 = func_0x00187bd0(uVar16,8);
    lVar9 = _UNK_008ae5b8;
    lVar8 = _UNK_008ae5b0;
    lVar7 = _UNK_008ae5a8;
    lVar6 = _UNK_008ae5a0;
    lVar5 = _UNK_008ae598;
    lVar4 = _UNK_008ae590;
    lVar3 = _UNK_008848d8;
    lVar2 = _UNK_008848d0;
    unaff_x20 = auVar18._8_8_;
    if (uVar10 != 0) {
      uVar16 = uVar16 >> 3;
      uVar11 = ((long)auVar18._8_8_ - (long)plVar15) - 8;
      if (uVar11 < 0x38) {
        uVar11 = 0;
        plVar12 = plVar15;
      }
      else {
        uVar1 = (uVar11 >> 3) + 1;
        uVar11 = uVar1 & 0x3ffffffffffffff8;
        plVar12 = plVar15 + uVar11;
        plVar13 = (long *)(uVar10 + 0x20);
        uVar14 = uVar11;
        do {
          plVar13[-3] = (long)plVar15 + lVar3;
          plVar13[-4] = (long)plVar15 + lVar2;
          plVar13[-1] = (long)plVar15 + lVar5;
          plVar13[-2] = (long)plVar15 + lVar4;
          plVar13[1] = (long)plVar15 + lVar7;
          *plVar13 = (long)plVar15 + lVar6;
          plVar13[3] = (long)plVar15 + lVar9;
          plVar13[2] = (long)plVar15 + lVar8;
          plVar15 = plVar15 + 8;
          uVar14 = uVar14 - 8;
          plVar13 = plVar13 + 8;
        } while (uVar14 != 0);
        if (uVar1 == uVar11) goto LAB_005a4f1c;
      }
      do {
        *(long **)(uVar10 + uVar11 * 8) = plVar12;
        plVar12 = plVar12 + 1;
        uVar11 = uVar11 + 1;
      } while (plVar12 != auVar18._8_8_);
      goto LAB_005a4f1c;
    }
  }
  else {
    uVar17 = 0;
  }
  auVar19 = func_0x007a1f00(uVar17,uVar16,param_3);
  plVar15 = auVar19._0_8_;
  uVar17 = 0;
  lVar2 = *plVar15;
  lVar3 = plVar15[1];
  uVar16 = lVar3 - lVar2;
  uVar11 = uVar16 >> 2;
  uVar16 = (uVar11 + (uVar16 >> 1)) * 8;
  auVar18._8_8_ = 0;
  auVar18._0_8_ = uVar11;
  if ((SUB168(auVar18 * ZEXT816(0x18),8) == 0) && (uVar16 < 0x7ffffffffffffff9)) {
    if (uVar16 != 0) {
      uVar17 = 8;
      uVar10 = func_0x00187bd0(uVar16,8);
      unaff_x20 = plVar15;
      if (uVar10 != 0) goto LAB_005a4fec;
      goto LAB_005a4fd4;
    }
  }
  else {
LAB_005a4fd4:
    plVar15 = unaff_x20;
    func_0x007a1f00(uVar17,uVar16,auVar19._8_8_);
  }
  uVar11 = 0;
  uVar10 = 8;
LAB_005a4fec:
  puStack_b8 = &uStack_e0;
  uStack_e0 = 0;
  lStack_c0 = plVar15[3];
  lStack_c8 = plVar15[2];
  uStack_b0 = 0;
  lStack_d8 = lVar2;
  lStack_d0 = lVar3;
  uStack_a8 = uVar10;
  func_0x005d163c(&lStack_d8,&puStack_b8);
  extraout_x8_00[1] = uVar10;
  *extraout_x8_00 = uVar11;
  extraout_x8_00[2] = uStack_e0;
  return;
}

