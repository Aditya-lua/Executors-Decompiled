
undefined8
FUN_004c6a8c(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5)

{
  char cVar1;
  byte *pbVar2;
  byte *pbVar3;
  ulong uVar4;
  uint uVar5;
  ulong uVar6;
  long *plVar7;
  bool bVar8;
  bool bVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  code *pcVar12;
  long lVar13;
  uint uVar14;
  long lVar15;
  ulong uVar16;
  long lVar17;
  long *plVar18;
  undefined *puVar19;
  uint *puVar20;
  ulong uVar21;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined8 extraout_x1_02;
  undefined8 extraout_x1_03;
  undefined8 extraout_x1_04;
  undefined8 extraout_x1_05;
  undefined8 extraout_x1_06;
  undefined8 extraout_x1_07;
  undefined8 extraout_x1_08;
  undefined8 extraout_x1_09;
  undefined8 extraout_x1_10;
  long lVar22;
  long lVar23;
  uint *puVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  byte bVar28;
  ulong uVar29;
  ulong uVar30;
  undefined8 unaff_x19;
  undefined8 uVar31;
  long *plVar32;
  long *plVar33;
  byte in_wzr;
  undefined8 uVar34;
  undefined8 uVar35;
  byte bVar36;
  undefined1 auVar37 [16];
  undefined8 in_stack_00000010;
  undefined1 uStack0000000000000020;
  long lStack_288;
  undefined4 *puStack_280;
  long lStack_278;
  long lStack_270;
  uint *puStack_268;
  ulong uStack_260;
  long lStack_258;
  uint *puStack_250;
  ulong uStack_248;
  undefined7 uStack_240;
  undefined1 uStack_239;
  undefined7 uStack_238;
  undefined1 uStack_231;
  undefined7 uStack_230;
  undefined1 uStack_229;
  undefined7 uStack_228;
  undefined1 uStack_221;
  long lStack_220;
  undefined8 uStack_218;
  long lStack_210;
  long lStack_200;
  undefined8 uStack_1f8;
  long lStack_1f0;
  long lStack_1e0;
  long lStack_1d8;
  long lStack_1d0;
  long lStack_1c0;
  int iStack_1b8;
  undefined4 uStack_1b4;
  uint uStack_1b0;
  uint uStack_1ac;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  long lStack_198;
  long lStack_190;
  long lStack_188;
  
  if (param_1 != 0) {
    param_4 = 4;
    func_0x00187bd4(in_stack_00000010,param_1 << 2,4);
    unaff_x19 = __Unwind_Resume();
    func_0x00490c98(&uStack0000000000000020);
  }
  __Unwind_Resume(unaff_x19);
  auVar37 = func_0x007a2668();
  uVar21 = auVar37._8_8_;
  lVar15 = auVar37._0_8_;
  func_0x00584800(&lStack_1c0);
  func_0x004d0228(&lStack_288,&lStack_1c0,&UNK_009e5910);
  uVar16 = func_0x004bfad0(lVar15,uVar21,param_4,param_5);
  if ((uVar16 & 1) == 0) {
    uVar16 = func_0x004be348(lVar15,uVar21);
    if ((uVar16 & 1) == 0) {
      if (lStack_278 == 0) {
code_r0x004c6db0:
        uVar31 = 0;
        goto joined_r0x004c6de0;
      }
      if (lStack_278 != 1) {
        if (lStack_278 != 2) {
          func_0x007a247c(&UNK_008a2482,0x28,&UNK_009e67f8);
          goto code_r0x004c7874;
        }
        func_0x00584d50(&lStack_1c0,lVar15,uVar21);
        uVar10 = uStack_1b4;
        if (lStack_1c0 == 0) {
          puVar19 = &UNK_009e67e0;
        }
        else {
          uVar11 = uStack_1a0._4_4_;
          lVar17 = func_0x005847cc(lVar15,uVar21);
          if (lVar17 == 0) {
            puVar19 = &UNK_009e5f28;
          }
          else {
            if (*(long *)(lVar17 + 0x10) != 0) {
              if (*(long *)(*(long *)(lVar17 + 8) + *(long *)(lVar17 + 0x10) * 0x108 + -0xf0) !=
                  0x10) goto code_r0x004c6db0;
              func_0x00584800(&lStack_1c0,lVar15,uVar10);
              func_0x004d0228(&lStack_270,&lStack_1c0,&UNK_009e5910);
              func_0x00584800(&uStack_240,lVar15,uVar11);
              lStack_1c0 = CONCAT17(uStack_239,uStack_240);
              iStack_1b8 = (int)uStack_238;
              uStack_1b4 = (undefined4)(CONCAT17(uStack_231,uStack_238) >> 0x20);
              uStack_1a8._0_4_ = (int)uStack_228;
              uStack_1a8._4_4_ = (undefined4)(CONCAT17(uStack_221,uStack_228) >> 0x20);
              uStack_1b0 = (uint)uStack_230;
              uStack_1ac = (uint)(CONCAT17(uStack_229,uStack_230) >> 0x20);
              func_0x004d0228(&lStack_258,&lStack_1c0,&UNK_009e5910);
              uVar16 = uStack_260 - 1;
              if ((uStack_260 == 0 || uVar16 == 0) && (uStack_248 < 2)) {
                if ((uStack_260 == uStack_248) &&
                   ((uStack_260 == 0 || ((*puStack_268 == *puStack_250 && (uStack_260 == 1)))))) {
code_r0x004c6f48:
                  func_0x0058485c(&lStack_1c0,lVar15,uVar10);
                  lVar17 = 0;
                  uVar16 = (ulong)uStack_1ac;
                  uVar29 = (ulong)uStack_1b0;
                  do {
                    for (; uVar29 < CONCAT44(uStack_1b4,iStack_1b8);
                        uVar29 = (ulong)*(uint *)(lStack_1c0 + uVar29 * 0x30 + 0x20)) {
                      lVar17 = lVar17 + 1;
                    }
                    do {
                      if (CONCAT44(uStack_1b4,iStack_1b8) <= uVar16) {
                        if (lVar17 != 1) goto code_r0x004c727c;
                        func_0x0058485c(&lStack_1c0,lVar15,uVar11);
                        lVar17 = 0;
                        uVar16 = (ulong)uStack_1ac;
                        uVar29 = (ulong)uStack_1b0;
                        goto joined_r0x004c6fe0;
                      }
                      lVar26 = lStack_1c0 + uVar16 * 0x30;
                      uVar16 = (ulong)*(uint *)(lVar26 + 0x24);
                    } while (*(int *)(lVar26 + 0x28) == (int)uStack_1a8);
                    lVar17 = lVar17 + 1;
                  } while( true );
                }
              }
              else if (*(long *)(lVar15 + 0xa8) != 0) {
                lVar17 = 0;
                uVar30 = (uVar21 & 0xffffffff) * 0x517cc1b727220a95;
                lVar26 = *(long *)(lVar15 + 0x90);
                uVar4 = *(ulong *)(lVar15 + 0x98);
                bVar28 = (byte)(uVar30 >> 0x39);
                uVar30 = uVar30 & uVar4;
                uVar31 = *(undefined8 *)(lVar26 + uVar30);
                uVar29 = CONCAT17(-((byte)((ulong)uVar31 >> 0x38) == bVar28),
                                  CONCAT16(-((byte)((ulong)uVar31 >> 0x30) == bVar28),
                                           CONCAT15(-((byte)((ulong)uVar31 >> 0x28) == bVar28),
                                                    CONCAT14(-((byte)((ulong)uVar31 >> 0x20) ==
                                                              bVar28),CONCAT13(-((byte)((ulong)
                                                  uVar31 >> 0x18) == bVar28),
                                                  CONCAT12(-((byte)((ulong)uVar31 >> 0x10) == bVar28
                                                            ),CONCAT11(-((byte)((ulong)uVar31 >> 8)
                                                                        == bVar28),
                                                                       -((byte)uVar31 == bVar28)))))
                                                  ))) & 0x8080808080808080;
                while( true ) {
                  while (uVar29 == 0) {
                    bVar36 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar31 >> 0x38) == -1),
                                                 CONCAT16(-((char)((ulong)uVar31 >> 0x30) == -1),
                                                          CONCAT15(-((char)((ulong)uVar31 >> 0x28)
                                                                    == -1),CONCAT14(-((char)((ulong)
                                                  uVar31 >> 0x20) == -1),
                                                  CONCAT13(-((char)((ulong)uVar31 >> 0x18) == -1),
                                                           CONCAT12(-((char)((ulong)uVar31 >> 0x10)
                                                                     == -1),CONCAT11(-((char)((ulong
                                                  )uVar31 >> 8) == -1),-((char)uVar31 == -1)))))))),
                                        1);
                    if ((bVar36 & 1) != 0) goto code_r0x004c727c;
                    lVar17 = lVar17 + 8;
                    uVar30 = uVar30 + lVar17 & uVar4;
                    uVar31 = *(undefined8 *)(lVar26 + uVar30);
                    uVar29 = CONCAT17(-((byte)((ulong)uVar31 >> 0x38) == bVar28),
                                      CONCAT16(-((byte)((ulong)uVar31 >> 0x30) == bVar28),
                                               CONCAT15(-((byte)((ulong)uVar31 >> 0x28) == bVar28),
                                                        CONCAT14(-((byte)((ulong)uVar31 >> 0x20) ==
                                                                  bVar28),CONCAT13(-((byte)((ulong)
                                                  uVar31 >> 0x18) == bVar28),
                                                  CONCAT12(-((byte)((ulong)uVar31 >> 0x10) == bVar28
                                                            ),CONCAT11(-((byte)((ulong)uVar31 >> 8)
                                                                        == bVar28),
                                                                       -((byte)uVar31 == bVar28)))))
                                                  ))) & 0x8080808080808080;
                  }
                  uVar6 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                          (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
                  uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
                  uVar14 = auVar37._8_4_;
                  if (uVar14 == *(uint *)(lVar26 + -4 +
                                         (uVar30 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >>
                                                   3) & uVar4) * -4)) break;
                  uVar29 = uVar29 - 1 & uVar29;
                }
                if (uStack_260 != 0) {
                  lVar17 = 0;
                  lVar26 = uStack_260 << 2;
                  do {
                    if (puStack_268[lVar17] == uVar14) {
                      bVar8 = false;
                      puStack_268[lVar17] = puStack_268[uVar16];
                      uStack_260 = uVar16;
                      goto code_r0x004c6e5c;
                    }
                    lVar17 = lVar17 + 1;
                    lVar26 = lVar26 + -4;
                  } while (lVar26 != 0);
                }
                bVar8 = true;
code_r0x004c6e5c:
                if (uStack_248 != 0) {
                  lVar17 = 0;
                  lVar26 = uStack_248 << 2;
                  do {
                    if (puStack_250[lVar17] == uVar14) {
                      uStack_248 = uStack_248 - 1;
                      puStack_250[lVar17] = puStack_250[uStack_248];
                      if ((bVar8) && (uStack_260 != 1)) goto code_r0x004c727c;
                      bVar9 = false;
                      goto code_r0x004c6ec0;
                    }
                    lVar17 = lVar17 + 1;
                    lVar26 = lVar26 + -4;
                  } while (lVar26 != 0);
                }
                if (((!bVar8) || (uStack_260 == 1)) && (uStack_248 == 1)) {
                  bVar9 = true;
code_r0x004c6ec0:
                  puVar20 = puStack_268;
                  puVar24 = puStack_250;
                  uVar16 = uStack_248;
                  if (uStack_260 == uStack_248) {
                    do {
                      if (uVar16 == 0) {
                        if (bVar8) {
                          if (bVar9) break;
                          uVar14 = func_0x004bdd28(lVar15,uVar21,uVar11);
code_r0x004c6f34:
                          if ((uVar14 & 1) == 0) break;
                          uVar14 = 0;
                        }
                        else {
                          uVar16 = func_0x004bdd28(lVar15,uVar21,uVar10);
                          if (bVar9) {
                            if ((uVar16 & 1) != 0) goto code_r0x004c6f48;
                            break;
                          }
                          uVar14 = func_0x004bdd28(lVar15,uVar21,uVar11);
                          if ((uVar16 & 1) == 0) goto code_r0x004c6f34;
                        }
                        if (bVar8 || (bVar9 || (uVar14 & 1) != 0)) goto code_r0x004c6f48;
                        func_0x007a247c(&UNK_008a23a8,0x2e,&UNK_009e5d48);
                        goto code_r0x004c7874;
                      }
                      uVar14 = *puVar20;
                      uVar5 = *puVar24;
                      uVar16 = uVar16 - 1;
                      puVar20 = puVar20 + 1;
                      puVar24 = puVar24 + 1;
                    } while (uVar14 == uVar5);
                  }
                }
              }
code_r0x004c727c:
              if (lStack_258 != 0) {
                func_0x00187bd4(puStack_250,lStack_258 << 2,4);
              }
              if (lStack_270 != 0) {
                func_0x00187bd4(puStack_268,lStack_270 << 2,4);
              }
              uVar16 = func_0x004bdf70(lVar15,uVar21,uVar10,uVar11,0);
              if ((uVar16 & 1) != 0) goto code_r0x004c6bec;
              uVar31 = func_0x004bdf70(lVar15,uVar21,uVar11,uVar10,1);
              goto code_r0x004c6dd8;
            }
            puVar19 = &UNK_009e5f40;
          }
        }
code_r0x004c7408:
        func_0x007a23bc(puVar19);
code_r0x004c7874:
                    /* WARNING: Does not return */
        pcVar12 = (code *)SoftwareBreakpoint(1,0x4c7878);
        (*pcVar12)();
      }
      uVar31 = func_0x004bea24(lVar15,uVar21,1,*puStack_280);
code_r0x004c6dd8:
      goto joined_r0x004c6de0;
    }
  }
  else {
    if (*(long *)(lVar15 + 0xa8) != 0) {
      uVar16 = *(ulong *)(lVar15 + 0x98);
      if (uVar16 != 0) {
        _memset(*(undefined8 *)(lVar15 + 0x90),0xff,uVar16 + 9);
      }
      if (7 < uVar16) {
        uVar16 = (uVar16 + 1 >> 3) * 7;
      }
      *(ulong *)(lVar15 + 0xa0) = uVar16;
      *(undefined8 *)(lVar15 + 0xa8) = 0;
    }
    if (*(int *)(lVar15 + 0x78) != 1) {
      puVar19 = &UNK_009e67c8;
      goto code_r0x004c7408;
    }
    func_0x004d661c(lVar15 + 0x18,1,*(undefined4 *)(lVar15 + 0x7c),lVar15 + 0x90);
  }
code_r0x004c6bec:
  uVar31 = 1;
joined_r0x004c6de0:
  if (lStack_288 != 0) {
    func_0x00187bd4(puStack_280,lStack_288 << 2,4);
  }
  return uVar31;
joined_r0x004c6fe0:
  for (; uVar29 < CONCAT44(uStack_1b4,iStack_1b8);
      uVar29 = (ulong)*(uint *)(lStack_1c0 + uVar29 * 0x30 + 0x20)) {
    lVar17 = lVar17 + 1;
  }
  do {
    if (CONCAT44(uStack_1b4,iStack_1b8) <= uVar16) {
      if (lVar17 != 1) goto code_r0x004c727c;
      func_0x00584fc4(&lStack_1c0,lVar15,uVar10);
      if (lStack_1c0 == -0x8000000000000000) {
        func_0x007a23bc(&UNK_009e5d60);
        goto code_r0x004c7874;
      }
      uStack_218 = CONCAT44(uStack_1b4,iStack_1b8);
      lStack_220 = lStack_1c0;
      lStack_210 = CONCAT44(uStack_1ac,uStack_1b0);
      func_0x00584fc4(&lStack_1c0,lVar15,uVar11);
      if (lStack_1c0 == -0x8000000000000000) {
        func_0x007a23bc(&UNK_009e5d78);
        goto code_r0x004c7874;
      }
      uStack_1f8 = CONCAT44(uStack_1b4,iStack_1b8);
      lStack_200 = lStack_1c0;
      lStack_1f0 = CONCAT44(uStack_1ac,uStack_1b0);
      lVar17 = func_0x005847cc(lVar15,uVar21);
      if (lVar17 == 0) {
        puVar19 = &UNK_009e5d90;
      }
      else if ((*(long *)(lVar17 + 0x10) == 0) ||
              (lVar26 = *(long *)(lVar17 + 8) + *(long *)(lVar17 + 0x10) * 0x108, lVar26 == 0x108))
      {
        puVar19 = &UNK_009e5da8;
      }
      else {
        puVar19 = &UNK_009e5dc0;
        plVar7 = (long *)(lVar26 + -0xe8);
        if ((plVar7 != (long *)0x0) && (*(long *)(lVar26 + -0xf0) == 0x10)) {
          uStack_231 = (undefined1)uStack_218;
          uStack_230 = (undefined7)((ulong)uStack_218 >> 8);
          uStack_239 = (undefined1)lStack_220;
          uStack_238 = (undefined7)((ulong)lStack_220 >> 8);
          uStack_229 = (undefined1)lStack_210;
          uStack_228 = (undefined7)((ulong)lStack_210 >> 8);
          lStack_1c0 = 1;
          uStack_1ac = (uint)((ulong)lStack_220 >> 0x20);
          iStack_1b8._1_3_ = (uint3)uStack_240;
          iStack_1b8 = (uint)iStack_1b8._1_3_ << 8;
          uStack_1b4 = (undefined4)((uint7)uStack_240 >> 0x18);
          uStack_1b0 = (uint)lStack_220;
          uStack_1a0 = lStack_210;
          uStack_1a8._0_4_ = (int)uStack_218;
          uStack_1a8._4_4_ = (undefined4)((ulong)uStack_218 >> 0x20);
          plVar18 = (long *)func_0x00187bd0(0x28,8);
          if (plVar18 == (long *)0x0) {
            func_0x007a1f18(8,0x28);
            goto code_r0x004c7874;
          }
          plVar18[1] = CONCAT44(uStack_1b4,iStack_1b8);
          *plVar18 = lStack_1c0;
          plVar18[3] = CONCAT44(uStack_1a8._4_4_,(int)uStack_1a8);
          plVar18[2] = CONCAT44(uStack_1ac,uStack_1b0);
          plVar18[4] = uStack_1a0;
          plVar32 = (long *)(lVar26 + -0xa8);
          lVar13 = *(long *)*plVar32;
          *(long *)*plVar32 = lVar13 + -1;
          LORelease();
          if (lVar13 == 1) {
            in_wzr = (byte)*(undefined8 *)*plVar32;
            func_0x005d2c74(plVar32);
          }
          *plVar32 = (long)plVar18;
          uStack_231 = (undefined1)uStack_1f8;
          uStack_230 = (undefined7)((ulong)uStack_1f8 >> 8);
          uStack_239 = (undefined1)lStack_200;
          uStack_238 = (undefined7)((ulong)lStack_200 >> 8);
          uStack_229 = (undefined1)lStack_1f0;
          uStack_228 = (undefined7)((ulong)lStack_1f0 >> 8);
          lStack_1c0 = 1;
          uStack_1ac = (uint)((ulong)lStack_200 >> 0x20);
          iStack_1b8._1_3_ = (uint3)uStack_240;
          iStack_1b8 = (uint)iStack_1b8._1_3_ << 8;
          uStack_1b4 = (undefined4)((uint7)uStack_240 >> 0x18);
          uStack_1b0 = (uint)lStack_200;
          uStack_1a0 = lStack_1f0;
          uStack_1a8._0_4_ = (int)uStack_1f8;
          uStack_1a8._4_4_ = (undefined4)((ulong)uStack_1f8 >> 0x20);
          auVar37 = func_0x00187bd0(0x28,8);
          uVar31 = auVar37._8_8_;
          plVar18 = auVar37._0_8_;
          if (plVar18 == (long *)0x0) {
            func_0x007a1f18(8,0x28);
            goto code_r0x004c7874;
          }
          plVar18[1] = CONCAT44(uStack_1b4,iStack_1b8);
          *plVar18 = lStack_1c0;
          plVar18[3] = CONCAT44(uStack_1a8._4_4_,(int)uStack_1a8);
          plVar18[2] = CONCAT44(uStack_1ac,uStack_1b0);
          plVar18[4] = uStack_1a0;
          plVar33 = (long *)(lVar26 + -0xa0);
          lVar13 = *(long *)*plVar33;
          *(long *)*plVar33 = lVar13 + -1;
          LORelease();
          if (lVar13 == 1) {
            in_wzr = (byte)*(undefined8 *)*plVar33;
            func_0x005d2c74(plVar33);
            uVar31 = extraout_x1;
          }
          *(long **)(lVar26 + -0xa0) = plVar18;
          if ((*(long *)(lVar26 + -0xe8) == 8) && (*(char *)(lVar26 + -0xd8) == '\0')) {
            uVar31 = *(undefined8 *)(lVar26 + -0xe0);
            plVar18 = (long *)func_0x004afc0c();
            func_0x004bd098(&lStack_1c0,uVar31);
            plVar18[1] = CONCAT44(uStack_1b4,iStack_1b8);
            *plVar18 = lStack_1c0;
            plVar18[3] = CONCAT44(uStack_1a8._4_4_,(int)uStack_1a8);
            plVar18[2] = CONCAT44(uStack_1ac,uStack_1b0);
            plVar18[5] = lStack_198;
            plVar18[4] = uStack_1a0;
            plVar18[7] = lStack_188;
            plVar18[6] = lStack_190;
            lStack_1c0 = *plVar18;
            iStack_1b8 = (int)plVar18[1];
            uStack_1b4 = (undefined4)((ulong)plVar18[1] >> 0x20);
            uStack_1a8._0_4_ = (int)plVar18[3];
            uStack_1a8._4_4_ = (undefined4)((ulong)plVar18[3] >> 0x20);
            uStack_1b0 = (uint)plVar18[2];
            uStack_1ac = (uint)((ulong)plVar18[2] >> 0x20);
            lStack_198 = plVar18[5];
            uStack_1a0 = plVar18[4];
            lStack_188 = plVar18[7];
            lStack_190 = plVar18[6];
            func_0x004bb4f4(plVar7);
            *(ulong *)(lVar26 + -0xe0) = CONCAT44(uStack_1b4,iStack_1b8);
            *plVar7 = lStack_1c0;
            *(ulong *)(lVar26 + -0xd0) = CONCAT44(uStack_1a8._4_4_,(int)uStack_1a8);
            *(ulong *)(lVar26 + -0xd8) = CONCAT44(uStack_1ac,uStack_1b0);
            *(long *)(lVar26 + -0xc0) = lStack_198;
            *(long *)(lVar26 + -200) = uStack_1a0;
            *(long *)(lVar26 + -0xb0) = lStack_188;
            *(long *)(lVar26 + -0xb8) = lStack_190;
            func_0x00187bd4(plVar18,0x40,8);
            lVar22 = *plVar32;
            lVar13 = *plVar33;
            *plVar32 = lVar13;
            *plVar33 = lVar22;
            uVar31 = extraout_x1_00;
          }
          else {
            lVar13 = *plVar32;
          }
          pbVar2 = (byte *)(lVar13 + 8);
          if (*pbVar2 == 0) {
            *pbVar2 = 1;
          }
          else {
            func_0x007aff64(pbVar2,uVar31,1000000000);
            uVar31 = extraout_x1_07;
          }
          lVar22 = *plVar33;
          pbVar3 = (byte *)(lVar22 + 8);
          if (*pbVar3 == 0) {
            *pbVar3 = 1;
          }
          else {
            func_0x007aff64(pbVar3,uVar31,1000000000);
            uVar31 = extraout_x1_08;
          }
          uVar16 = *(ulong *)(lVar13 + 0x20);
          if (uVar16 == 0) {
            lVar23 = 0;
          }
          else {
            lVar25 = *(long *)(lVar13 + 0x18) + uVar16 * 0x108;
            lVar23 = lVar25 + -0x108;
            if ((lVar23 != 0) && (*(long *)(lVar25 + -0xf0) != 0x1b)) {
              lVar23 = 0;
            }
          }
          uVar29 = *(ulong *)(lVar22 + 0x20);
          if (uVar29 == 0) {
code_r0x004c7570:
            lStack_1e0 = -0x8000000000000000;
          }
          else {
            lVar27 = *(long *)(lVar22 + 0x18) + uVar29 * 0x108;
            lVar25 = lVar27 + -0x108;
            if (lVar25 == 0) goto code_r0x004c7570;
            if (*(long *)(lVar27 + -0xf0) != 0x1b) {
              lVar25 = 0;
            }
            if ((lVar23 == 0) || (lVar25 == 0)) goto code_r0x004c7570;
            if (*(long *)(lVar23 + 0x10) == 0) {
              if (*(long *)(lVar25 + 0x10) == 0) {
                if (uVar16 != 0) {
                  *(ulong *)(lVar13 + 0x20) = uVar16 - 1;
                  _memcpy(&lStack_1c0,*(long *)(lVar13 + 0x18) + (uVar16 - 1) * 0x108,0x108);
                  uVar31 = extraout_x1_03;
                  if (CONCAT44(uStack_1a8._4_4_,(int)uStack_1a8) != 0x21) {
                    func_0x004bba74(&lStack_1c0);
                    uVar31 = extraout_x1_04;
                  }
                }
                if (*(long *)(lVar22 + 0x20) != 0) {
                  lVar13 = *(long *)(lVar22 + 0x20) + -1;
                  *(long *)(lVar22 + 0x20) = lVar13;
                  _memcpy(&lStack_1c0,*(long *)(lVar22 + 0x18) + lVar13 * 0x108,0x108);
                  uVar31 = extraout_x1_05;
                  if (CONCAT44(uStack_1a8._4_4_,(int)uStack_1a8) != 0x21) {
                    func_0x004bba74(&lStack_1c0);
                    uVar31 = extraout_x1_06;
                  }
                }
                goto code_r0x004c7570;
              }
              uVar31 = *(undefined8 *)(lVar22 + 0x20);
              uVar35 = *(undefined8 *)(lVar22 + 0x18);
              uVar34 = *(undefined8 *)(lVar22 + 0x10);
              *(undefined8 *)(lVar22 + 0x10) = 0;
              *(undefined8 *)(lVar22 + 0x18) = 8;
              *(undefined8 *)(lVar22 + 0x20) = 0;
              uStack_238 = (undefined7)*(undefined8 *)(lVar13 + 0x18);
              uStack_231 = (undefined1)((ulong)*(undefined8 *)(lVar13 + 0x18) >> 0x38);
              uStack_240 = (undefined7)*(undefined8 *)(lVar13 + 0x10);
              uStack_239 = (undefined1)((ulong)*(undefined8 *)(lVar13 + 0x10) >> 0x38);
              uStack_230 = (undefined7)*(undefined8 *)(lVar13 + 0x20);
              uStack_229 = (undefined1)((ulong)*(undefined8 *)(lVar13 + 0x20) >> 0x38);
              *(undefined8 *)(lVar13 + 0x18) = uVar35;
              *(undefined8 *)(lVar13 + 0x10) = uVar34;
              *(undefined8 *)(lVar13 + 0x20) = uVar31;
              func_0x004bd098(&lStack_1c0,plVar7);
              func_0x005cb804(&lStack_1c0,0);
              func_0x005cb1c8(&lStack_1c0);
              func_0x004bb4f4(plVar7);
              uVar31 = extraout_x1_02;
code_r0x004c7468:
              *(ulong *)(lVar26 + -0xe0) = CONCAT44(uStack_1b4,iStack_1b8);
              *plVar7 = lStack_1c0;
              *(ulong *)(lVar26 + -0xd0) = CONCAT44(uStack_1a8._4_4_,(int)uStack_1a8);
              *(ulong *)(lVar26 + -0xd8) = CONCAT44(uStack_1ac,uStack_1b0);
              *(long *)(lVar26 + -0xc0) = lStack_198;
              *(long *)(lVar26 + -200) = uStack_1a0;
              *(long *)(lVar26 + -0xb0) = lStack_188;
              *(long *)(lVar26 + -0xb8) = lStack_190;
              lStack_1d8 = CONCAT17(uStack_231,uStack_238);
              lStack_1e0 = CONCAT17(uStack_239,uStack_240);
              lStack_1d0 = CONCAT17(uStack_229,uStack_230);
            }
            else {
              if (*(long *)(lVar25 + 0x10) != 0) {
                cVar1 = uVar29 < uVar16;
                if (uVar16 < uVar29) {
                  cVar1 = -1;
                }
                if (cVar1 == '\0') goto code_r0x004c7570;
                if (cVar1 == '\x01') {
                  uVar31 = *(undefined8 *)(lVar22 + 0x20);
                  uVar35 = *(undefined8 *)(lVar22 + 0x18);
                  uVar34 = *(undefined8 *)(lVar22 + 0x10);
                  *(undefined8 *)(lVar22 + 0x10) = 0;
                  *(undefined8 *)(lVar22 + 0x18) = 8;
                  *(undefined8 *)(lVar22 + 0x20) = 0;
                  uStack_238 = (undefined7)*(undefined8 *)(lVar13 + 0x18);
                  uStack_231 = (undefined1)((ulong)*(undefined8 *)(lVar13 + 0x18) >> 0x38);
                  uStack_240 = (undefined7)*(undefined8 *)(lVar13 + 0x10);
                  uStack_239 = (undefined1)((ulong)*(undefined8 *)(lVar13 + 0x10) >> 0x38);
                  uStack_230 = (undefined7)*(undefined8 *)(lVar13 + 0x20);
                  uStack_229 = (undefined1)((ulong)*(undefined8 *)(lVar13 + 0x20) >> 0x38);
                  *(undefined8 *)(lVar13 + 0x18) = uVar35;
                  *(undefined8 *)(lVar13 + 0x10) = uVar34;
                  *(undefined8 *)(lVar13 + 0x20) = uVar31;
                  func_0x004bd098(&lStack_1c0,plVar7);
                  func_0x005cb804(&lStack_1c0,0);
                  func_0x005cb1c8(&lStack_1c0);
                  func_0x004bb4f4(plVar7);
                  uVar31 = extraout_x1_01;
                  goto code_r0x004c7468;
                }
              }
              lStack_1d8 = *(long *)(lVar22 + 0x18);
              lStack_1e0 = *(long *)(lVar22 + 0x10);
              lStack_1d0 = *(long *)(lVar22 + 0x20);
              *(undefined8 *)(lVar22 + 0x10) = 0;
              *(undefined8 *)(lVar22 + 0x18) = 8;
              *(undefined8 *)(lVar22 + 0x20) = 0;
            }
          }
          if (*pbVar3 == 1) {
            *pbVar3 = in_wzr;
          }
          else {
            func_0x007b05dc(pbVar3,0);
            uVar31 = extraout_x1_09;
          }
          if (*pbVar2 == 1) {
            *pbVar2 = in_wzr;
          }
          else {
            func_0x007b05dc(pbVar2,0);
            uVar31 = extraout_x1_10;
          }
          lVar13 = *plVar32;
          pbVar2 = (byte *)(lVar13 + 8);
          if (*pbVar2 == 0) {
            *pbVar2 = 1;
          }
          else {
            func_0x007aff64(pbVar2,uVar31,1000000000);
          }
          bVar28 = *pbVar2;
          if (bVar28 == 1) {
            *pbVar2 = in_wzr;
          }
          uVar14 = (uint)bVar28;
          if (*(long *)(lVar13 + 0x20) == 0) {
            if (bVar28 != 1) {
              func_0x007b05dc(pbVar2,0);
            }
            func_0x004bd098(&lStack_1c0,plVar7);
            func_0x005cb804(&lStack_1c0,0);
            func_0x005cb1c8(&lStack_1c0);
            func_0x004bb4f4(plVar7);
            *(ulong *)(lVar26 + -0xe0) = CONCAT44(uStack_1b4,iStack_1b8);
            *plVar7 = lStack_1c0;
            *(ulong *)(lVar26 + -0xd0) = CONCAT44(uStack_1a8._4_4_,(int)uStack_1a8);
            *(ulong *)(lVar26 + -0xd8) = CONCAT44(uStack_1ac,uStack_1b0);
            *(long *)(lVar26 + -0xc0) = lStack_198;
            *(long *)(lVar26 + -200) = uStack_1a0;
            *(long *)(lVar26 + -0xb0) = lStack_188;
            *(long *)(lVar26 + -0xb8) = lStack_190;
            lVar26 = *plVar32;
            *plVar32 = *plVar33;
            *plVar33 = lVar26;
          }
          else if (bVar28 != 1) {
            func_0x007b05dc(pbVar2,0);
          }
          if (lStack_1e0 != -0x8000000000000000) {
            uStack_1a8 = lStack_1d8 + lStack_1d0 * 0x108;
            lStack_1c0 = lStack_1d8;
            iStack_1b8 = (int)lStack_1d8;
            uStack_1b4 = (undefined4)((ulong)lStack_1d8 >> 0x20);
            uStack_1b0 = (uint)lStack_1e0;
            uStack_1ac = (uint)((ulong)lStack_1e0 >> 0x20);
            func_0x004ca0e0(lVar17,&lStack_1c0,&UNK_009e5dd8);
          }
          if (uStack_260 == 0) {
            func_0x0058497c(&lStack_1c0,lVar15,uVar21);
            func_0x004ce364(&lStack_1c0);
            if (lStack_1c0 != 0) {
              func_0x00187bd4(CONCAT44(uStack_1b4,iStack_1b8),lStack_1c0 * 0x28,8);
            }
            uVar31 = 0;
          }
          else {
            uVar14 = *puStack_268;
            puVar20 = (uint *)func_0x00187bd0(0x28,8);
            if (puVar20 == (uint *)0x0) {
              func_0x007a1f18(8,0x28);
              goto code_r0x004c7874;
            }
            *puVar20 = uVar14;
            puVar20[2] = 0;
            puVar20[3] = 0;
            puVar20[4] = 8;
            puVar20[5] = 0;
            puVar20[6] = 0;
            puVar20[7] = 0;
            *(undefined1 *)(puVar20 + 8) = 0;
            lStack_1c0 = 1;
            iStack_1b8 = (int)puVar20;
            uStack_1b4 = (undefined4)((ulong)puVar20 >> 0x20);
            uStack_1b0 = 1;
            uStack_1ac = 0;
            func_0x00584c34(&uStack_240,lVar15,uVar21,&lStack_1c0);
            func_0x004ce364(&uStack_240);
            if (CONCAT17(uStack_239,uStack_240) != 0) {
              func_0x00187bd4(CONCAT17(uStack_231,uStack_238),CONCAT17(uStack_239,uStack_240) * 0x28
                              ,8);
            }
            uVar31 = 1;
          }
          func_0x004bea24(lVar15,uVar21,uVar31,uVar14);
          if (lStack_258 != 0) {
            func_0x00187bd4(puStack_250,lStack_258 << 2,4);
          }
          if (lStack_270 != 0) {
            func_0x00187bd4(puStack_268,lStack_270 << 2,4);
          }
          goto code_r0x004c6bec;
        }
      }
      func_0x007a23bc(puVar19);
      goto code_r0x004c7874;
    }
    lVar26 = lStack_1c0 + uVar16 * 0x30;
    uVar16 = (ulong)*(uint *)(lVar26 + 0x24);
  } while (*(int *)(lVar26 + 0x28) == (int)uStack_1a8);
  lVar17 = lVar17 + 1;
  goto joined_r0x004c6fe0;
}

