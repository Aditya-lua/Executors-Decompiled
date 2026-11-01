
void FUN_0016b788(void)

{
  ulong *puVar1;
  long *plVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  code *pcVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  ulong uVar9;
  dword *pdVar10;
  ulong uVar11;
  undefined8 *extraout_x8;
  ulong *extraout_x8_00;
  ulong *extraout_x8_01;
  long *extraout_x8_02;
  ulong *extraout_x8_03;
  long *unaff_x19;
  ulong uVar12;
  ulong uVar13;
  long unaff_x20;
  undefined8 *puVar14;
  undefined8 uVar15;
  long unaff_x22;
  long lVar16;
  ulong uVar17;
  long *plVar18;
  ulong uVar19;
  undefined8 uVar20;
  long lVar21;
  long *plVar22;
  long *plVar23;
  long unaff_x25;
  ulong uVar24;
  long unaff_x26;
  long lVar25;
  long *plVar26;
  undefined2 uVar27;
  ulong unaff_x28;
  long lVar28;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  ulong uStack_210;
  dword *pdStack_208;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  long *plStack_1e0;
  ulong uStack_1d8;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  long lStack_1b8;
  long **pplStack_1b0;
  undefined *puStack_1a8;
  ulong uStack_198;
  undefined8 uStack_190;
  ulong uStack_188;
  ulong *puStack_180;
  ulong uStack_178;
  ulong uStack_168;
  ulong uStack_160;
  ulong uStack_150;
  ulong uStack_148;
  long lStack_140;
  ulong uStack_130;
  undefined1 uStack_124;
  ulong uStack_120;
  ulong uStack_118;
  undefined2 uStack_10c;
  undefined1 uStack_108;
  undefined2 uStack_104;
  ulong uStack_100;
  long lStack_f8;
  ulong uStack_e0;
  ulong uStack_d8;
  ulong uStack_d0;
  ulong uStack_c0;
  ulong uStack_b8;
  ulong uStack_b0;
  long *plStack_50;
  undefined8 uStack_48;
  
  lVar6 = func_0x00187bd0();
  if (lVar6 != 0) {
    uStack0000000000000008 = unaff_x25;
    if (unaff_x25 != 0) {
      lVar25 = 0;
      plVar18 = (long *)(lVar6 + 8);
      plVar22 = (long *)(unaff_x22 + 0x10);
      uStack0000000000000000 = 1;
      do {
        if (unaff_x20 == 0) break;
        if (plVar22[-2] == -0x8000000000000000) {
          lVar7 = plVar22[-1];
          lVar16 = *plVar22;
          lVar21 = -0x8000000000000000;
        }
        else {
          lVar16 = *plVar22;
          if (lVar16 < 0) {
            uStack0000000000000000 = 0;
LAB_0016b898:
            func_0x007a1f00(uStack0000000000000000,unaff_x22,&UNK_009bdb28);
                    /* WARNING: Does not return */
            pcVar5 = (code *)SoftwareBreakpoint(1,0x16b8b0);
            (*pcVar5)();
          }
          lVar21 = plVar22[-1];
          if (lVar16 == 0) {
            lVar7 = 1;
          }
          else {
            lVar7 = func_0x00187bd0(lVar16,1);
            if (lVar7 == 0) {
              unaff_x22 = lVar16;
              goto LAB_0016b898;
            }
          }
          _memcpy(lVar7,lVar21,lVar16);
          unaff_x22 = lVar7;
          lVar21 = lVar16;
        }
        lVar25 = lVar25 + 1;
        plVar18[-1] = lVar21;
        *plVar18 = lVar7;
        plVar18[1] = lVar16;
        plVar18 = plVar18 + 3;
        plVar22 = plVar22 + 3;
        unaff_x20 = unaff_x20 + -0x18;
      } while (unaff_x25 != lVar25);
    }
    unaff_x19[1] = lVar6;
    *unaff_x19 = uStack0000000000000008;
    unaff_x19[2] = unaff_x25;
    return;
  }
  uVar8 = func_0x007a1f00(8);
  func_0x0016b144(&uStack0000000000000008);
  lVar6 = __Unwind_Resume(uVar8);
  plVar18 = (long *)((long)register0x00000008 + -0x10);
  plVar22 = *(long **)(lVar6 + 0x10);
  uVar12 = (long)plVar22 * 0x10;
  if ((ulong)plVar22 >> 0x3c == 0 && uVar12 < 0x7ffffffffffffff9) {
    uVar8 = *(undefined8 *)(lVar6 + 8);
    if (uVar12 == 0) {
      plVar18 = (long *)0x0;
      lVar6 = 8;
LAB_0016b94c:
      _memcpy(lVar6,uVar8,uVar12);
      *extraout_x8 = plVar18;
      extraout_x8[1] = lVar6;
      extraout_x8[2] = plVar22;
      return;
    }
    uVar17 = 8;
    lVar6 = func_0x00187bd0(uVar12,8);
    if (lVar6 != 0) {
      plVar18 = plVar22;
      goto LAB_0016b94c;
    }
  }
  else {
    uVar17 = 0;
  }
  lVar6 = func_0x007a1f00(uVar17,uVar12,&UNK_009bdb28);
  uStack_48 = 0x16b990;
  uVar12 = 0;
  uVar24 = *(ulong *)(lVar6 + 0x10);
  uVar11 = uVar24 * 0x70;
  auVar3._8_8_ = 0;
  auVar3._0_8_ = uVar24;
  plStack_50 = plVar18;
  if ((SUB168(auVar3 * ZEXT816(0x70),8) == 0) && (uVar11 < 0x7ffffffffffffff9)) {
    puStack_180 = extraout_x8_00;
    if (uVar11 == 0) {
      uVar9 = 8;
LAB_0016bdf0:
      *puStack_180 = uVar24;
      puStack_180[1] = uVar9;
      puStack_180[2] = uVar24;
      return;
    }
    plVar22 = *(long **)(lVar6 + 8);
    uVar12 = 8;
    uVar9 = func_0x00187bd0(uVar11,8);
    if (uVar9 != 0) {
      if (uVar24 != 0) {
        lVar6 = 0;
        lVar25 = uVar24 * 0xe;
        uStack_190 = 1;
        plVar18 = plVar22;
        uStack_198 = uVar11;
        uStack_188 = uVar24;
        uStack_178 = uVar9;
        do {
          if (plVar18 == plVar22 + lVar25) break;
          if (*plVar18 != -0x8000000000000000) {
            uVar12 = plVar18[2];
            if (-1 < (long)uVar12) {
              uStack_108 = *(undefined1 *)((long)plVar18 + 0x34);
              uStack_104 = (undefined2)plVar18[6];
              uStack_10c = *(undefined2 *)((long)plVar18 + 0x32);
              lVar7 = plVar18[1];
              if (uVar12 == 0) {
                uVar11 = 1;
              }
              else {
                uVar11 = func_0x00187bd0(uVar12,1);
                if (uVar11 == 0) {
                  uStack_168 = uVar12;
                  goto code_r0x0016be9c;
                }
              }
              _memcpy(uVar11,lVar7,uVar12);
              uVar8 = 0;
              uStack_120 = plVar18[5];
              if (uStack_120 >> 0x3d == 0) {
                uVar17 = uStack_120 * 8;
                if (uVar17 < 0x7fffffffffffffff) {
                  lVar7 = plVar18[4];
                  if (uVar17 == 0) {
                    uStack_148 = 0;
                    uVar13 = 2;
                  }
                  else {
                    uVar13 = func_0x00187bd0(uVar17,2);
                    if (uVar13 == 0) {
                      uVar8 = 2;
                      uStack_160 = uVar17;
                      goto LAB_0016be80;
                    }
                    uStack_148 = uStack_120;
                  }
                  _memcpy(uVar13,lVar7,uVar17);
                  uStack_124 = (undefined1)plVar18[0xd];
                  if (plVar18[10] == -0x8000000000000000) {
                    uStack_118 = plVar18[0xb];
                    uStack_130 = plVar18[0xc];
                    uStack_100 = 0x8000000000000000;
                  }
                  else {
                    func_0x0045cd08(&uStack_c0);
                    uStack_100 = uStack_c0;
                    uStack_118 = uStack_b8;
                    uStack_130 = uStack_b0;
                  }
                  uVar8 = 0;
                  uStack_d0 = plVar18[9];
                  uVar17 = unaff_x28;
                  if ((uStack_d0 >> 0x3b != 0) ||
                     (uVar19 = uStack_d0 * 0x20, 0x7ffffffffffffff8 < uVar19)) {
LAB_0016be3c:
                    func_0x007a1f00(uVar8,uVar17,&UNK_009bdb40);
                    goto LAB_0016beb0;
                  }
                  if (uVar19 == 0) {
                    uStack_c0 = 0;
                    uStack_b8 = 8;
                    unaff_x28 = 8;
                  }
                  else {
                    plVar23 = (long *)plVar18[8];
                    unaff_x28 = func_0x00187bd0(uVar19,8);
                    uVar8 = 8;
                    uVar17 = uVar19;
                    if (unaff_x28 == 0) goto LAB_0016be3c;
                    uStack_c0 = uStack_d0;
                    uStack_b8 = unaff_x28;
                    if (uStack_d0 != 0) {
                      uVar9 = 0;
                      uVar17 = 0;
                      plVar26 = plVar23;
                      do {
                        if (uVar19 == uVar9) break;
                        lVar7 = plVar26[3];
                        uVar27 = *(undefined2 *)((long)plVar26 + 0x1a);
                        if (*plVar26 == -0x8000000000000000) {
                          lVar16 = *(long *)((long)plVar23 + uVar9 + 8);
                          lVar21 = *(long *)((long)plVar23 + uVar9 + 0x10);
                          lVar28 = -0x8000000000000000;
                        }
                        else {
                          lVar21 = *(long *)((long)plVar23 + uVar9 + 0x10);
                          if (lVar21 < 0) {
                            uStack_190 = 0;
LAB_0016be24:
                            func_0x007a1f00(uStack_190,lStack_f8,&UNK_009bdb28);
                            goto LAB_0016beb0;
                          }
                          uVar8 = *(undefined8 *)((long)plVar23 + uVar9 + 8);
                          if (lVar21 == 0) {
                            lVar16 = 1;
                          }
                          else {
                            lVar16 = func_0x00187bd0(lVar21,1);
                            if (lVar16 == 0) {
                              lStack_f8 = lVar21;
                              goto LAB_0016be24;
                            }
                          }
                          _memcpy(lVar16,uVar8,lVar21);
                          lVar28 = lVar21;
                          lStack_f8 = lVar16;
                        }
                        plVar26 = plVar26 + 4;
                        uVar17 = uVar17 + 1;
                        plVar2 = (long *)(unaff_x28 + uVar9);
                        *plVar2 = lVar28;
                        plVar2[1] = lVar16;
                        plVar2[2] = lVar21;
                        *(short *)(plVar2 + 3) = (short)lVar7;
                        uVar9 = uVar9 + 0x20;
                        *(undefined2 *)((long)plVar2 + 0x1a) = uVar27;
                      } while (uStack_d0 != uVar17);
                      uVar9 = uStack_178;
                    }
                  }
                  uVar27 = (undefined2)(uVar13 >> 0x10);
                  uStack_d8 = uStack_b8;
                  uStack_e0 = uStack_c0;
                  uVar17 = uVar13 >> 0x20;
                  uVar19 = uVar12;
                  uStack_160 = uVar13;
                  uStack_150 = uVar11;
                  goto LAB_0016ba64;
                }
              }
LAB_0016be80:
              func_0x007a1f00(uVar8,uStack_160,&UNK_009bdb28);
              goto LAB_0016beb0;
            }
            uStack_190 = 0;
            uStack_168 = uStack_150;
code_r0x0016be9c:
            func_0x007a1f00(uStack_190,uStack_168,&UNK_009bdb28);
LAB_0016beb0:
                    /* WARNING: Does not return */
            pcVar5 = (code *)SoftwareBreakpoint(1,0x16beb4);
            (*pcVar5)();
          }
          uVar11 = plVar18[3];
          if ((long)uVar11 < 0) {
            uStack_190 = 0;
            goto code_r0x0016be9c;
          }
          uVar13 = (ulong)*(ushort *)(plVar18 + 4);
          uVar27 = *(undefined2 *)((long)plVar18 + 0x22);
          lVar7 = plVar18[2];
          if (uVar11 == 0) {
            uStack_168 = 1;
          }
          else {
            uStack_168 = func_0x00187bd0(uVar11,1);
            if (uStack_168 == 0) {
              uStack_168 = uVar11;
              goto code_r0x0016be9c;
            }
          }
          _memcpy(uStack_168,lVar7);
          uVar12 = 0x8000000000000000;
          uStack_148 = uVar11;
          uVar19 = uStack_168;
LAB_0016ba64:
          puVar1 = (ulong *)(uVar9 + lVar6 * 0x70);
          *puVar1 = uVar12;
          puVar1[1] = uVar11;
          lVar6 = lVar6 + 1;
          puVar1[2] = uVar19;
          puVar1[3] = uStack_148;
          *(short *)(puVar1 + 4) = (short)uVar13;
          *(undefined2 *)((long)puVar1 + 0x22) = uVar27;
          *(int *)((long)puVar1 + 0x24) = (int)uVar17;
          puVar1[5] = uStack_120;
          *(undefined2 *)(puVar1 + 6) = uStack_104;
          *(undefined2 *)((long)puVar1 + 0x32) = uStack_10c;
          *(undefined1 *)((long)puVar1 + 0x34) = uStack_108;
          puVar1[8] = uStack_d8;
          puVar1[7] = uStack_e0;
          puVar1[9] = uStack_d0;
          puVar1[10] = uStack_100;
          puVar1[0xb] = uStack_118;
          puVar1[0xc] = uStack_130;
          *(undefined1 *)(puVar1 + 0xd) = uStack_124;
          uVar24 = uVar24 - 1;
          plVar18 = plVar18 + 0xe;
        } while (uVar24 != 0);
        uVar24 = uStack_188;
      }
      goto LAB_0016bdf0;
    }
  }
  uVar8 = func_0x007a1f00(uVar12,uVar11,&UNK_009bdb40);
  if (lStack_140 != 0) {
    func_0x00187bd4(uStack_150,lStack_140,1);
  }
  if (uStack_148 != 0) {
    func_0x00187bd4(uStack_160,uStack_148 << 3,2);
  }
  if (unaff_x26 != 0) {
    uVar12 = uStack_178;
    do {
      func_0x0016af10(uVar12);
      uVar12 = uVar12 + 0x70;
      unaff_x26 = unaff_x26 + -1;
    } while (unaff_x26 != 0);
  }
  uVar15 = 0;
  func_0x00187bd4(uStack_178,uStack_198,8);
  lVar6 = __Unwind_Resume(uVar8);
  puStack_1a8 = &DAT_0016bfa0;
  uVar20 = 0;
  uVar24 = *(ulong *)(lVar6 + 0x10);
  auVar4._8_8_ = 0;
  auVar4._0_8_ = uVar24;
  uVar11 = uVar24 * 0x18;
  plStack_1e0 = plVar22;
  uStack_1d8 = uVar17;
  uStack_1c8 = uVar15;
  uStack_1c0 = uVar8;
  lStack_1b8 = uVar12;
  pplStack_1b0 = &plStack_50;
  if ((SUB168(auVar4 * ZEXT816(0x18),8) == 0) && (uVar11 < 0x7ffffffffffffff9)) {
    if (uVar11 == 0) {
      uStack_210 = 0;
      pdStack_208 = &MACH_HEADER.cpusubtype;
LAB_0016c064:
      extraout_x8_01[1] = (ulong)pdStack_208;
      *extraout_x8_01 = uStack_210;
      extraout_x8_01[2] = uVar24;
      return;
    }
    lVar6 = *(long *)(lVar6 + 8);
    uVar20 = 8;
    pdVar10 = (dword *)func_0x00187bd0(uVar11,8);
    if (pdVar10 != (dword *)0x0) {
      uStack_210 = uVar24;
      pdStack_208 = pdVar10;
      if (uVar24 != 0) {
        uVar12 = 0;
        do {
          if (uVar11 == 0) break;
          func_0x0045cd08(&uStack_1f8,lVar6);
          uVar12 = uVar12 + 1;
          lVar6 = lVar6 + 0x18;
          *(undefined8 *)(pdVar10 + 2) = uStack_1f0;
          *(undefined8 *)pdVar10 = uStack_1f8;
          *(undefined8 *)(pdVar10 + 4) = uStack_1e8;
          uVar11 = uVar11 - 0x18;
          pdVar10 = pdVar10 + 6;
        } while (uVar24 != uVar12);
      }
      goto LAB_0016c064;
    }
  }
  uVar8 = func_0x007a1f00(uVar20,uVar11,&UNK_009bdb40);
  uStack_200 = uVar20;
  func_0x0016b01c(&uStack_210);
  lVar6 = __Unwind_Resume(uVar8);
  lVar25 = *(long *)(lVar6 + 0x10);
  if (lVar25 < 0) {
    uVar8 = 0;
  }
  else {
    uVar15 = *(undefined8 *)(lVar6 + 8);
    if (lVar25 == 0) {
      lVar6 = 1;
code_r0x0016c108:
      _memcpy(lVar6,uVar15,lVar25);
      *extraout_x8_02 = lVar25;
      extraout_x8_02[1] = lVar6;
      extraout_x8_02[2] = lVar25;
      return;
    }
    uVar8 = 1;
    lVar6 = func_0x00187bd0(lVar25,1);
    if (lVar6 != 0) goto code_r0x0016c108;
  }
  lVar6 = func_0x007a1f00(uVar8,lVar25,&UNK_009bdb28);
  uVar17 = *(ulong *)(lVar6 + 0x10);
  uVar12 = uVar17 << 1;
  if (-1 < (long)(uVar12 | uVar17)) {
    uVar15 = *(undefined8 *)(lVar6 + 8);
    if (uVar12 == 0) {
      uVar11 = 0;
      uVar24 = 1;
    }
    else {
      uVar8 = 1;
      uVar24 = func_0x00187bd0(uVar12,1);
      if (uVar24 == 0) goto code_r0x0016c1e0;
      uVar11 = uVar17;
    }
    _memcpy(uVar24,uVar15,uVar12);
    *extraout_x8_03 = uVar11;
    extraout_x8_03[1] = uVar24;
    extraout_x8_03[2] = uVar17;
    return;
  }
  uVar8 = 0;
code_r0x0016c1e0:
  lVar6 = func_0x007a1f00(uVar8,uVar12,&UNK_009bdb28);
  if (*(long *)(lVar6 + 0x10) != 0) {
    puVar14 = *(undefined8 **)(lVar6 + 8);
    lVar6 = 1 - *(long *)(lVar6 + 0x10);
    do {
      lVar25 = *(long *)*puVar14;
      *(long *)*puVar14 = lVar25 + -1;
      LORelease();
      if (lVar25 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9f8c(puVar14);
      }
      puVar14 = puVar14 + 1;
      lVar6 = lVar6 + 1;
    } while (lVar6 != 1);
  }
  return;
}

