
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_005ddf84(void)

{
  char *pcVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  code *pcVar8;
  int iVar9;
  long lVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  dword *pdVar13;
  ulong extraout_x1;
  ulong uVar14;
  ulong extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined8 extraout_x1_02;
  ulong uVar15;
  ulong uVar16;
  long lVar17;
  long lVar18;
  long *plVar19;
  undefined8 *puVar20;
  dword *unaff_x20;
  long lVar21;
  long lVar22;
  long lVar23;
  char *unaff_x24;
  long *plVar24;
  long unaff_x25;
  long lVar25;
  undefined8 *puVar26;
  ulong uVar27;
  char in_wzr;
  undefined1 auVar28 [16];
  
  func_0x00187bd4();
  auVar28 = __Unwind_Resume();
  lVar21 = *(long *)(auVar28._0_8_ + 0x28);
  if (lVar21 == 0) {
    return 0;
  }
  lVar22 = *(long *)(auVar28._0_8_ + 0x20);
  lVar10 = lVar21 << 3;
  puVar11 = (undefined8 *)func_0x00187bd0(lVar10,8);
  lVar7 = _UNK_008ae588;
  lVar6 = _UNK_008ae580;
  lVar5 = _UNK_008ae578;
  lVar4 = _UNK_008ae570;
  lVar3 = _UNK_008ae568;
  lVar2 = _UNK_008ae560;
  lVar25 = _UNK_008ae558;
  lVar23 = _UNK_008ae550;
  if (puVar11 != (undefined8 *)0x0) {
    uVar15 = lVar21 - 1U & 0x3ffffffffffffff;
    if (uVar15 < 7) {
      uVar16 = 0;
      lVar17 = lVar22;
    }
    else {
      uVar15 = uVar15 + 1;
      uVar16 = uVar15 & 0x7fffffffffffff8;
      lVar17 = lVar22 + uVar16 * 0x40;
      plVar24 = puVar11 + 4;
      uVar14 = uVar16;
      lVar18 = lVar22;
      do {
        plVar24[-3] = lVar18 + lVar25;
        plVar24[-4] = lVar18 + lVar23;
        plVar24[-1] = lVar18 + lVar3;
        plVar24[-2] = lVar18 + lVar2;
        plVar24[1] = lVar18 + lVar5;
        *plVar24 = lVar18 + lVar4;
        plVar24[3] = lVar18 + lVar7;
        plVar24[2] = lVar18 + lVar6;
        lVar18 = lVar18 + 0x200;
        uVar14 = uVar14 - 8;
        plVar24 = plVar24 + 8;
      } while (uVar14 != 0);
      if (uVar15 == uVar16) goto LAB_005de090;
    }
    do {
      puVar11[uVar16] = lVar17;
      lVar17 = lVar17 + 0x40;
      uVar16 = uVar16 + 1;
    } while (lVar17 != lVar22 + lVar21 * 0x40);
LAB_005de090:
    puVar20 = puVar11;
    do {
      puVar26 = puVar20 + 1;
      plVar24 = (long *)*puVar20;
      uVar15 = func_0x005ccc50(plVar24,auVar28._8_8_);
      if ((uVar15 & 1) != 0) break;
      if (*plVar24 == 10) {
        lVar23 = *auVar28._8_8_;
        lVar21 = plVar24[2];
        uVar27 = plVar24[3];
        uVar14 = uVar27;
        if (*(long *)(lVar23 + 0x18) != 0) {
          uVar14 = uVar27 + 1 >> 1;
        }
        if (*(ulong *)(lVar23 + 0x10) < uVar14) {
          func_0x007ae680(lVar23,uVar14,lVar23 + 0x20,1);
          uVar14 = extraout_x1_00;
        }
        if (uVar27 != 0) {
          puVar20 = (undefined8 *)(lVar21 + 8);
          do {
            lVar21 = *(long *)*puVar20;
            *(long *)*puVar20 = lVar21 + 1;
            if (lVar21 < 0) {
              func_0x007a05dc();
                    /* WARNING: Does not return */
              pcVar8 = (code *)SoftwareBreakpoint(1,0x5de1c0);
              (*pcVar8)();
            }
            func_0x005c5458(lVar23);
            puVar20 = puVar20 + 2;
            uVar27 = uVar27 - 1;
            uVar14 = extraout_x1;
          } while (uVar27 != 0);
        }
        lVar21 = plVar24[4];
        pcVar1 = (char *)(lVar21 + 8);
        if (*pcVar1 == '\0') {
          *pcVar1 = '\x01';
        }
        else {
          func_0x007aff64(pcVar1,uVar14,1000000000);
        }
        func_0x005d6b94(lVar23,lVar21 + 0x28);
        if (*pcVar1 == '\x01') {
          *pcVar1 = in_wzr;
        }
        else {
          func_0x007b05dc(pcVar1,0);
        }
      }
      puVar20 = puVar26;
    } while (puVar26 != puVar11 + uVar16);
    func_0x00187bd4(puVar11,lVar10,8);
    return uVar15;
  }
  uVar12 = func_0x007a1f00(8,lVar10,&UNK_009f30a0);
  if (*unaff_x24 == '\x01') {
    *unaff_x24 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  func_0x00187bd4();
  auVar28 = __Unwind_Resume(uVar12);
  puVar11 = auVar28._8_8_;
  plVar24 = auVar28._0_8_;
  lVar21 = plVar24[0x12];
  if (lVar21 != 0) {
    lVar10 = plVar24[0x11];
    unaff_x20 = (dword *)(lVar21 << 3);
    pdVar13 = (dword *)func_0x00187bd0(unaff_x20,8);
    lVar7 = _UNK_008ae548;
    lVar6 = _UNK_008ae540;
    lVar5 = _UNK_008ae538;
    lVar4 = _UNK_008ae530;
    lVar3 = _UNK_008ae528;
    lVar2 = _UNK_008ae520;
    lVar25 = _UNK_008ae518;
    lVar23 = _UNK_008ae510;
    if (pdVar13 == (dword *)0x0) {
      uVar12 = func_0x007a1f00(8,unaff_x20,&UNK_009f30a0);
      if ((char)*plVar24 != '\x01') goto LAB_005de5b4;
      *(char *)plVar24 = in_wzr;
      do {
        func_0x00187bd4(unaff_x20,0x10,8);
        __Unwind_Resume(uVar12);
LAB_005de5b4:
        func_0x007b05dc(plVar24,0);
      } while( true );
    }
    uVar15 = lVar21 * 0x18 - 0x18;
    if (uVar15 < 0xa8) {
      uVar16 = 0;
      lVar18 = lVar10;
LAB_005de30c:
      do {
        *(long *)(pdVar13 + uVar16 * 2) = lVar18;
        lVar18 = lVar18 + 0x18;
        uVar16 = uVar16 + 1;
      } while (lVar18 != lVar10 + lVar21 * 0x18);
    }
    else {
      uVar15 = uVar15 / 0x18 + 1;
      uVar16 = uVar15 & 0x1ffffffffffffff8;
      lVar18 = lVar10 + uVar16 * 0x18;
      plVar19 = (long *)(pdVar13 + 8);
      uVar14 = uVar16;
      lVar22 = lVar10;
      do {
        plVar19[-3] = lVar22 + lVar25;
        plVar19[-4] = lVar22 + lVar23;
        plVar19[-1] = lVar22 + lVar3;
        plVar19[-2] = lVar22 + lVar2;
        plVar19[1] = lVar22 + lVar5;
        *plVar19 = lVar22 + lVar4;
        plVar19[3] = lVar22 + lVar7;
        plVar19[2] = lVar22 + lVar6;
        lVar22 = lVar22 + 0xc0;
        uVar14 = uVar14 - 8;
        plVar19 = plVar19 + 8;
      } while (uVar14 != 0);
      if (uVar15 != uVar16) goto LAB_005de30c;
    }
    lVar21 = 0;
    unaff_x25 = uVar16 * 8;
    do {
      if ((**(long **)((long)pdVar13 + lVar21) == -0x7ffffffffffffffe) &&
         (uVar15 = func_0x005d0800(*(long **)((long)pdVar13 + lVar21) + 1,puVar11),
         (uVar15 & 1) != 0)) goto LAB_005de454;
      lVar21 = lVar21 + 8;
    } while (unaff_x25 != lVar21);
    func_0x00187bd4(pdVar13,unaff_x20,8);
  }
  pdVar13 = (dword *)func_0x00187bd0(0x10,8);
  if (pdVar13 == (dword *)0x0) {
    func_0x007a1f18(8,0x10);
    uVar12 = extraout_x1_02;
LAB_005de51c:
    func_0x007aff64(plVar24,uVar12,1000000000);
    pdVar13 = unaff_x20;
LAB_005de3e0:
    uVar12 = *puVar11;
    if (*(long *)(unaff_x25 + 0x20) != 0) {
      lVar21 = *(long *)(unaff_x25 + 0x18);
      lVar23 = *(long *)(unaff_x25 + 0x20) << 3;
      do {
        func_0x005d5ff8(uVar12,&UNK_008b647b,1,lVar21);
        lVar21 = lVar21 + 8;
        lVar23 = lVar23 + -8;
      } while (lVar23 != 0);
    }
    func_0x005d6394(uVar12,unaff_x25 + 0x28);
    if ((char)*plVar24 == '\x01') {
      *(char *)plVar24 = in_wzr;
    }
    else {
      func_0x007b05dc(plVar24,0);
    }
  }
  else {
    *(long **)pdVar13 = plVar24;
    *(long **)(pdVar13 + 2) = plVar24 + 8;
    iVar9 = func_0x005ccb98(plVar24,puVar11);
    if (iVar9 != 0) goto LAB_005de44c;
    if (*plVar24 == 10) {
      unaff_x25 = plVar24[4];
      plVar24 = (long *)(unaff_x25 + 8);
      uVar12 = extraout_x1_01;
      unaff_x20 = pdVar13;
      if (*(char *)plVar24 != '\0') goto LAB_005de51c;
      *(char *)plVar24 = '\x01';
      goto LAB_005de3e0;
    }
  }
  plVar24 = *(long **)(pdVar13 + 2);
  auVar28 = func_0x005ccb98(plVar24,puVar11);
  if ((auVar28._0_8_ & 1) == 0) {
    if (*plVar24 == 10) {
      lVar21 = plVar24[4];
      pcVar1 = (char *)(lVar21 + 8);
      if (*pcVar1 == '\0') {
        *pcVar1 = '\x01';
      }
      else {
        func_0x007aff64(pcVar1,auVar28._8_8_,1000000000);
      }
      uVar12 = *puVar11;
      if (*(long *)(lVar21 + 0x20) != 0) {
        lVar23 = *(long *)(lVar21 + 0x18);
        lVar25 = *(long *)(lVar21 + 0x20) << 3;
        do {
          func_0x005d5ff8(uVar12,&UNK_008b647b,1,lVar23);
          lVar23 = lVar23 + 8;
          lVar25 = lVar25 + -8;
        } while (lVar25 != 0);
      }
      func_0x005d6394(uVar12,lVar21 + 0x28);
      if (*pcVar1 == '\x01') {
        *pcVar1 = in_wzr;
      }
      else {
        func_0x007b05dc(pcVar1,0);
      }
    }
    func_0x00187bd4(pdVar13,0x10,8);
    return 0;
  }
LAB_005de44c:
  unaff_x20 = &MACH_HEADER.ncmds;
LAB_005de454:
  func_0x00187bd4(pdVar13,unaff_x20,8);
  return 1;
}

