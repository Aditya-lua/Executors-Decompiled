
/* WARNING: Removing unreachable block (ram,0x00212818) */
/* WARNING: Removing unreachable block (ram,0x0021282c) */

void FUN_002127e0(void)

{
  long *plVar1;
  code *pcVar2;
  undefined8 *puVar3;
  undefined2 *puVar4;
  ulong uVar5;
  long lVar6;
  dword *pdVar7;
  undefined8 *extraout_x8;
  long *plVar8;
  long lVar9;
  long *plVar10;
  long lVar11;
  long unaff_x19;
  long *unaff_x20;
  undefined1 uVar12;
  long *plVar13;
  long lVar14;
  ulong unaff_x24;
  long lVar15;
  undefined8 uVar16;
  undefined1 auVar17 [16];
  long lStack_298;
  long lStack_290;
  undefined8 uStack_288;
  long lStack_280;
  long lStack_278;
  long lStack_270;
  long lStack_268;
  long lStack_260;
  long lStack_258;
  long lStack_250;
  long lStack_248;
  long lStack_240;
  long lStack_238;
  undefined8 uStack_230;
  undefined8 uStack_228;
  undefined8 uStack_220;
  undefined8 uStack_218;
  undefined8 uStack_210;
  undefined8 uStack_208;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  ulong uStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  
  func_0x00187bd4();
  if (*unaff_x20 + 0x7fffffffffffffffU < 5) {
    func_0x002087e4();
    if ((unaff_x24 & 1) != 0) goto LAB_00212874;
  }
  else {
    if (unaff_x20[3] != -0x7ffffffffffffffa) {
      func_0x00208ff4();
    }
    lVar6 = *unaff_x20;
    if ((lVar6 != -0x8000000000000000) && (lVar6 != 0)) {
      func_0x00187bd4(unaff_x20[1],lVar6,1);
    }
    if ((int)unaff_x24 != 0) {
LAB_00212874:
      lVar6 = **(long **)(unaff_x19 + 0xb0);
      **(long **)(unaff_x19 + 0xb0) = lVar6 + -1;
      LORelease();
      if (lVar6 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9b44();
      }
      func_0x00209524(unaff_x19 + 0x90);
      func_0x0020848c();
      func_0x00209ea8(unaff_x19 + 0xc0);
      if (*(long *)(unaff_x19 + 0x50) != -0x7ffffffffffffffe) {
        func_0x00208e34();
      }
      func_0x00207f98(unaff_x19 + 0x38);
    }
  }
  pdVar7 = &MACH_HEADER.cpusubtype;
  func_0x00187bd4();
  __Unwind_Resume();
  auVar17 = func_0x007a2668();
  puVar3 = auVar17._0_8_;
  if ((*(byte *)(puVar3 + 0x35) & 1) == 0) {
    func_0x001d9854(puVar3,pdVar7);
  }
  if ((*(long *)pdVar7 + 0x7fffffffffffffffU < 5) ||
     (plVar13 = (long *)(pdVar7 + 6), *plVar13 != -0x7ffffffffffffffb)) {
    uStack_1d8 = *(undefined8 *)(pdVar7 + 0x22);
    uStack_1e0 = *(undefined8 *)(pdVar7 + 0x20);
    uStack_1c8 = *(undefined8 *)(pdVar7 + 0x26);
    uStack_1d0 = *(undefined8 *)(pdVar7 + 0x24);
    uStack_1b8 = *(undefined8 *)(pdVar7 + 0x2a);
    uStack_1c0 = *(undefined8 *)(pdVar7 + 0x28);
    uStack_1b0 = *(ulong *)(pdVar7 + 0x2c);
    uStack_218 = *(undefined8 *)(pdVar7 + 0x12);
    uStack_220 = *(undefined8 *)(pdVar7 + 0x10);
    uStack_208 = *(undefined8 *)(pdVar7 + 0x16);
    uStack_210 = *(undefined8 *)(pdVar7 + 0x14);
    uStack_1f8 = *(undefined8 *)(pdVar7 + 0x1a);
    uStack_200 = *(undefined8 *)(pdVar7 + 0x18);
    uStack_1e8 = *(undefined8 *)(pdVar7 + 0x1e);
    uStack_1f0 = *(undefined8 *)(pdVar7 + 0x1c);
    lStack_258 = *(long *)(pdVar7 + 2);
    lVar6 = *(long *)pdVar7;
    lStack_248 = *(long *)(pdVar7 + 6);
    lStack_250 = *(long *)(pdVar7 + 4);
    lStack_238 = *(long *)(pdVar7 + 10);
    lStack_240 = *(long *)(pdVar7 + 8);
    uStack_228 = *(undefined8 *)(pdVar7 + 0xe);
    uStack_230 = *(undefined8 *)(pdVar7 + 0xc);
    lStack_260 = lVar6;
    puVar4 = (undefined2 *)func_0x00187bd0(2,1);
    if (lVar6 + 0x7fffffffffffffffU < 5) {
      if (puVar4 == (undefined2 *)0x0) goto LAB_00212e80;
      *puVar4 = 2;
      uVar12 = (undefined1)(0x300020201 >> (lVar6 * 8 - 8U & 0x38));
      uVar16 = 0x8000000000000011;
    }
    else {
      if (puVar4 == (undefined2 *)0x0) {
LAB_00212e80:
        func_0x007a1f00(1,2,&UNK_009c64a8);
code_r0x00212eb0:
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x212eb4);
        (*pcVar2)();
      }
      *puVar4 = 8;
      unaff_x24 = uStack_1b0 >> 8 & 0xff;
      uVar16 = 0x8000000000000012;
      uVar12 = (undefined1)uStack_1b0;
    }
    func_0x002087e4(&lStack_260);
    extraout_x8[2] = puVar4;
    extraout_x8[3] = 1;
    *(undefined1 *)(extraout_x8 + 4) = uVar12;
    *(char *)((long)extraout_x8 + 0x21) = (char)unaff_x24;
    *extraout_x8 = uVar16;
    extraout_x8[1] = 1;
  }
  else {
    uStack_288 = *(undefined8 *)(pdVar7 + 10);
    lStack_290 = *(long *)(pdVar7 + 8);
    lStack_278 = *(long *)(pdVar7 + 0xe);
    lStack_280 = *(long *)(pdVar7 + 0xc);
    lStack_268 = *(long *)(pdVar7 + 0x12);
    lStack_270 = *(long *)(pdVar7 + 0x10);
    if (lStack_280 == 0) {
      uVar5 = func_0x001b5e88(&lStack_290);
      lVar6 = lStack_270;
      if ((uVar5 & 1) == 0) {
        lVar15 = lStack_270 + lStack_268 * 0x30;
        if (lStack_268 == 0) {
          lVar14 = 0;
          lStack_298 = 1;
        }
        else {
          lVar14 = lStack_270;
          do {
            plVar8 = *(long **)(lVar14 + 8);
            lVar9 = *(long *)(lVar14 + 0x10) << 5;
            while (lVar9 != 0) {
              lVar11 = *plVar8;
              plVar10 = plVar8 + 3;
              plVar8 = plVar8 + 4;
              lVar9 = lVar9 + -0x20;
              if (lVar11 != -0x7fffffffffffffff && (short)*plVar10 != 5) goto code_r0x00212b68;
            }
            lVar14 = lVar14 + 0x30;
          } while (lVar14 != lVar15);
          plVar10 = *(long **)(lStack_270 + 8);
          plVar8 = plVar10 + 3;
          lVar9 = *(long *)(lStack_270 + 0x10) << 5;
          lStack_298 = 1;
          do {
            if (lVar9 == 0) {
              lVar14 = 0;
              break;
            }
            if (*plVar10 == -0x7fffffffffffffff) {
              lVar14 = *plVar8;
              if (lVar14 < 0) {
                uVar16 = 0;
code_r0x00212e9c:
                func_0x007a1f00(uVar16,lVar14,&UNK_009c2560);
                goto code_r0x00212eb0;
              }
              lVar9 = plVar8[-1];
              if (lVar14 == 0) {
                lStack_298 = 1;
              }
              else {
                uVar16 = 1;
                lStack_298 = func_0x00187bd0(lVar14,1);
                if (lStack_298 == 0) goto code_r0x00212e9c;
              }
              _memcpy(lStack_298,lVar9,lVar14);
              break;
            }
            lVar14 = 0;
            plVar1 = plVar10 + 3;
            plVar10 = plVar10 + 4;
            plVar8 = plVar8 + 4;
            lVar9 = lVar9 + -0x20;
          } while ((short)*plVar1 != 5);
        }
        uVar16 = uStack_288;
        lVar9 = lStack_290;
        lStack_260 = lVar6;
        lStack_258 = lVar6;
        lStack_250 = lStack_278;
        lStack_248 = lVar15;
        func_0x00218e78(&lStack_80,&lStack_260,&UNK_009c2468);
        lVar11 = lStack_70;
        lVar15 = lStack_78;
        lVar6 = lStack_80;
        if (lVar9 != 0) {
          func_0x00187bd4(uVar16,lVar9,1);
        }
        lStack_260 = lVar15;
        lStack_258 = lVar15;
        lStack_248 = lVar15 + lVar11 * 0x18;
        lStack_250 = lVar6;
        func_0x002189a8(&lStack_80,&lStack_260,&UNK_009c2468);
        lStack_258 = lStack_78;
        lStack_260 = lStack_80;
        uStack_198 = puVar3[0x13];
        uStack_1a0 = puVar3[0x12];
        uStack_188 = puVar3[0x15];
        uStack_190 = puVar3[0x14];
        uStack_c0 = puVar3[0x2e];
        uStack_c8 = puVar3[0x2d];
        uStack_b0 = puVar3[0x30];
        uStack_b8 = puVar3[0x2f];
        uStack_a0 = puVar3[0x32];
        uStack_a8 = puVar3[0x31];
        uStack_90 = puVar3[0x34];
        uStack_98 = puVar3[0x33];
        uStack_228 = puVar3[1];
        uStack_230 = *puVar3;
        uStack_218 = puVar3[3];
        uStack_220 = puVar3[2];
        uStack_208 = puVar3[5];
        uStack_210 = puVar3[4];
        uStack_200 = puVar3[6];
        uStack_158 = puVar3[0x1b];
        uStack_160 = puVar3[0x1a];
        uStack_148 = puVar3[0x1d];
        uStack_150 = puVar3[0x1c];
        uStack_138 = puVar3[0x1f];
        uStack_140 = puVar3[0x1e];
        uStack_128 = puVar3[0x21];
        uStack_130 = puVar3[0x20];
        uStack_118 = puVar3[0x23];
        uStack_120 = puVar3[0x22];
        uStack_108 = puVar3[0x25];
        uStack_110 = puVar3[0x24];
        uStack_f8 = puVar3[0x27];
        uStack_100 = puVar3[0x26];
        uStack_e8 = puVar3[0x29];
        uStack_f0 = puVar3[0x28];
        uStack_d8 = puVar3[0x2b];
        uStack_e0 = puVar3[0x2a];
        uStack_d0 = puVar3[0x2c];
        uStack_1d8 = puVar3[0xb];
        uStack_1e0 = puVar3[10];
        uStack_1c8 = puVar3[0xd];
        uStack_1d0 = puVar3[0xc];
        uStack_1b8 = puVar3[0xf];
        uStack_1c0 = puVar3[0xe];
        uStack_1a8 = puVar3[0x11];
        uStack_1b0 = puVar3[0x10];
        uStack_1f0 = puVar3[8];
        uStack_1f8 = puVar3[7];
        uStack_1e8 = puVar3[9];
        uStack_178 = puVar3[0x17];
        uStack_180 = puVar3[0x16];
        uStack_168 = puVar3[0x19];
        uStack_170 = puVar3[0x18];
        lStack_250 = lStack_70;
        lStack_240 = lStack_298;
        lStack_248 = lVar14;
        lStack_238 = lVar14;
        lVar6 = func_0x00187bd0(0x1d8,8);
        if (lVar6 == 0) {
          func_0x007a1f18(8,0x1d8);
          goto code_r0x00212eb0;
        }
        _memcpy(lVar6,&lStack_260,0x1d8);
        extraout_x8[1] = lVar6;
        extraout_x8[2] = &UNK_009c6868;
        *extraout_x8 = 0x8000000000000027;
        lVar6 = *(long *)pdVar7;
        if (lVar6 + 0x7fffffffffffffffU < 5) {
          func_0x002087e4(pdVar7);
        }
        else {
          if (*plVar13 != -0x7ffffffffffffffb) {
            func_0x00208ff4(plVar13);
            lVar6 = *(long *)pdVar7;
          }
          if ((lVar6 != -0x8000000000000000) && (lVar6 != 0)) {
            func_0x00187bd4(*(undefined8 *)(pdVar7 + 2),lVar6,1);
          }
        }
        goto code_r0x00212b20;
      }
code_r0x00212b68:
      lVar6 = *auVar17._8_8_;
      uStack_1a8 = CONCAT62(uStack_1a8._2_6_,4);
      lStack_260 = -0x7fffffffffffffff;
      lStack_258 = CONCAT44(lStack_258._4_4_,0x1a0001);
      func_0x00248ae4(lVar6,&lStack_260,*(char *)(lVar6 + 0x49) == '\x02');
      *(undefined1 *)(lVar6 + 0x335) = 1;
      *extraout_x8 = 0x800000000000001a;
      *(undefined1 *)(extraout_x8 + 1) = 1;
    }
    else {
      lVar6 = *auVar17._8_8_;
      uStack_1a8 = CONCAT62(uStack_1a8._2_6_,4);
      lStack_260 = -0x7fffffffffffffff;
      lStack_258 = CONCAT44(lStack_258._4_4_,0x100001);
      func_0x00248ae4(lVar6,&lStack_260,*(char *)(lVar6 + 0x49) == '\x02');
      *(undefined1 *)(lVar6 + 0x335) = 1;
      *extraout_x8 = 0x8000000000000014;
      *(undefined1 *)(extraout_x8 + 1) = 5;
    }
    if (lStack_290 != 0) {
      func_0x00187bd4(uStack_288,lStack_290,1);
    }
    func_0x0016c428(&lStack_278);
    if (lStack_278 != 0) {
      func_0x00187bd4(lStack_270,lStack_278 * 0x30,8);
    }
    lVar6 = *(long *)pdVar7;
    if (lVar6 + 0x7fffffffffffffffU < 5) {
      func_0x002087e4(pdVar7);
    }
    else {
      if (*plVar13 != -0x7ffffffffffffffb) {
        func_0x00208ff4(plVar13);
        lVar6 = *(long *)pdVar7;
      }
      if ((lVar6 != -0x8000000000000000) && (lVar6 != 0)) {
        func_0x00187bd4(*(undefined8 *)(pdVar7 + 2),lVar6,1);
      }
    }
  }
  func_0x002088ac(puVar3);
code_r0x00212b20:
  func_0x00187bd4(puVar3,0x1b0,8);
  return;
}

