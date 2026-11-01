
void FUN_004e2438(long param_1)

{
  ulong *puVar1;
  ulong uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined1 uVar6;
  undefined1 uVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  code *pcVar13;
  long lVar14;
  long lVar15;
  dword *pdVar16;
  ulong uVar17;
  undefined8 uVar18;
  int iVar19;
  ulong *extraout_x8;
  ulong *extraout_x8_00;
  undefined8 *puVar20;
  ulong *extraout_x8_01;
  ulong *extraout_x8_02;
  undefined1 *puVar21;
  ulong uVar22;
  undefined8 *puVar23;
  long in_x9;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  undefined8 uVar33;
  ulong uVar34;
  ulong uVar35;
  ulong uVar36;
  long *plVar37;
  ulong uVar38;
  ulong uVar39;
  undefined8 *puVar40;
  undefined8 *puVar41;
  undefined8 *puVar42;
  ulong uVar43;
  undefined8 uVar44;
  undefined8 *puVar45;
  dword *pdVar46;
  undefined8 uVar47;
  ulong uVar48;
  ulong uVar49;
  undefined8 *unaff_x23;
  undefined8 uVar50;
  long lVar51;
  undefined8 uVar52;
  long lVar53;
  undefined8 uVar54;
  ulong uVar55;
  undefined8 uVar56;
  undefined8 uVar57;
  undefined8 uVar58;
  undefined8 uVar59;
  undefined8 uVar60;
  undefined8 uVar61;
  undefined8 uVar62;
  undefined8 uVar63;
  undefined1 auVar64 [16];
  undefined1 auVar65 [16];
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000200;
  ulong in_stack_00000208;
  ulong in_stack_00000218;
  ulong in_stack_00000220;
  ulong in_stack_00000228;
  undefined1 auStack_7ffffffe [2147482358];
  undefined8 uStack_508;
  undefined8 uStack_500;
  dword *pdStack_4e0;
  ulong uStack_4d0;
  dword *pdStack_4c0;
  dword *pdStack_4a8;
  ulong uStack_4a0;
  dword *pdStack_498;
  dword *pdStack_488;
  dword *pdStack_478;
  dword *pdStack_470;
  dword *pdStack_460;
  dword *pdStack_458;
  dword *pdStack_450;
  dword *pdStack_440;
  dword *pdStack_438;
  dword *pdStack_430;
  dword *pdStack_420;
  dword *pdStack_410;
  uint uStack_404;
  dword *pdStack_400;
  undefined8 uStack_3f8;
  dword *pdStack_3f0;
  uint uStack_3e8;
  uint uStack_3e4;
  uint uStack_3e0;
  uint uStack_3dc;
  undefined8 uStack_3c8;
  undefined8 *puStack_3c0;
  undefined8 uStack_3b0;
  undefined8 uStack_3a8;
  dword *pdStack_3a0;
  dword *pdStack_398;
  dword *pdStack_390;
  undefined8 uStack_368;
  ulong uStack_318;
  ulong uStack_308;
  undefined8 uStack_2d8;
  undefined8 uStack_2d0;
  ulong uStack_2c8;
  undefined8 *puStack_2c0;
  dword *pdStack_268;
  dword *pdStack_260;
  dword *pdStack_258;
  dword *pdStack_250;
  dword *pdStack_248;
  dword *pdStack_240;
  ulong uStack_238;
  ulong uStack_230;
  long lStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  long lStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_c8;
  ulong uStack_b8;
  ulong uStack_b0;
  
  auVar65._8_8_ = puStack_3c0;
  auVar65._0_8_ = uStack_3c8;
  if (param_1 != in_x9) {
    func_0x00187bd4(in_stack_000000f8,in_stack_00000200,1);
  }
  if ((in_stack_00000208 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_00000100,in_stack_00000208,1);
  }
  if ((in_stack_00000218 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_00000108,in_stack_00000218,1);
  }
  if ((in_stack_00000220 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_00000110,in_stack_00000220,1);
  }
  if ((in_stack_00000228 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_00000118,in_stack_00000228,1);
  }
  func_0x004dfed4(auStack_7ffffffe + 0x80000256);
  __Unwind_Resume();
  func_0x007a2668();
  lVar15 = func_0x007a2668();
  uVar48 = *(ulong *)(lVar15 + 0x10);
  uVar43 = uVar48 * 0x20;
  if (uVar48 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar43) {
    uVar44 = 0;
LAB_004e263c:
    lVar15 = func_0x007a1f00(uVar44,uVar43,&UNK_009e7fc8);
    uVar44 = 0;
    uVar48 = *(ulong *)(lVar15 + 0x10);
    auVar8._8_8_ = 0;
    auVar8._0_8_ = uVar48;
    uVar43 = uVar48 * 0x18;
    if ((SUB168(auVar8 * ZEXT816(0x18),8) == 0) && (uVar43 < 0x7ffffffffffffff9)) {
      if (uVar43 == 0) {
        uStack_b8 = 0;
        uStack_b0 = 8;
code_r0x004e27bc:
        extraout_x8_00[1] = uStack_b0;
        *extraout_x8_00 = uStack_b8;
        extraout_x8_00[2] = uVar48;
        return;
      }
      lVar15 = *(long *)(lVar15 + 8);
      uVar44 = 8;
      auVar64 = func_0x00187bd0(uVar43,8);
      uVar24 = auVar64._0_8_;
      if (uVar24 != 0) {
        uStack_b8 = uVar48;
        uStack_b0 = uVar24;
        if (uVar48 != 0) {
          lVar51 = 0;
          lVar53 = lVar15 + uVar48 * 0x18;
          uStack_c8 = 8;
          uVar43 = uVar48;
          do {
            uStack_b0 = auVar64._0_8_;
            if (lVar15 == lVar53) break;
            uVar55 = *(ulong *)(lVar15 + 0x10);
            uVar49 = uVar55 * 0x20;
            if (uVar55 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar49) {
              uStack_c8 = 0;
code_r0x004e27f8:
              uStack_b0 = auVar64._0_8_;
              func_0x007a1f00(uStack_c8,auVar64._8_8_,&UNK_009e7fc8);
code_r0x004e2808:
                    /* WARNING: Does not return */
              pcVar13 = (code *)SoftwareBreakpoint(1,0x4e280c);
              (*pcVar13)();
            }
            if (uVar49 == 0) {
              uVar17 = 8;
            }
            else {
              puVar45 = *(undefined8 **)(lVar15 + 8);
              uVar17 = func_0x00187bd0(uVar49,8);
              auVar64._8_8_ = uVar49;
              auVar64._0_8_ = uStack_b0;
              if (uVar17 == 0) goto code_r0x004e27f8;
              if (uVar55 != 0) {
                puVar20 = (undefined8 *)(uVar17 + 0x10);
                uVar25 = uVar55;
                do {
                  if (uVar49 == 0) break;
                  plVar37 = (long *)*puVar45;
                  lVar14 = *plVar37;
                  *plVar37 = lVar14 + 1;
                  if (lVar14 < 0) goto code_r0x004e2808;
                  uVar44 = puVar45[1];
                  uVar18 = puVar45[3];
                  uVar50 = puVar45[2];
                  puVar45 = puVar45 + 4;
                  puVar20[-2] = plVar37;
                  puVar20[-1] = uVar44;
                  puVar20[1] = uVar18;
                  *puVar20 = uVar50;
                  uVar49 = uVar49 - 0x20;
                  uVar25 = uVar25 - 1;
                  puVar20 = puVar20 + 4;
                } while (uVar25 != 0);
              }
            }
            auVar64._8_8_ = uVar17;
            auVar64._0_8_ = uStack_b0;
            lVar15 = lVar15 + 0x18;
            lVar14 = lVar51 * 0x18;
            lVar51 = lVar51 + 1;
            puVar1 = (ulong *)(uVar24 + lVar14);
            *puVar1 = uVar55;
            puVar1[1] = uVar17;
            puVar1[2] = uVar55;
            uVar43 = uVar43 - 1;
          } while (uVar43 != 0);
        }
        goto code_r0x004e27bc;
      }
    }
    uVar44 = func_0x007a1f00(uVar44,uVar43,&UNK_009e7fc8);
    func_0x004df158(&uStack_b8);
    __Unwind_Resume(uVar44);
    lVar15 = func_0x007a2668();
    uVar44 = 0;
    uVar43 = *(ulong *)(lVar15 + 0x10);
    auVar9._8_8_ = 0;
    auVar9._0_8_ = uVar43;
    uVar48 = uVar43 * 0x30;
    if ((SUB168(auVar9 * ZEXT816(0x30),8) == 0) && (uVar48 < 0x7ffffffffffffff9)) {
      if (uVar48 == 0) {
        uVar24 = 8;
code_r0x004e28e8:
        *extraout_x8_01 = uVar43;
        extraout_x8_01[1] = uVar24;
        extraout_x8_01[2] = uVar43;
        return;
      }
      unaff_x23 = *(undefined8 **)(lVar15 + 8);
      uVar44 = 8;
      uVar24 = func_0x00187bd0(uVar48,8);
      if (uVar24 != 0) {
        if (uVar43 != 0) {
          puVar45 = (undefined8 *)(uVar24 + 0x18);
          uVar49 = uVar43;
          do {
            if (uVar48 == 0) break;
            puVar20 = unaff_x23 + 1;
            uVar18 = *unaff_x23;
            uVar47 = unaff_x23[3];
            uVar33 = unaff_x23[2];
            uVar44 = unaff_x23[4];
            uVar50 = unaff_x23[5];
            unaff_x23 = unaff_x23 + 6;
            puVar45[-2] = *puVar20;
            puVar45[-3] = uVar18;
            *puVar45 = uVar47;
            puVar45[-1] = uVar33;
            puVar45[1] = uVar44;
            puVar45[2] = uVar50;
            uVar48 = uVar48 - 0x30;
            puVar45 = puVar45 + 6;
            uVar49 = uVar49 - 1;
          } while (uVar49 != 0);
        }
        goto code_r0x004e28e8;
      }
    }
    lVar15 = func_0x007a1f00(uVar44,uVar48,&UNK_009e7fc8);
    uVar44 = 0;
    uVar48 = *(ulong *)(lVar15 + 0x10);
    uVar24 = uVar48 * 600;
    auVar10._8_8_ = 0;
    auVar10._0_8_ = uVar48;
    if ((SUB168(auVar10 * ZEXT816(600),8) != 0) || (0x7ffffffffffffff8 < uVar24)) {
code_r0x004e3f0c:
      uVar44 = func_0x007a1f00(uVar44,uVar24,&UNK_009e7fc8);
      do {
        if (((ulong)unaff_x23 | 0x8000000000000000) != 0x8000000000000000) {
          func_0x00187bd4(uStack_3a8,unaff_x23,1);
        }
        if ((lStack_1d8 != -0x8000000000000000) && (lStack_1d8 != 0)) {
          func_0x00187bd4(uStack_1d0,lStack_1d8,1);
        }
        uVar48 = uStack_230;
        while (uVar43 = uVar43 - 1, uVar43 != 0) {
          func_0x004df40c(uVar48);
          uVar48 = uVar48 + 600;
        }
        if (uStack_238 != 0) {
          func_0x00187bd4(uStack_230,uStack_238 * 600,8);
        }
        __Unwind_Resume(uVar44);
        if (puStack_3c0[1] != 0) {
          func_0x00187bd4(uStack_3c8,puStack_3c0[1],puStack_3c0[2]);
        }
        uVar44 = func_0x007a2668();
        if ((uStack_404 & 1) == 0) {
          func_0x00187bd4(pdStack_250,pdStack_420,8);
        }
        if ((uStack_3e8 & 1) == 0) {
          func_0x00187bd4(pdStack_248,pdStack_410,8);
        }
        if ((uStack_3e4 & 1) == 0) {
          func_0x00187bd4(pdStack_240,pdStack_400,8);
        }
        if ((uStack_3e0 & 1) == 0) {
          func_0x00187bd4(uStack_2d8,pdStack_3f0,8);
        }
        if ((uStack_3dc & 1) == 0) {
          func_0x00187bd4(uStack_2d0,uStack_3f8,8);
        }
        if ((3 < uStack_2c8) && (uStack_2c8 != 5)) {
          if ((code *)*puStack_3c0 != (code *)0x0) {
            (*(code *)*puStack_3c0)(uStack_3c8);
          }
          if (puStack_3c0[1] != 0) {
            func_0x00187bd4(uStack_3c8,puStack_3c0[1],puStack_3c0[2]);
          }
        }
        unaff_x23 = puStack_2c0;
      } while( true );
    }
    if (uVar24 == 0) {
      uStack_238 = 0;
      uStack_230 = 8;
    }
    else {
      puVar45 = *(undefined8 **)(lVar15 + 8);
      uVar44 = 8;
      uVar49 = func_0x00187bd0(uVar24,8);
      if (uVar49 == 0) goto code_r0x004e3f0c;
      uStack_238 = uVar48;
      uStack_230 = uVar49;
      if (uVar48 != 0) {
        lVar15 = 0;
        puVar20 = puVar45 + uVar48 * 0x4b;
        uStack_500 = 8;
        uStack_508 = 4;
        uVar43 = uVar48;
        do {
          if (puVar45 == puVar20) break;
          uVar44 = puVar45[0x43];
          uVar50 = puVar45[0x44];
          if (puVar45[0x3d] == -0x8000000000000000) {
            lStack_1d8 = -0x8000000000000000;
          }
          else {
            func_0x0045cd08(&lStack_1d8,puVar45 + 0x3d);
          }
          lVar51 = -0x8000000000000000;
          if (puVar45[0x40] != -0x8000000000000000) {
            func_0x0045cd08(&lStack_1b0,puVar45 + 0x40);
            uStack_3b0 = uStack_1a0;
            uStack_3a8 = uStack_1a8;
            lVar51 = lStack_1b0;
          }
          uVar6 = *(undefined1 *)((long)puVar45 + 0x254);
          uVar24 = puVar45[10];
          if ((uVar24 != 5) && (3 < uVar24)) {
            auVar65 = (**(code **)(puVar45[0xc] + 0x38))(puVar45[0xb]);
          }
          uVar18 = 0;
          uVar55 = puVar45[0xf];
          pdVar16 = pdStack_398;
          if ((uVar55 >> 0x3c != 0) ||
             (pdVar46 = (dword *)(uVar55 * 0x10), (dword *)0x7ffffffffffffff8 < pdVar46)) {
code_r0x004e3d44:
            pdStack_398 = pdVar16;
            func_0x007a1f00(uVar18,pdStack_398,&UNK_009e7fc8);
            goto code_r0x004e3f08;
          }
          if (pdVar46 == (dword *)0x0) {
            pdStack_398 = &MACH_HEADER.cpusubtype;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0xe];
            pdStack_398 = (dword *)func_0x00187bd0(pdVar46,8);
            uVar18 = 8;
            pdVar16 = pdVar46;
            if (pdStack_398 == (dword *)0x0) goto code_r0x004e3d44;
            if (uVar55 == 0) goto code_r0x004e2bb8;
            uVar25 = uVar55 - 1;
            uVar17 = uVar55;
            if (uVar25 <= uVar55) {
              uVar17 = uVar25;
            }
            if (uVar17 < 4) {
code_r0x004e2b04:
              lVar53 = 0;
              uVar17 = uVar55;
              puVar23 = puVar42;
            }
            else {
              uVar26 = uVar55;
              if (uVar25 <= uVar55) {
                uVar26 = uVar25;
              }
              if ((pdStack_398 < puVar42 + uVar26 * 2 + 2) &&
                 (puVar42 < pdStack_398 + (uVar26 * 2 + 2) * 2)) goto code_r0x004e2b04;
              uVar25 = uVar17 + 1 & 3;
              uVar26 = 4;
              if (uVar25 != 0) {
                uVar26 = uVar25;
              }
              lVar53 = (uVar17 + 1) - uVar26;
              uVar17 = uVar55 - lVar53;
              puVar23 = puVar42 + lVar53 * 2;
              puVar40 = (undefined8 *)(pdStack_398 + 8);
              puVar41 = puVar42 + 4;
              lVar14 = lVar53;
              do {
                uVar33 = puVar41[-3];
                uVar18 = puVar41[-2];
                uVar47 = puVar41[-1];
                uVar58 = *puVar41;
                uVar56 = puVar41[1];
                uVar60 = puVar41[2];
                uVar57 = puVar41[3];
                puVar40[-4] = puVar41[-4];
                puVar40[-3] = uVar33;
                puVar40[-2] = uVar18;
                puVar40[-1] = uVar47;
                *puVar40 = uVar58;
                puVar40[1] = uVar56;
                puVar40[2] = uVar60;
                puVar40[3] = uVar57;
                puVar40 = puVar40 + 8;
                puVar41 = puVar41 + 8;
                lVar14 = lVar14 + -4;
              } while (lVar14 != 0);
            }
            pdVar16 = pdStack_398 + (lVar53 * 2 + 1) * 2;
            do {
              if (puVar23 == puVar42 + uVar55 * 2) break;
              uVar18 = *puVar23;
              uVar33 = puVar23[1];
              ((mach_header *)(pdVar16 + -2))->magic = (int)uVar18;
              ((mach_header *)(pdVar16 + -2))->cputype = (int)((ulong)uVar18 >> 0x20);
              *(undefined8 *)pdVar16 = uVar33;
              pdVar16 = pdVar16 + 4;
              uVar17 = uVar17 - 1;
              puVar23 = puVar23 + 2;
            } while (uVar17 != 0);
          }
code_r0x004e2bb8:
          uVar17 = puVar45[0x12];
          pdStack_3f0 = (dword *)(uVar17 * 0x10);
          if (uVar17 >> 0x3c != 0 || (dword *)0x7ffffffffffffff8 < pdStack_3f0) {
            uStack_500 = 0;
            pdStack_3f0 = pdStack_440;
code_r0x004e3d9c:
            func_0x007a1f00(uStack_500,pdStack_3f0,&UNK_009e7fc8);
            goto code_r0x004e3f08;
          }
          uVar3 = *(undefined4 *)(puVar45 + 0x4a);
          if (pdStack_3f0 == (dword *)0x0) {
            pdStack_440 = &MACH_HEADER.cpusubtype;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0x11];
            pdStack_440 = (dword *)func_0x00187bd0(pdStack_3f0,8);
            if (pdStack_440 == (dword *)0x0) goto code_r0x004e3d9c;
            if (uVar17 == 0) goto code_r0x004e2d08;
            uVar26 = uVar17 - 1;
            uVar25 = uVar17;
            if (uVar26 <= uVar17) {
              uVar25 = uVar26;
            }
            if (uVar25 < 4) {
code_r0x004e2c54:
              lVar53 = 0;
              uVar25 = uVar17;
              puVar23 = puVar42;
            }
            else {
              uVar27 = uVar17;
              if (uVar26 <= uVar17) {
                uVar27 = uVar26;
              }
              if ((pdStack_440 < puVar42 + uVar27 * 2 + 2) &&
                 (puVar42 < pdStack_440 + (uVar27 * 2 + 2) * 2)) goto code_r0x004e2c54;
              uVar26 = uVar25 + 1 & 3;
              uVar27 = 4;
              if (uVar26 != 0) {
                uVar27 = uVar26;
              }
              lVar53 = (uVar25 + 1) - uVar27;
              uVar25 = uVar17 - lVar53;
              puVar23 = puVar42 + lVar53 * 2;
              puVar40 = (undefined8 *)(pdStack_440 + 8);
              puVar41 = puVar42 + 4;
              lVar14 = lVar53;
              do {
                uVar33 = puVar41[-3];
                uVar18 = puVar41[-2];
                uVar47 = puVar41[-1];
                uVar58 = *puVar41;
                uVar56 = puVar41[1];
                uVar60 = puVar41[2];
                uVar57 = puVar41[3];
                puVar40[-4] = puVar41[-4];
                puVar40[-3] = uVar33;
                puVar40[-2] = uVar18;
                puVar40[-1] = uVar47;
                *puVar40 = uVar58;
                puVar40[1] = uVar56;
                puVar40[2] = uVar60;
                puVar40[3] = uVar57;
                puVar40 = puVar40 + 8;
                puVar41 = puVar41 + 8;
                lVar14 = lVar14 + -4;
              } while (lVar14 != 0);
            }
            pdVar16 = pdStack_440 + (lVar53 * 2 + 1) * 2;
            do {
              if (puVar23 == puVar42 + uVar17 * 2) break;
              uVar18 = *puVar23;
              uVar33 = puVar23[1];
              ((mach_header *)(pdVar16 + -2))->magic = (int)uVar18;
              ((mach_header *)(pdVar16 + -2))->cputype = (int)((ulong)uVar18 >> 0x20);
              *(undefined8 *)pdVar16 = uVar33;
              pdVar16 = pdVar16 + 4;
              uVar25 = uVar25 - 1;
              puVar23 = puVar23 + 2;
            } while (uVar25 != 0);
          }
code_r0x004e2d08:
          uVar25 = puVar45[0x15];
          pdStack_400 = (dword *)(uVar25 * 0x10);
          if (uVar25 >> 0x3c != 0 || (dword *)0x7ffffffffffffff8 < pdStack_400) {
            uStack_500 = 0;
            pdStack_400 = pdStack_450;
code_r0x004e3de4:
            func_0x007a1f00(uStack_500,pdStack_400,&UNK_009e7fc8);
            goto code_r0x004e3f08;
          }
          if (pdStack_400 == (dword *)0x0) {
            pdStack_240 = &MACH_HEADER.cpusubtype;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0x14];
            pdStack_240 = (dword *)func_0x00187bd0(pdStack_400,8);
            if (pdStack_240 == (dword *)0x0) goto code_r0x004e3de4;
            if (uVar25 == 0) goto code_r0x004e2e5c;
            uVar27 = uVar25 - 1;
            uVar26 = uVar25;
            if (uVar27 <= uVar25) {
              uVar26 = uVar27;
            }
            if (uVar26 < 4) {
code_r0x004e2d9c:
              lVar53 = 0;
              uVar26 = uVar25;
              puVar23 = puVar42;
            }
            else {
              uVar28 = uVar25;
              if (uVar27 <= uVar25) {
                uVar28 = uVar27;
              }
              if ((pdStack_240 < puVar42 + uVar28 * 2 + 2) &&
                 (puVar42 < pdStack_240 + (uVar28 * 2 + 2) * 2)) goto code_r0x004e2d9c;
              uVar27 = uVar26 + 1 & 3;
              uVar28 = 4;
              if (uVar27 != 0) {
                uVar28 = uVar27;
              }
              lVar53 = (uVar26 + 1) - uVar28;
              uVar26 = uVar25 - lVar53;
              puVar23 = puVar42 + lVar53 * 2;
              puVar40 = (undefined8 *)(pdStack_240 + 8);
              puVar41 = puVar42 + 4;
              lVar14 = lVar53;
              do {
                uVar33 = puVar41[-3];
                uVar18 = puVar41[-2];
                uVar47 = puVar41[-1];
                uVar58 = *puVar41;
                uVar56 = puVar41[1];
                uVar60 = puVar41[2];
                uVar57 = puVar41[3];
                puVar40[-4] = puVar41[-4];
                puVar40[-3] = uVar33;
                puVar40[-2] = uVar18;
                puVar40[-1] = uVar47;
                *puVar40 = uVar58;
                puVar40[1] = uVar56;
                puVar40[2] = uVar60;
                puVar40[3] = uVar57;
                puVar40 = puVar40 + 8;
                puVar41 = puVar41 + 8;
                lVar14 = lVar14 + -4;
              } while (lVar14 != 0);
            }
            pdVar16 = pdStack_240 + (lVar53 * 2 + 1) * 2;
            do {
              if (puVar23 == puVar42 + uVar25 * 2) break;
              uVar18 = *puVar23;
              uVar33 = puVar23[1];
              ((mach_header *)(pdVar16 + -2))->magic = (int)uVar18;
              ((mach_header *)(pdVar16 + -2))->cputype = (int)((ulong)uVar18 >> 0x20);
              *(undefined8 *)pdVar16 = uVar33;
              pdVar16 = pdVar16 + 4;
              uVar26 = uVar26 - 1;
              puVar23 = puVar23 + 2;
            } while (uVar26 != 0);
          }
code_r0x004e2e5c:
          uVar26 = puVar45[0x18];
          pdStack_410 = (dword *)(uVar26 * 0x20);
          if (uVar26 >> 0x3b != 0 || (dword *)0x7ffffffffffffff8 < pdStack_410) {
            uStack_500 = 0;
            pdStack_410 = pdStack_460;
code_r0x004e3e38:
            func_0x007a1f00(uStack_500,pdStack_410,&UNK_009e7fc8);
            goto code_r0x004e3f08;
          }
          if (pdStack_410 == (dword *)0x0) {
            pdStack_248 = &MACH_HEADER.cpusubtype;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0x17];
            pdStack_248 = (dword *)func_0x00187bd0(pdStack_410,8);
            if (pdStack_248 == (dword *)0x0) goto code_r0x004e3e38;
            if (uVar26 == 0) goto code_r0x004e2f94;
            uVar28 = uVar26 - 1;
            uVar27 = uVar26;
            if (uVar28 <= uVar26) {
              uVar27 = uVar28;
            }
            if (uVar27 < 2) {
code_r0x004e2f38:
              uVar27 = 0;
              uVar28 = uVar26;
              puVar23 = puVar42;
            }
            else {
              uVar29 = uVar26;
              if (uVar28 <= uVar26) {
                uVar29 = uVar28;
              }
              if (pdStack_248 < puVar42 + uVar29 * 4 + 4 &&
                  puVar42 < pdStack_248 + (uVar29 * 4 + 4) * 2) goto code_r0x004e2f38;
              uVar27 = uVar27 & 0x7fffffffffffffe;
              uVar28 = uVar26 - uVar27;
              puVar23 = puVar42 + uVar27 * 4;
              uVar29 = uVar27;
              puVar40 = puVar42;
              pdVar16 = pdStack_248;
              do {
                uVar58 = puVar40[5];
                uVar47 = puVar40[4];
                uVar33 = puVar40[7];
                uVar18 = puVar40[6];
                uVar57 = puVar40[1];
                uVar56 = puVar40[3];
                uVar60 = puVar40[2];
                *(undefined8 *)pdVar16 = *puVar40;
                *(undefined8 *)(pdVar16 + 2) = uVar57;
                *(undefined8 *)(pdVar16 + 4) = uVar60;
                *(undefined8 *)(pdVar16 + 6) = uVar56;
                *(undefined8 *)(pdVar16 + 8) = uVar47;
                *(undefined8 *)(pdVar16 + 10) = uVar58;
                *(undefined8 *)(pdVar16 + 0xc) = uVar18;
                *(undefined8 *)(pdVar16 + 0xe) = uVar33;
                pdVar16 = pdVar16 + 0x10;
                uVar29 = uVar29 - 2;
                puVar40 = puVar40 + 8;
              } while (uVar29 != 0);
            }
            pdVar16 = pdStack_248 + (uVar27 * 4 + 2) * 2;
            do {
              if (puVar23 == puVar42 + uVar26 * 4) break;
              uVar58 = puVar23[1];
              uVar47 = *puVar23;
              uVar18 = puVar23[2];
              uVar33 = puVar23[3];
              ((mach_header *)(pdVar16 + -2))->magic = (int)uVar58;
              ((mach_header *)(pdVar16 + -2))->cputype = (int)((ulong)uVar58 >> 0x20);
              *(undefined8 *)(pdVar16 + -4) = uVar47;
              *(undefined8 *)pdVar16 = uVar18;
              *(undefined8 *)(pdVar16 + 2) = uVar33;
              puVar23 = puVar23 + 4;
              uVar28 = uVar28 - 1;
              pdVar16 = pdVar16 + 8;
            } while (uVar28 != 0);
          }
code_r0x004e2f94:
          uVar27 = puVar45[0x1b];
          pdStack_420 = (dword *)(uVar27 * 0x20);
          if (uVar27 >> 0x3b != 0 || (dword *)0x7ffffffffffffff8 < pdStack_420) {
            uStack_500 = 0;
            pdStack_420 = pdStack_470;
code_r0x004e3e5c:
            func_0x007a1f00(uStack_500,pdStack_420,&UNK_009e7fc8);
            goto code_r0x004e3f08;
          }
          if (pdStack_420 == (dword *)0x0) {
            pdStack_250 = &MACH_HEADER.cpusubtype;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0x1a];
            pdStack_250 = (dword *)func_0x00187bd0(pdStack_420,8);
            if (pdStack_250 == (dword *)0x0) goto code_r0x004e3e5c;
            if (uVar27 == 0) goto code_r0x004e30cc;
            uVar29 = uVar27 - 1;
            uVar28 = uVar27;
            if (uVar29 <= uVar27) {
              uVar28 = uVar29;
            }
            if (uVar28 < 2) {
code_r0x004e3070:
              uVar28 = 0;
              uVar29 = uVar27;
              puVar23 = puVar42;
            }
            else {
              uVar30 = uVar27;
              if (uVar29 <= uVar27) {
                uVar30 = uVar29;
              }
              if (pdStack_250 < puVar42 + uVar30 * 4 + 4 &&
                  puVar42 < pdStack_250 + (uVar30 * 4 + 4) * 2) goto code_r0x004e3070;
              uVar28 = uVar28 & 0x7fffffffffffffe;
              uVar29 = uVar27 - uVar28;
              puVar23 = puVar42 + uVar28 * 4;
              uVar30 = uVar28;
              puVar40 = puVar42;
              pdVar16 = pdStack_250;
              do {
                uVar58 = puVar40[5];
                uVar47 = puVar40[4];
                uVar33 = puVar40[7];
                uVar18 = puVar40[6];
                uVar57 = puVar40[1];
                uVar56 = puVar40[3];
                uVar60 = puVar40[2];
                *(undefined8 *)pdVar16 = *puVar40;
                *(undefined8 *)(pdVar16 + 2) = uVar57;
                *(undefined8 *)(pdVar16 + 4) = uVar60;
                *(undefined8 *)(pdVar16 + 6) = uVar56;
                *(undefined8 *)(pdVar16 + 8) = uVar47;
                *(undefined8 *)(pdVar16 + 10) = uVar58;
                *(undefined8 *)(pdVar16 + 0xc) = uVar18;
                *(undefined8 *)(pdVar16 + 0xe) = uVar33;
                pdVar16 = pdVar16 + 0x10;
                uVar30 = uVar30 - 2;
                puVar40 = puVar40 + 8;
              } while (uVar30 != 0);
            }
            pdVar16 = pdStack_250 + (uVar28 * 4 + 2) * 2;
            do {
              if (puVar23 == puVar42 + uVar27 * 4) break;
              uVar58 = puVar23[1];
              uVar47 = *puVar23;
              uVar18 = puVar23[2];
              uVar33 = puVar23[3];
              ((mach_header *)(pdVar16 + -2))->magic = (int)uVar58;
              ((mach_header *)(pdVar16 + -2))->cputype = (int)((ulong)uVar58 >> 0x20);
              *(undefined8 *)(pdVar16 + -4) = uVar47;
              *(undefined8 *)pdVar16 = uVar18;
              *(undefined8 *)(pdVar16 + 2) = uVar33;
              puVar23 = puVar23 + 4;
              uVar29 = uVar29 - 1;
              pdVar16 = pdVar16 + 8;
            } while (uVar29 != 0);
          }
code_r0x004e30cc:
          uVar28 = puVar45[0x1e];
          pdStack_430 = (dword *)(uVar28 * 0x20);
          if (uVar28 >> 0x3b != 0 || (dword *)0x7ffffffffffffff8 < pdStack_430) {
            uStack_500 = 0;
            pdStack_430 = pdStack_478;
code_r0x004e3d78:
            func_0x007a1f00(uStack_500,pdStack_430,&UNK_009e7fc8);
            goto code_r0x004e3f08;
          }
          if (pdStack_430 == (dword *)0x0) {
            pdStack_258 = &MACH_HEADER.cpusubtype;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0x1d];
            pdStack_258 = (dword *)func_0x00187bd0(pdStack_430,8);
            if (pdStack_258 == (dword *)0x0) goto code_r0x004e3d78;
            if (uVar28 == 0) goto code_r0x004e3204;
            uVar30 = uVar28 - 1;
            uVar29 = uVar28;
            if (uVar30 <= uVar28) {
              uVar29 = uVar30;
            }
            if (uVar29 < 2) {
code_r0x004e31a8:
              uVar29 = 0;
              uVar30 = uVar28;
              puVar23 = puVar42;
            }
            else {
              uVar31 = uVar28;
              if (uVar30 <= uVar28) {
                uVar31 = uVar30;
              }
              if (pdStack_258 < puVar42 + uVar31 * 4 + 4 &&
                  puVar42 < pdStack_258 + (uVar31 * 4 + 4) * 2) goto code_r0x004e31a8;
              uVar29 = uVar29 & 0x7fffffffffffffe;
              uVar30 = uVar28 - uVar29;
              puVar23 = puVar42 + uVar29 * 4;
              uVar31 = uVar29;
              puVar40 = puVar42;
              pdVar16 = pdStack_258;
              do {
                uVar58 = puVar40[5];
                uVar47 = puVar40[4];
                uVar33 = puVar40[7];
                uVar18 = puVar40[6];
                uVar57 = puVar40[1];
                uVar56 = puVar40[3];
                uVar60 = puVar40[2];
                *(undefined8 *)pdVar16 = *puVar40;
                *(undefined8 *)(pdVar16 + 2) = uVar57;
                *(undefined8 *)(pdVar16 + 4) = uVar60;
                *(undefined8 *)(pdVar16 + 6) = uVar56;
                *(undefined8 *)(pdVar16 + 8) = uVar47;
                *(undefined8 *)(pdVar16 + 10) = uVar58;
                *(undefined8 *)(pdVar16 + 0xc) = uVar18;
                *(undefined8 *)(pdVar16 + 0xe) = uVar33;
                pdVar16 = pdVar16 + 0x10;
                uVar31 = uVar31 - 2;
                puVar40 = puVar40 + 8;
              } while (uVar31 != 0);
            }
            pdVar16 = pdStack_258 + (uVar29 * 4 + 2) * 2;
            do {
              if (puVar23 == puVar42 + uVar28 * 4) break;
              uVar58 = puVar23[1];
              uVar47 = *puVar23;
              uVar18 = puVar23[2];
              uVar33 = puVar23[3];
              ((mach_header *)(pdVar16 + -2))->magic = (int)uVar58;
              ((mach_header *)(pdVar16 + -2))->cputype = (int)((ulong)uVar58 >> 0x20);
              *(undefined8 *)(pdVar16 + -4) = uVar47;
              *(undefined8 *)pdVar16 = uVar18;
              *(undefined8 *)(pdVar16 + 2) = uVar33;
              puVar23 = puVar23 + 4;
              uVar30 = uVar30 - 1;
              pdVar16 = pdVar16 + 8;
            } while (uVar30 != 0);
          }
code_r0x004e3204:
          uVar29 = puVar45[0x21];
          pdStack_438 = (dword *)(uVar29 * 0x10);
          if (uVar29 >> 0x3c != 0 || (dword *)0x7ffffffffffffff8 < pdStack_438) {
            uStack_500 = 0;
            pdStack_438 = pdStack_488;
code_r0x004e3dc0:
            func_0x007a1f00(uStack_500,pdStack_438,&UNK_009e7fc8);
            goto code_r0x004e3f08;
          }
          if (pdStack_438 == (dword *)0x0) {
            pdStack_260 = &MACH_HEADER.cpusubtype;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0x20];
            pdStack_260 = (dword *)func_0x00187bd0(pdStack_438,8);
            if (pdStack_260 == (dword *)0x0) goto code_r0x004e3dc0;
            if (uVar29 == 0) goto code_r0x004e334c;
            uVar31 = uVar29 - 1;
            uVar30 = uVar29;
            if (uVar31 <= uVar29) {
              uVar30 = uVar31;
            }
            if (uVar30 < 4) {
code_r0x004e3290:
              lVar53 = 0;
              uVar30 = uVar29;
              puVar23 = puVar42;
            }
            else {
              uVar32 = uVar29;
              if (uVar31 <= uVar29) {
                uVar32 = uVar31;
              }
              if ((pdStack_260 < puVar42 + uVar32 * 2 + 2) &&
                 (puVar42 < pdStack_260 + (uVar32 * 2 + 2) * 2)) goto code_r0x004e3290;
              uVar31 = uVar30 + 1 & 3;
              uVar32 = 4;
              if (uVar31 != 0) {
                uVar32 = uVar31;
              }
              lVar53 = (uVar30 + 1) - uVar32;
              uVar30 = uVar29 - lVar53;
              puVar23 = puVar42 + lVar53 * 2;
              puVar40 = (undefined8 *)(pdStack_260 + 8);
              puVar41 = puVar42 + 4;
              lVar14 = lVar53;
              do {
                uVar33 = puVar41[-3];
                uVar18 = puVar41[-2];
                uVar47 = puVar41[-1];
                uVar58 = *puVar41;
                uVar56 = puVar41[1];
                uVar60 = puVar41[2];
                uVar57 = puVar41[3];
                puVar40[-4] = puVar41[-4];
                puVar40[-3] = uVar33;
                puVar40[-2] = uVar18;
                puVar40[-1] = uVar47;
                *puVar40 = uVar58;
                puVar40[1] = uVar56;
                puVar40[2] = uVar60;
                puVar40[3] = uVar57;
                puVar40 = puVar40 + 8;
                puVar41 = puVar41 + 8;
                lVar14 = lVar14 + -4;
              } while (lVar14 != 0);
            }
            pdVar16 = pdStack_260 + (lVar53 * 2 + 1) * 2;
            do {
              if (puVar23 == puVar42 + uVar29 * 2) break;
              uVar18 = *puVar23;
              uVar33 = puVar23[1];
              ((mach_header *)(pdVar16 + -2))->magic = (int)uVar18;
              ((mach_header *)(pdVar16 + -2))->cputype = (int)((ulong)uVar18 >> 0x20);
              *(undefined8 *)pdVar16 = uVar33;
              pdVar16 = pdVar16 + 4;
              uVar30 = uVar30 - 1;
              puVar23 = puVar23 + 2;
            } while (uVar30 != 0);
          }
code_r0x004e334c:
          uVar30 = puVar45[0x24];
          pdStack_458 = (dword *)(uVar30 * 0x10);
          if (uVar30 >> 0x3c != 0 || (dword *)0x7ffffffffffffff8 < pdStack_458) {
            uStack_500 = 0;
            pdStack_458 = pdStack_498;
code_r0x004e3e08:
            func_0x007a1f00(uStack_500,pdStack_458,&UNK_009e7fc8);
            goto code_r0x004e3f08;
          }
          if (pdStack_458 == (dword *)0x0) {
            pdStack_268 = &MACH_HEADER.cpusubtype;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0x23];
            pdStack_268 = (dword *)func_0x00187bd0(pdStack_458,8);
            if (pdStack_268 == (dword *)0x0) goto code_r0x004e3e08;
            if (uVar30 == 0) goto code_r0x004e3498;
            uVar32 = uVar30 - 1;
            uVar31 = uVar30;
            if (uVar32 <= uVar30) {
              uVar31 = uVar32;
            }
            if (uVar31 < 4) {
code_r0x004e33dc:
              lVar53 = 0;
              uVar31 = uVar30;
              puVar23 = puVar42;
            }
            else {
              uVar38 = uVar30;
              if (uVar32 <= uVar30) {
                uVar38 = uVar32;
              }
              if ((pdStack_268 < puVar42 + uVar38 * 2 + 2) &&
                 (puVar42 < pdStack_268 + (uVar38 * 2 + 2) * 2)) goto code_r0x004e33dc;
              uVar32 = uVar31 + 1 & 3;
              uVar38 = 4;
              if (uVar32 != 0) {
                uVar38 = uVar32;
              }
              lVar53 = (uVar31 + 1) - uVar38;
              uVar31 = uVar30 - lVar53;
              puVar23 = puVar42 + lVar53 * 2;
              puVar40 = (undefined8 *)(pdStack_268 + 8);
              puVar41 = puVar42 + 4;
              lVar14 = lVar53;
              do {
                uVar33 = puVar41[-3];
                uVar18 = puVar41[-2];
                uVar47 = puVar41[-1];
                uVar58 = *puVar41;
                uVar56 = puVar41[1];
                uVar60 = puVar41[2];
                uVar57 = puVar41[3];
                puVar40[-4] = puVar41[-4];
                puVar40[-3] = uVar33;
                puVar40[-2] = uVar18;
                puVar40[-1] = uVar47;
                *puVar40 = uVar58;
                puVar40[1] = uVar56;
                puVar40[2] = uVar60;
                puVar40[3] = uVar57;
                puVar40 = puVar40 + 8;
                puVar41 = puVar41 + 8;
                lVar14 = lVar14 + -4;
              } while (lVar14 != 0);
            }
            pdVar16 = pdStack_268 + (lVar53 * 2 + 1) * 2;
            do {
              if (puVar23 == puVar42 + uVar30 * 2) break;
              uVar18 = *puVar23;
              uVar33 = puVar23[1];
              ((mach_header *)(pdVar16 + -2))->magic = (int)uVar18;
              ((mach_header *)(pdVar16 + -2))->cputype = (int)((ulong)uVar18 >> 0x20);
              *(undefined8 *)pdVar16 = uVar33;
              pdVar16 = pdVar16 + 4;
              uVar31 = uVar31 - 1;
              puVar23 = puVar23 + 2;
            } while (uVar31 != 0);
          }
code_r0x004e3498:
          uVar18 = 0;
          uVar31 = puVar45[0x27];
          auVar11._8_8_ = 0;
          auVar11._0_8_ = uVar31;
          if (SUB168(auVar11 * ZEXT816(0x18),8) != 0) {
code_r0x004e3ec0:
            func_0x007a1f00(uVar18,uStack_4a0,&UNK_009e7fc8);
code_r0x004e3f08:
                    /* WARNING: Does not return */
            pcVar13 = (code *)SoftwareBreakpoint(1,0x4e3f0c);
            (*pcVar13)();
          }
          uVar32 = uVar31 * 0x18;
          if (0x7ffffffffffffff8 < uVar32) goto code_r0x004e3ec0;
          uVar4 = *(undefined4 *)(puVar45 + 0x49);
          uVar33 = puVar45[0x45];
          uVar18 = puVar45[0x46];
          if (uVar32 == 0) {
            uStack_4a0 = 8;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0x26];
            uStack_4a0 = func_0x00187bd0(uVar32,8);
            if (uStack_4a0 == 0) {
              uVar18 = 8;
              uStack_4a0 = uVar32;
              goto code_r0x004e3ec0;
            }
            if (uVar31 != 0) {
              puVar21 = (undefined1 *)(uStack_4a0 + 0x10);
              uVar38 = uVar31;
              do {
                if (uVar32 == 0) break;
                uVar47 = *puVar42;
                uVar58 = puVar42[1];
                uVar7 = *(undefined1 *)(puVar42 + 2);
                puVar42 = puVar42 + 3;
                *(undefined8 *)(puVar21 + -0x10) = uVar47;
                *(undefined8 *)(puVar21 + -8) = uVar58;
                *puVar21 = uVar7;
                uVar32 = uVar32 - 0x18;
                uVar38 = uVar38 - 1;
                puVar21 = puVar21 + 0x18;
              } while (uVar38 != 0);
            }
          }
          uVar32 = puVar45[0x2a];
          uVar38 = uVar32 * 8;
          if (uVar32 >> 0x3d != 0 || 0x7ffffffffffffffc < uVar38) {
            uStack_508 = 0;
code_r0x004e3ed8:
            func_0x007a1f00(uStack_508,uStack_318,&UNK_009e7fe0);
            goto code_r0x004e3f08;
          }
          uVar47 = puVar45[0x29];
          if (uVar38 == 0) {
            uStack_308 = 0;
            uStack_318 = 4;
          }
          else {
            uStack_318 = func_0x00187bd0(uVar38,4);
            if (uStack_318 == 0) {
              uStack_318 = uVar38;
              goto code_r0x004e3ed8;
            }
            uStack_308 = uVar32;
          }
          _memcpy(uStack_318,uVar47,uVar38);
          uVar47 = 0;
          uVar38 = puVar45[0x2d];
          pdVar16 = pdStack_3a0;
          if ((uVar38 >> 0x3c != 0) ||
             (pdVar46 = (dword *)(uVar38 * 0x10), (dword *)0x7ffffffffffffff8 < pdVar46)) {
code_r0x004e3d58:
            pdStack_3a0 = pdVar16;
            func_0x007a1f00(uVar47,pdStack_3a0,&UNK_009e7fc8);
            goto code_r0x004e3f08;
          }
          uVar58 = *puVar45;
          uVar60 = puVar45[1];
          if (pdVar46 == (dword *)0x0) {
            pdStack_3a0 = &MACH_HEADER.cpusubtype;
            uStack_368 = puVar45[2];
            iVar19 = (int)uStack_368;
joined_r0x004e36a8:
            if (iVar19 == 1) goto code_r0x004e3758;
code_r0x004e36ac:
            uStack_368 = 0;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0x2c];
            pdStack_3a0 = (dword *)func_0x00187bd0(pdVar46,8);
            uVar47 = 8;
            pdVar16 = pdVar46;
            if (pdStack_3a0 == (dword *)0x0) goto code_r0x004e3d58;
            if (uVar38 == 0) {
              uStack_368 = puVar45[2];
              iVar19 = (int)uStack_368;
              goto joined_r0x004e36a8;
            }
            uVar34 = uVar38 - 1;
            uVar22 = uVar38;
            if (uVar34 <= uVar38) {
              uVar22 = uVar34;
            }
            if (uVar22 < 4) {
code_r0x004e3684:
              lVar53 = 0;
              uVar22 = uVar38;
              puVar23 = puVar42;
            }
            else {
              uVar35 = uVar38;
              if (uVar34 <= uVar38) {
                uVar35 = uVar34;
              }
              if ((pdStack_3a0 < puVar42 + uVar35 * 2 + 2) &&
                 (puVar42 < pdStack_3a0 + (uVar35 * 2 + 2) * 2)) goto code_r0x004e3684;
              uVar34 = uVar22 + 1 & 3;
              uVar35 = 4;
              if (uVar34 != 0) {
                uVar35 = uVar34;
              }
              lVar53 = (uVar22 + 1) - uVar35;
              uVar22 = uVar38 - lVar53;
              puVar23 = puVar42 + lVar53 * 2;
              puVar40 = (undefined8 *)(pdStack_3a0 + 8);
              puVar41 = puVar42 + 4;
              lVar14 = lVar53;
              do {
                uVar56 = puVar41[-3];
                uVar47 = puVar41[-2];
                uVar57 = puVar41[-1];
                uVar59 = *puVar41;
                uVar62 = puVar41[1];
                uVar61 = puVar41[2];
                uVar63 = puVar41[3];
                puVar40[-4] = puVar41[-4];
                puVar40[-3] = uVar56;
                puVar40[-2] = uVar47;
                puVar40[-1] = uVar57;
                *puVar40 = uVar59;
                puVar40[1] = uVar62;
                puVar40[2] = uVar61;
                puVar40[3] = uVar63;
                puVar40 = puVar40 + 8;
                puVar41 = puVar41 + 8;
                lVar14 = lVar14 + -4;
              } while (lVar14 != 0);
            }
            pdVar16 = pdStack_3a0 + (lVar53 * 2 + 1) * 2;
            do {
              if (puVar23 == puVar42 + uVar38 * 2) break;
              uVar47 = *puVar23;
              uVar56 = puVar23[1];
              ((mach_header *)(pdVar16 + -2))->magic = (int)uVar47;
              ((mach_header *)(pdVar16 + -2))->cputype = (int)((ulong)uVar47 >> 0x20);
              *(undefined8 *)pdVar16 = uVar56;
              pdVar16 = pdVar16 + 4;
              uVar22 = uVar22 - 1;
              puVar23 = puVar23 + 2;
            } while (uVar22 != 0);
            uStack_368 = puVar45[2];
            if ((int)uStack_368 != 1) goto code_r0x004e36ac;
code_r0x004e3758:
            uStack_1b8 = puVar45[4];
            uStack_1c0 = puVar45[3];
          }
          uVar22 = puVar45[0x30];
          pdStack_4a8 = (dword *)(uVar22 * 0x10);
          if (uVar22 >> 0x3c != 0 || (dword *)0x7ffffffffffffff8 < pdStack_4a8) {
            uStack_500 = 0;
            pdStack_4a8 = pdStack_4c0;
code_r0x004e3ea0:
            func_0x007a1f00(uStack_500,pdStack_4a8,&UNK_009e7fc8);
            goto code_r0x004e3f08;
          }
          uVar5 = *(undefined4 *)((long)puVar45 + 0x24c);
          if (pdStack_4a8 == (dword *)0x0) {
            pdStack_4c0 = &MACH_HEADER.cpusubtype;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0x2f];
            pdStack_4c0 = (dword *)func_0x00187bd0(pdStack_4a8,8);
            if (pdStack_4c0 == (dword *)0x0) goto code_r0x004e3ea0;
            if (uVar22 == 0) goto code_r0x004e38b4;
            uVar35 = uVar22 - 1;
            uVar34 = uVar22;
            if (uVar35 <= uVar22) {
              uVar34 = uVar35;
            }
            if (uVar34 < 4) {
code_r0x004e3800:
              lVar53 = 0;
              uVar34 = uVar22;
              puVar23 = puVar42;
            }
            else {
              uVar39 = uVar22;
              if (uVar35 <= uVar22) {
                uVar39 = uVar35;
              }
              if ((pdStack_4c0 < puVar42 + uVar39 * 2 + 2) &&
                 (puVar42 < pdStack_4c0 + (uVar39 * 2 + 2) * 2)) goto code_r0x004e3800;
              uVar35 = uVar34 + 1 & 3;
              uVar39 = 4;
              if (uVar35 != 0) {
                uVar39 = uVar35;
              }
              lVar53 = (uVar34 + 1) - uVar39;
              uVar34 = uVar22 - lVar53;
              puVar23 = puVar42 + lVar53 * 2;
              puVar40 = (undefined8 *)(pdStack_4c0 + 8);
              puVar41 = puVar42 + 4;
              lVar14 = lVar53;
              do {
                uVar56 = puVar41[-3];
                uVar47 = puVar41[-2];
                uVar57 = puVar41[-1];
                uVar59 = *puVar41;
                uVar62 = puVar41[1];
                uVar61 = puVar41[2];
                uVar63 = puVar41[3];
                puVar40[-4] = puVar41[-4];
                puVar40[-3] = uVar56;
                puVar40[-2] = uVar47;
                puVar40[-1] = uVar57;
                *puVar40 = uVar59;
                puVar40[1] = uVar62;
                puVar40[2] = uVar61;
                puVar40[3] = uVar63;
                puVar40 = puVar40 + 8;
                puVar41 = puVar41 + 8;
                lVar14 = lVar14 + -4;
              } while (lVar14 != 0);
            }
            pdVar16 = pdStack_4c0 + (lVar53 * 2 + 1) * 2;
            do {
              if (puVar23 == puVar42 + uVar22 * 2) break;
              uVar47 = *puVar23;
              uVar56 = puVar23[1];
              ((mach_header *)(pdVar16 + -2))->magic = (int)uVar47;
              ((mach_header *)(pdVar16 + -2))->cputype = (int)((ulong)uVar47 >> 0x20);
              *(undefined8 *)pdVar16 = uVar56;
              pdVar16 = pdVar16 + 4;
              uVar34 = uVar34 - 1;
              puVar23 = puVar23 + 2;
            } while (uVar34 != 0);
          }
code_r0x004e38b4:
          uVar47 = 0;
          uVar34 = puVar45[0x33];
          auVar12._8_8_ = 0;
          auVar12._0_8_ = uVar34;
          if (SUB168(auVar12 * ZEXT816(0x30),8) != 0) {
code_r0x004e3ef8:
            func_0x007a1f00(uVar47,uStack_4d0,&UNK_009e7fc8);
            goto code_r0x004e3f08;
          }
          uVar35 = uVar34 * 0x30;
          if (0x7ffffffffffffff8 < uVar35) goto code_r0x004e3ef8;
          if (uVar35 == 0) {
            uStack_4d0 = 8;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0x32];
            uStack_4d0 = func_0x00187bd0(uVar35,8);
            if (uStack_4d0 == 0) {
              uVar47 = 8;
              uStack_4d0 = uVar35;
              goto code_r0x004e3ef8;
            }
            if (uVar34 != 0) {
              puVar23 = (undefined8 *)(uStack_4d0 + 0x18);
              uVar39 = uVar34;
              do {
                if (uVar35 == 0) break;
                puVar40 = puVar42 + 1;
                uVar57 = *puVar42;
                uVar61 = puVar42[3];
                uVar59 = puVar42[2];
                uVar47 = puVar42[4];
                uVar56 = puVar42[5];
                puVar42 = puVar42 + 6;
                puVar23[-2] = *puVar40;
                puVar23[-3] = uVar57;
                *puVar23 = uVar61;
                puVar23[-1] = uVar59;
                puVar23[1] = uVar47;
                puVar23[2] = uVar56;
                uVar35 = uVar35 - 0x30;
                puVar23 = puVar23 + 6;
                uVar39 = uVar39 - 1;
              } while (uVar39 != 0);
            }
          }
          uVar35 = puVar45[0x36];
          pdVar16 = (dword *)(uVar35 * 0x10);
          if (uVar35 >> 0x3c != 0 || (dword *)0x7ffffffffffffff8 < pdVar16) {
            uStack_500 = 0;
code_r0x004e3e7c:
            func_0x007a1f00(uStack_500,pdStack_4e0,&UNK_009e7fc8);
            goto code_r0x004e3f08;
          }
          if (pdVar16 == (dword *)0x0) {
            pdStack_390 = &MACH_HEADER.cpusubtype;
          }
          else {
            puVar42 = (undefined8 *)puVar45[0x35];
            pdStack_390 = (dword *)func_0x00187bd0(pdVar16,8);
            pdStack_4e0 = pdVar16;
            if (pdStack_390 == (dword *)0x0) goto code_r0x004e3e7c;
            if (uVar35 == 0) goto code_r0x004e3ab0;
            uVar36 = uVar35 - 1;
            uVar39 = uVar35;
            if (uVar36 <= uVar35) {
              uVar39 = uVar36;
            }
            if (uVar39 < 4) {
code_r0x004e3a68:
              lVar53 = 0;
              uVar39 = uVar35;
              puVar23 = puVar42;
            }
            else {
              uVar2 = uVar35;
              if (uVar36 <= uVar35) {
                uVar2 = uVar36;
              }
              if (pdStack_390 < puVar42 + uVar2 * 2 + 2 &&
                  puVar42 < pdStack_390 + (uVar2 * 2 + 2) * 2) goto code_r0x004e3a68;
              uVar36 = uVar39 + 1 & 3;
              uVar2 = 4;
              if (uVar36 != 0) {
                uVar2 = uVar36;
              }
              lVar53 = (uVar39 + 1) - uVar2;
              uVar39 = uVar35 - lVar53;
              puVar23 = puVar42 + lVar53 * 2;
              puVar40 = (undefined8 *)(pdStack_390 + 8);
              puVar41 = puVar42 + 4;
              lVar14 = lVar53;
              do {
                uVar56 = puVar41[-3];
                uVar47 = puVar41[-2];
                uVar57 = puVar41[-1];
                uVar59 = *puVar41;
                uVar62 = puVar41[1];
                uVar61 = puVar41[2];
                uVar63 = puVar41[3];
                puVar40[-4] = puVar41[-4];
                puVar40[-3] = uVar56;
                puVar40[-2] = uVar47;
                puVar40[-1] = uVar57;
                *puVar40 = uVar59;
                puVar40[1] = uVar62;
                puVar40[2] = uVar61;
                puVar40[3] = uVar63;
                puVar40 = puVar40 + 8;
                puVar41 = puVar41 + 8;
                lVar14 = lVar14 + -4;
              } while (lVar14 != 0);
            }
            pdVar16 = pdStack_390 + (lVar53 * 2 + 1) * 2;
            do {
              if (puVar23 == puVar42 + uVar35 * 2) break;
              uVar47 = *puVar23;
              uVar56 = puVar23[1];
              ((mach_header *)(pdVar16 + -2))->magic = (int)uVar47;
              ((mach_header *)(pdVar16 + -2))->cputype = (int)((ulong)uVar47 >> 0x20);
              *(undefined8 *)pdVar16 = uVar56;
              pdVar16 = pdVar16 + 4;
              uVar39 = uVar39 - 1;
              puVar23 = puVar23 + 2;
            } while (uVar39 != 0);
          }
code_r0x004e3ab0:
          uVar54 = puVar45[0x47];
          uVar63 = puVar45[0x48];
          uVar47 = puVar45[5];
          uVar57 = puVar45[6];
          uVar56 = puVar45[7];
          uVar59 = puVar45[8];
          uVar52 = puVar45[9];
          func_0x004e97f4(&lStack_1b0,puVar45 + 0x37);
          uVar62 = uStack_1a0;
          uVar61 = uStack_1a8;
          lVar53 = lStack_1b0;
          puVar45 = puVar45 + 0x4b;
          uStack_1a0 = uStack_1c8;
          puVar42 = (undefined8 *)(uVar49 + lVar15 * 600);
          *puVar42 = uVar58;
          puVar42[1] = uVar60;
          puVar42[2] = uStack_368;
          puVar42[5] = uVar47;
          puVar42[6] = uVar57;
          puVar42[7] = uVar56;
          puVar42[8] = uVar59;
          puVar42[9] = uVar52;
          puVar42[10] = uVar24;
          puVar42[0xe] = pdStack_398;
          puVar42[0x11] = pdStack_440;
          puVar42[0xd] = uVar55;
          puVar42[0xf] = uVar55;
          puVar42[0x10] = uVar17;
          puVar42[0x12] = uVar17;
          puVar42[0x14] = pdStack_240;
          puVar42[0x17] = pdStack_248;
          puVar42[0x13] = uVar25;
          puVar42[0x15] = uVar25;
          puVar42[0x16] = uVar26;
          puVar42[0x18] = uVar26;
          puVar42[0x1a] = pdStack_250;
          puVar42[0x1d] = pdStack_258;
          puVar42[0x19] = uVar27;
          puVar42[0x1b] = uVar27;
          puVar42[0x1c] = uVar28;
          puVar42[0x1e] = uVar28;
          puVar42[0x20] = pdStack_260;
          puVar42[0x23] = pdStack_268;
          puVar42[0x1f] = uVar29;
          puVar42[0x21] = uVar29;
          puVar42[0x22] = uVar30;
          puVar42[0x24] = uVar30;
          puVar42[0x26] = uStack_4a0;
          puVar42[0x25] = uVar31;
          puVar42[0x27] = uVar31;
          puVar42[0x28] = uStack_308;
          puVar42[0x2a] = uVar32;
          puVar42[0x2c] = pdStack_3a0;
          puVar42[0x2f] = pdStack_4c0;
          puVar42[0x2b] = uVar38;
          puVar42[0x2d] = uVar38;
          puVar42[0x2e] = uVar22;
          puVar42[0x30] = uVar22;
          puVar42[0x32] = uStack_4d0;
          puVar42[0x31] = uVar34;
          puVar42[0x33] = uVar34;
          puVar42[0x34] = uVar35;
          puVar42[0x35] = pdStack_390;
          puVar42[0x36] = uVar35;
          uStack_1a8 = uStack_1d0;
          lStack_1b0 = lStack_1d8;
          puVar42[0x3a] = uStack_198;
          puVar42[0x39] = uVar62;
          puVar42[0x3c] = uStack_188;
          puVar42[0x3b] = uStack_190;
          puVar42[0x38] = uVar61;
          puVar42[0x37] = lVar53;
          puVar42[0x3e] = uStack_1d0;
          puVar42[0x3d] = lStack_1d8;
          puVar42[0x3f] = uStack_1c8;
          puVar42[0x40] = lVar51;
          puVar42[0x43] = uVar44;
          puVar42[0x44] = uVar50;
          puVar42[0x45] = uVar33;
          puVar42[0x46] = uVar18;
          puVar42[0x47] = uVar54;
          puVar42[0x48] = uVar63;
          *(undefined4 *)(puVar42 + 0x49) = uVar4;
          *(undefined4 *)((long)puVar42 + 0x24c) = uVar5;
          *(undefined4 *)(puVar42 + 0x4a) = uVar3;
          *(undefined1 *)((long)puVar42 + 0x254) = uVar6;
          puVar42[0x29] = uStack_318;
          puVar42[4] = uStack_1b8;
          puVar42[3] = uStack_1c0;
          *(undefined1 (*) [16])(puVar42 + 0xb) = auVar65;
          puVar42[0x41] = uStack_3a8;
          puVar42[0x42] = uStack_3b0;
          lVar15 = lVar15 + 1;
          uVar43 = uVar43 - 1;
          pdStack_4e0 = pdStack_390;
          pdStack_498 = pdStack_268;
          pdStack_488 = pdStack_260;
          pdStack_478 = pdStack_258;
          pdStack_470 = pdStack_250;
          pdStack_460 = pdStack_248;
          pdStack_450 = pdStack_240;
        } while (uVar43 != 0);
      }
    }
    extraout_x8_02[1] = uStack_230;
    *extraout_x8_02 = uStack_238;
    extraout_x8_02[2] = uVar48;
    return;
  }
  if (uVar43 == 0) {
    pdVar16 = &MACH_HEADER.cpusubtype;
    goto LAB_004e261c;
  }
  unaff_x23 = *(undefined8 **)(lVar15 + 8);
  uVar44 = 8;
  pdVar16 = (dword *)func_0x00187bd0(uVar43,8);
  if (pdVar16 == (dword *)0x0) goto LAB_004e263c;
  if (uVar48 == 0) goto LAB_004e261c;
  uVar24 = uVar48 - 1;
  uVar43 = uVar48;
  if (uVar24 <= uVar48) {
    uVar43 = uVar24;
  }
  if (uVar43 < 6) {
LAB_004e25e0:
    uVar43 = 0;
    uVar24 = uVar48;
    puVar45 = unaff_x23;
  }
  else {
    uVar49 = uVar48;
    if (uVar24 <= uVar48) {
      uVar49 = uVar24;
    }
    if (pdVar16 < unaff_x23 + uVar49 * 4 + 4 && unaff_x23 < pdVar16 + (uVar49 * 4 + 4) * 2)
    goto LAB_004e25e0;
    uVar43 = uVar43 & 0x7fffffffffffffe;
    uVar24 = uVar48 - uVar43;
    puVar45 = unaff_x23 + uVar43 * 4;
    uVar49 = uVar43;
    puVar20 = unaff_x23;
    pdVar46 = pdVar16;
    do {
      uVar33 = puVar20[5];
      uVar18 = puVar20[4];
      uVar50 = puVar20[7];
      uVar44 = puVar20[6];
      uVar60 = puVar20[1];
      uVar58 = puVar20[3];
      uVar47 = puVar20[2];
      *(undefined8 *)pdVar46 = *puVar20;
      *(undefined8 *)(pdVar46 + 2) = uVar60;
      *(undefined8 *)(pdVar46 + 4) = uVar47;
      *(undefined8 *)(pdVar46 + 6) = uVar58;
      *(undefined8 *)(pdVar46 + 8) = uVar18;
      *(undefined8 *)(pdVar46 + 10) = uVar33;
      *(undefined8 *)(pdVar46 + 0xc) = uVar44;
      *(undefined8 *)(pdVar46 + 0xe) = uVar50;
      pdVar46 = pdVar46 + 0x10;
      uVar49 = uVar49 - 2;
      puVar20 = puVar20 + 8;
    } while (uVar49 != 0);
  }
  pdVar46 = pdVar16 + (uVar43 * 4 + 2) * 2;
  do {
    if (puVar45 == unaff_x23 + uVar48 * 4) break;
    uVar33 = puVar45[1];
    uVar18 = *puVar45;
    uVar44 = puVar45[2];
    uVar50 = puVar45[3];
    ((mach_header *)(pdVar46 + -2))->magic = (int)uVar33;
    ((mach_header *)(pdVar46 + -2))->cputype = (int)((ulong)uVar33 >> 0x20);
    *(undefined8 *)(pdVar46 + -4) = uVar18;
    *(undefined8 *)pdVar46 = uVar44;
    *(undefined8 *)(pdVar46 + 2) = uVar50;
    puVar45 = puVar45 + 4;
    uVar24 = uVar24 - 1;
    pdVar46 = pdVar46 + 8;
  } while (uVar24 != 0);
LAB_004e261c:
  *extraout_x8 = uVar48;
  extraout_x8[1] = (ulong)pdVar16;
  extraout_x8[2] = uVar48;
  return;
}

