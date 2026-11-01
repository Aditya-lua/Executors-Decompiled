
/* WARNING: Type propagation algorithm not settling */

void FUN_004e60f0(void)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  undefined8 *puVar4;
  dword *pdVar5;
  undefined8 uVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  long *plVar10;
  long *extraout_x8;
  ulong uVar11;
  long *extraout_x8_00;
  long *extraout_x8_01;
  long lVar12;
  long *extraout_x8_02;
  long *extraout_x8_03;
  undefined8 *puVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  undefined8 uVar19;
  ulong uVar20;
  undefined8 *puVar21;
  long lVar22;
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined8 uStack_2b0;
  long lStack_2a8;
  long *plStack_2a0;
  long lStack_298;
  long lStack_290;
  undefined8 *puStack_288;
  undefined8 *puStack_280;
  undefined8 uStack_278;
  long lStack_270;
  long lStack_268;
  long lStack_260;
  long lStack_258;
  long lStack_250;
  undefined8 uStack_248;
  undefined1 ****ppppuStack_240;
  undefined8 uStack_238;
  long lStack_228;
  long *plStack_220;
  long lStack_218;
  long lStack_210;
  long lStack_208;
  long lStack_200;
  undefined8 uStack_1f8;
  undefined1 ***pppuStack_1f0;
  undefined *puStack_1e8;
  long lStack_1d8;
  long *plStack_1d0;
  long lStack_1c8;
  long lStack_1c0;
  undefined *puStack_1b8;
  long lStack_1b0;
  long *plStack_1a8;
  long lStack_1a0;
  undefined8 uStack_198;
  undefined1 **ppuStack_190;
  undefined *puStack_188;
  long lStack_180;
  undefined8 *puStack_178;
  long lStack_170;
  long *plStack_168;
  long *plStack_160;
  long lStack_158;
  undefined8 *puStack_150;
  long lStack_148;
  undefined1 *puStack_f0;
  undefined8 uStack_e8;
  long lStack_d8;
  dword *pdStack_d0;
  long lStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  long lStack_70;
  long lStack_68;
  undefined1 auStack_6 [6];
  
  func_0x00187bd4();
  func_0x00174b7c();
  __Unwind_Resume();
  auVar23 = func_0x007a2668();
  puVar4 = auVar23._0_8_;
  auVar24 = func_0x005211c0();
  if (auVar24._0_8_ == 0) {
    *extraout_x8 = 0;
    extraout_x8[1] = 8;
    extraout_x8[2] = 0;
  }
  else {
    uVar11 = 0;
    if (puVar4[10] != 0) {
      uVar11 = (ulong)(puVar4[0xb] - puVar4[10]) >> 4;
    }
    uVar19 = 0;
    uVar20 = uVar11;
    if (uVar11 < 4) {
      uVar20 = 3;
    }
    lVar14 = uVar20 + 1;
    uVar20 = lVar14 * 0x10;
    if ((uVar11 == 0xfffffffffffffff) || (0x7ffffffffffffff8 < uVar20)) {
code_r0x004e62dc:
      uVar19 = func_0x007a1f00(uVar19,uVar20,auVar23._8_8_);
      if (lStack_d8 != 0) {
        func_0x00187bd4(pdStack_d0,lStack_d8 << 4,8);
      }
      auVar23 = __Unwind_Resume(uVar19);
      plStack_168 = auVar23._8_8_;
      plVar7 = auVar23._0_8_;
      uStack_e8 = 0x4e6310;
      puVar4 = (undefined8 *)plVar7[1];
      plStack_160 = extraout_x8_00;
      if ((undefined8 *)*plVar7 != puVar4) {
        lVar14 = plVar7[2];
        lVar18 = plVar7[3];
        puVar13 = (undefined8 *)*plVar7;
        puStack_f0 = auStack_6 + -10;
        do {
          puVar21 = puVar13 + 2;
          *plVar7 = (long)puVar21;
          iVar3 = func_0x005175a8(lVar14,puVar13,&UNK_008a7780);
          if ((iVar3 != 0) && (*(long *)(lVar18 + 0x90) != 0)) {
            uVar19 = *puVar13;
            lVar17 = puVar13[1];
            puVar13 = (undefined8 *)(*(long *)(lVar18 + 0x88) + 0x218);
            lVar16 = *(long *)(lVar18 + 0x90) * 600;
            do {
              if ((puVar13[1] == lVar17) && (iVar3 = _memcmp(*puVar13,uVar19,lVar17), iVar3 == 0)) {
                if ((*(byte *)(puVar13 + 7) >> 2 & 1) == 0) {
                  puStack_178 = (undefined8 *)func_0x00187bd0(0x40,8);
                  if (puStack_178 == (undefined8 *)0x0) {
                    plVar10 = plStack_168;
                    uVar6 = func_0x007a1f00(8,0x40);
                    if (lStack_158 != 0) {
                      plVar10 = (long *)0x8;
                      func_0x00187bd4(puStack_150,lStack_158 << 4);
                    }
                    auVar23 = __Unwind_Resume(uVar6);
                    lVar22 = auVar23._8_8_;
                    puStack_1b8 = &UNK_008a7780;
                    puStack_188 = &DAT_004e65cc;
                    lVar12 = auVar23._0_8_;
                    do {
                      lVar1 = lVar12;
                      lVar12 = lVar1 + 600;
                      if (lVar1 == lVar22) {
                        *extraout_x8_01 = 0;
                        extraout_x8_01[1] = 8;
                        extraout_x8_01[2] = 0;
                        return;
                      }
                    } while ((*(long *)(lVar1 + 0x228) == 0) &&
                            (*(int *)(lVar1 + 0x248) == 0x110000));
                    lStack_1c0 = lVar17;
                    lStack_1b0 = lVar16;
                    plStack_1a8 = plVar7;
                    lStack_1a0 = lVar14;
                    uStack_198 = uVar6;
                    ppuStack_190 = &puStack_f0;
                    plVar7 = (long *)func_0x00187bd0(0x20,8);
                    if (plVar7 != (long *)0x0) {
                      *plVar7 = lVar1;
                      lStack_1d8 = 4;
                      lVar14 = 1;
                      plStack_1d0 = plVar7;
                      while( true ) {
                        lVar18 = lVar12;
                        if (lVar18 == lVar22) break;
                        lVar12 = lVar18 + 600;
                        if ((*(long *)(lVar18 + 0x228) != 0) ||
                           (*(int *)(lVar18 + 0x248) != 0x110000)) {
                          if (lVar14 == lStack_1d8) {
                            lStack_1c8 = lVar14;
                            func_0x007a5594(&lStack_1d8,lVar14,1,8,8);
                            plVar7 = plStack_1d0;
                          }
                          plVar7[lVar14] = lVar18;
                          lVar14 = lVar14 + 1;
                        }
                      }
                      extraout_x8_01[1] = (long)plStack_1d0;
                      *extraout_x8_01 = lStack_1d8;
                      extraout_x8_01[2] = lVar14;
                      return;
                    }
                    lVar14 = (long)plVar10;
                    uVar6 = func_0x007a1f00(8,0x20);
                    if (lStack_1d8 != 0) {
                      lVar14 = 8;
                      func_0x00187bd4(plStack_1d0,lStack_1d8 << 3);
                    }
                    auVar23 = __Unwind_Resume(uVar6);
                    lVar9 = auVar23._8_8_;
                    puStack_1e8 = &DAT_004e671c;
                    lVar16 = auVar23._0_8_;
                    do {
                      lVar8 = lVar16;
                      if (lVar8 == lVar9) {
                        *extraout_x8_02 = 0;
                        extraout_x8_02[1] = 8;
                        extraout_x8_02[2] = 0;
                        return;
                      }
                      lVar16 = lVar8 + 600;
                    } while ((*(long *)(lVar8 + 0x228) != 0) ||
                            (*(int *)(lVar8 + 0x248) != 0x110000));
                    lStack_210 = lVar12;
                    lStack_208 = (long)plVar10;
                    lStack_200 = lVar22;
                    uStack_1f8 = uVar6;
                    pppuStack_1f0 = &ppuStack_190;
                    plVar7 = (long *)func_0x00187bd0(0x20,8);
                    if (plVar7 != (long *)0x0) {
                      *plVar7 = lVar8;
                      lStack_228 = 4;
                      lStack_218 = 1;
                      plStack_220 = plVar7;
                      lVar14 = lStack_218;
                      while (lVar18 = lVar16, lVar18 != lVar9) {
                        lVar16 = lVar18 + 600;
                        if ((*(long *)(lVar18 + 0x228) == 0) &&
                           (*(int *)(lVar18 + 0x248) == 0x110000)) {
                          if (lVar14 == lStack_228) {
                            lStack_218 = lVar14;
                            func_0x007a5594(&lStack_228,lVar14,1,8,8);
                            plVar7 = plStack_220;
                          }
                          plVar7[lVar14] = lVar18;
                          lVar14 = lVar14 + 1;
                        }
                      }
                      extraout_x8_02[1] = (long)plStack_220;
                      *extraout_x8_02 = lStack_228;
                      extraout_x8_02[2] = lVar14;
                      return;
                    }
                    lVar12 = lVar14;
                    uVar6 = func_0x007a1f00(8,0x20,lVar14);
                    if (lStack_228 != 0) {
                      lVar12 = 8;
                      func_0x00187bd4(plStack_220,lStack_228 << 3,8);
                    }
                    auVar23 = __Unwind_Resume(uVar6);
                    uStack_238 = 0x4e6884;
                    lVar22 = auVar23._0_8_;
                    do {
                      lVar8 = lVar22;
                      if (lVar8 == auVar23._8_8_) {
                        *extraout_x8_03 = 0;
                        extraout_x8_03[1] = 8;
                        extraout_x8_03[2] = 0;
                        return;
                      }
                      lVar22 = lVar8 + 0x48;
                    } while ((*(byte *)(lVar8 + 0x40) & 1) != 0);
                    lVar15 = *(long *)(lVar8 + 0x38);
                    lStack_290 = lVar18;
                    puStack_288 = puVar21;
                    puStack_280 = puVar4;
                    uStack_278 = uVar19;
                    lStack_270 = lVar17;
                    lStack_268 = lVar1;
                    lStack_260 = lVar16;
                    lStack_258 = lVar14;
                    lStack_250 = lVar9;
                    uStack_248 = uVar6;
                    ppppuStack_240 = &pppuStack_1f0;
                    if (lVar15 < 0) {
                      uVar6 = 0;
code_r0x004e6a5c:
                      func_0x007a1f00(uVar6,lVar15,&UNK_009e7fe0);
                      lVar12 = lVar17;
code_r0x004e6a70:
                      lVar17 = lVar12;
                      uStack_2b0 = 0;
code_r0x004e6a7c:
                      func_0x007a1f00(uStack_2b0,lVar17,&UNK_009e7fe0);
code_r0x004e6a90:
                    /* WARNING: Does not return */
                      pcVar2 = (code *)SoftwareBreakpoint(1,0x4e6a94);
                      (*pcVar2)();
                    }
                    if (lVar15 == 0) {
                      lVar14 = 1;
                      plVar7 = (long *)func_0x00187bd0(0x60,8);
                    }
                    else {
                      uVar19 = *(undefined8 *)(lVar8 + 0x30);
                      uVar6 = 1;
                      lVar14 = func_0x00187bd0(lVar15,1);
                      lVar17 = lVar12;
                      if (lVar14 == 0) goto code_r0x004e6a5c;
                      _memcpy(lVar14,uVar19,lVar15);
                      plVar7 = (long *)func_0x00187bd0(0x60,8);
                    }
                    if (plVar7 == (long *)0x0) {
                      func_0x007a1f00(8,0x60,lVar12);
                      goto code_r0x004e6a90;
                    }
                    *plVar7 = lVar15;
                    plVar7[1] = lVar14;
                    plVar7[2] = lVar15;
                    uStack_2b0 = 1;
                    lStack_2a8 = 4;
                    lVar14 = 1;
                    plStack_2a0 = plVar7;
                    do {
                      do {
                        lVar18 = lVar22;
                        if (lVar18 == auVar23._8_8_) {
                          extraout_x8_03[1] = (long)plStack_2a0;
                          *extraout_x8_03 = lStack_2a8;
                          extraout_x8_03[2] = lVar14;
                          return;
                        }
                        lVar22 = lVar18 + 0x48;
                      } while ((*(byte *)(lVar18 + 0x40) & 1) != 0);
                      lVar17 = *(long *)(lVar18 + 0x38);
                      lStack_298 = lVar14;
                      if (lVar17 < 0) goto code_r0x004e6a70;
                      if (lVar17 == 0) {
                        lVar12 = 1;
                      }
                      else {
                        uVar19 = *(undefined8 *)(lVar18 + 0x30);
                        lVar12 = func_0x00187bd0(lVar17,1);
                        if (lVar12 == 0) goto code_r0x004e6a7c;
                        _memcpy(lVar12,uVar19,lVar17);
                      }
                      if (lVar14 == lStack_2a8) {
                        func_0x007a5594(&lStack_2a8,lVar14,1,8,0x18);
                        plVar7 = plStack_2a0;
                      }
                      plVar10 = plVar7 + lVar14 * 3;
                      *plVar10 = lVar17;
                      plVar10[1] = lVar12;
                      plVar10[2] = lVar17;
                      lVar14 = lVar14 + 1;
                    } while( true );
                  }
                  *puStack_178 = uVar19;
                  puStack_178[1] = lVar17;
                  lStack_158 = 4;
                  lStack_148 = 1;
                  puStack_150 = puStack_178;
                  if (puVar21 != puVar4) goto LAB_004e6414;
                  goto code_r0x004e6538;
                }
                break;
              }
              puVar13 = puVar13 + 0x4b;
              lVar16 = lVar16 + -600;
            } while (lVar16 != 0);
          }
          puVar13 = puVar21;
        } while (puVar21 != puVar4);
      }
      *plStack_160 = 0;
      plStack_160[1] = 8;
      plStack_160[2] = 0;
      return;
    }
    if (uVar20 == 0) {
      lVar14 = 0;
      pdVar5 = &MACH_HEADER.cpusubtype;
    }
    else {
      uVar19 = 8;
      pdVar5 = (dword *)func_0x00187bd0(uVar20,8);
      if (pdVar5 == (dword *)0x0) goto code_r0x004e62dc;
    }
    lVar18 = 0;
    *(undefined1 (*) [16])pdVar5 = auVar24;
    lStack_c8 = 1;
    uStack_98 = puVar4[5];
    uStack_a0 = puVar4[4];
    uStack_88 = puVar4[7];
    uStack_90 = puVar4[6];
    uStack_78 = puVar4[9];
    uStack_80 = puVar4[8];
    lStack_68 = puVar4[0xb];
    lStack_70 = puVar4[10];
    uStack_b8 = puVar4[1];
    uStack_c0 = *puVar4;
    uStack_a8 = puVar4[3];
    uStack_b0 = puVar4[2];
    lStack_d8 = lVar14;
    pdStack_d0 = pdVar5;
    while( true ) {
      lVar14 = lStack_c8;
      auVar23 = func_0x005211c0(&uStack_c0);
      if (auVar23._0_8_ == 0) break;
      if (lVar14 == lStack_d8) {
        uVar11 = 0;
        if (lStack_70 != 0) {
          uVar11 = (ulong)(lStack_68 - lStack_70) >> 4;
        }
        func_0x007a5594(&lStack_d8,lVar14,uVar11 + 1,8,0x10);
        pdVar5 = pdStack_d0;
      }
      *(undefined1 (*) [16])((long)pdVar5 + lVar18 + 0x10) = auVar23;
      lStack_c8 = lVar14 + 1;
      lVar18 = lVar18 + 0x10;
    }
    extraout_x8[1] = (long)pdStack_d0;
    *extraout_x8 = lStack_d8;
    extraout_x8[2] = lStack_c8;
  }
  return;
LAB_004e6414:
  if (*(long *)(lVar14 + 0x50) == 0) {
code_r0x004e6538:
    plStack_160[1] = (long)puStack_150;
    *plStack_160 = lStack_158;
    plStack_160[2] = lStack_148;
    return;
  }
  plStack_168 = (long *)(*(long *)(lVar14 + 0x48) + 8);
  lStack_170 = *(long *)(lVar14 + 0x50) << 4;
  puVar13 = puVar21;
  lStack_180 = lStack_148;
code_r0x004e6438:
  uVar11 = 0;
  puVar21 = puVar13 + 2;
  uVar19 = *puVar13;
  lVar16 = puVar13[1];
  lVar17 = 0x61;
  plVar7 = plStack_168;
  lVar12 = lStack_170;
  do {
    if ((*plVar7 == lVar16) && (iVar3 = _memcmp(plVar7[-1],uVar19,lVar16), iVar3 == 0)) {
      if (*(ulong *)(lVar14 + 0x68) <= uVar11) {
        func_0x007a2570(uVar11,*(ulong *)(lVar14 + 0x68),&UNK_009e9b68);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x4e6594);
        (*pcVar2)();
      }
      if ((*(char *)(*(long *)(lVar14 + 0x60) + lVar17) != '\0') && (*(long *)(lVar18 + 0x90) != 0))
      {
        puVar13 = (undefined8 *)(*(long *)(lVar18 + 0x88) + 0x218);
        lVar17 = *(long *)(lVar18 + 0x90) * 600;
        goto LAB_004e64c0;
      }
      break;
    }
    plVar7 = plVar7 + 2;
    lVar17 = lVar17 + 0x68;
    uVar11 = uVar11 + 1;
    lVar12 = lVar12 + -0x10;
  } while (lVar12 != 0);
  goto LAB_004e6430;
LAB_004e64c0:
  do {
    if (puVar13[1] == lVar16) {
      iVar3 = _memcmp(*puVar13,uVar19,lVar16);
      lVar12 = lStack_180;
      if (iVar3 == 0) {
        if ((*(byte *)(puVar13 + 7) >> 2 & 1) == 0) {
          if (lStack_180 == lStack_158) {
            func_0x007a5594(&lStack_158,lStack_180,1,8,0x10);
            puStack_178 = puStack_150;
          }
          puStack_178[lVar12 * 2] = uVar19;
          (puStack_178 + lVar12 * 2)[1] = lVar16;
          lStack_148 = lVar12 + 1;
          if (puVar21 == puVar4) goto code_r0x004e6538;
          goto LAB_004e6414;
        }
        break;
      }
    }
    puVar13 = puVar13 + 0x4b;
    lVar17 = lVar17 + -600;
  } while (lVar17 != 0);
LAB_004e6430:
  puVar13 = puVar21;
  if (puVar21 == puVar4) goto code_r0x004e6538;
  goto code_r0x004e6438;
}

