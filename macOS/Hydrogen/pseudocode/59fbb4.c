
/* WARNING: Possible PIC construction at 0x0059fbc4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a0124: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a0298: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a02d8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0059fef8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0059fbc8) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0059fbb4(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined1 auVar1 [16];
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  code *pcVar10;
  undefined1 *puVar11;
  ulong uVar12;
  long lVar13;
  dword *pdVar14;
  ulong *extraout_x8;
  ulong uVar15;
  long *extraout_x8_00;
  long *extraout_x8_01;
  ulong uVar16;
  ulong *puVar17;
  undefined8 *puVar18;
  ulong *puVar19;
  long *plVar20;
  ulong uVar21;
  long lVar22;
  undefined8 uVar23;
  long unaff_x25;
  undefined8 *******unaff_x29;
  undefined *puVar24;
  undefined1 uVar25;
  undefined1 uVar26;
  undefined1 uVar27;
  undefined1 uVar28;
  undefined1 uVar29;
  undefined1 uVar30;
  undefined1 uVar31;
  undefined1 uVar32;
  undefined1 uVar33;
  undefined1 uVar34;
  undefined1 uVar35;
  undefined1 uVar36;
  undefined1 uVar37;
  undefined1 uVar38;
  undefined1 uVar39;
  undefined1 uVar40;
  undefined1 auVar41 [16];
  long lVar42;
  long lVar43;
  undefined1 auVar44 [16];
  undefined1 auStack_1b0 [8];
  long lStack_1a8;
  dword *pdStack_1a0;
  long lStack_198;
  ulong uStack_190;
  undefined8 *puStack_188;
  undefined1 uStack_180;
  undefined7 uStack_17f;
  ulong uStack_178;
  undefined8 *puStack_170;
  ulong uStack_168;
  undefined8 *puStack_160;
  ulong uStack_158;
  undefined8 *puStack_150;
  ulong uStack_148;
  ulong uStack_140;
  ulong uStack_138;
  undefined8 *puStack_130;
  ulong uStack_128;
  undefined8 *puStack_120;
  ulong uStack_110;
  ulong uStack_108;
  undefined8 *puStack_100;
  long lStack_f8;
  undefined8 *******pppppppuStack_a0;
  undefined8 uStack_98;
  undefined8 ******ppppppuStack_50;
  undefined *puStack_48;
  
  if (unaff_x25 != 0) {
    puVar11 = (undefined1 *)register0x00000008;
    puVar24 = (undefined *)0x59fbc8;
    goto code_r0x00187bd4;
  }
  func_0x0059e6a8();
  auVar44 = __Unwind_Resume();
  lVar13 = auVar44._0_8_;
  uVar16 = auVar44._8_8_ - lVar13;
  if (uVar16 == 0) {
    uVar15 = 0;
    uVar12 = 8;
  }
  else {
    uVar12 = func_0x00187bd0(uVar16 >> 1,8);
    if (uVar12 == 0) {
      auVar44 = func_0x007a1f00(8,uVar16 >> 1);
      lVar13 = auVar44._0_8_;
      puVar11 = (undefined1 *)((long)register0x00000008 + -0x90);
      puStack_48 = &DAT_0059fcfc;
      uVar16 = auVar44._8_8_ - lVar13;
      if (uVar16 == 0) {
        lVar43 = 0;
        uVar16 = 0;
        lVar42 = 8;
      }
      else {
        lVar43 = (uVar16 >> 3) * -0x5555555555555555;
        lVar22 = (uVar16 >> 3) * 0x5555555555555558;
        ppppppuStack_50 = (undefined8 ******)((long)register0x00000008 + -0x10);
        lVar42 = func_0x00187bd0(lVar22,8);
        lVar9 = _UNK_008ae548;
        lVar8 = _UNK_008ae540;
        lVar7 = _UNK_008ae538;
        lVar6 = _UNK_008ae530;
        lVar5 = _UNK_008ae528;
        lVar4 = _UNK_008ae520;
        lVar3 = _UNK_008ae518;
        lVar2 = _UNK_008ae510;
        if (lVar42 == 0) {
          auVar44 = func_0x007a1f00(8,lVar22,param_3);
          puVar19 = auVar44._0_8_;
          uStack_98 = &DAT_0059fe44;
          unaff_x29 = &pppppppuStack_a0;
          pppppppuStack_a0 = &ppppppuStack_50;
          lVar13 = func_0x0059c208();
          if (lVar13 != 0) {
            if (puVar19[0xb] == 0) {
              if ((*puVar19 & 1) == 0) {
                uVar12 = 0;
                uVar15 = 0;
                puVar17 = &uStack_108;
              }
              else {
                uVar15 = puVar19[2];
                auVar41[9] = (char)(uVar15 >> 8);
                auVar41._0_9_ = *(unkbyte9 *)(puVar19 + 1);
                auVar41[10] = (char)(uVar15 >> 0x10);
                auVar41[0xb] = (char)(uVar15 >> 0x18);
                auVar41[0xc] = (char)(uVar15 >> 0x20);
                auVar41[0xd] = (char)(uVar15 >> 0x28);
                auVar41[0xe] = (char)(uVar15 >> 0x30);
                auVar41[0xf] = (char)(uVar15 >> 0x38);
                auVar41 = NEON_ext(*(undefined1 (*) [16])(puVar19 + 4),auVar41,8,1);
                lVar42 = -(ulong)(auVar41._0_8_ == 0);
                lVar43 = -(ulong)(auVar41._8_8_ == 0);
                uVar15 = *(long *)*(undefined1 (*) [16])(puVar19 + 4) - uVar15;
                uVar12 = puVar19[8] - puVar19[6] >> 3;
                uVar21 = uVar15 >> 3;
                uVar12 = CONCAT17((byte)(puVar19[8] - puVar19[6] >> 0x3b) &
                                  ~(byte)((ulong)lVar42 >> 0x38),
                                  CONCAT16((byte)(uVar12 >> 0x30) & ~(byte)((ulong)lVar42 >> 0x30),
                                           CONCAT15((byte)(uVar12 >> 0x28) &
                                                    ~(byte)((ulong)lVar42 >> 0x28),
                                                    CONCAT14((byte)(uVar12 >> 0x20) &
                                                             ~(byte)((ulong)lVar42 >> 0x20),
                                                             CONCAT13((byte)(uVar12 >> 0x18) &
                                                                      ~(byte)((ulong)lVar42 >> 0x18)
                                                                      ,CONCAT12((byte)(uVar12 >>
                                                                                      0x10) &
                                                                                ~(byte)((ulong)
                                                  lVar42 >> 0x10),
                                                  CONCAT11((byte)(uVar12 >> 8) &
                                                           ~(byte)((ulong)lVar42 >> 8),
                                                           (byte)uVar12 & ~(byte)lVar42))))))) +
                         CONCAT17((byte)(uVar15 >> 0x3b) & ~(byte)((ulong)lVar43 >> 0x38),
                                  CONCAT16((byte)(uVar21 >> 0x30) & ~(byte)((ulong)lVar43 >> 0x30),
                                           CONCAT15((byte)(uVar21 >> 0x28) &
                                                    ~(byte)((ulong)lVar43 >> 0x28),
                                                    CONCAT14((byte)(uVar21 >> 0x20) &
                                                             ~(byte)((ulong)lVar43 >> 0x20),
                                                             CONCAT13((byte)(uVar21 >> 0x18) &
                                                                      ~(byte)((ulong)lVar43 >> 0x18)
                                                                      ,CONCAT12((byte)(uVar21 >>
                                                                                      0x10) &
                                                                                ~(byte)((ulong)
                                                  lVar43 >> 0x10),
                                                  CONCAT11((byte)(uVar21 >> 8) &
                                                           ~(byte)((ulong)lVar43 >> 8),
                                                           (byte)uVar21 & ~(byte)lVar43)))))));
                uVar15 = (ulong)(puVar19[9] == 0 || puVar19[10] == puVar19[9]);
                puVar17 = &uStack_190;
              }
            }
            else {
              if ((*puVar19 & 1) == 0) {
                uVar12 = puVar19[0xe] - puVar19[0xc] >> 3;
              }
              else {
                uVar15 = 0;
                if (puVar19[1] != 0) {
                  uVar15 = puVar19[4] - puVar19[2] >> 3;
                }
                uVar12 = 0;
                if (puVar19[5] != 0) {
                  uVar12 = puVar19[8] - puVar19[6] >> 3;
                }
                uVar12 = uVar15 + (puVar19[0xe] - puVar19[0xc] >> 3) + uVar12;
              }
              puVar17 = &uStack_108;
              uVar15 = uVar12;
            }
            uVar23 = 0;
            *puVar17 = uVar15;
            uVar15 = uVar12;
            if (uVar12 < 4) {
              uVar15 = 3;
            }
            if (uVar12 < 0x1fffffffffffffff) {
              lVar42 = uVar15 + 1;
              uVar16 = lVar42 * 8;
              if (uVar16 < 0x7ffffffffffffff9) {
                if (uVar16 == 0) {
                  lVar42 = 0;
                  pdVar14 = &MACH_HEADER.cpusubtype;
                }
                else {
                  uVar23 = 8;
                  pdVar14 = (dword *)func_0x00187bd0(uVar16,8);
                  if (pdVar14 == (dword *)0x0) goto LAB_005a030c;
                }
                *(long *)pdVar14 = lVar13;
                lStack_198 = 1;
                uStack_148 = puVar19[9];
                puStack_150 = (undefined8 *)puVar19[8];
                uStack_138 = puVar19[0xb];
                uStack_140 = puVar19[10];
                uStack_128 = puVar19[0xd];
                puStack_130 = (undefined8 *)puVar19[0xc];
                puStack_120 = (undefined8 *)puVar19[0xe];
                puStack_188 = (undefined8 *)puVar19[1];
                uStack_190 = *puVar19;
                uStack_178 = puVar19[3];
                uStack_180 = (undefined1)puVar19[2];
                uStack_17f = (undefined7)(puVar19[2] >> 8);
                uStack_168 = puVar19[5];
                puStack_170 = (undefined8 *)puVar19[4];
                uStack_158 = puVar19[7];
                puStack_160 = (undefined8 *)puVar19[6];
                lStack_1a8 = lVar42;
                pdStack_1a0 = pdVar14;
                do {
                  uVar16 = uStack_190;
                  lVar13 = lStack_198;
                  if (uStack_138 == 0) {
LAB_005a012c:
                    if ((int)uStack_190 != 1) goto LAB_005a02a0;
                    if (puStack_188 == (undefined8 *)0x0) goto LAB_005a0180;
                    puVar18 = (undefined8 *)CONCAT71(uStack_17f,uStack_180);
                    if ((undefined8 *)CONCAT71(uStack_17f,uStack_180) == puStack_170) {
                      do {
                        if (uStack_178 != 0) {
                          func_0x00187bd4(puStack_188,uStack_178 << 3,8);
                        }
                        puStack_188 = (undefined8 *)0x0;
LAB_005a0180:
                        if ((uStack_148 == 0) || (uStack_148 == uStack_140)) {
LAB_005a01b0:
                          if (uStack_168 == 0) goto LAB_005a02a0;
                          if (puStack_160 != puStack_150) {
                            uVar23 = *puStack_160;
                            puStack_160 = puStack_160 + 1;
                            goto joined_r0x005a01d8;
                          }
                          if (uStack_158 == 0) {
                            uStack_168 = 0;
                            goto LAB_005a02a0;
                          }
                          puVar11 = auStack_1b0;
                          puVar24 = (undefined *)0x5a029c;
                          goto code_r0x00187bd4;
                        }
                        uStack_148 = uStack_148 + 0x40;
                        func_0x005a54e8(&uStack_108);
                        if (uStack_108 == 0x8000000000000000) goto LAB_005a01b0;
                        puStack_170 = puStack_100 + lStack_f8;
                        puStack_188 = puStack_100;
                        uStack_180 = SUB81(puStack_100,0);
                        uStack_17f = (undefined7)((ulong)puStack_100 >> 8);
                        uStack_178 = uStack_108;
                        puVar18 = puStack_100;
                      } while (puStack_100 == puStack_170);
                    }
                    uVar23 = *puVar18;
                    uStack_180 = SUB81(puVar18 + 1,0);
                    uStack_17f = (undefined7)((ulong)(puVar18 + 1) >> 8);
joined_r0x005a01d8:
                    if (lVar13 == lStack_1a8) {
                      if ((int)uStack_190 == 1) {
                        auVar44[8] = uStack_180;
                        auVar44._0_8_ = puStack_188;
                        auVar1._8_8_ = uStack_168;
                        auVar1._0_8_ = puStack_170;
                        auVar44[9] = (char)uStack_17f;
                        auVar44[10] = (char)((uint7)uStack_17f >> 8);
                        auVar44[0xb] = (char)((uint7)uStack_17f >> 0x10);
                        auVar44[0xc] = (char)((uint7)uStack_17f >> 0x18);
                        auVar44[0xd] = (char)((uint7)uStack_17f >> 0x20);
                        auVar44[0xe] = (char)((uint7)uStack_17f >> 0x28);
                        auVar44[0xf] = (char)((uint7)uStack_17f >> 0x30);
                        auVar44 = NEON_ext(auVar1,auVar44,8,1);
                        lVar42 = -(ulong)(auVar44._0_8_ == 0);
                        lVar43 = -(ulong)(auVar44._8_8_ == 0);
                        uVar12 = (long)puStack_170 - CONCAT71(uStack_17f,uStack_180);
                        uVar16 = (ulong)((long)puStack_150 - (long)puStack_160) >> 3;
                        uVar15 = uVar12 >> 3;
                        uVar16 = CONCAT17((byte)((ulong)((long)puStack_150 - (long)puStack_160) >>
                                                0x3b) & ~(byte)((ulong)lVar42 >> 0x38),
                                          CONCAT16((byte)(uVar16 >> 0x30) &
                                                   ~(byte)((ulong)lVar42 >> 0x30),
                                                   CONCAT15((byte)(uVar16 >> 0x28) &
                                                            ~(byte)((ulong)lVar42 >> 0x28),
                                                            CONCAT14((byte)(uVar16 >> 0x20) &
                                                                     ~(byte)((ulong)lVar42 >> 0x20),
                                                                     CONCAT13((byte)(uVar16 >> 0x18)
                                                                              & ~(byte)((ulong)
                                                  lVar42 >> 0x18),
                                                  CONCAT12((byte)(uVar16 >> 0x10) &
                                                           ~(byte)((ulong)lVar42 >> 0x10),
                                                           CONCAT11((byte)(uVar16 >> 8) &
                                                                    ~(byte)((ulong)lVar42 >> 8),
                                                                    (byte)uVar16 & ~(byte)lVar42))))
                                                  ))) +
                                 CONCAT17((byte)(uVar12 >> 0x3b) & ~(byte)((ulong)lVar43 >> 0x38),
                                          CONCAT16((byte)(uVar15 >> 0x30) &
                                                   ~(byte)((ulong)lVar43 >> 0x30),
                                                   CONCAT15((byte)(uVar15 >> 0x28) &
                                                            ~(byte)((ulong)lVar43 >> 0x28),
                                                            CONCAT14((byte)(uVar15 >> 0x20) &
                                                                     ~(byte)((ulong)lVar43 >> 0x20),
                                                                     CONCAT13((byte)(uVar15 >> 0x18)
                                                                              & ~(byte)((ulong)
                                                  lVar43 >> 0x18),
                                                  CONCAT12((byte)(uVar15 >> 0x10) &
                                                           ~(byte)((ulong)lVar43 >> 0x10),
                                                           CONCAT11((byte)(uVar15 >> 8) &
                                                                    ~(byte)((ulong)lVar43 >> 8),
                                                                    (byte)uVar15 & ~(byte)lVar43))))
                                                  )));
                        uVar12 = (ulong)(uStack_148 == 0 || uStack_140 == uStack_148);
                        puVar19 = &uStack_108;
                      }
                      else {
                        uVar16 = 0;
                        uVar12 = 0;
                        puVar19 = &uStack_110;
                      }
LAB_005a0244:
                      *puVar19 = uVar12;
                      func_0x007af5a0(&lStack_1a8,lVar13,uVar16 + 1,8,8);
                      pdVar14 = pdStack_1a0;
                    }
                  }
                  else {
                    if (puStack_130 == puStack_120) {
                      if (uStack_128 == 0) {
                        uStack_138 = 0;
                        goto LAB_005a012c;
                      }
                      puVar11 = auStack_1b0;
                      puVar24 = (undefined *)0x5a0128;
                      goto code_r0x00187bd4;
                    }
                    puVar18 = puStack_130 + 1;
                    uVar23 = *puStack_130;
                    puStack_130 = puVar18;
                    if (lStack_198 == lStack_1a8) {
                      uVar16 = (ulong)((long)puStack_120 - (long)puVar18) >> 3;
                      if ((uStack_190 & 1) != 0) {
                        uVar12 = 0;
                        if (puStack_188 != (undefined8 *)0x0) {
                          uVar12 = (ulong)((long)puStack_170 - CONCAT71(uStack_17f,uStack_180)) >> 3
                          ;
                        }
                        uVar15 = 0;
                        if (uStack_168 != 0) {
                          uVar15 = (ulong)((long)puStack_150 - (long)puStack_160) >> 3;
                        }
                        uVar16 = uVar12 + uVar16 + uVar15;
                      }
                      puVar19 = &uStack_110;
                      uVar12 = uVar16;
                      goto LAB_005a0244;
                    }
                  }
                  *(undefined8 *)(pdVar14 + lVar13 * 2) = uVar23;
                  lStack_198 = lVar13 + 1;
                } while( true );
              }
            }
LAB_005a030c:
            func_0x007a1f00(uVar23,uVar16,auVar44._8_8_);
                    /* WARNING: Does not return */
            pcVar10 = (code *)SoftwareBreakpoint(1,0x5a0320);
            (*pcVar10)();
          }
          *extraout_x8_01 = 0;
          extraout_x8_01[1] = 8;
          extraout_x8_01[2] = 0;
          if ((puVar19[0xb] != 0) && (puVar19[0xd] != 0)) {
            puVar11 = auStack_1b0;
            puVar24 = &UNK_0059fefc;
code_r0x00187bd4:
            *(undefined8 ********)(puVar11 + -0x10) = unaff_x29;
            *(undefined **)(puVar11 + -8) = puVar24;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(code *)PTR__free_00a24e58)();
            return;
          }
          if (*puVar19 != 0) {
            if ((puVar19[1] != 0) && (puVar19[3] != 0)) {
              func_0x00187bd4(puVar19[1],puVar19[3] << 3,8);
            }
            if ((puVar19[5] != 0) && (puVar19[7] != 0)) {
              unaff_x29 = pppppppuStack_a0;
              puVar24 = uStack_98;
              goto code_r0x00187bd4;
            }
          }
          return;
        }
        if (uVar16 - 0x18 < 0xa8) {
          uVar16 = 0;
          lVar22 = lVar13;
        }
        else {
          uVar12 = (uVar16 - 0x18) / 0x18 + 1;
          uVar16 = uVar12 & 0x1ffffffffffffff8;
          lVar22 = lVar13 + uVar16 * 0x18;
          plVar20 = (long *)(lVar42 + 0x20);
          uVar15 = uVar16;
          do {
            plVar20[-3] = lVar13 + lVar3;
            plVar20[-4] = lVar13 + lVar2;
            plVar20[-1] = lVar13 + lVar5;
            plVar20[-2] = lVar13 + lVar4;
            plVar20[1] = lVar13 + lVar7;
            *plVar20 = lVar13 + lVar6;
            plVar20[3] = lVar13 + lVar9;
            plVar20[2] = lVar13 + lVar8;
            lVar13 = lVar13 + 0xc0;
            uVar15 = uVar15 - 8;
            plVar20 = plVar20 + 8;
          } while (uVar15 != 0);
          if (uVar12 == uVar16) goto code_r0x0059fe14;
        }
        do {
          *(long *)(lVar42 + uVar16 * 8) = lVar22;
          lVar22 = lVar22 + 0x18;
          uVar16 = uVar16 + 1;
        } while (lVar22 != auVar44._8_8_);
      }
code_r0x0059fe14:
      *extraout_x8_00 = lVar43;
      extraout_x8_00[1] = lVar42;
      extraout_x8_00[2] = uVar16;
      return;
    }
    uVar15 = uVar16 >> 4;
    if (uVar16 < 0x80) {
      uVar16 = 0;
    }
    else {
      uVar16 = uVar15 & 0xffffffffffffff8;
      uVar33 = (undefined1)_UNK_007fc2d8;
      uVar34 = (undefined1)((ulong)_UNK_007fc2d8 >> 8);
      uVar35 = (undefined1)((ulong)_UNK_007fc2d8 >> 0x10);
      uVar36 = (undefined1)((ulong)_UNK_007fc2d8 >> 0x18);
      uVar37 = (undefined1)((ulong)_UNK_007fc2d8 >> 0x20);
      uVar38 = (undefined1)((ulong)_UNK_007fc2d8 >> 0x28);
      uVar39 = (undefined1)((ulong)_UNK_007fc2d8 >> 0x30);
      uVar40 = (undefined1)((ulong)_UNK_007fc2d8 >> 0x38);
      uVar25 = (undefined1)_UNK_007fc2d0;
      uVar26 = (undefined1)((ulong)_UNK_007fc2d0 >> 8);
      uVar27 = (undefined1)((ulong)_UNK_007fc2d0 >> 0x10);
      uVar28 = (undefined1)((ulong)_UNK_007fc2d0 >> 0x18);
      uVar29 = (undefined1)((ulong)_UNK_007fc2d0 >> 0x20);
      uVar30 = (undefined1)((ulong)_UNK_007fc2d0 >> 0x28);
      uVar31 = (undefined1)((ulong)_UNK_007fc2d0 >> 0x30);
      uVar32 = (undefined1)((ulong)_UNK_007fc2d0 >> 0x38);
      plVar20 = (long *)(uVar12 + 0x20);
      uVar21 = uVar16;
      do {
        lVar42 = lVar13 + CONCAT17(uVar32,CONCAT16(uVar31,CONCAT15(uVar30,CONCAT14(uVar29,CONCAT13(
                                                  uVar28,CONCAT12(uVar27,CONCAT11(uVar26,uVar25)))))
                                                  )) * 0x10;
        lVar43 = lVar13 + CONCAT17(uVar40,CONCAT16(uVar39,CONCAT15(uVar38,CONCAT14(uVar37,CONCAT13(
                                                  uVar36,CONCAT12(uVar35,CONCAT11(uVar34,uVar33)))))
                                                  )) * 0x10;
        plVar20[-3] = lVar43 + 8;
        plVar20[-4] = lVar42 + 8;
        plVar20[-1] = lVar43 + 0x28;
        plVar20[-2] = lVar42 + 0x28;
        plVar20[1] = lVar43 + 0x48;
        *plVar20 = lVar42 + 0x48;
        plVar20[3] = lVar43 + 0x68;
        plVar20[2] = lVar42 + 0x68;
        lVar42 = CONCAT17(uVar32,CONCAT16(uVar31,CONCAT15(uVar30,CONCAT14(uVar29,CONCAT13(uVar28,
                                                  CONCAT12(uVar27,CONCAT11(uVar26,uVar25))))))) + 8;
        uVar25 = (undefined1)lVar42;
        uVar26 = (undefined1)((ulong)lVar42 >> 8);
        uVar27 = (undefined1)((ulong)lVar42 >> 0x10);
        uVar28 = (undefined1)((ulong)lVar42 >> 0x18);
        uVar29 = (undefined1)((ulong)lVar42 >> 0x20);
        uVar30 = (undefined1)((ulong)lVar42 >> 0x28);
        uVar31 = (undefined1)((ulong)lVar42 >> 0x30);
        uVar32 = (undefined1)((ulong)lVar42 >> 0x38);
        lVar42 = CONCAT17(uVar40,CONCAT16(uVar39,CONCAT15(uVar38,CONCAT14(uVar37,CONCAT13(uVar36,
                                                  CONCAT12(uVar35,CONCAT11(uVar34,uVar33))))))) + 8;
        uVar33 = (undefined1)lVar42;
        uVar34 = (undefined1)((ulong)lVar42 >> 8);
        uVar35 = (undefined1)((ulong)lVar42 >> 0x10);
        uVar36 = (undefined1)((ulong)lVar42 >> 0x18);
        uVar37 = (undefined1)((ulong)lVar42 >> 0x20);
        uVar38 = (undefined1)((ulong)lVar42 >> 0x28);
        uVar39 = (undefined1)((ulong)lVar42 >> 0x30);
        uVar40 = (undefined1)((ulong)lVar42 >> 0x38);
        uVar21 = uVar21 - 8;
        plVar20 = plVar20 + 8;
      } while (uVar21 != 0);
      if (uVar15 == uVar16) goto code_r0x0059fcd0;
    }
    lVar13 = lVar13 + uVar16 * 0x10 + 8;
    do {
      *(long *)(uVar12 + uVar16 * 8) = lVar13;
      uVar16 = uVar16 + 1;
      lVar13 = lVar13 + 0x10;
    } while (uVar15 != uVar16);
  }
code_r0x0059fcd0:
  *extraout_x8 = uVar15;
  extraout_x8[1] = uVar12;
  extraout_x8[2] = uVar15;
  return;
LAB_005a02a0:
  if (uVar16 != 0) {
    if ((puStack_188 != (undefined8 *)0x0) && (uStack_178 != 0)) {
      func_0x00187bd4(puStack_188,uStack_178 << 3,8);
    }
    if ((uStack_168 != 0) && (uStack_158 != 0)) {
      puVar11 = auStack_1b0;
      puVar24 = (undefined *)0x5a02dc;
      goto code_r0x00187bd4;
    }
  }
  extraout_x8_01[1] = (long)pdStack_1a0;
  *extraout_x8_01 = lStack_1a8;
  extraout_x8_01[2] = lStack_198;
  return;
}

