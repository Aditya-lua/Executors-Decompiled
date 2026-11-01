
undefined8 FUN_00545128(undefined8 param_1)

{
  ulong *puVar1;
  undefined8 *puVar2;
  long lVar3;
  uint uVar4;
  char cVar5;
  ulong uVar6;
  char cVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  code *pcVar21;
  bool bVar22;
  long lVar23;
  uint uVar24;
  int iVar25;
  undefined8 uVar26;
  long lVar27;
  undefined8 *puVar28;
  undefined *puVar29;
  long lVar30;
  long *plVar31;
  long *plVar32;
  long lVar33;
  byte bVar34;
  undefined8 uVar35;
  ulong uVar36;
  ulong uVar37;
  ulong uVar38;
  ulong uVar39;
  ulong uVar40;
  long *plVar41;
  ulong *puVar42;
  int iVar43;
  long *plVar44;
  long **pplVar45;
  ulong uVar46;
  long lVar47;
  long *plVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  undefined1 auVar56 [16];
  undefined1 auVar57 [16];
  undefined1 auVar58 [16];
  undefined1 uStack0000000000000080;
  ulong *puStack_1a0;
  long *plStack_198;
  long *plStack_190;
  long lStack_188;
  ulong uStack_180;
  ulong uStack_178;
  long *plStack_170;
  undefined8 uStack_168;
  ulong uStack_160;
  ulong uStack_158;
  ulong uStack_150;
  ulong uStack_148;
  undefined1 auStack_140 [16];
  long *plStack_130;
  undefined8 uStack_128;
  long *plStack_120;
  ulong uStack_118;
  long *plStack_110;
  undefined8 uStack_108;
  long *plStack_100;
  ulong uStack_f8;
  long *plStack_f0;
  ulong uStack_e8;
  undefined1 auStack_e0 [16];
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  long *plStack_c0;
  long *plStack_b8;
  long *plStack_b0;
  long *plStack_a8;
  long *plStack_a0;
  ulong uStack_98;
  long *plStack_90;
  undefined1 auStack_80 [32];
  
  _memcpy();
  uVar26 = __Unwind_Resume(param_1);
  func_0x0053d360(&uStack0000000000000080);
  __Unwind_Resume(uVar26);
  uVar35 = 8;
  func_0x00187bd4();
  lVar27 = __Unwind_Resume(uVar26);
  puVar28 = (undefined8 *)func_0x00544148();
  uVar38 = *(ulong *)*puVar28;
  *(ulong *)*puVar28 = uVar38 + 1;
  if (0xfffffffffffffffe < uVar38) goto code_r0x00546fd0;
  puStack_1a0 = (ulong *)*puVar28;
  puVar28 = (undefined8 *)func_0x00544148(lVar27,uVar35);
  puVar42 = puStack_1a0;
  uVar38 = *(ulong *)*puVar28;
  *(ulong *)*puVar28 = uVar38 + 1;
  if (0xfffffffffffffffe < uVar38) goto code_r0x00546fd0;
  plVar41 = (long *)*puVar28;
  plStack_198 = plVar41;
  if (0x7ffffffffffffffe < puStack_1a0[2]) {
    puVar29 = &UNK_009eca28;
    goto code_r0x00546f48;
  }
  puStack_1a0[2] = puStack_1a0[2] + 1;
  if (0x7ffffffffffffffe < (ulong)plVar41[2]) {
    func_0x007a2378(&UNK_009eca10);
    goto code_r0x00546fd0;
  }
  plVar41[2] = plVar41[2] + 1;
  uVar38 = func_0x00584344(puStack_1a0 + 3,plVar41 + 3);
  plVar48 = plStack_198;
  puVar1 = puStack_1a0;
  auVar17._8_8_ = auStack_e0._8_8_;
  auVar17._0_8_ = auStack_e0._0_8_;
  auVar16._8_8_ = auStack_e0._8_8_;
  auVar16._0_8_ = auStack_e0._0_8_;
  auVar15._8_8_ = auStack_140._8_8_;
  auVar15._0_8_ = auStack_140._0_8_;
  auVar14._8_8_ = auStack_140._8_8_;
  auVar14._0_8_ = auStack_140._0_8_;
  auVar56._8_8_ = auStack_80._8_8_;
  auVar56._0_8_ = auStack_80._0_8_;
  auVar58._8_8_ = auStack_80._8_8_;
  auVar58._0_8_ = auStack_80._0_8_;
  plVar41[2] = plVar41[2] + -1;
  puVar42[2] = puVar42[2] - 1;
  if ((uVar38 & 1) != 0) goto code_r0x005454a0;
  if (puStack_1a0[2] < 0x7fffffffffffffff) {
    if (puStack_1a0[5] != 1) {
code_r0x0054556c:
      plStack_a0 = (long *)0x0;
      uStack_98 = 8;
      plStack_90 = (long *)0x0;
      if (puStack_1a0[2] < 0x7fffffffffffffff) {
        puStack_1a0[2] = puStack_1a0[2] + 1;
        if ((ulong)plStack_198[2] < 0x7fffffffffffffff) {
          plStack_198[2] = plStack_198[2] + 1;
          uStack_180 = puStack_1a0[3];
          uStack_118 = 0;
          plStack_f0 = (long *)0x0;
          if (uStack_180 == 0) {
            uStack_178 = 0;
            uStack_150 = 0;
          }
          else {
            uStack_150 = puStack_1a0[5];
            uStack_178 = puStack_1a0[4];
          }
          plStack_190 = (long *)(ulong)(uStack_180 != 0);
          lStack_188 = 0;
          uStack_168 = 0;
          uStack_148 = 0;
          plStack_120 = (long *)plStack_198[3];
          if (plStack_120 != (long *)0x0) {
            plStack_f0 = (long *)plStack_198[5];
            uStack_118 = plStack_198[4];
          }
          plStack_130 = (long *)(ulong)(plStack_120 != (long *)0x0);
          uStack_128 = 0;
          uStack_108 = 0;
          uStack_e8 = 0;
          plStack_170 = plStack_190;
          uStack_160 = uStack_180;
          uStack_158 = uStack_178;
          plStack_110 = plStack_130;
          plStack_100 = plStack_120;
          uStack_f8 = uStack_118;
          auStack_140 = func_0x0058027c(&plStack_190);
          auVar57._8_8_ = auStack_e0._8_8_;
          auVar57._0_8_ = auStack_e0._0_8_;
          uStack_148 = 1;
          if (auStack_140._0_8_ == 0) {
            puVar29 = &UNK_009ecbe8;
          }
          else {
            auStack_80._0_16_ =
                 func_0x0053bf00(lVar27 + 0x160,(*auStack_140._8_8_ + 8) * 0x517cc1b727220a95);
            plVar44 = auStack_80._8_8_;
            plVar41 = auStack_80._0_8_;
            if (plVar41 != (long *)0x0) {
              lVar23 = *plVar41;
              *plVar41 = lVar23 + -1;
              LORelease();
              auStack_80._8_8_ = plVar44;
              if (lVar23 == 1) {
                func_0x005d2ac4(auStack_80);
              }
              auVar8._8_8_ = auStack_80._8_8_;
              auVar8._0_8_ = plVar44;
              auStack_80._0_8_ = plVar44;
              if (plVar44 != (long *)0x0) {
                lVar23 = *plVar44;
                *plVar44 = lVar23 + -1;
                LORelease();
                auStack_80._0_16_ = auVar8;
                if (lVar23 == 1) {
                  func_0x005d2ac4(auStack_80);
                }
              }
            }
            auVar57._8_8_ = auStack_e0._8_8_;
            auVar57._0_8_ = auStack_e0._0_8_;
            if ((int)uStack_e8 != 1) {
              auVar57 = func_0x0058027c(&plStack_130);
              uStack_e8 = 1;
            }
            auStack_e0._8_8_ = auVar57._8_8_;
            auStack_e0._0_8_ = auVar57._0_8_;
            if (auStack_e0._0_8_ != 0) {
              lVar23 = *(long *)auStack_e0._8_8_;
              auStack_e0 = auVar57;
              auVar58 = func_0x0053bf00(lVar27 + 0x160,(lVar23 + 8) * 0x517cc1b727220a95);
              plVar44 = auVar58._8_8_;
              plVar41 = auVar58._0_8_;
              auStack_80._0_16_ = auVar58;
              if (plVar41 != (long *)0x0) {
                lVar23 = *plVar41;
                *plVar41 = lVar23 + -1;
                LORelease();
                auStack_80._8_8_ = plVar44;
                if (lVar23 == 1) {
                  func_0x005d2ac4(auStack_80);
                }
                auVar9._8_8_ = auStack_80._8_8_;
                auVar9._0_8_ = plVar44;
                auStack_80._0_8_ = plVar44;
                if (plVar44 != (long *)0x0) {
                  lVar23 = *plVar44;
                  *plVar44 = lVar23 + -1;
                  LORelease();
                  auStack_80._0_16_ = auVar9;
                  if (lVar23 == 1) {
                    func_0x005d2ac4(auStack_80);
                  }
                }
              }
              iVar43 = 0;
              iVar25 = 0;
              auVar57 = auStack_e0;
code_r0x00545768:
              auStack_e0._0_8_ = auVar57._0_8_;
              if ((uStack_e8 & 1) == 0) {
                auStack_e0 = auVar57;
                auVar57 = func_0x0058027c(&plStack_130);
                uStack_e8 = 1;
                if (auVar57._0_8_ == 0) goto code_r0x005457b0;
code_r0x0054577c:
                if ((uStack_148 & 1) == 0) {
                  auStack_e0 = auVar57;
                  auVar58 = func_0x0058027c(&plStack_190);
                  uStack_148 = 1;
                  uVar38 = uStack_e8;
                  auVar56 = auStack_e0;
                  auVar57 = auStack_e0;
                  auStack_140 = auVar58;
                  if (auVar58._0_8_ != 0) {
code_r0x005457ec:
                    uVar26 = auStack_140._8_8_;
                    if ((uStack_e8 & 1) == 0) {
                      auStack_e0 = auVar57;
                      auVar57 = func_0x0058027c(&plStack_130);
                      uStack_e8 = 1;
                    }
                    auStack_e0._8_8_ = auVar57._8_8_;
                    auStack_e0._0_8_ = auVar57._0_8_;
                    if (auStack_e0._0_8_ == 0) {
                      puVar29 = &UNK_009ecc18;
                      goto code_r0x00546f0c;
                    }
                    uVar35 = *(undefined8 *)auStack_e0._8_8_;
                    auStack_e0 = auVar57;
                    uVar38 = func_0x00543f78(lVar27,*(undefined8 *)uVar26,uVar35);
                    if ((uVar38 & 1) != 0) {
                      uVar26 = uStack_c8;
                      uVar35 = uStack_d0;
                      auVar58 = auStack_140;
                      goto joined_r0x005457c4;
                    }
                    uVar38 = uStack_e8;
                    auVar58 = auStack_140;
                    auVar56 = auStack_e0;
                  }
                }
                else {
                  uVar38 = uStack_e8;
                  auVar58 = auStack_140;
                  auVar56 = auVar57;
                  if (auStack_140._0_8_ != 0) goto code_r0x005457ec;
                }
                uStack_e8 = 0;
                auStack_e0._8_8_ = uStack_c8;
                auStack_e0._0_8_ = uStack_d0;
                auStack_140 = auVar58;
                if ((uVar38 & 1) == 0) {
                  auVar56 = func_0x0058027c(&plStack_130);
                }
                plVar41 = auVar56._8_8_;
                auVar57._8_8_ = auStack_e0._8_8_;
                auVar57._0_8_ = auStack_e0._0_8_;
                if (auVar56._0_8_ == 0) {
                  puVar29 = &UNK_009ecc30;
                  goto code_r0x00546f0c;
                }
                iVar43 = iVar43 + 1;
                cVar7 = '\x01';
              }
              else {
                if (auStack_e0._0_8_ != 0) goto code_r0x0054577c;
code_r0x005457b0:
                uVar26 = uStack_c8;
                uVar35 = uStack_d0;
                auStack_e0 = auVar57;
                auVar58 = auStack_140;
joined_r0x005457c4:
                auStack_140._0_8_ = uVar35;
                auStack_140._8_8_ = uVar26;
                uVar38 = uStack_148 & 1;
                uStack_148 = 0;
                uStack_d0 = auStack_140._0_8_;
                uStack_c8 = auStack_140._8_8_;
                auVar57 = auStack_e0;
                if (uVar38 == 0) {
                  uStack_148 = 0;
                  auVar58 = func_0x0058027c(&plStack_190);
                  auVar57 = auStack_e0;
                }
                plVar41 = auVar58._8_8_;
                if (auVar58._0_8_ == 0) {
                  puVar29 = &UNK_009ecc48;
                  goto code_r0x00546f0c;
                }
                cVar7 = '\0';
                iVar25 = iVar25 + 1;
              }
              if (plStack_90 == (long *)0x0) goto code_r0x00546214;
              auStack_e0 = auVar57;
              if (*(long *)(lVar27 + 0x198) != 0) {
                lVar23 = *(long *)(lVar27 + 0x180);
                uVar38 = *(ulong *)(lVar27 + 0x188);
                lVar47 = *(long *)(lVar27 + 0x1c0);
                uVar40 = *(ulong *)(lVar27 + 0x1c8);
code_r0x005458d0:
                puVar28 = (undefined8 *)((uStack_98 - 0x10) + (long)plStack_90 * 0x10);
                if (puVar28 != (undefined8 *)0x0) {
                  lVar33 = 0;
                  plVar44 = (long *)*puVar28;
                  uVar36 = (*plVar44 + 8) * 0x517cc1b727220a95;
                  bVar34 = (byte)(uVar36 >> 0x39);
                  while( true ) {
                    uVar36 = uVar36 & uVar38;
                    uVar26 = *(undefined8 *)(lVar23 + uVar36);
                    bVar55 = (byte)((ulong)uVar26 >> 8);
                    bVar49 = (byte)((ulong)uVar26 >> 0x10);
                    bVar50 = (byte)((ulong)uVar26 >> 0x18);
                    bVar51 = (byte)((ulong)uVar26 >> 0x20);
                    bVar52 = (byte)((ulong)uVar26 >> 0x28);
                    bVar53 = (byte)((ulong)uVar26 >> 0x30);
                    bVar54 = (byte)((ulong)uVar26 >> 0x38);
                    for (uVar39 = CONCAT17(-(bVar54 == bVar34),
                                           CONCAT16(-(bVar53 == bVar34),
                                                    CONCAT15(-(bVar52 == bVar34),
                                                             CONCAT14(-(bVar51 == bVar34),
                                                                      CONCAT13(-(bVar50 == bVar34),
                                                                               CONCAT12(-(bVar49 ==
                                                                                         bVar34),
                                                  CONCAT11(-(bVar55 == bVar34),
                                                           -((byte)uVar26 == bVar34)))))))) &
                                  0x8080808080808080; uVar39 != 0; uVar39 = uVar39 - 1 & uVar39) {
                      uVar37 = (uVar39 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                               (uVar39 >> 7 & 0xff00ff00ff00ff) << 8;
                      uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar37 & 0xffff0000ffff) << 0x10;
                      uVar37 = uVar36 + ((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3) &
                               uVar38;
                      if (*plVar44 == *(long *)(lVar23 + -0x28 + uVar37 * -0x28)) {
                        lVar33 = 0;
                        lVar30 = lVar23 + uVar37 * -0x28;
                        uVar24 = *(uint *)(lVar30 + -0x18);
                        uVar37 = (*plVar41 + 8) * 0x517cc1b727220a95;
                        bVar34 = (byte)(uVar37 >> 0x39);
                        uVar39 = uVar37 & uVar38;
                        uVar26 = *(undefined8 *)(lVar23 + uVar39);
                        uVar36 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                                          CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                                                   CONCAT15(-((byte)((ulong)uVar26 >> 0x28) ==
                                                             bVar34),CONCAT14(-((byte)((ulong)uVar26
                                                                                      >> 0x20) ==
                                                                               bVar34),CONCAT13(-((
                                                  byte)((ulong)uVar26 >> 0x18) == bVar34),
                                                  CONCAT12(-((byte)((ulong)uVar26 >> 0x10) == bVar34
                                                            ),CONCAT11(-((byte)((ulong)uVar26 >> 8)
                                                                        == bVar34),
                                                                       -((byte)uVar26 == bVar34)))))
                                                  ))) & 0x8080808080808080;
                        goto joined_r0x00545a14;
                      }
                    }
                    bVar55 = NEON_umaxv(CONCAT17(-(bVar54 == 0xff),
                                                 CONCAT16(-(bVar53 == 0xff),
                                                          CONCAT15(-(bVar52 == 0xff),
                                                                   CONCAT14(-(bVar51 == 0xff),
                                                                            CONCAT13(-(bVar50 ==
                                                                                      0xff),CONCAT12
                                                  (-(bVar49 == 0xff),
                                                   CONCAT11(-(bVar55 == 0xff),
                                                            -((byte)uVar26 == 0xff)))))))),1);
                    puVar29 = &UNK_009ecba0;
                    if ((bVar55 & 1) != 0) break;
                    lVar33 = lVar33 + 8;
                    uVar36 = uVar36 + lVar33;
                  }
                  goto code_r0x00546554;
                }
                goto code_r0x00546f04;
              }
              if ((uStack_98 - 0x10) + (long)plStack_90 * 0x10 == 0) {
code_r0x00546f04:
                puVar29 = &UNK_009ecc60;
                goto code_r0x00546f0c;
              }
              puVar29 = &UNK_009ecba0;
code_r0x00546554:
              func_0x007a23d8(&UNK_008aad91,0x16,puVar29);
              goto code_r0x00546fd0;
            }
            puVar29 = &UNK_009ecc00;
          }
code_r0x00546f0c:
          auStack_e0 = auVar57;
          func_0x007a23bc(puVar29);
        }
        else {
          func_0x007a2378(&UNK_009ecca8);
        }
      }
      else {
        func_0x007a2378(&UNK_009eccc0);
      }
      goto code_r0x00546fd0;
    }
    if ((ulong)plStack_198[2] < 0x7fffffffffffffff) {
      if (plStack_198[5] != 1) goto code_r0x0054556c;
      if (puStack_1a0[2] < 0x7fffffffffffffff) {
        puVar42 = puStack_1a0 + 3;
        plStack_120 = (long *)*puVar42;
        puStack_1a0[2] = puStack_1a0[2] + 1;
        if (plStack_120 == (long *)0x0) {
          uStack_118 = 0;
          plStack_f0 = (long *)0x0;
        }
        else {
          plStack_f0 = (long *)puStack_1a0[5];
          uStack_118 = puStack_1a0[4];
        }
        plStack_130 = (long *)(ulong)(plStack_120 != (long *)0x0);
        uStack_128 = 0;
        uStack_108 = 0;
        plStack_110 = plStack_130;
        plStack_100 = plStack_120;
        uStack_f8 = uStack_118;
        auVar58 = func_0x0058027c(&plStack_130);
        puVar28 = auVar58._8_8_;
        if ((auVar58._0_8_ == 0) || (puVar28 == (undefined8 *)0x0)) {
          func_0x007a23bc(&UNK_009eca68);
          goto code_r0x00546fd0;
        }
        lVar23 = *(long *)*puVar28;
        *(long *)*puVar28 = lVar23 + 1;
        if (lVar23 < 0) {
          func_0x007a05dc();
          goto code_r0x00546fd0;
        }
        auStack_80._0_8_ = *puVar28;
        puVar1[2] = puVar1[2] - 1;
        if (0x7ffffffffffffffe < (ulong)plVar48[2]) {
          func_0x007a2378(&UNK_009ecac8);
          goto code_r0x00546fd0;
        }
        plVar48[2] = plVar48[2] + 1;
        plStack_120 = (long *)plVar48[3];
        if (plStack_120 == (long *)0x0) {
          uStack_118 = 0;
          plStack_f0 = (long *)0x0;
        }
        else {
          plStack_f0 = (long *)plVar48[5];
          uStack_118 = plVar48[4];
        }
        plStack_130 = (long *)(ulong)(plStack_120 != (long *)0x0);
        uStack_128 = 0;
        uStack_108 = 0;
        plStack_110 = plStack_130;
        plStack_100 = plStack_120;
        uStack_f8 = uStack_118;
        auVar58 = func_0x0058027c(&plStack_130);
        puVar28 = auVar58._8_8_;
        if ((auVar58._0_8_ == 0) || (puVar28 == (undefined8 *)0x0)) {
          func_0x007a23bc(&UNK_009eca80);
          goto code_r0x00546fd0;
        }
        lVar23 = *(long *)*puVar28;
        *(long *)*puVar28 = lVar23 + 1;
        if (lVar23 < 0) {
          func_0x007a05dc();
          goto code_r0x00546fd0;
        }
        plStack_a0 = (long *)*puVar28;
        plVar48[2] = plVar48[2] + -1;
        uVar38 = func_0x00543f78(lVar27,auStack_80._0_8_);
        uVar26 = auStack_80._0_8_;
        if ((uVar38 & 1) != 0) {
          auStack_80._0_8_ = plStack_a0;
          plStack_a0 = (long *)uVar26;
        }
        iVar25 = func_0x005473b0(lVar27,auStack_80._0_8_,plStack_a0);
        if (iVar25 != 0) {
          lVar23 = *(long *)auStack_80._0_8_;
          *(long *)auStack_80._0_8_ = lVar23 + 1;
          if (lVar23 < 0) {
            func_0x007a05dc();
            goto code_r0x00546fd0;
          }
          puVar28 = (undefined8 *)func_0x00547df0(lVar27,auStack_80._0_8_);
          uVar38 = *(ulong *)*puVar28;
          *(ulong *)*puVar28 = uVar38 + 1;
          if (0xfffffffffffffffe < uVar38) goto code_r0x00546fd0;
          plStack_190 = (long *)*puVar28;
          lVar23 = *plStack_a0;
          *plStack_a0 = lVar23 + 1;
          if (lVar23 < 0) {
            func_0x007a05dc();
            goto code_r0x00546fd0;
          }
          puVar28 = (undefined8 *)func_0x00547df0(lVar27,plStack_a0);
          uVar38 = *(ulong *)*puVar28;
          *(ulong *)*puVar28 = uVar38 + 1;
          if (0xfffffffffffffffe < uVar38) goto code_r0x00546fd0;
          plStack_130 = (long *)*puVar28;
          if (plStack_190 != plStack_130) {
            if (0x7ffffffffffffffe < (ulong)plStack_190[2]) {
              func_0x007a2378(&UNK_009ec450);
              goto code_r0x00546fd0;
            }
            plStack_190[2] = plStack_190[2] + 1;
            uVar38 = plStack_130[2];
            if (0x7ffffffffffffffe < uVar38) {
              func_0x007a2378(&UNK_009ec438);
              goto code_r0x00546fd0;
            }
            plStack_130[2] = uVar38 + 1;
            lVar23 = plStack_190[6];
            if (lVar23 == plStack_130[6]) {
              if (lVar23 == 0) {
code_r0x005466b0:
                plStack_130[2] = uVar38;
                plStack_190[2] = plStack_190[2] + -1;
                goto code_r0x005466c0;
              }
              plVar41 = (long *)plStack_190[3];
              plVar48 = plVar41 + 1;
              lVar47 = *plVar41;
              uVar40 = CONCAT17(-(-1 < lVar47),
                                CONCAT16(-(-1 < (char)((ulong)lVar47 >> 0x30)),
                                         CONCAT15(-(-1 < (char)((ulong)lVar47 >> 0x28)),
                                                  CONCAT14(-(-1 < (char)((ulong)lVar47 >> 0x20)),
                                                           CONCAT13(-(-1 < (char)((ulong)lVar47 >>
                                                                                 0x18)),
                                                                    CONCAT12(-(-1 < (char)((ulong)
                                                  lVar47 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar47 >> 8)),
                                                           -(-1 < (char)lVar47)))))))) &
                       0x8080808080808080;
joined_r0x005465cc:
              while (uVar40 == 0) {
                lVar47 = *plVar48;
                plVar41 = plVar41 + -8;
                plVar48 = plVar48 + 1;
                uVar40 = CONCAT17(-(-1 < lVar47),
                                  CONCAT16(-(-1 < (char)((ulong)lVar47 >> 0x30)),
                                           CONCAT15(-(-1 < (char)((ulong)lVar47 >> 0x28)),
                                                    CONCAT14(-(-1 < (char)((ulong)lVar47 >> 0x20)),
                                                             CONCAT13(-(-1 < (char)((ulong)lVar47 >>
                                                                                   0x18)),
                                                                      CONCAT12(-(-1 < (char)((ulong)
                                                  lVar47 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar47 >> 8)),
                                                           -(-1 < (char)lVar47)))))))) &
                         0x8080808080808080;
              }
              lVar47 = 0;
              uVar36 = (uVar40 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar40 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar36 = (uVar36 & 0xffff0000ffff0000) >> 0x10 | (uVar36 & 0xffff0000ffff) << 0x10;
              uVar40 = uVar40 - 1 & uVar40;
              lVar23 = lVar23 + -1;
              lVar33 = *(long *)((long)plVar41 +
                                (-8 - (LZCOUNT(uVar36 >> 0x20 | uVar36 << 0x20) & 0x78U)));
              uVar36 = (lVar33 + 8) * 0x517cc1b727220a95;
              bVar34 = (byte)(uVar36 >> 0x39);
              while( true ) {
                uVar36 = uVar36 & plStack_130[4];
                uVar26 = *(undefined8 *)(plStack_130[3] + uVar36);
                bVar55 = (byte)((ulong)uVar26 >> 8);
                bVar49 = (byte)((ulong)uVar26 >> 0x10);
                bVar50 = (byte)((ulong)uVar26 >> 0x18);
                bVar51 = (byte)((ulong)uVar26 >> 0x20);
                bVar52 = (byte)((ulong)uVar26 >> 0x28);
                bVar53 = (byte)((ulong)uVar26 >> 0x30);
                bVar54 = (byte)((ulong)uVar26 >> 0x38);
                for (uVar39 = CONCAT17(-(bVar54 == bVar34),
                                       CONCAT16(-(bVar53 == bVar34),
                                                CONCAT15(-(bVar52 == bVar34),
                                                         CONCAT14(-(bVar51 == bVar34),
                                                                  CONCAT13(-(bVar50 == bVar34),
                                                                           CONCAT12(-(bVar49 ==
                                                                                     bVar34),
                                                  CONCAT11(-(bVar55 == bVar34),
                                                           -((byte)uVar26 == bVar34)))))))) &
                              0x8080808080808080; uVar39 != 0; uVar39 = uVar39 - 1 & uVar39) {
                  uVar37 = (uVar39 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                           (uVar39 >> 7 & 0xff00ff00ff00ff) << 8;
                  uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 | (uVar37 & 0xffff0000ffff) << 0x10
                  ;
                  if (lVar33 == *(long *)(plStack_130[3] + -8 +
                                         (uVar36 + ((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20)
                                                   >> 3) & plStack_130[4]) * -8)) {
                    if (lVar23 != 0) goto joined_r0x005465cc;
                    goto code_r0x005466b0;
                  }
                }
                bVar55 = NEON_umaxv(CONCAT17(-(bVar54 == 0xff),
                                             CONCAT16(-(bVar53 == 0xff),
                                                      CONCAT15(-(bVar52 == 0xff),
                                                               CONCAT14(-(bVar51 == 0xff),
                                                                        CONCAT13(-(bVar50 == 0xff),
                                                                                 CONCAT12(-(bVar49 
                                                  == 0xff),CONCAT11(-(bVar55 == 0xff),
                                                                    -((byte)uVar26 == 0xff)))))))),1
                                   );
                if ((bVar55 & 1) != 0) break;
                lVar47 = lVar47 + 8;
                uVar36 = uVar36 + lVar47;
              }
            }
            plStack_130[2] = uVar38;
            plStack_190[2] = plStack_190[2] + -1;
            lVar27 = *plStack_130;
            *plStack_130 = lVar27 + -1;
            if (lVar27 + -1 == 0) {
              func_0x0057e714(&plStack_130);
            }
            lVar27 = *plStack_190;
            *plStack_190 = lVar27 + -1;
            if (lVar27 + -1 == 0) {
              func_0x0057e714(&plStack_190);
            }
            lVar27 = *plStack_a0;
            *plStack_a0 = lVar27 + -1;
            LORelease();
            if (lVar27 == 1) {
              func_0x005d2ac4(&plStack_a0);
            }
            lVar27 = *(long *)auStack_80._0_8_;
            *(long *)auStack_80._0_8_ = lVar27 + -1;
            LORelease();
            if (lVar27 == 1) {
              func_0x005d2ac4(auStack_80);
            }
            goto code_r0x005454a0;
          }
code_r0x005466c0:
          lVar23 = *plStack_130;
          *plStack_130 = lVar23 + -1;
          if (lVar23 + -1 == 0) {
            func_0x0057e714(&plStack_130);
          }
          lVar23 = *plStack_190;
          *plStack_190 = lVar23 + -1;
          if (lVar23 + -1 == 0) {
            func_0x0057e714(&plStack_190);
          }
        }
        plStack_130 = (long *)auStack_80._0_8_;
        lVar23 = *plStack_a0;
        *plStack_a0 = lVar23 + 1;
        if (lVar23 < 0) {
          func_0x007a05dc();
        }
        else {
          plStack_190 = (long *)func_0x0056237c(lVar27 + 0x140,auStack_80._0_8_,plStack_a0);
          if (plStack_190 != (long *)0x0) {
            lVar23 = *plStack_190;
            *plStack_190 = lVar23 + -1;
            LORelease();
            if (lVar23 == 1) {
              func_0x005d2ac4(&plStack_190);
            }
          }
          if (*(long *)(lVar27 + 0x198) == 0) {
code_r0x005468dc:
            func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009eca98);
          }
          else {
            lVar23 = 0;
            lVar47 = *(long *)(lVar27 + 0x180);
            uVar40 = *(ulong *)(lVar27 + 0x188);
            bVar34 = (byte)((ulong)((long)(plStack_a0 + 1) * 0x517cc1b727220a95) >> 0x39);
            uVar36 = (long)(plStack_a0 + 1) * 0x517cc1b727220a95 & uVar40;
            uVar26 = *(undefined8 *)(lVar47 + uVar36);
            uVar38 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                              CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                                       CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                                CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar34),
                                                         CONCAT13(-((byte)((ulong)uVar26 >> 0x18) ==
                                                                   bVar34),CONCAT12(-((byte)((ulong)
                                                  uVar26 >> 0x10) == bVar34),
                                                  CONCAT11(-((byte)((ulong)uVar26 >> 8) == bVar34),
                                                           -((byte)uVar26 == bVar34)))))))) &
                     0x8080808080808080;
            while( true ) {
              while (uVar38 == 0) {
                bVar55 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar26 >> 0x38) == -1),
                                             CONCAT16(-((char)((ulong)uVar26 >> 0x30) == -1),
                                                      CONCAT15(-((char)((ulong)uVar26 >> 0x28) == -1
                                                                ),CONCAT14(-((char)((ulong)uVar26 >>
                                                                                   0x20) == -1),
                                                                           CONCAT13(-((char)((ulong)
                                                  uVar26 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar26 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar26 >> 8) ==
                                                                     -1),-((char)uVar26 == -1)))))))
                                            ),1);
                if ((bVar55 & 1) != 0) goto code_r0x005468dc;
                lVar23 = lVar23 + 8;
                uVar36 = uVar36 + lVar23 & uVar40;
                uVar26 = *(undefined8 *)(lVar47 + uVar36);
                uVar38 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                                  CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                                           CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                                    CONCAT14(-((byte)((ulong)uVar26 >> 0x20) ==
                                                              bVar34),CONCAT13(-((byte)((ulong)
                                                  uVar26 >> 0x18) == bVar34),
                                                  CONCAT12(-((byte)((ulong)uVar26 >> 0x10) == bVar34
                                                            ),CONCAT11(-((byte)((ulong)uVar26 >> 8)
                                                                        == bVar34),
                                                                       -((byte)uVar26 == bVar34)))))
                                                  ))) & 0x8080808080808080;
              }
              uVar39 = (uVar38 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar38 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar39 = (uVar39 & 0xffff0000ffff0000) >> 0x10 | (uVar39 & 0xffff0000ffff) << 0x10;
              uVar39 = uVar36 + ((ulong)LZCOUNT(uVar39 >> 0x20 | uVar39 << 0x20) >> 3) & uVar40;
              if (plStack_a0 == *(long **)(lVar47 + -0x28 + uVar39 * -0x28)) break;
              uVar38 = uVar38 - 1 & uVar38;
            }
            if (puVar1[2] == 0) {
              lVar47 = lVar47 + uVar39 * -0x28;
              plStack_130 = *(long **)(lVar47 + -0x20);
              plStack_120 = *(long **)(lVar47 + -8);
              uStack_128 = *(undefined8 *)(lVar47 + -0x10);
              puVar1[2] = 0xffffffffffffffff;
              lVar23 = *plStack_a0;
              *plStack_a0 = lVar23 + 1;
              if (lVar23 < 0) {
                func_0x007a05dc();
              }
              else {
                plStack_190 = (long *)func_0x00582704(puVar42,&plStack_130,plStack_a0);
                if (plStack_190 != (long *)0x0) {
                  lVar23 = *plStack_190;
                  *plStack_190 = lVar23 + -1;
                  LORelease();
                  if (lVar23 == 1) {
                    func_0x005d2ac4(&plStack_190);
                  }
                }
                puVar1[2] = puVar1[2] + 1;
                uVar38 = *puVar1;
                *puVar1 = uVar38 + 1;
                if (uVar38 != 0xffffffffffffffff) {
                  plStack_130 = (long *)func_0x00562594(lVar27 + 0x120,plStack_a0,puVar1);
                  auVar20._8_8_ = auStack_e0._8_8_;
                  auVar20._0_8_ = auStack_e0._0_8_;
                  auVar19._8_8_ = auStack_140._8_8_;
                  auVar19._0_8_ = auStack_140._0_8_;
                  auVar12._8_8_ = auStack_80._8_8_;
                  auVar12._0_8_ = auStack_80._0_8_;
                  if (plStack_130 != (long *)0x0) {
                    lVar27 = *plStack_130;
                    *plStack_130 = lVar27 + -1;
                    auStack_80._0_16_ = auVar12;
                    auStack_140 = auVar19;
                    auStack_e0 = auVar20;
                    if (lVar27 + -1 == 0) {
                      func_0x0057e6ac(&plStack_130);
                    }
                  }
code_r0x005468c0:
                  uVar26 = 0;
                  lVar27 = *plStack_198 + -1;
                  *plStack_198 = lVar27;
                  goto joined_r0x005454b4;
                }
              }
            }
            else {
              func_0x007a2334(&UNK_009ecab0);
            }
          }
        }
        goto code_r0x00546fd0;
      }
      puVar29 = &UNK_009ecae0;
      auStack_80._0_16_ = auVar58;
      auStack_140 = auVar14;
      auStack_e0 = auVar16;
    }
    else {
      puVar29 = &UNK_009ec9e0;
      auStack_80._0_16_ = auVar56;
      auStack_140 = auVar15;
      auStack_e0 = auVar17;
    }
  }
  else {
    puVar29 = &UNK_009ec9f8;
  }
code_r0x00546f48:
  func_0x007a2378(puVar29);
code_r0x00546fd0:
                    /* WARNING: Does not return */
  pcVar21 = (code *)SoftwareBreakpoint(1,0x546fd4);
  (*pcVar21)();
joined_r0x00545a14:
  if (uVar36 == 0) {
    bVar55 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar26 >> 0x38) == -1),
                                 CONCAT16(-((char)((ulong)uVar26 >> 0x30) == -1),
                                          CONCAT15(-((char)((ulong)uVar26 >> 0x28) == -1),
                                                   CONCAT14(-((char)((ulong)uVar26 >> 0x20) == -1),
                                                            CONCAT13(-((char)((ulong)uVar26 >> 0x18)
                                                                      == -1),CONCAT12(-((char)((
                                                  ulong)uVar26 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar26 >> 8) == -1),
                                                           -((char)uVar26 == -1)))))))),1);
    puVar29 = &UNK_009ecbb8;
    if ((bVar55 & 1) != 0) goto code_r0x00546554;
    lVar33 = lVar33 + 8;
    uVar39 = uVar39 + lVar33 & uVar38;
    uVar26 = *(undefined8 *)(lVar23 + uVar39);
    uVar36 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                      CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                               CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                        CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar34),
                                                 CONCAT13(-((byte)((ulong)uVar26 >> 0x18) == bVar34)
                                                          ,CONCAT12(-((byte)((ulong)uVar26 >> 0x10)
                                                                     == bVar34),
                                                                    CONCAT11(-((byte)((ulong)uVar26
                                                                                     >> 8) == bVar34
                                                                              ),-((byte)uVar26 ==
                                                                                 bVar34)))))))) &
             0x8080808080808080;
    goto joined_r0x00545a14;
  }
  uVar46 = (uVar36 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar36 >> 7 & 0xff00ff00ff00ff) << 8;
  uVar46 = (uVar46 & 0xffff0000ffff0000) >> 0x10 | (uVar46 & 0xffff0000ffff) << 0x10;
  uVar46 = uVar39 + ((ulong)LZCOUNT(uVar46 >> 0x20 | uVar46 << 0x20) >> 3) & uVar38;
  if (*plVar41 != *(long *)(lVar23 + -0x28 + uVar46 * -0x28)) {
    uVar36 = uVar36 - 1 & uVar36;
    goto joined_r0x00545a14;
  }
  lVar33 = lVar23 + uVar46 * -0x28;
  uVar4 = *(uint *)(lVar33 + -0x18);
  if (uVar24 != uVar4) {
    if (*(long *)(lVar27 + 0x1d8) == 0) {
code_r0x0054654c:
      puVar29 = &UNK_009ecbd0;
      goto code_r0x00546554;
    }
    lVar33 = 0;
    bVar34 = (byte)((ulong)uVar4 * 0x517cc1b727220a95 >> 0x39);
    uVar39 = (ulong)uVar4 * 0x517cc1b727220a95 & uVar40;
    uVar26 = *(undefined8 *)(lVar47 + uVar39);
    uVar36 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                      CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                               CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                        CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar34),
                                                 CONCAT13(-((byte)((ulong)uVar26 >> 0x18) == bVar34)
                                                          ,CONCAT12(-((byte)((ulong)uVar26 >> 0x10)
                                                                     == bVar34),
                                                                    CONCAT11(-((byte)((ulong)uVar26
                                                                                     >> 8) == bVar34
                                                                              ),-((byte)uVar26 ==
                                                                                 bVar34)))))))) &
             0x8080808080808080;
    while( true ) {
      while (uVar36 == 0) {
        bVar55 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar26 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar26 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar26 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar26 >> 0x20) ==
                                                                 -1),CONCAT13(-((char)((ulong)uVar26
                                                                                      >> 0x18) == -1
                                                                               ),CONCAT12(-((char)((
                                                  ulong)uVar26 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar26 >> 8) == -1),
                                                           -((char)uVar26 == -1)))))))),1);
        if ((bVar55 & 1) != 0) goto code_r0x0054654c;
        lVar33 = lVar33 + 8;
        uVar39 = uVar39 + lVar33 & uVar40;
        uVar26 = *(undefined8 *)(lVar47 + uVar39);
        uVar36 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                          CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                                   CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                            CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar34),
                                                     CONCAT13(-((byte)((ulong)uVar26 >> 0x18) ==
                                                               bVar34),CONCAT12(-((byte)((ulong)
                                                  uVar26 >> 0x10) == bVar34),
                                                  CONCAT11(-((byte)((ulong)uVar26 >> 8) == bVar34),
                                                           -((byte)uVar26 == bVar34)))))))) &
                 0x8080808080808080;
      }
      uVar46 = (uVar36 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar36 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar46 = (uVar46 & 0xffff0000ffff0000) >> 0x10 | (uVar46 & 0xffff0000ffff) << 0x10;
      uVar46 = uVar39 + ((ulong)LZCOUNT(uVar46 >> 0x20 | uVar46 << 0x20) >> 3) & uVar40;
      if (uVar4 == *(uint *)(lVar47 + -0x28 + uVar46 * -0x28)) break;
      uVar36 = uVar36 - 1 & uVar36;
    }
    lVar33 = lVar47 + uVar46 * -0x28;
    if (*(long *)(lVar33 + -8) != 0) {
      lVar30 = 0;
      lVar3 = *(long *)(lVar33 + -0x20);
      uVar39 = *(ulong *)(lVar33 + -0x18);
      bVar34 = (byte)((ulong)uVar24 * 0x517cc1b727220a95 >> 0x39);
      uVar46 = (ulong)uVar24 * 0x517cc1b727220a95 & uVar39;
      uVar26 = *(undefined8 *)(lVar3 + uVar46);
      uVar36 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                        CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                                 CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                          CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar34),
                                                   CONCAT13(-((byte)((ulong)uVar26 >> 0x18) ==
                                                             bVar34),CONCAT12(-((byte)((ulong)uVar26
                                                                                      >> 0x10) ==
                                                                               bVar34),CONCAT11(-((
                                                  byte)((ulong)uVar26 >> 8) == bVar34),
                                                  -((byte)uVar26 == bVar34)))))))) &
               0x8080808080808080;
      while( true ) {
        for (; uVar36 != 0; uVar36 = uVar36 - 1 & uVar36) {
          uVar6 = (uVar36 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar36 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
          if (uVar24 == *(uint *)(lVar3 + -4 +
                                 (uVar46 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3) &
                                 uVar39) * -4)) goto code_r0x00545c58;
        }
        bVar55 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar26 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar26 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar26 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar26 >> 0x20) ==
                                                                 -1),CONCAT13(-((char)((ulong)uVar26
                                                                                      >> 0x18) == -1
                                                                               ),CONCAT12(-((char)((
                                                  ulong)uVar26 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar26 >> 8) == -1),
                                                           -((char)uVar26 == -1)))))))),1);
        if ((bVar55 & 1) != 0) break;
        lVar30 = lVar30 + 8;
        uVar46 = uVar46 + lVar30 & uVar39;
        uVar26 = *(undefined8 *)(lVar3 + uVar46);
        uVar36 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                          CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                                   CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                            CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar34),
                                                     CONCAT13(-((byte)((ulong)uVar26 >> 0x18) ==
                                                               bVar34),CONCAT12(-((byte)((ulong)
                                                  uVar26 >> 0x10) == bVar34),
                                                  CONCAT11(-((byte)((ulong)uVar26 >> 8) == bVar34),
                                                           -((byte)uVar26 == bVar34)))))))) &
                 0x8080808080808080;
      }
    }
    goto code_r0x00545c34;
  }
  if (*(ulong *)(lVar30 + -0x20) != *(ulong *)(lVar33 + -0x20)) {
    if (*(ulong *)(lVar33 + -0x20) <= *(ulong *)(lVar30 + -0x20)) goto code_r0x00545c34;
    goto code_r0x00545c58;
  }
  uVar36 = *(ulong *)(lVar33 + -0x10);
  if (*(ulong *)(lVar30 + -0x10) == 0) {
    if ((int)uVar36 == 0) goto code_r0x00545c2c;
  }
  else if ((uVar36 & 1) != 0) {
code_r0x00545c2c:
    if (*(ulong *)(lVar33 + -8) <= *(ulong *)(lVar30 + -8)) goto code_r0x00545c34;
    goto code_r0x00545c58;
  }
  if (uVar36 <= *(ulong *)(lVar30 + -0x10)) {
code_r0x00545c34:
    plStack_90 = (long *)((long)plStack_90 + -1);
    uVar24 = (uint)*(byte *)(uStack_98 + (long)plStack_90 * 0x10 + 8);
    iVar43 = iVar43 - uVar24;
    iVar25 = iVar25 - (uVar24 ^ 1);
    if (plStack_90 == (long *)0x0) goto code_r0x00546214;
    goto code_r0x005458d0;
  }
code_r0x00545c58:
  lVar23 = uStack_98 + (long)plStack_90 * 0x10;
  if (lVar23 == 0x10) {
    puVar29 = &UNK_009ecc78;
    goto code_r0x00546f0c;
  }
  cVar5 = *(char *)(lVar23 + -8);
  auVar58 = func_0x0053bf00(lVar27 + 0x160,uVar37,plVar41);
  plVar31 = auVar58._8_8_;
  plVar32 = auVar58._0_8_;
  auStack_80._0_16_ = auVar58;
  if (plVar32 != (long *)0x0) {
    lVar23 = *plVar32;
    *plVar32 = lVar23 + -1;
    LORelease();
    auStack_80._8_8_ = plVar31;
    if (lVar23 == 1) {
      func_0x005d2ac4(auStack_80);
    }
    auVar10._8_8_ = auStack_80._8_8_;
    auVar10._0_8_ = plVar31;
    auStack_80._0_8_ = plVar31;
    if (plVar31 != (long *)0x0) {
      lVar23 = *plVar31;
      *plVar31 = lVar23 + -1;
      LORelease();
      auStack_80._0_16_ = auVar10;
      if (lVar23 == 1) {
        func_0x005d2ac4(auStack_80);
      }
    }
  }
  if (cVar5 != cVar7) goto code_r0x00545d9c;
  auVar57 = auStack_e0;
  if (*(long *)(lVar27 + 0x178) != 0) {
    lVar23 = 0;
    uVar36 = (*plVar44 + 8) * 0x517cc1b727220a95;
    lVar47 = *(long *)(lVar27 + 0x160);
    uVar40 = *(ulong *)(lVar27 + 0x168);
    bVar34 = (byte)(uVar36 >> 0x39);
    uVar36 = uVar36 & uVar40;
    uVar26 = *(undefined8 *)(lVar47 + uVar36);
    uVar38 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                      CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                               CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                        CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar34),
                                                 CONCAT13(-((byte)((ulong)uVar26 >> 0x18) == bVar34)
                                                          ,CONCAT12(-((byte)((ulong)uVar26 >> 0x10)
                                                                     == bVar34),
                                                                    CONCAT11(-((byte)((ulong)uVar26
                                                                                     >> 8) == bVar34
                                                                              ),-((byte)uVar26 ==
                                                                                 bVar34)))))))) &
             0x8080808080808080;
    goto joined_r0x00545d28;
  }
  goto code_r0x00546214;
joined_r0x00545d28:
  if (uVar38 == 0) {
    bVar55 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar26 >> 0x38) == -1),
                                 CONCAT16(-((char)((ulong)uVar26 >> 0x30) == -1),
                                          CONCAT15(-((char)((ulong)uVar26 >> 0x28) == -1),
                                                   CONCAT14(-((char)((ulong)uVar26 >> 0x20) == -1),
                                                            CONCAT13(-((char)((ulong)uVar26 >> 0x18)
                                                                      == -1),CONCAT12(-((char)((
                                                  ulong)uVar26 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar26 >> 8) == -1),
                                                           -((char)uVar26 == -1)))))))),1);
    if ((bVar55 & 1) != 0) goto code_r0x00546214;
    lVar23 = lVar23 + 8;
    uVar36 = uVar36 + lVar23 & uVar40;
    uVar26 = *(undefined8 *)(lVar47 + uVar36);
    uVar38 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                      CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                               CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                        CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar34),
                                                 CONCAT13(-((byte)((ulong)uVar26 >> 0x18) == bVar34)
                                                          ,CONCAT12(-((byte)((ulong)uVar26 >> 0x10)
                                                                     == bVar34),
                                                                    CONCAT11(-((byte)((ulong)uVar26
                                                                                     >> 8) == bVar34
                                                                              ),-((byte)uVar26 ==
                                                                                 bVar34)))))))) &
             0x8080808080808080;
    goto joined_r0x00545d28;
  }
  uVar39 = (uVar38 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar38 >> 7 & 0xff00ff00ff00ff) << 8;
  uVar39 = (uVar39 & 0xffff0000ffff0000) >> 0x10 | (uVar39 & 0xffff0000ffff) << 0x10;
  uVar39 = uVar36 + ((ulong)LZCOUNT(uVar39 >> 0x20 | uVar39 << 0x20) >> 3) & uVar40;
  if (*plVar44 == *(long *)(lVar47 + -0x10 + uVar39 * -0x10)) goto code_r0x00545d90;
  uVar38 = uVar38 - 1 & uVar38;
  goto joined_r0x00545d28;
code_r0x00545d90:
  plVar44 = (long *)(lVar47 + uVar39 * -0x10 + -8);
code_r0x00545d9c:
  lVar23 = *(long *)*plVar44;
  *(long *)*plVar44 = lVar23 + 1;
  if (lVar23 < 0) {
    func_0x007a05dc();
    goto code_r0x00546fd0;
  }
  plStack_c0 = (long *)*plVar44;
  uVar38 = func_0x00547aa0(lVar27,*plVar41);
  if ((uVar38 & 1) != 0) {
    func_0x007a247c(&UNK_008aaeb2,0x34,&UNK_009eccd8);
    goto code_r0x00546fd0;
  }
  pplVar45 = &plStack_c0;
code_r0x00545e40:
  uVar38 = func_0x005473b0(lVar27,*plVar41,*pplVar45);
  plVar44 = plStack_c0;
  if ((uVar38 & 1) == 0) {
    if (*(long *)(lVar27 + 0x158) != 0) {
      lVar23 = 0;
      uVar38 = (long)(*pplVar45 + 1) * 0x517cc1b727220a95;
      lVar47 = *(long *)(lVar27 + 0x140);
      bVar34 = (byte)(uVar38 >> 0x39);
      while( true ) {
        uVar38 = uVar38 & *(ulong *)(lVar27 + 0x148);
        uVar26 = *(undefined8 *)(lVar47 + uVar38);
        bVar55 = (byte)((ulong)uVar26 >> 8);
        bVar49 = (byte)((ulong)uVar26 >> 0x10);
        bVar50 = (byte)((ulong)uVar26 >> 0x18);
        bVar51 = (byte)((ulong)uVar26 >> 0x20);
        bVar52 = (byte)((ulong)uVar26 >> 0x28);
        bVar53 = (byte)((ulong)uVar26 >> 0x30);
        bVar54 = (byte)((ulong)uVar26 >> 0x38);
        for (uVar40 = CONCAT17(-(bVar54 == bVar34),
                               CONCAT16(-(bVar53 == bVar34),
                                        CONCAT15(-(bVar52 == bVar34),
                                                 CONCAT14(-(bVar51 == bVar34),
                                                          CONCAT13(-(bVar50 == bVar34),
                                                                   CONCAT12(-(bVar49 == bVar34),
                                                                            CONCAT11(-(bVar55 ==
                                                                                      bVar34),-((
                                                  byte)uVar26 == bVar34)))))))) & 0x8080808080808080
            ; uVar40 != 0; uVar40 = uVar40 - 1 & uVar40) {
          uVar36 = (uVar40 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar40 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar36 = (uVar36 & 0xffff0000ffff0000) >> 0x10 | (uVar36 & 0xffff0000ffff) << 0x10;
          uVar36 = uVar38 + ((ulong)LZCOUNT(uVar36 >> 0x20 | uVar36 << 0x20) >> 3) &
                   *(ulong *)(lVar27 + 0x148);
          if (*pplVar45 == *(long **)(lVar47 + -0x10 + uVar36 * -0x10)) {
            pplVar45 = (long **)(lVar47 + uVar36 * -0x10 + -8);
            goto code_r0x00545e40;
          }
        }
        bVar55 = NEON_umaxv(CONCAT17(-(bVar54 == 0xff),
                                     CONCAT16(-(bVar53 == 0xff),
                                              CONCAT15(-(bVar52 == 0xff),
                                                       CONCAT14(-(bVar51 == 0xff),
                                                                CONCAT13(-(bVar50 == 0xff),
                                                                         CONCAT12(-(bVar49 == 0xff),
                                                                                  CONCAT11(-(bVar55 
                                                  == 0xff),-((byte)uVar26 == 0xff)))))))),1);
        if ((bVar55 & 1) != 0) break;
        lVar23 = lVar23 + 8;
        uVar38 = uVar38 + lVar23;
      }
    }
    plStack_b8 = (long *)0x0;
    lVar23 = *plStack_c0;
    *plStack_c0 = lVar23 + 1;
    goto joined_r0x00545ea4;
  }
  lVar23 = **pplVar45;
  **pplVar45 = lVar23 + 1;
  if (lVar23 < 0) {
    func_0x007a05dc();
    goto code_r0x00546fd0;
  }
  plStack_b8 = *pplVar45;
  lVar23 = *plStack_c0;
  *plStack_c0 = lVar23 + 1;
joined_r0x00545ea4:
  if (lVar23 < 0) {
    func_0x007a05dc();
    goto code_r0x00546fd0;
  }
  plStack_b0 = plStack_c0;
  plVar32 = (long *)*plVar41;
  lVar23 = *plVar32;
  *plVar32 = lVar23 + 1;
  if (lVar23 < 0) {
    func_0x007a05dc();
    goto code_r0x00546fd0;
  }
  puVar28 = (undefined8 *)func_0x00547df0(lVar27);
  uVar38 = *(ulong *)*puVar28;
  *(ulong *)*puVar28 = uVar38 + 1;
  if (0xfffffffffffffffe < uVar38) goto code_r0x00546fd0;
  plStack_a8 = (long *)*puVar28;
  puVar28 = (undefined8 *)func_0x00547df0(lVar27,plVar44);
  uVar38 = *(ulong *)*puVar28;
  *(ulong *)*puVar28 = uVar38 + 1;
  if (0xfffffffffffffffe < uVar38) goto code_r0x00546fd0;
  auStack_80._0_8_ = *puVar28;
  if (plStack_a8 == (long *)auStack_80._0_8_) {
code_r0x005460b0:
    lVar23 = *(long *)auStack_80._0_8_;
    *(long *)auStack_80._0_8_ = lVar23 + -1;
    if (lVar23 + -1 == 0) {
      func_0x0057e714(auStack_80);
    }
    lVar23 = *plStack_a8;
    *plStack_a8 = lVar23 + -1;
    if (lVar23 + -1 == 0) {
      func_0x0057e714(&plStack_a8);
    }
    if (plStack_b8 != (long *)0x0) {
      plStack_a8 = plStack_b8;
      lVar23 = *plVar32;
      *plVar32 = lVar23 + 1;
      if (lVar23 < 0) {
        func_0x007a05dc();
        goto code_r0x00546fd0;
      }
      auStack_80._0_8_ = func_0x0056237c(lVar27 + 0x160,plVar32,plStack_b8);
      if ((long *)auStack_80._0_8_ != (long *)0x0) {
        lVar23 = *(long *)auStack_80._0_8_;
        *(long *)auStack_80._0_8_ = lVar23 + -1;
        LORelease();
        if (lVar23 == 1) {
          func_0x005d2ac4(auStack_80);
        }
      }
      bVar22 = false;
      goto code_r0x005461ec;
    }
    auStack_80._0_16_ = func_0x0053bf00(lVar27 + 0x160,(*plVar41 + 8) * 0x517cc1b727220a95,plVar41);
    plVar32 = auStack_80._8_8_;
    plVar44 = auStack_80._0_8_;
    if (plVar44 != (long *)0x0) {
      lVar23 = *plVar44;
      *plVar44 = lVar23 + -1;
      LORelease();
      auStack_80._8_8_ = plVar32;
      if (lVar23 == 1) {
        func_0x005d2ac4(auStack_80);
      }
      auVar11._8_8_ = auStack_80._8_8_;
      auVar11._0_8_ = plVar32;
      auStack_80._0_8_ = plVar32;
      if (plVar32 != (long *)0x0) {
        lVar23 = *plVar32;
        *plVar32 = lVar23 + -1;
        LORelease();
        auStack_80._0_16_ = auVar11;
        if (lVar23 == 1) {
          func_0x005d2ac4(auStack_80);
        }
      }
    }
    bVar22 = false;
  }
  else {
    if (0x7ffffffffffffffe < (ulong)plStack_a8[2]) {
      func_0x007a2378(&UNK_009ec450);
      goto code_r0x00546fd0;
    }
    plStack_a8[2] = plStack_a8[2] + 1;
    uVar38 = *(ulong *)(auStack_80._0_8_ + 0x10);
    if (0x7ffffffffffffffe < uVar38) {
      func_0x007a2378(&UNK_009ec438);
      goto code_r0x00546fd0;
    }
    *(ulong *)(auStack_80._0_8_ + 0x10) = uVar38 + 1;
    lVar23 = plStack_a8[6];
    if (lVar23 == *(long *)(auStack_80._0_8_ + 0x30)) {
      if (lVar23 == 0) {
code_r0x005460a0:
        *(ulong *)(auStack_80._0_8_ + 0x10) = uVar38;
        plStack_a8[2] = plStack_a8[2] + -1;
        goto code_r0x005460b0;
      }
      plVar44 = (long *)plStack_a8[3];
      plVar31 = plVar44 + 1;
      lVar47 = *plVar44;
      uVar40 = CONCAT17(-(-1 < lVar47),
                        CONCAT16(-(-1 < (char)((ulong)lVar47 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar47 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar47 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar47 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar47 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar47 >> 8)),-(-1 < (char)lVar47)))))))) &
               0x8080808080808080;
joined_r0x00545fe4:
      while (uVar40 == 0) {
        lVar47 = *plVar31;
        plVar44 = plVar44 + -8;
        plVar31 = plVar31 + 1;
        uVar40 = CONCAT17(-(-1 < lVar47),
                          CONCAT16(-(-1 < (char)((ulong)lVar47 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar47 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar47 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar47 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar47
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar47 >> 8)),-(-1 < (char)lVar47)))))))) &
                 0x8080808080808080;
      }
      lVar47 = 0;
      uVar36 = (uVar40 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar40 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar36 = (uVar36 & 0xffff0000ffff0000) >> 0x10 | (uVar36 & 0xffff0000ffff) << 0x10;
      uVar40 = uVar40 - 1 & uVar40;
      lVar23 = lVar23 + -1;
      lVar33 = *(long *)((long)plVar44 + (-8 - (LZCOUNT(uVar36 >> 0x20 | uVar36 << 0x20) & 0x78U)));
      uVar36 = (lVar33 + 8) * 0x517cc1b727220a95;
      bVar34 = (byte)(uVar36 >> 0x39);
      while( true ) {
        uVar36 = uVar36 & *(ulong *)(auStack_80._0_8_ + 0x20);
        uVar26 = *(undefined8 *)(*(long *)(auStack_80._0_8_ + 0x18) + uVar36);
        bVar55 = (byte)((ulong)uVar26 >> 8);
        bVar49 = (byte)((ulong)uVar26 >> 0x10);
        bVar50 = (byte)((ulong)uVar26 >> 0x18);
        bVar51 = (byte)((ulong)uVar26 >> 0x20);
        bVar52 = (byte)((ulong)uVar26 >> 0x28);
        bVar53 = (byte)((ulong)uVar26 >> 0x30);
        bVar54 = (byte)((ulong)uVar26 >> 0x38);
        for (uVar39 = CONCAT17(-(bVar54 == bVar34),
                               CONCAT16(-(bVar53 == bVar34),
                                        CONCAT15(-(bVar52 == bVar34),
                                                 CONCAT14(-(bVar51 == bVar34),
                                                          CONCAT13(-(bVar50 == bVar34),
                                                                   CONCAT12(-(bVar49 == bVar34),
                                                                            CONCAT11(-(bVar55 ==
                                                                                      bVar34),-((
                                                  byte)uVar26 == bVar34)))))))) & 0x8080808080808080
            ; uVar39 != 0; uVar39 = uVar39 - 1 & uVar39) {
          uVar37 = (uVar39 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar39 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 | (uVar37 & 0xffff0000ffff) << 0x10;
          if (lVar33 == *(long *)(*(long *)(auStack_80._0_8_ + 0x18) + -8 +
                                 (uVar36 + ((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3) &
                                 *(ulong *)(auStack_80._0_8_ + 0x20)) * -8)) {
            if (lVar23 != 0) goto joined_r0x00545fe4;
            goto code_r0x005460a0;
          }
        }
        bVar55 = NEON_umaxv(CONCAT17(-(bVar54 == 0xff),
                                     CONCAT16(-(bVar53 == 0xff),
                                              CONCAT15(-(bVar52 == 0xff),
                                                       CONCAT14(-(bVar51 == 0xff),
                                                                CONCAT13(-(bVar50 == 0xff),
                                                                         CONCAT12(-(bVar49 == 0xff),
                                                                                  CONCAT11(-(bVar55 
                                                  == 0xff),-((byte)uVar26 == 0xff)))))))),1);
        if ((bVar55 & 1) != 0) break;
        lVar47 = lVar47 + 8;
        uVar36 = uVar36 + lVar47;
      }
    }
    *(ulong *)(auStack_80._0_8_ + 0x10) = uVar38;
    plStack_a8[2] = plStack_a8[2] + -1;
    lVar23 = *(long *)auStack_80._0_8_;
    *(long *)auStack_80._0_8_ = lVar23 + -1;
    if (lVar23 + -1 == 0) {
      func_0x0057e714(auStack_80);
    }
    lVar23 = *plStack_a8;
    *plStack_a8 = lVar23 + -1;
    if (lVar23 + -1 == 0) {
      func_0x0057e714(&plStack_a8);
    }
    bVar22 = plStack_b8 != (long *)0x0;
  }
  if (plStack_b8 != (long *)0x0) {
    lVar23 = *plStack_b8;
    *plStack_b8 = lVar23 + -1;
    LORelease();
    if (lVar23 == 1) {
      func_0x005d2ac4(&plStack_b8);
    }
  }
code_r0x005461ec:
  lVar23 = *plStack_c0;
  *plStack_c0 = lVar23 + -1;
  LORelease();
  auVar57 = auStack_e0;
  if (lVar23 == 1) {
    func_0x005d2ac4(&plStack_c0);
    auVar57 = auStack_e0;
  }
  if (bVar22) {
    plVar48[2] = plVar48[2] + -1;
    puVar1[2] = puVar1[2] - 1;
    auStack_e0 = auVar57;
    if (plStack_a0 != (long *)0x0) {
      func_0x00187bd4(uStack_98,(long)plStack_a0 << 4,8);
    }
    goto code_r0x005468c0;
  }
code_r0x00546214:
  plVar44 = plStack_90;
  auStack_e0 = auVar57;
  if (plStack_90 == plStack_a0) {
    func_0x00582dc4(&plStack_a0,&UNK_009ecc90);
  }
  puVar28 = (undefined8 *)(uStack_98 + (long)plVar44 * 0x10);
  *puVar28 = plVar41;
  *(char *)(puVar28 + 1) = cVar7;
  plStack_90 = (long *)((long)plVar44 + 1);
  auVar57 = auStack_e0;
  lVar23 = auStack_140._0_8_;
  if ((int)uStack_148 != 1) {
    auVar58 = func_0x0058027c(&plStack_190);
    uStack_148 = 1;
    auStack_140 = auVar58;
    auVar57 = auStack_e0;
    lVar23 = auVar58._0_8_;
  }
  if ((lVar23 != 0) && (0 < iVar43)) goto code_r0x00545768;
  auStack_e0._0_8_ = auVar57._0_8_;
  lVar23 = auStack_e0._0_8_;
  if ((int)uStack_e8 != 1) {
    auStack_e0 = auVar57;
    auVar57 = func_0x0058027c(&plStack_130);
    uStack_e8 = 1;
    lVar23 = auVar57._0_8_;
  }
  auStack_e0 = auVar57;
  if ((lVar23 != 0) && (auVar57 = auStack_e0, 0 < iVar25)) goto code_r0x00545768;
  if ((uStack_148 & 1) == 0) {
    auVar58 = func_0x0058027c(&plStack_190);
    uStack_148 = 1;
    auStack_140 = auVar58;
  }
  if (auStack_140._0_8_ == 0) goto code_r0x005468fc;
  lVar23 = auStack_e0._0_8_;
  if ((uStack_e8 & 1) == 0) {
    auVar58 = func_0x0058027c(&plStack_130);
    uStack_e8 = 1;
    auStack_e0 = auVar58;
    lVar23 = auVar58._0_8_;
  }
  auVar57 = auStack_e0;
  if (lVar23 == 0) goto code_r0x005468fc;
  goto code_r0x00545768;
code_r0x00546d34:
  if (lVar47 != 0) {
code_r0x00546d40:
    lVar23 = *(long *)*plVar41;
    *(long *)*plVar41 = lVar23 + 1;
    if (lVar23 < 0) {
      func_0x007a05dc();
      goto code_r0x00546fd0;
    }
    plStack_190 = (long *)*plVar41;
    lVar23 = *(long *)*puVar28;
    *(long *)*puVar28 = lVar23 + 1;
    if (lVar23 < 0) {
      func_0x007a05dc();
      goto code_r0x00546fd0;
    }
    plVar41 = (long *)func_0x0056237c(lVar27 + 0x140,plStack_190,*puVar28);
    auVar18._8_8_ = auStack_80._8_8_;
    auVar18._0_8_ = plVar41;
    auStack_80._0_8_ = plVar41;
    if (plVar41 != (long *)0x0) {
      lVar23 = *plVar41;
      *plVar41 = lVar23 + -1;
      LORelease();
      auStack_80._0_16_ = auVar18;
      if (lVar23 == 1) {
        func_0x005d2ac4(auStack_80);
      }
    }
  }
  goto code_r0x00546b54;
code_r0x005468fc:
  plVar48[2] = plVar48[2] + -1;
  puVar1[2] = puVar1[2] - 1;
  if (plStack_a0 != (long *)0x0) {
    func_0x00187bd4(uStack_98,(long)plStack_a0 << 4,8);
  }
  puVar42 = puStack_1a0;
  if (plStack_198[2] != 0) {
    func_0x007a2334(&UNK_009ecd20);
    goto code_r0x00546fd0;
  }
  plStack_198[2] = -1;
  uVar38 = plStack_198[4];
  plVar48 = (long *)plStack_198[3];
  plVar41 = (long *)plStack_198[5];
  plStack_198[5] = 0;
  plStack_198[2] = 0;
  plStack_198[3] = 0;
  plStack_f0 = plVar41;
  if (plVar48 == (long *)0x0) {
    plStack_f0 = (long *)0x0;
  }
  plStack_130 = (long *)(ulong)(plVar48 != (long *)0x0);
  uStack_128 = 0;
  uStack_108 = 0;
  plStack_120 = plVar48;
  uStack_118 = uVar38;
  plStack_110 = plStack_130;
  plStack_100 = plVar48;
  uStack_f8 = uVar38;
  plStack_a0 = plVar48;
  uStack_98 = uVar38;
  plStack_90 = plVar41;
  while( true ) {
    auVar58 = func_0x0058027c(&plStack_130);
    puVar28 = auVar58._8_8_;
    if ((auVar58._0_8_ == 0) || (puVar28 == (undefined8 *)0x0)) break;
    lVar23 = *(long *)*puVar28;
    *(long *)*puVar28 = lVar23 + 1;
    if (lVar23 < 0) {
      func_0x007a05dc();
      goto code_r0x00546fd0;
    }
    uVar26 = *puVar28;
    uVar40 = *puVar42;
    *puVar42 = uVar40 + 1;
    if (0xfffffffffffffffe < uVar40) goto code_r0x00546fd0;
    plStack_190 = (long *)func_0x00562594(lVar27 + 0x120,uVar26,puVar42);
    if ((plStack_190 != (long *)0x0) &&
       (lVar23 = *plStack_190, *plStack_190 = lVar23 + -1, lVar23 + -1 == 0)) {
      func_0x0057e6ac(&plStack_190);
    }
  }
  if (puVar42[2] != 0) {
    func_0x007a2334(&UNK_009ecd08);
    goto code_r0x00546fd0;
  }
  puVar42[2] = 0xffffffffffffffff;
  if (plVar48 == (long *)0x0) {
    plVar41 = (long *)0x0;
  }
  else {
    uStack_128 = 0;
    uStack_108 = 0;
    plStack_120 = plVar48;
    uStack_118 = uVar38;
    plStack_100 = plVar48;
    uStack_f8 = uVar38;
  }
  plStack_130 = (long *)(ulong)(plVar48 != (long *)0x0);
  plStack_110 = plStack_130;
  plStack_f0 = plVar41;
  while( true ) {
    func_0x00582958(&plStack_190,&plStack_130);
    if ((plStack_190 == (long *)0x0) || (plStack_190[uStack_180 * 3 + 2] == 2)) break;
    lStack_188 = plStack_190[uStack_180 * 3 + 2];
    puVar1 = (ulong *)(plStack_190 + uStack_180 * 3 + 3);
    plVar41 = plStack_190 + uStack_180 + 0x22;
    plStack_190 = (long *)plStack_190[uStack_180 * 3 + 1];
    uStack_180 = *puVar1;
    plVar41 = (long *)func_0x00582704(puVar42 + 3,&plStack_190,*plVar41);
    auVar13._8_8_ = auStack_80._8_8_;
    auVar13._0_8_ = plVar41;
    auStack_80._0_8_ = plVar41;
    if (plVar41 != (long *)0x0) {
      lVar23 = *plVar41;
      *plVar41 = lVar23 + -1;
      LORelease();
      auStack_80._0_16_ = auVar13;
      if (lVar23 == 1) {
        func_0x005d2ac4(auStack_80);
      }
    }
  }
  func_0x00582958(&plStack_190,&plStack_130);
  while (plStack_190 != (long *)0x0) {
    lVar23 = *(long *)plStack_190[uStack_180 + 0x22];
    *(long *)plStack_190[uStack_180 + 0x22] = lVar23 + -1;
    LORelease();
    if (lVar23 == 1) {
      func_0x005d2ac4(plStack_190 + uStack_180 + 0x22);
    }
    func_0x00582958(&plStack_190,&plStack_130);
  }
  uVar40 = puVar42[2];
  uVar38 = uVar40 + 1;
  puVar42[2] = uVar38;
  if (0x7ffffffffffffffe < uVar38) {
    puVar29 = &UNK_009eccf0;
    plStack_190 = (long *)0x0;
    goto code_r0x00546f48;
  }
  puVar42[2] = uVar40 + 2;
  plStack_120 = (long *)puVar42[3];
  if (plStack_120 == (long *)0x0) {
    uStack_118 = 0;
    plStack_f0 = (long *)0x0;
  }
  else {
    plStack_f0 = (long *)puVar42[5];
    uStack_118 = puVar42[4];
  }
  plStack_130 = (long *)(ulong)(plStack_120 != (long *)0x0);
  uStack_128 = 0;
  uStack_108 = 0;
  plStack_190 = (long *)0x0;
  plStack_110 = plStack_130;
  plStack_100 = plStack_120;
  uStack_f8 = uStack_118;
code_r0x00546b54:
  auVar58 = func_0x0058027c(&plStack_130);
  plVar41 = auVar58._8_8_;
  if ((auVar58._0_8_ != 0) && (plVar41 != (long *)0x0)) {
    lVar23 = 0;
    if (*(long *)(lVar27 + 0x158) != 0) {
      lVar23 = 0;
      uVar36 = (*plVar41 + 8) * 0x517cc1b727220a95;
      lVar47 = *(long *)(lVar27 + 0x140);
      uVar40 = *(ulong *)(lVar27 + 0x148);
      bVar34 = (byte)(uVar36 >> 0x39);
      uVar36 = uVar36 & uVar40;
      uVar26 = *(undefined8 *)(lVar47 + uVar36);
      uVar38 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                        CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                                 CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                          CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar34),
                                                   CONCAT13(-((byte)((ulong)uVar26 >> 0x18) ==
                                                             bVar34),CONCAT12(-((byte)((ulong)uVar26
                                                                                      >> 0x10) ==
                                                                               bVar34),CONCAT11(-((
                                                  byte)((ulong)uVar26 >> 8) == bVar34),
                                                  -((byte)uVar26 == bVar34)))))))) &
               0x8080808080808080;
      while( true ) {
        while (uVar38 == 0) {
          bVar55 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar26 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar26 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar26 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar26 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar26 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar26 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar26 >> 8) ==
                                                                     -1),-((char)uVar26 == -1)))))))
                                      ),1);
          if ((bVar55 & 1) != 0) {
            lVar47 = 0;
            goto code_r0x00546c2c;
          }
          lVar23 = lVar23 + 8;
          uVar36 = uVar36 + lVar23 & uVar40;
          uVar26 = *(undefined8 *)(lVar47 + uVar36);
          uVar38 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                            CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                                     CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                              CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar34),
                                                       CONCAT13(-((byte)((ulong)uVar26 >> 0x18) ==
                                                                 bVar34),CONCAT12(-((byte)((ulong)
                                                  uVar26 >> 0x10) == bVar34),
                                                  CONCAT11(-((byte)((ulong)uVar26 >> 8) == bVar34),
                                                           -((byte)uVar26 == bVar34)))))))) &
                   0x8080808080808080;
        }
        uVar39 = (uVar38 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar38 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar39 = (uVar39 & 0xffff0000ffff0000) >> 0x10 | (uVar39 & 0xffff0000ffff) << 0x10;
        uVar39 = uVar36 + ((ulong)LZCOUNT(uVar39 >> 0x20 | uVar39 << 0x20) >> 3) & uVar40;
        if (*plVar41 == *(long *)(lVar47 + -0x10 + uVar39 * -0x10)) break;
        uVar38 = uVar38 - 1 & uVar38;
      }
      lVar47 = lVar47 + uVar39 * -0x10;
code_r0x00546c2c:
      lVar23 = 0;
      if (lVar47 != 0) {
        lVar23 = lVar47 + -0x10;
      }
    }
    lVar47 = 0;
    if (*(long *)(lVar27 + 0x178) != 0) {
      lVar47 = 0;
      uVar36 = (*plVar41 + 8) * 0x517cc1b727220a95;
      lVar33 = *(long *)(lVar27 + 0x160);
      uVar40 = *(ulong *)(lVar27 + 0x168);
      bVar34 = (byte)(uVar36 >> 0x39);
      uVar36 = uVar36 & uVar40;
      uVar26 = *(undefined8 *)(lVar33 + uVar36);
      uVar38 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                        CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                                 CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                          CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar34),
                                                   CONCAT13(-((byte)((ulong)uVar26 >> 0x18) ==
                                                             bVar34),CONCAT12(-((byte)((ulong)uVar26
                                                                                      >> 0x10) ==
                                                                               bVar34),CONCAT11(-((
                                                  byte)((ulong)uVar26 >> 8) == bVar34),
                                                  -((byte)uVar26 == bVar34)))))))) &
               0x8080808080808080;
      while( true ) {
        while (uVar38 == 0) {
          bVar55 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar26 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar26 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar26 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar26 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar26 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar26 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar26 >> 8) ==
                                                                     -1),-((char)uVar26 == -1)))))))
                                      ),1);
          if ((bVar55 & 1) != 0) {
            lVar33 = 0;
            goto code_r0x00546cfc;
          }
          lVar47 = lVar47 + 8;
          uVar36 = uVar36 + lVar47 & uVar40;
          uVar26 = *(undefined8 *)(lVar33 + uVar36);
          uVar38 = CONCAT17(-((byte)((ulong)uVar26 >> 0x38) == bVar34),
                            CONCAT16(-((byte)((ulong)uVar26 >> 0x30) == bVar34),
                                     CONCAT15(-((byte)((ulong)uVar26 >> 0x28) == bVar34),
                                              CONCAT14(-((byte)((ulong)uVar26 >> 0x20) == bVar34),
                                                       CONCAT13(-((byte)((ulong)uVar26 >> 0x18) ==
                                                                 bVar34),CONCAT12(-((byte)((ulong)
                                                  uVar26 >> 0x10) == bVar34),
                                                  CONCAT11(-((byte)((ulong)uVar26 >> 8) == bVar34),
                                                           -((byte)uVar26 == bVar34)))))))) &
                   0x8080808080808080;
        }
        uVar39 = (uVar38 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar38 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar39 = (uVar39 & 0xffff0000ffff0000) >> 0x10 | (uVar39 & 0xffff0000ffff) << 0x10;
        uVar39 = uVar36 + ((ulong)LZCOUNT(uVar39 >> 0x20 | uVar39 << 0x20) >> 3) & uVar40;
        if (*plVar41 == *(long *)(lVar33 + -0x10 + uVar39 * -0x10)) break;
        uVar38 = uVar38 - 1 & uVar38;
      }
      lVar33 = lVar33 + uVar39 * -0x10;
code_r0x00546cfc:
      lVar47 = 0;
      if (lVar33 != 0) {
        lVar47 = lVar33 + -0x10;
      }
    }
    puVar28 = (undefined8 *)(lVar47 + 8);
    if (lVar23 == 0) goto code_r0x00546d34;
    puVar2 = (undefined8 *)(lVar23 + 8);
    if (lVar47 == 0) {
      puVar28 = puVar2;
    }
    else {
      iVar25 = func_0x00543f78(lVar27,*puVar2,*puVar28);
      if (iVar25 == 0) {
        puVar28 = puVar2;
      }
    }
    goto code_r0x00546d40;
  }
  puVar42[2] = puVar42[2] - 1;
code_r0x005454a0:
  uVar26 = 1;
  lVar27 = *plStack_198 + -1;
  *plStack_198 = lVar27;
joined_r0x005454b4:
  if (lVar27 == 0) {
    func_0x0057e6ac(&plStack_198);
  }
  uVar38 = *puStack_1a0;
  *puStack_1a0 = uVar38 - 1;
  if (uVar38 - 1 == 0) {
    func_0x0057e6ac(&puStack_1a0);
  }
  return uVar26;
}

