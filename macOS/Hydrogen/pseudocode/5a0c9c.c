
/* WARNING: Possible PIC construction at 0x005a11c4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a13fc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a14d4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a1510: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a12c4: Changing call to branch */
/* WARNING: Type propagation algorithm not settling */

void FUN_005a0c9c(void)

{
  char cVar1;
  long *plVar2;
  code *pcVar3;
  undefined1 *puVar4;
  bool bVar5;
  char cVar6;
  ulong *puVar7;
  undefined8 uVar8;
  unkbyte9 *pVar9;
  long lVar10;
  dword *pdVar11;
  dword *pdVar12;
  long *extraout_x8;
  ulong uVar13;
  long *plVar14;
  long *extraout_x8_00;
  ulong uVar15;
  long *plVar16;
  long *plVar17;
  long *plVar18;
  long lVar19;
  long *plVar20;
  dword *pdVar21;
  long *plVar22;
  long *plVar23;
  long *plVar24;
  dword *pdVar25;
  dword *pdVar26;
  ulong uVar27;
  ulong uVar28;
  undefined8 *******pppppppuVar29;
  undefined *puVar30;
  long lVar31;
  long lVar32;
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auStack_1c0 [8];
  long *plStack_1b8;
  long *plStack_1b0;
  dword *pdStack_1a8;
  long *plStack_1a0;
  dword *pdStack_198;
  long lStack_190;
  long *plStack_188;
  dword *pdStack_180;
  long lStack_178;
  dword *pdStack_170;
  long lStack_168;
  dword *pdStack_160;
  dword *pdStack_158;
  long lStack_150;
  dword *pdStack_148;
  dword *pdStack_140;
  long *plStack_138;
  long lStack_130;
  long *plStack_128;
  long *plStack_120;
  long *plStack_118;
  ulong *puStack_100;
  ulong uStack_f8;
  ulong uStack_f0;
  long *plStack_e8;
  long lStack_e0;
  long *plStack_d8;
  long *plStack_d0;
  undefined8 uStack_c8;
  long lStack_c0;
  undefined8 uStack_b8;
  undefined8 *******pppppppuStack_b0;
  undefined *puStack_a8;
  undefined1 auStack_a0 [8];
  long *plStack_98;
  ulong uStack_90;
  uint uStack_84;
  long *plStack_80;
  long lStack_78;
  dword *pdStack_70;
  long lStack_68;
  
  auVar33 = __Unwind_Resume();
  auVar33._0_8_ = auVar33._0_8_;
  puVar4 = auStack_a0;
  uVar27 = *auVar33._0_8_;
  plVar16 = (long *)auVar33._0_8_[1];
  uStack_90 = auVar33._0_8_[2];
  plVar23 = (long *)auVar33._0_8_[3];
  plVar18 = (long *)auVar33._0_8_[8];
  plStack_80 = (long *)auVar33._0_8_[9];
  plVar22 = plVar16;
  if (uVar27 == 2) {
    if (plVar18 != (long *)0x0 && plVar18 != plStack_80) {
code_r0x005a0de4:
      plVar23 = plVar18 + 0x10;
      auVar33._0_8_[8] = (ulong)plVar23;
      plVar14 = plVar18 + 8;
      lVar10 = *plVar18;
      uStack_90 = 1;
      auVar33._0_8_[2] = 1;
      auVar33._0_8_[3] = (ulong)plVar14;
      *auVar33._0_8_ = 1;
      auVar33._0_8_[1] = 0;
      if (lVar10 != 0xc) {
        plVar22 = (long *)0x0;
        uVar27 = 1;
        plVar16 = plVar18;
        plVar18 = plVar23;
        goto code_r0x005a0e4c;
      }
      plVar22 = (long *)0x0;
      uVar27 = 0;
      uVar15 = 0;
      *auVar33._0_8_ = 0;
      auVar33._0_8_[3] = 0;
      uVar28 = auVar33._0_8_[4];
      uStack_90 = 1;
      plVar18 = plVar23;
      plVar16 = plVar14;
      plVar23 = (long *)0x0;
      goto joined_r0x005a0e34;
    }
code_r0x005a0cf8:
    if (auVar33._0_8_[4] == 2) goto code_r0x005a0d88;
    if ((auVar33._0_8_[4] & 1) == 0) {
code_r0x005a0d18:
      if ((int)auVar33._0_8_[6] == 1) {
        plVar16 = (long *)auVar33._0_8_[7];
        auVar33._0_8_[7] = 0;
        if (plVar16 != (long *)0x0) goto code_r0x005a0d30;
      }
      auVar33._0_8_[4] = 2;
code_r0x005a0d88:
      *extraout_x8 = 0;
      extraout_x8[1] = 8;
      extraout_x8[2] = 0;
      return;
    }
    plVar16 = (long *)auVar33._0_8_[5];
    auVar33._0_8_[5] = 0;
    if (plVar16 == (long *)0x0) {
      auVar33._0_8_[4] = 0;
      goto code_r0x005a0d18;
    }
code_r0x005a0d30:
    uVar27 = 2;
    uVar28 = auVar33._0_8_[4];
joined_r0x005a0eac:
    uVar15 = 0;
    if (uVar28 == 2) goto code_r0x005a0eec;
code_r0x005a0eb0:
    if ((uVar28 & 1) == 0) {
      if ((auVar33._0_8_[6] & 1) != 0) {
        uVar13 = auVar33._0_8_[7];
        goto code_r0x005a0efc;
      }
      goto code_r0x005a0eec;
    }
    if ((auVar33._0_8_[6] & 1) == 0) {
      uVar13 = auVar33._0_8_[5];
code_r0x005a0efc:
      uVar13 = (ulong)(uVar13 != 0);
    }
    else {
      uVar13 = (ulong)(auVar33._0_8_[7] != 0);
      if (auVar33._0_8_[5] != 0) {
        uVar13 = uVar13 + 1;
      }
    }
  }
  else {
    if ((uVar27 & 1) == 0) {
joined_r0x005a0d78:
      if (((uStack_90 & 1) == 0) || (auVar33._0_8_[3] = 0, plVar23 == (long *)0x0)) {
        *auVar33._0_8_ = 2;
        if (plVar18 == (long *)0x0 || plVar18 == plStack_80) goto code_r0x005a0cf8;
        goto code_r0x005a0de4;
      }
      plVar14 = (long *)0x0;
      plVar16 = plVar23;
      if ((uVar27 & 1) != 0) goto code_r0x005a0e4c;
      uVar28 = auVar33._0_8_[4];
      plVar23 = plVar14;
      goto joined_r0x005a0eac;
    }
    auVar33._0_8_[1] = 0;
    if (plVar16 == (long *)0x0) {
      uVar27 = 0;
      *auVar33._0_8_ = 0;
      plVar22 = (long *)0x0;
      goto joined_r0x005a0d78;
    }
    plVar22 = (long *)0x0;
    if ((uStack_90 & 1) == 0) {
      uVar28 = auVar33._0_8_[4];
      goto joined_r0x005a0eac;
    }
    plVar14 = plVar23;
code_r0x005a0e4c:
    uVar15 = (ulong)(plVar14 != (long *)0x0);
    if (plVar22 != (long *)0x0) {
      uVar15 = uVar15 + 1;
    }
    uVar28 = auVar33._0_8_[4];
    plVar23 = plVar14;
joined_r0x005a0e34:
    if (uVar28 != 2) goto code_r0x005a0eb0;
code_r0x005a0eec:
    uVar13 = 0;
  }
  uVar13 = uVar13 + uVar15;
  if (uVar13 < 4) {
    uVar13 = 3;
  }
  lVar10 = uVar13 + 1;
  lVar19 = lVar10 * 8;
  plStack_98 = extraout_x8;
  puVar7 = (ulong *)func_0x00187bd0(lVar19,8);
  if (puVar7 != (ulong *)0x0) {
    *puVar7 = (ulong)plVar16;
    lStack_68 = 1;
    uStack_84 = (uint)auVar33._0_8_[6];
    plVar14 = (long *)auVar33._0_8_[7];
    uVar15 = uStack_90;
    plVar16 = (long *)auVar33._0_8_[5];
    lStack_78 = lVar10;
    pdStack_70 = (dword *)puVar7;
    do {
      lVar10 = lStack_68;
      plVar17 = plVar23;
      plVar20 = plVar22;
      plVar24 = plVar16;
      plVar2 = plVar14;
      if (uVar27 == 2) {
LAB_005a0fe8:
        if ((plVar18 == (long *)0x0) || (plVar18 == plStack_80)) {
          if (uVar28 == 2) {
LAB_005a1168:
            plStack_98[1] = (long)pdStack_70;
            *plStack_98 = lStack_78;
            plStack_98[2] = lStack_68;
            return;
          }
          if ((uVar28 & 1) != 0) {
            if (plVar16 != (long *)0x0) {
              uVar27 = 2;
              plVar24 = (long *)0x0;
              plVar23 = plVar16;
              goto LAB_005a1094;
            }
            uVar28 = 0;
            plVar16 = (long *)0x0;
          }
          if ((uStack_84 & plVar14 != (long *)0x0) != 1) goto LAB_005a1168;
          uVar27 = 2;
          plVar24 = plVar16;
          plVar2 = (long *)0x0;
          plVar23 = plVar14;
        }
        else {
          lVar19 = *plVar18;
          plVar23 = plVar18;
          plVar17 = plVar18 + 8;
          if (lVar19 == 0xc) {
            plVar17 = (long *)0x0;
            plVar23 = plVar18 + 8;
          }
          plVar18 = plVar18 + 0x10;
          uVar15 = 1;
          plVar20 = (long *)0x0;
          uVar27 = (ulong)(lVar19 != 0xc);
        }
      }
      else if ((uVar27 & 1) == 0) {
        if ((uVar15 & 1) == 0) goto code_r0x005a0fe4;
LAB_005a0fc4:
        plVar17 = (long *)0x0;
        if (plVar23 == (long *)0x0) goto LAB_005a0fe8;
      }
      else {
        plVar20 = (long *)0x0;
        if (plVar22 == (long *)0x0) {
          uVar27 = 0;
          plVar22 = plVar20;
          if ((uVar15 & 1) != 0) goto LAB_005a0fc4;
code_r0x005a0fe4:
          plVar20 = plVar22;
          goto LAB_005a0fe8;
        }
        plVar23 = plVar22;
      }
LAB_005a1094:
      plVar14 = plVar2;
      if (lStack_68 == lStack_78) {
        bVar5 = plVar20 != (long *)0x0;
        cVar1 = bVar5;
        if (plVar17 != (long *)0x0) {
          cVar1 = bVar5 + '\x01';
        }
        if ((uVar15 & 1) == 0) {
          cVar1 = bVar5;
        }
        cVar6 = (uVar15 & 1) != 0 && plVar17 != (long *)0x0;
        if ((uVar27 & 1) != 0) {
          cVar6 = cVar1;
        }
        cVar1 = '\0';
        if (uVar27 != 2) {
          cVar1 = cVar6;
        }
        if (uVar28 == 2) {
LAB_005a10e8:
          cVar6 = '\0';
        }
        else if ((uVar28 & 1) == 0) {
          if ((uStack_84 & 1) == 0) goto LAB_005a10e8;
          cVar6 = plVar14 != (long *)0x0;
        }
        else {
          cVar6 = plVar24 != (long *)0x0;
          if (((uStack_84 & 1) != 0) && (plVar14 != (long *)0x0)) {
            cVar6 = cVar6 + '\x01';
          }
        }
        func_0x007af5a0(&lStack_78,lStack_68,cVar1 + cVar6 + '\x01',8,8);
        puVar7 = (ulong *)pdStack_70;
      }
      puVar7[lVar10] = (ulong)plVar23;
      lStack_68 = lVar10 + 1;
      plVar22 = plVar20;
      plVar23 = plVar17;
      plVar16 = plVar24;
    } while( true );
  }
  uVar8 = func_0x007a1f00(8,lVar19,auVar33._8_8_);
  if (lStack_78 == 0) {
    auVar34 = __Unwind_Resume(uVar8);
    pVar9 = auVar34._0_8_;
    puStack_a8 = &DAT_005a11d0;
    puStack_100 = auVar33._0_8_;
    uStack_f8 = uVar28;
    uStack_f0 = uVar27;
    plStack_e8 = plVar18;
    lStack_e0 = lVar10;
    plStack_d8 = plVar23;
    plStack_d0 = plVar22;
    uStack_c8 = auVar33._8_8_;
    lStack_c0 = lVar19;
    uStack_b8 = uVar8;
    pppppppuStack_b0 = (undefined8 *******)((long)register0x00000008 + -0x10);
    lVar10 = func_0x0059c5e4();
    pppppppuVar29 = &pppppppuStack_b0;
    if (lVar10 != 0) {
      lVar19 = *(long *)((long)pVar9 + 8);
      auVar33[9] = (char)((ulong)lVar19 >> 8);
      auVar33._0_9_ = *pVar9;
      auVar33[10] = (char)((ulong)lVar19 >> 0x10);
      auVar33[0xb] = (char)((ulong)lVar19 >> 0x18);
      auVar33[0xc] = (char)((ulong)lVar19 >> 0x20);
      auVar33[0xd] = (char)((ulong)lVar19 >> 0x28);
      auVar33[0xe] = (char)((ulong)lVar19 >> 0x30);
      auVar33[0xf] = (char)((ulong)lVar19 >> 0x38);
      auVar33 = NEON_ext(*(undefined1 (*) [16])((long)pVar9 + 0x18),auVar33,8,1);
      lVar31 = -(ulong)(auVar33._0_8_ == 0);
      lVar32 = -(ulong)(auVar33._8_8_ == 0);
      uVar27 = *(long *)((long)pVar9 + 0x38) - *(long *)((long)pVar9 + 0x28);
      uVar15 = *(long *)*(undefined1 (*) [16])((long)pVar9 + 0x18) - lVar19;
      uVar28 = uVar27 >> 3;
      uVar13 = uVar15 >> 3;
      uVar28 = CONCAT17((byte)(uVar27 >> 0x3b) & ~(byte)((ulong)lVar31 >> 0x38),
                        CONCAT16((byte)(uVar28 >> 0x30) & ~(byte)((ulong)lVar31 >> 0x30),
                                 CONCAT15((byte)(uVar28 >> 0x28) & ~(byte)((ulong)lVar31 >> 0x28),
                                          CONCAT14((byte)(uVar28 >> 0x20) &
                                                   ~(byte)((ulong)lVar31 >> 0x20),
                                                   CONCAT13((byte)(uVar28 >> 0x18) &
                                                            ~(byte)((ulong)lVar31 >> 0x18),
                                                            CONCAT12((byte)(uVar28 >> 0x10) &
                                                                     ~(byte)((ulong)lVar31 >> 0x10),
                                                                     CONCAT11((byte)(uVar28 >> 8) &
                                                                              ~(byte)((ulong)lVar31
                                                                                     >> 8),
                                                                              (byte)uVar28 &
                                                                              ~(byte)lVar31))))))) +
               CONCAT17((byte)(uVar15 >> 0x3b) & ~(byte)((ulong)lVar32 >> 0x38),
                        CONCAT16((byte)(uVar13 >> 0x30) & ~(byte)((ulong)lVar32 >> 0x30),
                                 CONCAT15((byte)(uVar13 >> 0x28) & ~(byte)((ulong)lVar32 >> 0x28),
                                          CONCAT14((byte)(uVar13 >> 0x20) &
                                                   ~(byte)((ulong)lVar32 >> 0x20),
                                                   CONCAT13((byte)(uVar13 >> 0x18) &
                                                            ~(byte)((ulong)lVar32 >> 0x18),
                                                            CONCAT12((byte)(uVar13 >> 0x10) &
                                                                     ~(byte)((ulong)lVar32 >> 0x10),
                                                                     CONCAT11((byte)(uVar13 >> 8) &
                                                                              ~(byte)((ulong)lVar32
                                                                                     >> 8),
                                                                              (byte)uVar13 &
                                                                              ~(byte)lVar32)))))));
      uVar27 = uVar28;
      if (uVar28 < 4) {
        uVar27 = 3;
      }
      lVar19 = uVar27 + 1;
      uVar27 = lVar19 * 8;
      if (0x1ffffffffffffffe < uVar28 || 0x7ffffffffffffff8 < uVar27) {
        uVar8 = 0;
code_r0x005a1570:
        func_0x007a1f00(uVar8,uVar27,auVar34._8_8_);
code_r0x005a1580:
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x5a1584);
        (*pcVar3)();
      }
      plStack_1b8 = extraout_x8_00;
      if (uVar27 == 0) {
        lVar19 = 0;
        pdVar11 = &MACH_HEADER.cpusubtype;
      }
      else {
        uVar8 = 8;
        pdVar11 = (dword *)func_0x00187bd0(uVar27,8);
        if (pdVar11 == (dword *)0x0) goto code_r0x005a1570;
      }
      *(long *)pdVar11 = lVar10;
      lStack_168 = 1;
      pdVar21 = *(dword **)((long)pVar9 + 8);
      pdVar25 = *(dword **)pVar9;
      pdVar12 = *(dword **)((long)pVar9 + 0x18);
      lStack_190 = *(long *)(pVar9 + 1);
      plStack_188 = *(long **)((long)pVar9 + 0x38);
      lStack_130 = *(long *)(pVar9 + 3);
      plStack_1a0 = *(long **)((long)pVar9 + 0x48);
      plVar18 = *(long **)(pVar9 + 4);
      plVar16 = *(long **)((long)pVar9 + 0x28);
      pdStack_180 = *(dword **)(pVar9 + 2);
      pdVar26 = pdVar21;
      plStack_1b0 = plVar16;
      pdStack_1a8 = pdVar12;
      pdStack_198 = pdVar25;
      lStack_178 = lVar19;
      pdStack_170 = pdVar11;
      pdStack_160 = pdVar25;
      pdStack_158 = pdVar21;
      lStack_150 = lStack_190;
      pdStack_148 = pdVar12;
      pdStack_140 = pdStack_180;
      plStack_138 = plVar16;
      plStack_128 = plStack_188;
      plStack_120 = plVar18;
      plStack_118 = plStack_1a0;
      do {
        lVar10 = lStack_168;
        plVar23 = plVar18;
        if (pdVar25 == (dword *)0x0) goto code_r0x005a140c;
        pdStack_70 = pdVar25;
        if (pdVar26 == pdVar12) {
          do {
            if (lStack_190 != 0) {
              lStack_78 = lStack_190 << 3;
              puVar4 = auStack_1c0;
              puVar30 = &UNK_005a1400;
              goto code_r0x00187bd4;
            }
            pdStack_198 = (dword *)0x0;
            plVar23 = plVar18;
            pdVar12 = pdVar26;
code_r0x005a140c:
            if ((plVar23 == (long *)0x0) || (plVar23 == plStack_1a0)) {
              if (pdStack_180 != (dword *)0x0) {
                if (plVar16 != plStack_188) {
                  pdVar25 = (dword *)0x0;
                  plStack_1b0 = plVar16 + 1;
                  lVar19 = *plVar16;
                  plVar16 = plStack_1b0;
                  plVar18 = plVar23;
                  goto joined_r0x005a14b8;
                }
                if (lStack_130 != 0) {
                  lStack_78 = lStack_130 << 3;
                  puVar4 = auStack_1c0;
                  pdStack_70 = pdStack_180;
                  puVar30 = &UNK_005a14d8;
                  goto code_r0x00187bd4;
                }
                pdStack_140 = (dword *)0x0;
              }
              if ((pdStack_198 != (dword *)0x0) && (lStack_190 != 0)) {
                func_0x00187bd4(pdStack_198,lStack_190 << 3,8);
              }
              if ((pdStack_140 == (dword *)0x0) || (lStack_130 == 0)) {
                plStack_1b8[1] = (long)pdStack_170;
                *plStack_1b8 = lStack_178;
                plStack_1b8[2] = lStack_168;
                return;
              }
              lStack_78 = lStack_130 << 3;
              puVar4 = auStack_1c0;
              pdStack_70 = pdStack_140;
              puVar30 = &UNK_005a1514;
              goto code_r0x00187bd4;
            }
            lVar19 = 0;
            plVar18 = plVar23 + 3;
            pdVar12 = &MACH_HEADER.cpusubtype;
            if (*plVar23 == -0x8000000000000000) {
              pdVar12 = (dword *)func_0x00187bd0(8,8);
              if (pdVar12 == (dword *)0x0) {
                pdStack_160 = pdStack_198;
                lStack_150 = lStack_190;
                pdStack_148 = pdStack_1a8;
                plStack_138 = plStack_1b0;
                pdStack_158 = pdVar21;
                plStack_120 = plVar18;
                func_0x007a1f18(8,8);
                goto code_r0x005a1580;
              }
              *(long **)pdVar12 = plVar23 + 1;
              lVar19 = 1;
            }
            pdVar21 = pdVar12;
            pdVar12 = pdVar21 + lVar19 * 2;
            pdVar25 = pdVar21;
            pdStack_70 = pdVar21;
            pdVar26 = pdVar21;
            pdStack_1a8 = pdVar12;
            pdStack_198 = pdVar21;
            lStack_190 = lVar19;
          } while (pdVar21 == pdVar12);
        }
        pdVar21 = pdVar26 + 2;
        lVar19 = *(long *)pdVar26;
        pdVar26 = pdVar21;
joined_r0x005a14b8:
        if (lVar10 == lStack_178) {
          uVar27 = 0;
          if (pdVar25 != (dword *)0x0) {
            uVar27 = (ulong)((long)pdVar12 - (long)pdVar26) >> 3;
          }
          lVar31 = 1;
          if (pdStack_180 != (dword *)0x0) {
            lVar31 = ((ulong)((long)plStack_188 - (long)plVar16) >> 3) + 1;
          }
          func_0x007af5a0(&lStack_178,lVar10,uVar27 + lVar31,8,8);
          pdVar11 = pdStack_170;
        }
        *(long *)(pdVar11 + lVar10 * 2) = lVar19;
        lStack_168 = lVar10 + 1;
      } while( true );
    }
    *extraout_x8_00 = 0;
    extraout_x8_00[1] = 8;
    extraout_x8_00[2] = 0;
    pdStack_70 = *(dword **)pVar9;
    if ((pdStack_70 == (dword *)0x0) || (*(long *)(pVar9 + 1) == 0)) {
      pdStack_70 = *(dword **)(pVar9 + 2);
      if ((pdStack_70 == (dword *)0x0) || (*(long *)(pVar9 + 3) == 0)) {
        return;
      }
      lStack_78 = *(long *)(pVar9 + 3) << 3;
      pppppppuVar29 = pppppppuStack_b0;
      puVar30 = puStack_a8;
    }
    else {
      lStack_78 = *(long *)(pVar9 + 1) << 3;
      puVar4 = auStack_1c0;
      puVar30 = &UNK_005a12c8;
    }
  }
  else {
    lStack_78 = lStack_78 << 3;
    puVar4 = auStack_a0;
    pppppppuVar29 = (undefined8 *******)((long)register0x00000008 + -0x10);
    puVar30 = &UNK_005a11c8;
  }
code_r0x00187bd4:
  *(undefined8 ********)(puVar4 + -0x10) = pppppppuVar29;
  *(undefined **)(puVar4 + -8) = puVar30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(pdStack_70,lStack_78,8);
  return;
}

