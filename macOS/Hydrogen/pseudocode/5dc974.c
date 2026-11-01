
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_005dc974(void)

{
  char *pcVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  char cVar9;
  int iVar10;
  undefined8 uVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  undefined8 extraout_x1;
  ulong uVar14;
  ulong uVar15;
  long lVar16;
  long lVar17;
  ulong uVar18;
  long lVar19;
  long lVar20;
  long *plVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  undefined8 *puVar26;
  undefined8 *puVar25;
  char in_wzr;
  undefined1 auVar27 [16];
  long in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 uStack_68;
  
  uVar11 = func_0x007a2668();
  if (in_stack_00000068 != 0) {
    func_0x00187bd4(in_stack_00000070,in_stack_00000068,1);
  }
  auVar27 = __Unwind_Resume(uVar11);
  puVar13 = auVar27._8_8_;
  lVar20 = auVar27._0_8_;
  lVar22 = *(long *)(lVar20 + 0x10);
  if (lVar22 != 0) {
    lVar23 = *(long *)(lVar20 + 8);
    lVar19 = lVar22 << 3;
    puVar12 = (undefined8 *)func_0x00187bd0(lVar19,8);
    lVar8 = _UNK_008ae548;
    lVar7 = _UNK_008ae540;
    lVar6 = _UNK_008ae538;
    lVar5 = _UNK_008ae530;
    lVar4 = _UNK_008ae528;
    lVar3 = _UNK_008ae520;
    lVar2 = _UNK_008ae518;
    lVar24 = _UNK_008ae510;
    if (puVar12 == (undefined8 *)0x0) goto LAB_005dccec;
    uVar14 = lVar22 * 0x18 - 0x18;
    if (uVar14 < 0xa8) {
      uVar15 = 0;
      lVar16 = lVar23;
LAB_005dca8c:
      do {
        puVar12[uVar15] = lVar16;
        lVar16 = lVar16 + 0x18;
        uVar15 = uVar15 + 1;
      } while (lVar16 != lVar23 + lVar22 * 0x18);
    }
    else {
      uVar14 = uVar14 / 0x18 + 1;
      uVar15 = uVar14 & 0x1ffffffffffffff8;
      lVar16 = lVar23 + uVar15 * 0x18;
      plVar21 = puVar12 + 4;
      uVar18 = uVar15;
      lVar17 = lVar23;
      do {
        plVar21[-3] = lVar17 + lVar2;
        plVar21[-4] = lVar17 + lVar24;
        plVar21[-1] = lVar17 + lVar4;
        plVar21[-2] = lVar17 + lVar3;
        plVar21[1] = lVar17 + lVar6;
        *plVar21 = lVar17 + lVar5;
        plVar21[3] = lVar17 + lVar8;
        plVar21[2] = lVar17 + lVar7;
        lVar17 = lVar17 + 0xc0;
        uVar18 = uVar18 - 8;
        plVar21 = plVar21 + 8;
      } while (uVar18 != 0);
      if (uVar14 != uVar15) goto LAB_005dca8c;
    }
    lVar22 = 0;
    do {
      if ((**(long **)((long)puVar12 + lVar22) == -0x7ffffffffffffffe) &&
         (uVar14 = func_0x005d0800(*(long **)((long)puVar12 + lVar22) + 1,puVar13),
         (uVar14 & 1) != 0)) goto LAB_005dcca8;
      lVar22 = lVar22 + 8;
    } while (uVar15 * 8 != lVar22);
    func_0x00187bd4(puVar12,lVar19,8);
  }
  lVar22 = *(long *)(lVar20 + 0x28);
  if (lVar22 == 0) {
    return 0;
  }
  lVar23 = *(long *)(lVar20 + 0x20);
  lVar19 = lVar22 << 3;
  puVar12 = (undefined8 *)func_0x00187bd0(lVar19,8);
  lVar8 = _UNK_008ae588;
  lVar7 = _UNK_008ae580;
  lVar6 = _UNK_008ae578;
  lVar5 = _UNK_008ae570;
  lVar4 = _UNK_008ae568;
  lVar3 = _UNK_008ae560;
  lVar2 = _UNK_008ae558;
  lVar24 = _UNK_008ae550;
  if (puVar12 == (undefined8 *)0x0) {
LAB_005dccec:
    uVar11 = func_0x007a1f00(8,lVar19,&UNK_009f3020);
    cVar9 = in_wzr;
    if (___rust_no_alloc_shim_is_unstable != '\x01') goto LAB_005dcd68;
    do {
      ___rust_no_alloc_shim_is_unstable = cVar9;
      func_0x00187bd4(lVar20,uStack_68,8);
      __Unwind_Resume(uVar11);
LAB_005dcd68:
      func_0x007b05dc(&___rust_no_alloc_shim_is_unstable,0);
      cVar9 = ___rust_no_alloc_shim_is_unstable;
    } while( true );
  }
  uVar14 = lVar22 - 1U & 0x3ffffffffffffff;
  if (uVar14 < 7) {
    uVar15 = 0;
    lVar17 = lVar23;
  }
  else {
    uVar14 = uVar14 + 1;
    uVar15 = uVar14 & 0x7fffffffffffff8;
    lVar17 = lVar23 + uVar15 * 0x40;
    plVar21 = puVar12 + 4;
    uVar18 = uVar15;
    lVar20 = lVar23;
    do {
      plVar21[-3] = lVar20 + lVar2;
      plVar21[-4] = lVar20 + lVar24;
      plVar21[-1] = lVar20 + lVar4;
      plVar21[-2] = lVar20 + lVar3;
      plVar21[1] = lVar20 + lVar6;
      *plVar21 = lVar20 + lVar5;
      plVar21[3] = lVar20 + lVar8;
      plVar21[2] = lVar20 + lVar7;
      lVar20 = lVar20 + 0x200;
      uVar18 = uVar18 - 8;
      plVar21 = plVar21 + 8;
    } while (uVar18 != 0);
    if (uVar14 == uVar15) goto LAB_005dcbd4;
  }
  do {
    puVar12[uVar15] = lVar17;
    lVar17 = lVar17 + 0x40;
    uVar15 = uVar15 + 1;
  } while (lVar17 != lVar23 + lVar22 * 0x40);
LAB_005dcbd4:
  puVar25 = puVar12;
  while( true ) {
    puVar26 = puVar25 + 1;
    plVar21 = (long *)*puVar25;
    iVar10 = func_0x005ccb98(plVar21,puVar13);
    if (iVar10 != 0) break;
    if (*plVar21 == 10) {
      lVar20 = plVar21[4];
      pcVar1 = (char *)(lVar20 + 8);
      if (*pcVar1 == '\0') {
        *pcVar1 = '\x01';
      }
      else {
        func_0x007aff64(pcVar1,extraout_x1,1000000000);
      }
      uVar11 = *puVar13;
      if (*(long *)(lVar20 + 0x20) != 0) {
        lVar22 = *(long *)(lVar20 + 0x18);
        lVar24 = *(long *)(lVar20 + 0x20) << 3;
        do {
          func_0x005d5ff8(uVar11,&UNK_008b647b,1,lVar22);
          lVar22 = lVar22 + 8;
          lVar24 = lVar24 + -8;
        } while (lVar24 != 0);
      }
      func_0x005d6394(uVar11,lVar20 + 0x28);
      if (*pcVar1 == '\x01') {
        *pcVar1 = in_wzr;
      }
      else {
        func_0x007b05dc(pcVar1,0);
      }
    }
    puVar25 = puVar26;
    if (puVar26 == puVar12 + uVar15) {
      func_0x00187bd4(puVar12,lVar19,8);
      return 0;
    }
  }
LAB_005dcca8:
  func_0x00187bd4(puVar12,lVar19,8);
  return 1;
}

