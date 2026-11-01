
void FUN_00211e54(void)

{
  uint uVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  code *pcVar6;
  short sVar7;
  int iVar8;
  ulong *puVar9;
  undefined2 *puVar10;
  ulong uVar11;
  uint extraout_w1;
  long *plVar12;
  long lVar13;
  dword *pdVar14;
  undefined1 uVar15;
  undefined8 *extraout_x8;
  long lVar16;
  long lVar17;
  long unaff_x19;
  ushort uVar18;
  ulong uVar19;
  long *plVar20;
  undefined8 uVar21;
  ulong uVar22;
  long *plVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  undefined1 auVar27 [16];
  ulong uStack_320;
  ulong uStack_300;
  ulong uStack_2f8;
  ulong uStack_2f0;
  ulong uStack_2e8;
  ulong uStack_2e0;
  ulong uStack_2d8;
  ulong uStack_2d0;
  ulong uStack_2c8;
  ulong uStack_2c0;
  ulong uStack_2b8;
  ulong uStack_2b0;
  ulong uStack_2a8;
  ulong uStack_2a0;
  ulong uStack_298;
  ulong uStack_290;
  ulong uStack_288;
  ulong uStack_280;
  ulong uStack_278;
  ulong uStack_270;
  ulong uStack_268;
  ulong uStack_260;
  ulong uStack_258;
  ulong uStack_250;
  undefined2 uStack_248;
  undefined6 uStack_246;
  ulong uStack_240;
  ulong uStack_238;
  ulong uStack_230;
  ulong uStack_228;
  ulong uStack_220;
  ulong uStack_218;
  ulong uStack_210;
  ulong uStack_208;
  ulong uStack_200;
  ulong uStack_1f8;
  ulong uStack_1f0;
  ulong uStack_1e8;
  ulong uStack_1e0;
  ulong uStack_1d8;
  ulong uStack_1d0;
  ulong uStack_1c8;
  ulong uStack_1c0;
  ulong uStack_1b8;
  ulong uStack_1b0;
  ulong uStack_1a8;
  ulong uStack_1a0;
  ulong uStack_198;
  ulong uStack_190;
  ulong uStack_188;
  ulong uStack_180;
  ulong uStack_178;
  ulong uStack_170;
  ulong uStack_168;
  ulong uStack_160;
  ulong uStack_158;
  ulong uStack_150;
  ulong uStack_148;
  ulong uStack_140;
  ulong uStack_138;
  ulong uStack_130;
  ulong uStack_128;
  ulong uStack_120;
  ulong uStack_118;
  ulong uStack_110;
  ulong uStack_108;
  ulong uStack_100;
  ulong uStack_f8;
  ulong uStack_f0;
  ulong uStack_e8;
  ulong uStack_e0;
  ulong uStack_d8;
  ulong uStack_d0;
  ulong uStack_c8;
  ulong uStack_c0;
  ulong uStack_b8;
  ulong uStack_b0;
  ulong uStack_a8;
  ulong uStack_a0;
  undefined1 uStack_98;
  ulong uStack_88;
  ulong uStack_80;
  ulong uStack_78;
  
  func_0x00209524(unaff_x19 + 0x50);
  func_0x0020848c();
  func_0x00209ea8(unaff_x19 + 0x80);
  func_0x00207f98(unaff_x19 + 0x38);
  pdVar14 = &MACH_HEADER.cpusubtype;
  func_0x00187bd4();
  __Unwind_Resume();
  func_0x007a2668();
  auVar27 = func_0x007a2668();
  plVar12 = auVar27._8_8_;
  puVar9 = auVar27._0_8_;
  func_0x001d9854(puVar9,pdVar14);
  if ((*(long *)pdVar14 + 0x7fffffffffffffffU < 5) ||
     (plVar23 = (long *)(pdVar14 + 6), *plVar23 != -0x7ffffffffffffffa)) {
    uStack_1b8 = *(ulong *)(pdVar14 + 0x22);
    uStack_1c0 = *(ulong *)(pdVar14 + 0x20);
    uStack_1a8 = *(ulong *)(pdVar14 + 0x26);
    uStack_1b0 = *(ulong *)(pdVar14 + 0x24);
    uStack_198 = *(ulong *)(pdVar14 + 0x2a);
    uStack_1a0 = *(ulong *)(pdVar14 + 0x28);
    uStack_190 = *(ulong *)(pdVar14 + 0x2c);
    uStack_1f8 = *(ulong *)(pdVar14 + 0x12);
    uStack_200 = *(ulong *)(pdVar14 + 0x10);
    uStack_1e8 = *(ulong *)(pdVar14 + 0x16);
    uStack_1f0 = *(ulong *)(pdVar14 + 0x14);
    uStack_1d8 = *(ulong *)(pdVar14 + 0x1a);
    uStack_1e0 = *(ulong *)(pdVar14 + 0x18);
    uStack_1c8 = *(ulong *)(pdVar14 + 0x1e);
    uStack_1d0 = *(ulong *)(pdVar14 + 0x1c);
    uStack_238 = *(ulong *)(pdVar14 + 2);
    uVar26 = *(ulong *)pdVar14;
    uStack_228 = *(ulong *)(pdVar14 + 6);
    uStack_230 = *(ulong *)(pdVar14 + 4);
    uStack_218 = *(ulong *)(pdVar14 + 10);
    uStack_220 = *(ulong *)(pdVar14 + 8);
    uStack_208 = *(ulong *)(pdVar14 + 0xe);
    uStack_210 = *(ulong *)(pdVar14 + 0xc);
    uStack_240 = uVar26;
    puVar10 = (undefined2 *)func_0x00187bd0(2,1);
    if (uVar26 + 0x7fffffffffffffff < 5) {
      if (puVar10 == (undefined2 *)0x0) goto code_r0x00212614;
      *puVar10 = 2;
      uVar18 = (ushort)(0x300020201 >> (uVar26 * 8 - 8 & 0x38)) & 3;
      uVar21 = 0x8000000000000011;
    }
    else {
      if (puVar10 == (undefined2 *)0x0) {
code_r0x00212614:
        func_0x007a1f00(1,2,&UNK_009c64a8);
code_r0x00212640:
                    /* WARNING: Does not return */
        pcVar6 = (code *)SoftwareBreakpoint(1,0x212644);
        (*pcVar6)();
      }
      *puVar10 = 0x12;
      uVar21 = 0x8000000000000012;
      uVar18 = (ushort)uStack_190;
    }
    func_0x002087e4(&uStack_240);
    extraout_x8[2] = puVar10;
    extraout_x8[3] = 1;
    *(ushort *)(extraout_x8 + 4) = uVar18;
    *extraout_x8 = uVar21;
    extraout_x8[1] = 1;
  }
  else {
    uVar26 = *(ulong *)(pdVar14 + 8);
    lVar13 = *(long *)(pdVar14 + 10);
    lVar16 = *(long *)(puVar9[0x16] + 0x48);
    if (lVar16 != 0) {
      lVar17 = *(long *)(pdVar14 + 0xc);
      lVar2 = *(long *)(pdVar14 + 0xe);
      uVar18 = *(ushort *)((long)pdVar14 + 0x3a);
      uVar1 = pdVar14[0xf];
      uVar24 = (ulong)uVar1;
      plVar20 = (long *)(*(long *)(puVar9[0x16] + 0x40) + 8);
      lVar16 = lVar16 << 4;
      do {
        sVar7 = (**(code **)(*plVar20 + 0x28))(plVar20[-1]);
        if (((short)lVar2 == sVar7) && ((short)lVar2 != 3 || (extraout_w1 & 0xffff) == (uint)uVar18)
           ) {
          if (0x10000 < uVar1) {
            lVar16 = *plVar12;
            uStack_188 = CONCAT62(uStack_188._2_6_,4);
            uStack_240 = 0x8000000000000001;
            uStack_238 = CONCAT44(uStack_238._4_4_,0x80001);
            func_0x00248ae4(lVar16,&uStack_240,*(char *)(lVar16 + 0x49) == '\x02');
            *(undefined1 *)(lVar16 + 0x335) = 1;
            *extraout_x8 = 0x8000000000000014;
            uVar15 = 10;
            goto code_r0x00212118;
          }
          if (uVar1 == 0) {
            uVar19 = 0;
            uVar11 = 1;
          }
          else {
            uVar11 = func_0x00187bdc(uVar24,1);
            if (uVar11 == 0) {
              func_0x007a1f00(1,uVar24,&UNK_009c6850);
              goto code_r0x00212640;
            }
            uVar19 = uVar24;
          }
          iVar8 = (**(code **)(*plVar20 + 0x20))(plVar20[-1],lVar13,lVar17,uVar11,uVar24);
          if (iVar8 == 0) {
            uStack_2f0 = 0;
            uStack_300 = uVar11;
            uStack_2f8 = uVar24;
            func_0x00224240(&uStack_240,&uStack_300);
            uVar25 = uStack_228;
            uVar3 = uStack_230;
            uVar24 = uStack_238;
            uStack_320 = uStack_238;
            if ((int)uStack_240 == 1) {
              uVar22 = uStack_228;
              uVar25 = uStack_230;
            }
            else {
              func_0x001aa200(&uStack_240,&uStack_300);
              uVar22 = uStack_228;
              uVar4 = uStack_230;
              uStack_320 = uStack_238;
              if ((int)uStack_240 == 1) {
                if (uVar24 != 0) {
                  func_0x00187bd4(uVar3,uVar24,1);
                }
                uVar25 = uVar4;
              }
              else {
                if (uVar24 != 0x8000000000000000) {
                  uStack_240 = uStack_230;
                  uStack_238 = uStack_230;
                  uStack_228 = uStack_230 + uStack_228 * 0x30;
                  uStack_230 = uStack_320;
                  func_0x00218c98(&uStack_88,&uStack_240,&UNK_009c2468);
                  uStack_2d8 = uStack_80;
                  uStack_2e0 = uStack_88;
                  uStack_2d0 = uStack_78;
                  uStack_2f0 = uVar3;
                  uStack_2e8 = uVar25;
                  uStack_268 = CONCAT71(uStack_268._1_7_,8);
                  uStack_300 = 0x8000000000000005;
                  uStack_2f8 = uVar24;
                  uStack_88 = 0;
                  uStack_80 = 1;
                  uStack_78 = 0;
                  uStack_240 = 0x8000000000000000;
                  func_0x001bb074(&uStack_300,&uStack_88,&uStack_240);
                  uStack_250 = uStack_268;
                  uStack_258 = uStack_270;
                  uStack_260 = uStack_278;
                  uStack_268 = uStack_280;
                  uVar5 = uStack_2a0;
                  uVar22 = uStack_2a8;
                  uVar4 = uStack_2b0;
                  uStack_2a0 = uStack_2b8;
                  uStack_2a8 = uStack_2c0;
                  uVar25 = uStack_2e0;
                  uVar3 = uStack_2e8;
                  uVar24 = uStack_2f0;
                  uStack_2e0 = uStack_2f8;
                  uStack_2e8 = uStack_300;
                  uStack_248 = 5;
                  uStack_278 = uStack_290;
                  uStack_280 = uStack_298;
                  uStack_270 = uStack_288;
                  uStack_2b8 = uStack_2d0;
                  uStack_2c0 = uStack_2d8;
                  uStack_2b0 = uStack_2c8;
                  uStack_298 = uVar4;
                  uStack_288 = uVar5;
                  uStack_290 = uVar22;
                  uStack_2f8 = uStack_80;
                  uStack_300 = uStack_88;
                  uStack_2f0 = uStack_78;
                  uStack_2d8 = uVar24;
                  uStack_2c8 = uVar25;
                  uStack_2d0 = uVar3;
                  uStack_1a8 = puVar9[0x13];
                  uStack_1b0 = puVar9[0x12];
                  uStack_198 = puVar9[0x15];
                  uStack_1a0 = puVar9[0x14];
                  uStack_d0 = puVar9[0x2e];
                  uStack_d8 = puVar9[0x2d];
                  uStack_c0 = puVar9[0x30];
                  uStack_c8 = puVar9[0x2f];
                  uStack_b0 = puVar9[0x32];
                  uStack_b8 = puVar9[0x31];
                  uStack_a0 = puVar9[0x34];
                  uStack_a8 = puVar9[0x33];
                  uStack_210 = puVar9[6];
                  uStack_228 = puVar9[3];
                  uStack_230 = puVar9[2];
                  uStack_218 = puVar9[5];
                  uStack_220 = puVar9[4];
                  uStack_238 = puVar9[1];
                  uStack_240 = *puVar9;
                  uStack_108 = puVar9[0x27];
                  uStack_110 = puVar9[0x26];
                  uStack_f8 = puVar9[0x29];
                  uStack_100 = puVar9[0x28];
                  uStack_e8 = puVar9[0x2b];
                  uStack_f0 = puVar9[0x2a];
                  uStack_e0 = puVar9[0x2c];
                  uStack_148 = puVar9[0x1f];
                  uStack_150 = puVar9[0x1e];
                  uStack_138 = puVar9[0x21];
                  uStack_140 = puVar9[0x20];
                  uStack_128 = puVar9[0x23];
                  uStack_130 = puVar9[0x22];
                  uStack_118 = puVar9[0x25];
                  uStack_120 = puVar9[0x24];
                  uStack_168 = puVar9[0x1b];
                  uStack_170 = puVar9[0x1a];
                  uStack_158 = puVar9[0x1d];
                  uStack_160 = puVar9[0x1c];
                  uStack_1e8 = puVar9[0xb];
                  uStack_1f0 = puVar9[10];
                  uStack_1d8 = puVar9[0xd];
                  uStack_1e0 = puVar9[0xc];
                  uStack_1c8 = puVar9[0xf];
                  uStack_1d0 = puVar9[0xe];
                  uStack_1b8 = puVar9[0x11];
                  uStack_1c0 = puVar9[0x10];
                  uStack_200 = puVar9[8];
                  uStack_208 = puVar9[7];
                  uStack_1f8 = puVar9[9];
                  uStack_188 = puVar9[0x17];
                  uStack_190 = puVar9[0x16];
                  uStack_178 = puVar9[0x19];
                  uStack_180 = puVar9[0x18];
                  uStack_98 = 1;
                  lVar16 = func_0x00187bd0(0x1b0,8);
                  if (lVar16 == 0) {
                    func_0x007a1f18(8,0x1b0);
                    goto code_r0x00212640;
                  }
                  _memcpy(lVar16,&uStack_240,0x1b0);
                  uStack_1b8 = uStack_278;
                  uStack_1c0 = uStack_280;
                  uStack_1a8 = uStack_268;
                  uStack_1b0 = uStack_270;
                  uStack_188 = CONCAT62(uStack_246,uStack_248);
                  uStack_198 = uStack_258;
                  uStack_1a0 = uStack_260;
                  uStack_190 = uStack_250;
                  uStack_1f8 = uStack_2b8;
                  uStack_200 = uStack_2c0;
                  uStack_1e8 = uStack_2a8;
                  uStack_1f0 = uStack_2b0;
                  uStack_1d8 = uStack_298;
                  uStack_1e0 = uStack_2a0;
                  uStack_1c8 = uStack_288;
                  uStack_1d0 = uStack_290;
                  uStack_238 = uStack_2f8;
                  uStack_240 = uStack_300;
                  uStack_228 = uStack_2e8;
                  uStack_230 = uStack_2f0;
                  uStack_218 = uStack_2d8;
                  uStack_220 = uStack_2e0;
                  uStack_208 = uStack_2c8;
                  uStack_210 = uStack_2d0;
                  func_0x002128f0(extraout_x8,lVar16,plVar12,&uStack_240);
                  if (uVar19 != 0) {
                    func_0x00187bd4(uVar11,uVar19,1);
                  }
                  if ((uVar26 | 0x8000000000000000) != 0x8000000000000000) {
                    func_0x00187bd4(lVar13,uVar26,1);
                  }
                  lVar13 = *(long *)pdVar14;
                  if (lVar13 + 0x7fffffffffffffffU < 5) {
                    func_0x002087e4(pdVar14);
                  }
                  else {
                    if (*plVar23 != -0x7ffffffffffffffa) {
                      func_0x00208ff4(plVar23);
                      lVar13 = *(long *)pdVar14;
                    }
                    if ((lVar13 != -0x8000000000000000) && (lVar13 != 0)) {
                      func_0x00187bd4(*(long *)(pdVar14 + 2),lVar13,1);
                    }
                  }
                  goto LAB_00212094;
                }
                uStack_320 = uVar3;
                uVar22 = uStack_238;
              }
            }
            lVar16 = *plVar12;
            uStack_188 = CONCAT62(uStack_188._2_6_,4);
            uStack_240 = 0x8000000000000001;
            uStack_238 = CONCAT44(uStack_238._4_4_,0x80001);
            func_0x00248ae4(lVar16,&uStack_240,*(char *)(lVar16 + 0x49) == '\x02');
            *(undefined1 *)(lVar16 + 0x335) = 1;
            *extraout_x8 = 0x8000000000000014;
            extraout_x8[1] = uStack_320;
            extraout_x8[2] = uVar25;
            extraout_x8[3] = uVar22;
          }
          else {
            lVar16 = *plVar12;
            uStack_188 = CONCAT62(uStack_188._2_6_,4);
            uStack_240 = 0x8000000000000001;
            uStack_238 = CONCAT44(uStack_238._4_4_,0x80001);
            func_0x00248ae4(lVar16,&uStack_240,*(char *)(lVar16 + 0x49) == '\x02');
            *(undefined1 *)(lVar16 + 0x335) = 1;
            *extraout_x8 = 0x800000000000001a;
            *(undefined1 *)(extraout_x8 + 1) = 0x18;
          }
          if (uVar19 != 0) {
            func_0x00187bd4(uVar11,uVar19,1);
          }
          goto code_r0x00212120;
        }
        plVar20 = plVar20 + 2;
        lVar16 = lVar16 + -0x10;
      } while (lVar16 != 0);
    }
    lVar16 = *plVar12;
    uStack_188 = CONCAT62(uStack_188._2_6_,4);
    uStack_240 = 0x8000000000000001;
    uStack_238 = CONCAT44(uStack_238._4_4_,0x80001);
    func_0x00248ae4(lVar16,&uStack_240,*(char *)(lVar16 + 0x49) == '\x02');
    *(undefined1 *)(lVar16 + 0x335) = 1;
    *extraout_x8 = 0x800000000000001a;
    uVar15 = 0x33;
code_r0x00212118:
    *(undefined1 *)(extraout_x8 + 1) = uVar15;
code_r0x00212120:
    if ((uVar26 | 0x8000000000000000) == 0x8000000000000000) {
      lVar13 = *(long *)pdVar14;
    }
    else {
      func_0x00187bd4(lVar13,uVar26,1);
      lVar13 = *(long *)pdVar14;
    }
    if (lVar13 + 0x7fffffffffffffffU < 5) {
      func_0x002087e4(pdVar14);
    }
    else {
      if (*plVar23 != -0x7ffffffffffffffa) {
        func_0x00208ff4(plVar23);
        lVar13 = *(long *)pdVar14;
      }
      if ((lVar13 != -0x8000000000000000) && (lVar13 != 0)) {
        func_0x00187bd4(*(long *)(pdVar14 + 2),lVar13,1);
      }
    }
  }
  func_0x00209f40(puVar9);
LAB_00212094:
  func_0x00187bd4(puVar9,0x1a8,8);
  return;
}

