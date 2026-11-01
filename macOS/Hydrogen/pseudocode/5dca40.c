
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_005dca40(long param_1,undefined1 param_2 [16])

{
  char *pcVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  int iVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 extraout_x1;
  ulong uVar9;
  long in_x9;
  long lVar10;
  long in_x10;
  long *in_x11;
  long in_x12;
  ulong uVar11;
  long lVar12;
  undefined8 *unaff_x19;
  long lVar13;
  long unaff_x21;
  long unaff_x22;
  char *unaff_x23;
  long *plVar14;
  long unaff_x24;
  long lVar15;
  long lVar16;
  undefined8 uVar17;
  long unaff_x25;
  long lVar18;
  long lVar19;
  undefined8 *puVar21;
  undefined8 *puVar20;
  char in_wzr;
  long lVar22;
  long lVar23;
  
  lVar4 = _UNK_008ae548;
  lVar3 = _UNK_008ae540;
  lVar2 = _UNK_008ae538;
  lVar19 = _UNK_008ae530;
  lVar23 = *(long *)(in_x12 + 0x528);
  lVar22 = *(long *)(in_x12 + 0x520);
  lVar18 = param_1;
  lVar15 = unaff_x25;
  do {
    in_x11[-3] = lVar15 + param_2._8_8_;
    in_x11[-4] = lVar15 + param_2._0_8_;
    in_x11[-1] = lVar15 + lVar23;
    in_x11[-2] = lVar15 + lVar22;
    in_x11[1] = lVar15 + lVar2;
    *in_x11 = lVar15 + lVar19;
    in_x11[3] = lVar15 + lVar4;
    in_x11[2] = lVar15 + lVar3;
    lVar15 = lVar15 + 0xc0;
    lVar18 = lVar18 + -8;
    in_x11 = in_x11 + 8;
  } while (lVar18 != 0);
  if (in_x10 != param_1) {
    do {
      *(long *)(unaff_x22 + param_1 * 8) = in_x9;
      in_x9 = in_x9 + 0x18;
      param_1 = param_1 + 1;
    } while (in_x9 != unaff_x25 + unaff_x24 * 0x18);
  }
  lVar15 = 0;
  do {
    if ((**(long **)(unaff_x22 + lVar15) == -0x7ffffffffffffffe) &&
       (uVar7 = func_0x005d0800(*(long **)(unaff_x22 + lVar15) + 1), (uVar7 & 1) != 0))
    goto LAB_005dcca8;
    lVar15 = lVar15 + 8;
  } while (param_1 * 8 != lVar15);
  func_0x00187bd4();
  lVar15 = *(long *)(unaff_x21 + 0x28);
  if (lVar15 == 0) {
    return 0;
  }
  lVar16 = *(long *)(unaff_x21 + 0x20);
  lVar13 = lVar15 << 3;
  puVar8 = (undefined8 *)func_0x00187bd0(lVar13,8);
  lVar5 = _UNK_008ae588;
  lVar23 = _UNK_008ae580;
  lVar22 = _UNK_008ae578;
  lVar4 = _UNK_008ae570;
  lVar3 = _UNK_008ae568;
  lVar2 = _UNK_008ae560;
  lVar19 = _UNK_008ae558;
  lVar18 = _UNK_008ae550;
  if (puVar8 == (undefined8 *)0x0) {
    uVar17 = func_0x007a1f00(8,lVar13,&UNK_009f3020);
    if (*unaff_x23 != '\x01') goto LAB_005dcd68;
    *unaff_x23 = in_wzr;
    do {
      func_0x00187bd4();
      __Unwind_Resume(uVar17);
LAB_005dcd68:
      func_0x007b05dc();
    } while( true );
  }
  uVar7 = lVar15 - 1U & 0x3ffffffffffffff;
  if (uVar7 < 7) {
    uVar9 = 0;
    lVar10 = lVar16;
  }
  else {
    uVar7 = uVar7 + 1;
    uVar9 = uVar7 & 0x7fffffffffffff8;
    lVar10 = lVar16 + uVar9 * 0x40;
    plVar14 = puVar8 + 4;
    uVar11 = uVar9;
    lVar12 = lVar16;
    do {
      plVar14[-3] = lVar12 + lVar19;
      plVar14[-4] = lVar12 + lVar18;
      plVar14[-1] = lVar12 + lVar3;
      plVar14[-2] = lVar12 + lVar2;
      plVar14[1] = lVar12 + lVar22;
      *plVar14 = lVar12 + lVar4;
      plVar14[3] = lVar12 + lVar5;
      plVar14[2] = lVar12 + lVar23;
      lVar12 = lVar12 + 0x200;
      uVar11 = uVar11 - 8;
      plVar14 = plVar14 + 8;
    } while (uVar11 != 0);
    if (uVar7 == uVar9) goto LAB_005dcbd4;
  }
  do {
    puVar8[uVar9] = lVar10;
    lVar10 = lVar10 + 0x40;
    uVar9 = uVar9 + 1;
  } while (lVar10 != lVar16 + lVar15 * 0x40);
LAB_005dcbd4:
  puVar20 = puVar8;
  while( true ) {
    puVar21 = puVar20 + 1;
    plVar14 = (long *)*puVar20;
    iVar6 = func_0x005ccb98(plVar14);
    if (iVar6 != 0) break;
    if (*plVar14 == 10) {
      lVar15 = plVar14[4];
      pcVar1 = (char *)(lVar15 + 8);
      if (*pcVar1 == '\0') {
        *pcVar1 = '\x01';
      }
      else {
        func_0x007aff64(pcVar1,extraout_x1,1000000000);
      }
      uVar17 = *unaff_x19;
      if (*(long *)(lVar15 + 0x20) != 0) {
        lVar18 = *(long *)(lVar15 + 0x18);
        lVar19 = *(long *)(lVar15 + 0x20) << 3;
        do {
          func_0x005d5ff8(uVar17,&UNK_008b647b,1,lVar18);
          lVar18 = lVar18 + 8;
          lVar19 = lVar19 + -8;
        } while (lVar19 != 0);
      }
      func_0x005d6394(uVar17,lVar15 + 0x28);
      if (*pcVar1 == '\x01') {
        *pcVar1 = in_wzr;
      }
      else {
        func_0x007b05dc(pcVar1,0);
      }
    }
    puVar20 = puVar21;
    if (puVar21 == puVar8 + uVar9) {
      func_0x00187bd4(puVar8,lVar13,8);
      return 0;
    }
  }
LAB_005dcca8:
  func_0x00187bd4();
  return 1;
}

