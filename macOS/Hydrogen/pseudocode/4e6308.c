
void FUN_004e6308(void)

{
  undefined8 *puVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  undefined8 uVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  long *plVar9;
  long *extraout_x8;
  long *extraout_x8_00;
  long lVar10;
  long *extraout_x8_01;
  long *extraout_x8_02;
  long lVar11;
  undefined8 *puVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  undefined8 uVar17;
  ulong uVar18;
  undefined8 *puVar19;
  long lVar20;
  undefined1 auVar21 [16];
  undefined8 uStack_1d0;
  long lStack_1c8;
  long *plStack_1c0;
  long lStack_1b8;
  long lStack_1b0;
  undefined8 *puStack_1a8;
  undefined8 *puStack_1a0;
  undefined8 uStack_198;
  long lStack_190;
  long lStack_188;
  long lStack_180;
  long lStack_178;
  long lStack_170;
  undefined8 uStack_168;
  undefined1 ***pppuStack_160;
  undefined8 uStack_158;
  long lStack_148;
  long *plStack_140;
  long lStack_138;
  long lStack_130;
  long lStack_128;
  long lStack_120;
  undefined8 uStack_118;
  undefined1 **ppuStack_110;
  undefined *puStack_108;
  long lStack_f8;
  long *plStack_f0;
  long lStack_e8;
  long lStack_e0;
  undefined *puStack_d8;
  long lStack_d0;
  long *plStack_c8;
  long lStack_c0;
  undefined8 uStack_b8;
  undefined1 *puStack_b0;
  undefined *puStack_a8;
  long lStack_a0;
  undefined8 *puStack_98;
  long lStack_90;
  long *plStack_88;
  long *plStack_80;
  long lStack_78;
  undefined8 *puStack_70;
  long lStack_68;
  undefined1 auStack_6 [6];
  
  auVar21 = __Unwind_Resume();
  plStack_88 = auVar21._8_8_;
  plVar6 = auVar21._0_8_;
  puVar1 = (undefined8 *)plVar6[1];
  plStack_80 = extraout_x8;
  if ((undefined8 *)*plVar6 != puVar1) {
    lVar13 = plVar6[2];
    lVar11 = plVar6[3];
    puVar12 = (undefined8 *)*plVar6;
    do {
      puVar19 = puVar12 + 2;
      *plVar6 = (long)puVar19;
      iVar4 = func_0x005175a8(lVar13,puVar12,&UNK_008a7780);
      if ((iVar4 != 0) && (*(long *)(lVar11 + 0x90) != 0)) {
        uVar17 = *puVar12;
        lVar16 = puVar12[1];
        puVar12 = (undefined8 *)(*(long *)(lVar11 + 0x88) + 0x218);
        lVar15 = *(long *)(lVar11 + 0x90) * 600;
        do {
          if ((puVar12[1] == lVar16) && (iVar4 = _memcmp(*puVar12,uVar17,lVar16), iVar4 == 0)) {
            if ((*(byte *)(puVar12 + 7) >> 2 & 1) == 0) {
              puStack_98 = (undefined8 *)func_0x00187bd0(0x40,8);
              if (puStack_98 == (undefined8 *)0x0) {
                plVar9 = plStack_88;
                uVar5 = func_0x007a1f00(8,0x40);
                if (lStack_78 != 0) {
                  plVar9 = (long *)0x8;
                  func_0x00187bd4(puStack_70,lStack_78 << 4);
                }
                auVar21 = __Unwind_Resume(uVar5);
                lVar20 = auVar21._8_8_;
                puStack_d8 = &UNK_008a7780;
                puStack_a8 = &DAT_004e65cc;
                lVar10 = auVar21._0_8_;
                do {
                  lVar2 = lVar10;
                  lVar10 = lVar2 + 600;
                  if (lVar2 == lVar20) {
                    *extraout_x8_00 = 0;
                    extraout_x8_00[1] = 8;
                    extraout_x8_00[2] = 0;
                    return;
                  }
                } while ((*(long *)(lVar2 + 0x228) == 0) && (*(int *)(lVar2 + 0x248) == 0x110000));
                lStack_e0 = lVar16;
                lStack_d0 = lVar15;
                plStack_c8 = plVar6;
                lStack_c0 = lVar13;
                uStack_b8 = uVar5;
                puStack_b0 = auStack_6 + -10;
                plVar6 = (long *)func_0x00187bd0(0x20,8);
                if (plVar6 != (long *)0x0) {
                  *plVar6 = lVar2;
                  lStack_f8 = 4;
                  lVar13 = 1;
                  plStack_f0 = plVar6;
                  while( true ) {
                    lVar11 = lVar10;
                    if (lVar11 == lVar20) break;
                    lVar10 = lVar11 + 600;
                    if ((*(long *)(lVar11 + 0x228) != 0) || (*(int *)(lVar11 + 0x248) != 0x110000))
                    {
                      if (lVar13 == lStack_f8) {
                        lStack_e8 = lVar13;
                        func_0x007a5594(&lStack_f8,lVar13,1,8,8);
                        plVar6 = plStack_f0;
                      }
                      plVar6[lVar13] = lVar11;
                      lVar13 = lVar13 + 1;
                    }
                  }
                  extraout_x8_00[1] = (long)plStack_f0;
                  *extraout_x8_00 = lStack_f8;
                  extraout_x8_00[2] = lVar13;
                  return;
                }
                lVar13 = (long)plVar9;
                uVar5 = func_0x007a1f00(8,0x20);
                if (lStack_f8 != 0) {
                  lVar13 = 8;
                  func_0x00187bd4(plStack_f0,lStack_f8 << 3);
                }
                auVar21 = __Unwind_Resume(uVar5);
                lVar8 = auVar21._8_8_;
                puStack_108 = &DAT_004e671c;
                lVar15 = auVar21._0_8_;
                do {
                  lVar7 = lVar15;
                  if (lVar7 == lVar8) {
                    *extraout_x8_01 = 0;
                    extraout_x8_01[1] = 8;
                    extraout_x8_01[2] = 0;
                    return;
                  }
                  lVar15 = lVar7 + 600;
                } while ((*(long *)(lVar7 + 0x228) != 0) || (*(int *)(lVar7 + 0x248) != 0x110000));
                lStack_130 = lVar10;
                lStack_128 = (long)plVar9;
                lStack_120 = lVar20;
                uStack_118 = uVar5;
                ppuStack_110 = &puStack_b0;
                plVar6 = (long *)func_0x00187bd0(0x20,8);
                if (plVar6 != (long *)0x0) {
                  *plVar6 = lVar7;
                  lStack_148 = 4;
                  lStack_138 = 1;
                  plStack_140 = plVar6;
                  lVar13 = lStack_138;
                  while (lVar11 = lVar15, lVar11 != lVar8) {
                    lVar15 = lVar11 + 600;
                    if ((*(long *)(lVar11 + 0x228) == 0) && (*(int *)(lVar11 + 0x248) == 0x110000))
                    {
                      if (lVar13 == lStack_148) {
                        lStack_138 = lVar13;
                        func_0x007a5594(&lStack_148,lVar13,1,8,8);
                        plVar6 = plStack_140;
                      }
                      plVar6[lVar13] = lVar11;
                      lVar13 = lVar13 + 1;
                    }
                  }
                  extraout_x8_01[1] = (long)plStack_140;
                  *extraout_x8_01 = lStack_148;
                  extraout_x8_01[2] = lVar13;
                  return;
                }
                lVar10 = lVar13;
                uVar5 = func_0x007a1f00(8,0x20,lVar13);
                if (lStack_148 != 0) {
                  lVar10 = 8;
                  func_0x00187bd4(plStack_140,lStack_148 << 3,8);
                }
                auVar21 = __Unwind_Resume(uVar5);
                uStack_158 = 0x4e6884;
                lVar20 = auVar21._0_8_;
                do {
                  lVar7 = lVar20;
                  if (lVar7 == auVar21._8_8_) {
                    *extraout_x8_02 = 0;
                    extraout_x8_02[1] = 8;
                    extraout_x8_02[2] = 0;
                    return;
                  }
                  lVar20 = lVar7 + 0x48;
                } while ((*(byte *)(lVar7 + 0x40) & 1) != 0);
                lVar14 = *(long *)(lVar7 + 0x38);
                lStack_1b0 = lVar11;
                puStack_1a8 = puVar19;
                puStack_1a0 = puVar1;
                uStack_198 = uVar17;
                lStack_190 = lVar16;
                lStack_188 = lVar2;
                lStack_180 = lVar15;
                lStack_178 = lVar13;
                lStack_170 = lVar8;
                uStack_168 = uVar5;
                pppuStack_160 = &ppuStack_110;
                if (lVar14 < 0) {
                  uVar5 = 0;
code_r0x004e6a5c:
                  func_0x007a1f00(uVar5,lVar14,&UNK_009e7fe0);
                  lVar10 = lVar16;
code_r0x004e6a70:
                  lVar16 = lVar10;
                  uStack_1d0 = 0;
code_r0x004e6a7c:
                  func_0x007a1f00(uStack_1d0,lVar16,&UNK_009e7fe0);
code_r0x004e6a90:
                    /* WARNING: Does not return */
                  pcVar3 = (code *)SoftwareBreakpoint(1,0x4e6a94);
                  (*pcVar3)();
                }
                if (lVar14 == 0) {
                  lVar13 = 1;
                  plVar6 = (long *)func_0x00187bd0(0x60,8);
                }
                else {
                  uVar17 = *(undefined8 *)(lVar7 + 0x30);
                  uVar5 = 1;
                  lVar13 = func_0x00187bd0(lVar14,1);
                  lVar16 = lVar10;
                  if (lVar13 == 0) goto code_r0x004e6a5c;
                  _memcpy(lVar13,uVar17,lVar14);
                  plVar6 = (long *)func_0x00187bd0(0x60,8);
                }
                if (plVar6 == (long *)0x0) {
                  func_0x007a1f00(8,0x60,lVar10);
                  goto code_r0x004e6a90;
                }
                *plVar6 = lVar14;
                plVar6[1] = lVar13;
                plVar6[2] = lVar14;
                uStack_1d0 = 1;
                lStack_1c8 = 4;
                lVar13 = 1;
                plStack_1c0 = plVar6;
                do {
                  do {
                    lVar11 = lVar20;
                    if (lVar11 == auVar21._8_8_) {
                      extraout_x8_02[1] = (long)plStack_1c0;
                      *extraout_x8_02 = lStack_1c8;
                      extraout_x8_02[2] = lVar13;
                      return;
                    }
                    lVar20 = lVar11 + 0x48;
                  } while ((*(byte *)(lVar11 + 0x40) & 1) != 0);
                  lVar16 = *(long *)(lVar11 + 0x38);
                  lStack_1b8 = lVar13;
                  if (lVar16 < 0) goto code_r0x004e6a70;
                  if (lVar16 == 0) {
                    lVar10 = 1;
                  }
                  else {
                    uVar17 = *(undefined8 *)(lVar11 + 0x30);
                    lVar10 = func_0x00187bd0(lVar16,1);
                    if (lVar10 == 0) goto code_r0x004e6a7c;
                    _memcpy(lVar10,uVar17,lVar16);
                  }
                  if (lVar13 == lStack_1c8) {
                    func_0x007a5594(&lStack_1c8,lVar13,1,8,0x18);
                    plVar6 = plStack_1c0;
                  }
                  plVar9 = plVar6 + lVar13 * 3;
                  *plVar9 = lVar16;
                  plVar9[1] = lVar10;
                  plVar9[2] = lVar16;
                  lVar13 = lVar13 + 1;
                } while( true );
              }
              *puStack_98 = uVar17;
              puStack_98[1] = lVar16;
              lStack_78 = 4;
              lStack_68 = 1;
              puStack_70 = puStack_98;
              if (puVar19 != puVar1) goto LAB_004e6414;
              goto code_r0x004e6538;
            }
            break;
          }
          puVar12 = puVar12 + 0x4b;
          lVar15 = lVar15 + -600;
        } while (lVar15 != 0);
      }
      puVar12 = puVar19;
    } while (puVar19 != puVar1);
  }
  *plStack_80 = 0;
  plStack_80[1] = 8;
  plStack_80[2] = 0;
  return;
LAB_004e6414:
  if (*(long *)(lVar13 + 0x50) == 0) {
code_r0x004e6538:
    plStack_80[1] = (long)puStack_70;
    *plStack_80 = lStack_78;
    plStack_80[2] = lStack_68;
    return;
  }
  plStack_88 = (long *)(*(long *)(lVar13 + 0x48) + 8);
  lStack_90 = *(long *)(lVar13 + 0x50) << 4;
  puVar12 = puVar19;
  lStack_a0 = lStack_68;
code_r0x004e6438:
  uVar18 = 0;
  puVar19 = puVar12 + 2;
  uVar17 = *puVar12;
  lVar15 = puVar12[1];
  lVar16 = 0x61;
  plVar6 = plStack_88;
  lVar10 = lStack_90;
  do {
    if ((*plVar6 == lVar15) && (iVar4 = _memcmp(plVar6[-1],uVar17,lVar15), iVar4 == 0)) {
      if (*(ulong *)(lVar13 + 0x68) <= uVar18) {
        func_0x007a2570(uVar18,*(ulong *)(lVar13 + 0x68),&UNK_009e9b68);
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x4e6594);
        (*pcVar3)();
      }
      if ((*(char *)(*(long *)(lVar13 + 0x60) + lVar16) != '\0') && (*(long *)(lVar11 + 0x90) != 0))
      {
        puVar12 = (undefined8 *)(*(long *)(lVar11 + 0x88) + 0x218);
        lVar16 = *(long *)(lVar11 + 0x90) * 600;
        goto LAB_004e64c0;
      }
      break;
    }
    plVar6 = plVar6 + 2;
    lVar16 = lVar16 + 0x68;
    uVar18 = uVar18 + 1;
    lVar10 = lVar10 + -0x10;
  } while (lVar10 != 0);
  goto LAB_004e6430;
LAB_004e64c0:
  do {
    if (puVar12[1] == lVar15) {
      iVar4 = _memcmp(*puVar12,uVar17,lVar15);
      lVar10 = lStack_a0;
      if (iVar4 == 0) {
        if ((*(byte *)(puVar12 + 7) >> 2 & 1) == 0) {
          if (lStack_a0 == lStack_78) {
            func_0x007a5594(&lStack_78,lStack_a0,1,8,0x10);
            puStack_98 = puStack_70;
          }
          puStack_98[lVar10 * 2] = uVar17;
          (puStack_98 + lVar10 * 2)[1] = lVar15;
          lStack_68 = lVar10 + 1;
          if (puVar19 == puVar1) goto code_r0x004e6538;
          goto LAB_004e6414;
        }
        break;
      }
    }
    puVar12 = puVar12 + 0x4b;
    lVar16 = lVar16 + -600;
  } while (lVar16 != 0);
LAB_004e6430:
  puVar12 = puVar19;
  if (puVar19 == puVar1) goto code_r0x004e6538;
  goto code_r0x004e6438;
}

