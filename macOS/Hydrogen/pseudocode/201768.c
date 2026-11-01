
void FUN_00201768(void)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  bool bVar4;
  long *plVar5;
  undefined8 *puVar6;
  ulong uVar7;
  long lVar8;
  long *plVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  ulong uVar16;
  long lVar17;
  undefined1 auVar18 [16];
  long *plStack_80;
  undefined *puStack_78;
  undefined8 uStack_70;
  long **pplStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  long *plStack_48;
  undefined *puStack_40;
  undefined1 *puStack_38;
  undefined *puStack_30;
  long lStack_28;
  
  func_0x00187bd4();
  auVar18 = __Unwind_Resume();
  puVar6 = auVar18._8_8_;
  plVar5 = auVar18._0_8_;
  uVar10 = *plVar5 - 2;
  if (2 < uVar10) {
    uVar10 = 1;
  }
  if (uVar10 == 0) {
                    /* WARNING: Could not recover jumptable at 0x00201828. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(puVar6[1] + 0x18))(*puVar6,&UNK_00826bf4,0x13);
    return;
  }
  if (uVar10 != 1) {
                    /* WARNING: Could not recover jumptable at 0x00201840. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(puVar6[1] + 0x18))(*puVar6,&UNK_00826c2e,0x18);
    return;
  }
  puStack_38 = (undefined1 *)&plStack_80;
  plStack_80 = plVar5 + 7;
  uVar10 = plVar5[5];
  if (uVar10 == 0) {
    lStack_28 = 0;
    goto LAB_00201980;
  }
  lStack_28 = 0;
  lVar2 = plVar5[3];
  uVar3 = plVar5[4];
  uVar12 = plVar5[2];
  uVar7 = 0;
  if (uVar12 <= uVar3) {
    uVar7 = uVar12;
  }
  lVar13 = uVar3 - uVar7;
  uVar11 = uVar12 - lVar13;
  if (uVar10 <= uVar11) {
    uVar12 = lVar13 + uVar10;
  }
  uVar1 = 0;
  if (uVar11 <= uVar10) {
    uVar1 = uVar10 - uVar11;
  }
  if (uVar12 - lVar13 != 0) {
    uVar12 = (uVar12 - lVar13) * 0x18;
    uVar14 = uVar12 / 0x18;
    if (uVar12 < 0x60) {
      lStack_28 = 0;
      uVar16 = 0;
    }
    else {
      lVar13 = 0;
      lVar15 = 0;
      lVar17 = 0;
      lVar8 = 0;
      uVar16 = uVar14 & 0xffffffffffffffc;
      plVar9 = (long *)(uVar3 * 0x18 + uVar7 * -0x18 + lVar2 + 0x40);
      uVar12 = uVar16;
      do {
        lVar13 = plVar9[-6] + lVar13;
        lVar15 = plVar9[-3] + lVar15;
        lVar17 = *plVar9 + lVar17;
        lVar8 = plVar9[3] + lVar8;
        plVar9 = plVar9 + 0xc;
        uVar12 = uVar12 - 4;
      } while (uVar12 != 0);
      lStack_28 = lVar8 + lVar17 + lVar15 + lVar13;
      if (uVar14 == uVar16) goto LAB_002018e4;
    }
    lVar13 = uVar16 - uVar14;
    plVar9 = (long *)(uVar3 * 0x18 + uVar16 * 0x18 + uVar7 * -0x18 + lVar2 + 0x10);
    do {
      lStack_28 = *plVar9 + lStack_28;
      bVar4 = lVar13 != -1;
      lVar13 = lVar13 + 1;
      plVar9 = plVar9 + 3;
    } while (bVar4);
  }
LAB_002018e4:
  if (uVar11 < uVar10) {
    if (uVar1 < 4) {
      uVar12 = 0;
    }
    else {
      lVar13 = 0;
      lVar15 = 0;
      lVar17 = 0;
      uVar12 = uVar1 & 0xfffffffffffffffc;
      plVar9 = (long *)(lVar2 + 0x40);
      uVar7 = uVar12;
      do {
        lStack_28 = plVar9[-6] + lStack_28;
        lVar13 = plVar9[-3] + lVar13;
        lVar15 = *plVar9 + lVar15;
        lVar17 = plVar9[3] + lVar17;
        plVar9 = plVar9 + 0xc;
        uVar7 = uVar7 - 4;
      } while (uVar7 != 0);
      lStack_28 = lVar17 + lVar15 + lVar13 + lStack_28;
      if (uVar1 == uVar12) goto LAB_00201980;
    }
    uVar7 = uVar10;
    if (uVar11 <= uVar10) {
      uVar7 = uVar11;
    }
    lVar13 = (uVar12 + uVar7) - uVar10;
    plVar9 = (long *)(lVar2 + uVar12 * 0x18 + 0x10);
    do {
      lStack_28 = *plVar9 + lStack_28;
      bVar4 = lVar13 != -1;
      lVar13 = lVar13 + 1;
      plVar9 = plVar9 + 3;
    } while (bVar4);
  }
LAB_00201980:
  lStack_28 = lStack_28 - plVar5[6];
  plStack_48 = &lStack_28;
  puStack_40 = &
               __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
  ;
  puStack_30 = &DAT_00241564;
  puStack_78 = &UNK_009c5e68;
  uStack_70 = 3;
  pplStack_68 = &plStack_48;
  uStack_60 = 2;
  uStack_58 = 0;
  func_0x0046849c(*puVar6,puVar6[1],&puStack_78);
  return;
}

