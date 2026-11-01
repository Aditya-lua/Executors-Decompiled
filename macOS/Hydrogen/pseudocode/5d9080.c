
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_005d9080(void)

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
  undefined8 uVar10;
  long lVar11;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  long *plVar17;
  ulong uVar18;
  long lVar19;
  long lVar20;
  undefined8 *puVar21;
  ulong *puVar22;
  long lVar23;
  long lVar24;
  char in_wzr;
  undefined1 auVar25 [16];
  
  func_0x00187bd4();
  uVar10 = __Unwind_Resume();
  func_0x00187bd4();
  auVar25 = __Unwind_Resume(uVar10);
  auVar25._8_8_ = auVar25._8_8_;
  lVar14 = auVar25._0_8_;
  lVar23 = *(long *)(lVar14 + 0x10);
  if (lVar23 != 0) {
    lVar24 = *(long *)(lVar14 + 8);
    lVar19 = lVar23 << 3;
    lVar11 = func_0x00187bd0(lVar19,8);
    lVar20 = _UNK_008ae548;
    lVar8 = _UNK_008ae540;
    lVar7 = _UNK_008ae538;
    lVar6 = _UNK_008ae530;
    lVar5 = _UNK_008ae528;
    lVar4 = _UNK_008ae520;
    lVar3 = _UNK_008ae518;
    lVar2 = _UNK_008ae510;
    if (lVar11 == 0) goto code_r0x005d94d8;
    uVar12 = lVar23 * 0x18 - 0x18;
    if (uVar12 < 0xa8) {
      uVar13 = 0;
      lVar15 = lVar24;
code_r0x005d91a8:
      do {
        *(long *)(lVar11 + uVar13 * 8) = lVar15;
        lVar15 = lVar15 + 0x18;
        uVar13 = uVar13 + 1;
      } while (lVar15 != lVar24 + lVar23 * 0x18);
    }
    else {
      uVar12 = uVar12 / 0x18 + 1;
      uVar13 = uVar12 & 0x1ffffffffffffff8;
      lVar15 = lVar24 + uVar13 * 0x18;
      plVar17 = (long *)(lVar11 + 0x20);
      uVar18 = uVar13;
      lVar16 = lVar24;
      do {
        plVar17[-3] = lVar16 + lVar3;
        plVar17[-4] = lVar16 + lVar2;
        plVar17[-1] = lVar16 + lVar5;
        plVar17[-2] = lVar16 + lVar4;
        plVar17[1] = lVar16 + lVar7;
        *plVar17 = lVar16 + lVar6;
        plVar17[3] = lVar16 + lVar20;
        plVar17[2] = lVar16 + lVar8;
        lVar16 = lVar16 + 0xc0;
        uVar18 = uVar18 - 8;
        plVar17 = plVar17 + 8;
      } while (uVar18 != 0);
      if (uVar12 != uVar13) goto code_r0x005d91a8;
    }
    lVar23 = 0;
    do {
      if ((**(long **)(lVar11 + lVar23) == -0x7ffffffffffffffe) &&
         (uVar12 = func_0x005d0800(*(long **)(lVar11 + lVar23) + 1,auVar25._8_8_), (uVar12 & 1) != 0
         )) goto code_r0x005d94ac;
      lVar23 = lVar23 + 8;
    } while (uVar13 * 8 != lVar23);
    func_0x00187bd4(lVar11,lVar19,8);
  }
  lVar23 = *(long *)(lVar14 + 0x28);
  if (lVar23 == 0) {
    return 0;
  }
  lVar20 = *(long *)(lVar14 + 0x20);
  lVar19 = lVar23 << 3;
  auVar25 = func_0x00187bd0(lVar19,8);
  lVar8 = _UNK_008ae588;
  lVar7 = _UNK_008ae580;
  lVar6 = _UNK_008ae578;
  lVar5 = _UNK_008ae570;
  lVar4 = _UNK_008ae568;
  lVar3 = _UNK_008ae560;
  lVar2 = _UNK_008ae558;
  lVar14 = _UNK_008ae550;
  lVar11 = auVar25._0_8_;
  if (lVar11 == 0) {
code_r0x005d94d8:
    uVar10 = func_0x007a1f00(8,lVar19,&UNK_009f3020);
    cVar9 = in_wzr;
    if (___rust_no_alloc_shim_is_unstable != '\x01') goto code_r0x005d9554;
    do {
      ___rust_no_alloc_shim_is_unstable = cVar9;
      func_0x00187bd4();
      __Unwind_Resume(uVar10);
code_r0x005d9554:
      func_0x007b05dc(&___rust_no_alloc_shim_is_unstable,0);
      cVar9 = ___rust_no_alloc_shim_is_unstable;
    } while( true );
  }
  uVar12 = lVar23 - 1U & 0x3ffffffffffffff;
  if (uVar12 < 7) {
    uVar13 = 0;
    lVar16 = lVar20;
  }
  else {
    uVar12 = uVar12 + 1;
    uVar13 = uVar12 & 0x7fffffffffffff8;
    lVar16 = lVar20 + uVar13 * 0x40;
    plVar17 = (long *)(lVar11 + 0x20);
    uVar18 = uVar13;
    lVar24 = lVar20;
    do {
      plVar17[-3] = lVar24 + lVar2;
      plVar17[-4] = lVar24 + lVar14;
      plVar17[-1] = lVar24 + lVar4;
      plVar17[-2] = lVar24 + lVar3;
      plVar17[1] = lVar24 + lVar6;
      *plVar17 = lVar24 + lVar5;
      plVar17[3] = lVar24 + lVar8;
      plVar17[2] = lVar24 + lVar7;
      lVar24 = lVar24 + 0x200;
      uVar18 = uVar18 - 8;
      plVar17 = plVar17 + 8;
    } while (uVar18 != 0);
    if (uVar12 == uVar13) goto code_r0x005d92f0;
  }
  do {
    *(long *)(lVar11 + uVar13 * 8) = lVar16;
    lVar16 = lVar16 + 0x40;
    uVar13 = uVar13 + 1;
  } while (lVar16 != lVar20 + lVar23 * 0x40);
code_r0x005d92f0:
  do {
    uVar10 = auVar25._8_8_;
    puVar21 = auVar25._0_8_ + 1;
    puVar22 = (ulong *)*auVar25._0_8_;
    uVar12 = *puVar22;
    if ((long)uVar12 < 6) {
      if ((long)uVar12 < 3) {
        if (uVar12 < 2) goto code_r0x005d93f4;
        lVar14 = 8;
code_r0x005d93b0:
        auVar25 = func_0x005d0a60((long)puVar22 + lVar14,auVar25._8_8_);
code_r0x005d93ec:
        uVar10 = auVar25._8_8_;
        if ((auVar25._0_8_ & 1) != 0) {
code_r0x005d94ac:
          func_0x00187bd4(lVar11,lVar19,8);
          return 1;
        }
        uVar12 = *puVar22;
        goto code_r0x005d93f4;
      }
      if (uVar12 == 3) {
code_r0x005d93c4:
        auVar25 = func_0x005d010c(puVar22 + 1,auVar25._8_8_);
        goto code_r0x005d93ec;
      }
      if (uVar12 != 4) {
        auVar25 = func_0x005cc4b0(puVar22 + 1,auVar25._8_8_);
        goto code_r0x005d93ec;
      }
    }
    else {
      if ((long)uVar12 < 9) {
        if (uVar12 != 6) {
          if (uVar12 == 7) {
            auVar25 = func_0x005d0800(puVar22 + 1,auVar25._8_8_);
          }
          else {
            auVar25 = func_0x005cc374(puVar22 + 1,auVar25._8_8_);
          }
          goto code_r0x005d93ec;
        }
      }
      else {
        if (uVar12 == 9) {
          auVar25 = func_0x005c2d98(puVar22 + 1,auVar25._8_8_);
          goto code_r0x005d93ec;
        }
        if (uVar12 != 10) {
          uVar12 = puVar22[1] ^ 0x8000000000000000;
          if (1 < uVar12) {
            uVar12 = 2;
          }
          if (uVar12 == 0) goto code_r0x005d9304;
          if (uVar12 != 2) {
            lVar14 = 0x10;
            goto code_r0x005d93b0;
          }
          goto code_r0x005d93c4;
        }
      }
code_r0x005d93f4:
      if (uVar12 == 10) {
        uVar12 = puVar22[4];
        pcVar1 = (char *)(uVar12 + 8);
        if (*pcVar1 == '\0') {
          *pcVar1 = '\x01';
        }
        else {
          func_0x007aff64(pcVar1,uVar10,1000000000);
        }
        uVar10 = *auVar25._8_8_;
        if (*(long *)(uVar12 + 0x20) != 0) {
          lVar14 = *(long *)(uVar12 + 0x18);
          lVar23 = *(long *)(uVar12 + 0x20) << 3;
          do {
            func_0x005d5ff8(uVar10,&UNK_008b62ce,1,lVar14);
            lVar14 = lVar14 + 8;
            lVar23 = lVar23 + -8;
          } while (lVar23 != 0);
        }
        func_0x005d6394(uVar10,uVar12 + 0x28);
        if (*pcVar1 == '\x01') {
          *pcVar1 = in_wzr;
          uVar10 = extraout_x1;
        }
        else {
          func_0x007b05dc(pcVar1,0);
          uVar10 = extraout_x1_00;
        }
      }
    }
code_r0x005d9304:
    auVar25._8_8_ = uVar10;
    auVar25._0_8_ = puVar21;
    if (puVar21 == (undefined8 *)(lVar11 + uVar13 * 8)) {
      func_0x00187bd4(lVar11,lVar19,8);
      return 0;
    }
  } while( true );
}

