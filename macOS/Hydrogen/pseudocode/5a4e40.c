
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005a4e40(long *param_1,long param_2)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  undefined1 auVar4 [16];
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  ulong *extraout_x8;
  ulong uVar13;
  long *plVar14;
  long *plVar15;
  ulong uVar16;
  ulong *unaff_x19;
  long *unaff_x20;
  ulong unaff_x22;
  undefined8 uVar17;
  undefined1 auVar18 [16];
  ulong uStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  ulong *puStack_68;
  undefined8 uStack_60;
  ulong uStack_58;
  
  if (param_2 - (long)param_1 == 0) {
    uVar12 = 0;
    uVar13 = 0;
    uVar11 = 8;
LAB_005a4f1c:
    *unaff_x19 = uVar12;
    unaff_x19[1] = uVar11;
    unaff_x19[2] = uVar13;
    return;
  }
  uVar11 = func_0x00187bd0();
  lVar10 = _UNK_008ae5b8;
  lVar9 = _UNK_008ae5b0;
  lVar8 = _UNK_008ae5a8;
  lVar7 = _UNK_008ae5a0;
  lVar6 = _UNK_008ae598;
  lVar5 = _UNK_008ae590;
  lVar3 = _UNK_008848d8;
  lVar2 = _UNK_008848d0;
  if (uVar11 != 0) {
    uVar12 = unaff_x22 >> 3;
    uVar13 = (param_2 - (long)param_1) - 8;
    if (uVar13 < 0x38) {
      uVar13 = 0;
      plVar14 = param_1;
    }
    else {
      uVar1 = (uVar13 >> 3) + 1;
      uVar13 = uVar1 & 0x3ffffffffffffff8;
      plVar14 = param_1 + uVar13;
      plVar15 = (long *)(uVar11 + 0x20);
      uVar16 = uVar13;
      do {
        plVar15[-3] = (long)param_1 + lVar3;
        plVar15[-4] = (long)param_1 + lVar2;
        plVar15[-1] = (long)param_1 + lVar6;
        plVar15[-2] = (long)param_1 + lVar5;
        plVar15[1] = (long)param_1 + lVar8;
        *plVar15 = (long)param_1 + lVar7;
        plVar15[3] = (long)param_1 + lVar10;
        plVar15[2] = (long)param_1 + lVar9;
        param_1 = param_1 + 8;
        uVar16 = uVar16 - 8;
        plVar15 = plVar15 + 8;
      } while (uVar16 != 0);
      if (uVar1 == uVar13) goto LAB_005a4f1c;
    }
    do {
      *(long **)(uVar11 + uVar13 * 8) = plVar14;
      plVar14 = plVar14 + 1;
      uVar13 = uVar13 + 1;
    } while (plVar14 != unaff_x20);
    goto LAB_005a4f1c;
  }
  auVar18 = func_0x007a1f00(8);
  plVar14 = auVar18._0_8_;
  uVar17 = 0;
  lVar2 = *plVar14;
  lVar3 = plVar14[1];
  uVar13 = lVar3 - lVar2;
  uVar11 = uVar13 >> 2;
  uVar13 = (uVar11 + (uVar13 >> 1)) * 8;
  auVar4._8_8_ = 0;
  auVar4._0_8_ = uVar11;
  if ((SUB168(auVar4 * ZEXT816(0x18),8) == 0) && (uVar13 < 0x7ffffffffffffff9)) {
    if (uVar13 != 0) {
      uVar17 = 8;
      uVar12 = func_0x00187bd0(uVar13,8);
      unaff_x20 = plVar14;
      if (uVar12 != 0) goto LAB_005a4fec;
      goto LAB_005a4fd4;
    }
  }
  else {
LAB_005a4fd4:
    plVar14 = unaff_x20;
    func_0x007a1f00(uVar17,uVar13,auVar18._8_8_);
  }
  uVar11 = 0;
  uVar12 = 8;
LAB_005a4fec:
  puStack_68 = &uStack_90;
  uStack_90 = 0;
  lStack_70 = plVar14[3];
  lStack_78 = plVar14[2];
  uStack_60 = 0;
  lStack_88 = lVar2;
  lStack_80 = lVar3;
  uStack_58 = uVar12;
  func_0x005d163c(&lStack_88,&puStack_68);
  extraout_x8[1] = uVar12;
  *extraout_x8 = uVar11;
  extraout_x8[2] = uStack_90;
  return;
}

