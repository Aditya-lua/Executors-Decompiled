
/* WARNING: Removing unreachable block (ram,0x0020170c) */

undefined8 FUN_00201660(void)

{
  ulong uVar1;
  ulong uVar2;
  bool bVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  long lVar7;
  long *plVar8;
  ulong uVar9;
  long *plVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  long lVar18;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x24;
  undefined1 auVar19 [16];
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
  
  lVar4 = func_0x00187bd0();
  if (lVar4 != 0) {
    _memcpy(lVar4);
    if (unaff_x19 != 0) {
      uVar9 = *(ulong *)(unaff_x20 + 0x10);
      uVar11 = *(ulong *)(unaff_x20 + 0x28);
      if (uVar11 == uVar9) {
        func_0x00242e68((ulong *)(unaff_x20 + 0x10),&UNK_009c2c40);
        uVar11 = *(ulong *)(unaff_x20 + 0x28);
        uVar9 = *(ulong *)(unaff_x20 + 0x10);
      }
      uVar11 = *(long *)(unaff_x20 + 0x20) + uVar11;
      uVar13 = 0;
      if (uVar9 <= uVar11) {
        uVar13 = uVar9;
      }
      plVar10 = (long *)(*(long *)(unaff_x20 + 0x18) + (uVar11 - uVar13) * 0x18);
      *plVar10 = unaff_x19;
      plVar10[1] = lVar4;
      plVar10[2] = unaff_x19;
      *(long *)(unaff_x20 + 0x28) = *(long *)(unaff_x20 + 0x28) + 1;
      unaff_x24 = *(long *)(unaff_x20 + 0x38);
    }
    *(long *)(unaff_x20 + 0x38) = unaff_x24 - unaff_x19;
    return 1;
  }
  uVar5 = func_0x007a1f00(1);
  if (unaff_x22 != 0) {
    func_0x00187bd4();
  }
  auVar19 = __Unwind_Resume(uVar5);
  puVar6 = auVar19._8_8_;
  plVar10 = auVar19._0_8_;
  uVar11 = *plVar10 - 2;
  if (2 < uVar11) {
    uVar11 = 1;
  }
  if (uVar11 == 0) {
                    /* WARNING: Could not recover jumptable at 0x00201828. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar5 = (**(code **)(puVar6[1] + 0x18))(*puVar6,&UNK_00826bf4,0x13);
    return uVar5;
  }
  if (uVar11 != 1) {
                    /* WARNING: Could not recover jumptable at 0x00201840. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar5 = (**(code **)(puVar6[1] + 0x18))(*puVar6,&UNK_00826c2e,0x18);
    return uVar5;
  }
  puStack_38 = (undefined1 *)&plStack_80;
  plStack_80 = plVar10 + 7;
  uVar11 = plVar10[5];
  if (uVar11 == 0) {
    lStack_28 = 0;
    goto LAB_00201980;
  }
  lStack_28 = 0;
  lVar4 = plVar10[3];
  uVar2 = plVar10[4];
  uVar13 = plVar10[2];
  uVar9 = 0;
  if (uVar13 <= uVar2) {
    uVar9 = uVar13;
  }
  lVar14 = uVar2 - uVar9;
  uVar12 = uVar13 - lVar14;
  if (uVar11 <= uVar12) {
    uVar13 = lVar14 + uVar11;
  }
  uVar1 = 0;
  if (uVar12 <= uVar11) {
    uVar1 = uVar11 - uVar12;
  }
  if (uVar13 - lVar14 != 0) {
    uVar13 = (uVar13 - lVar14) * 0x18;
    uVar15 = uVar13 / 0x18;
    if (uVar13 < 0x60) {
      lStack_28 = 0;
      uVar17 = 0;
    }
    else {
      lVar14 = 0;
      lVar16 = 0;
      lVar18 = 0;
      lVar7 = 0;
      uVar17 = uVar15 & 0xffffffffffffffc;
      plVar8 = (long *)(uVar2 * 0x18 + uVar9 * -0x18 + lVar4 + 0x40);
      uVar13 = uVar17;
      do {
        lVar14 = plVar8[-6] + lVar14;
        lVar16 = plVar8[-3] + lVar16;
        lVar18 = *plVar8 + lVar18;
        lVar7 = plVar8[3] + lVar7;
        plVar8 = plVar8 + 0xc;
        uVar13 = uVar13 - 4;
      } while (uVar13 != 0);
      lStack_28 = lVar7 + lVar18 + lVar16 + lVar14;
      if (uVar15 == uVar17) goto LAB_002018e4;
    }
    lVar14 = uVar17 - uVar15;
    plVar8 = (long *)(uVar2 * 0x18 + uVar17 * 0x18 + uVar9 * -0x18 + lVar4 + 0x10);
    do {
      lStack_28 = *plVar8 + lStack_28;
      bVar3 = lVar14 != -1;
      lVar14 = lVar14 + 1;
      plVar8 = plVar8 + 3;
    } while (bVar3);
  }
LAB_002018e4:
  if (uVar12 < uVar11) {
    if (uVar1 < 4) {
      uVar13 = 0;
    }
    else {
      lVar14 = 0;
      lVar16 = 0;
      lVar18 = 0;
      uVar13 = uVar1 & 0xfffffffffffffffc;
      plVar8 = (long *)(lVar4 + 0x40);
      uVar9 = uVar13;
      do {
        lStack_28 = plVar8[-6] + lStack_28;
        lVar14 = plVar8[-3] + lVar14;
        lVar16 = *plVar8 + lVar16;
        lVar18 = plVar8[3] + lVar18;
        plVar8 = plVar8 + 0xc;
        uVar9 = uVar9 - 4;
      } while (uVar9 != 0);
      lStack_28 = lVar18 + lVar16 + lVar14 + lStack_28;
      if (uVar1 == uVar13) goto LAB_00201980;
    }
    uVar9 = uVar11;
    if (uVar12 <= uVar11) {
      uVar9 = uVar12;
    }
    lVar14 = (uVar13 + uVar9) - uVar11;
    plVar8 = (long *)(lVar4 + uVar13 * 0x18 + 0x10);
    do {
      lStack_28 = *plVar8 + lStack_28;
      bVar3 = lVar14 != -1;
      lVar14 = lVar14 + 1;
      plVar8 = plVar8 + 3;
    } while (bVar3);
  }
LAB_00201980:
  lStack_28 = lStack_28 - plVar10[6];
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
  uVar5 = func_0x0046849c(*puVar6,puVar6[1],&puStack_78);
  return uVar5;
}

