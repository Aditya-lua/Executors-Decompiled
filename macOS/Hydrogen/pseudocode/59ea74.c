
void FUN_0059ea74(void)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  long lVar3;
  long lVar4;
  dword *pdVar5;
  undefined8 uVar6;
  dword *pdVar7;
  ulong *extraout_x8;
  ulong *extraout_x8_00;
  ulong *extraout_x8_01;
  ulong *extraout_x8_02;
  ulong *extraout_x8_03;
  long *plVar8;
  long unaff_x19;
  long *unaff_x20;
  ulong uVar9;
  undefined8 *puVar10;
  long unaff_x21;
  long *unaff_x22;
  undefined8 uVar11;
  ulong uVar12;
  undefined8 uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uStack_2d8;
  dword *pdStack_2d0;
  undefined8 uStack_2c8;
  undefined8 uStack_2c0;
  undefined8 uStack_2b8;
  undefined8 uStack_2b0;
  undefined8 uStack_2a8;
  undefined8 uStack_2a0;
  undefined8 uStack_298;
  ulong uStack_290;
  dword *pdStack_288;
  ulong uStack_280;
  undefined8 uStack_278;
  ulong uStack_270;
  undefined8 uStack_268;
  undefined1 ***pppuStack_260;
  undefined8 uStack_258;
  ulong uStack_248;
  ulong uStack_240;
  undefined8 uStack_238;
  ulong uStack_230;
  dword *pdStack_228;
  long *plStack_220;
  long lStack_218;
  ulong uStack_210;
  undefined8 uStack_208;
  undefined1 **ppuStack_200;
  undefined8 uStack_1f8;
  ulong uStack_1e8;
  dword *pdStack_1e0;
  dword *pdStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  ulong uStack_190;
  undefined8 uStack_188;
  long *plStack_180;
  undefined1 *puStack_160;
  undefined8 uStack_158;
  ulong uStack_148;
  dword *pdStack_140;
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
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined1 auStack_6 [6];
  
  if (unaff_x19 == 0) {
    lVar4 = 1;
  }
  else {
    lVar4 = func_0x00187bd0();
    if (lVar4 == 0) {
      lVar4 = func_0x007a1f00(1);
      uVar14 = *(ulong *)(lVar4 + 0x10);
      uVar9 = uVar14 * 0x80;
      if (uVar14 >> 0x39 == 0 && uVar9 < 0x7ffffffffffffff9) {
        if (uVar9 == 0) {
          uStack_148 = 0;
          pdStack_140 = &MACH_HEADER.cpusubtype;
LAB_0059ebfc:
          extraout_x8[1] = (ulong)pdStack_140;
          *extraout_x8 = uStack_148;
          extraout_x8[2] = uVar14;
          return;
        }
        unaff_x22 = *(long **)(lVar4 + 8);
        uVar11 = 8;
        pdVar5 = (dword *)func_0x00187bd0(uVar9,8);
        if (pdVar5 != (dword *)0x0) {
          uStack_138 = 0;
          uStack_148 = uVar14;
          pdStack_140 = pdVar5;
          if (uVar14 != 0) {
            uVar12 = 0;
            do {
              if (uVar9 == 0) break;
              if (*unaff_x22 == 0xc) {
                uStack_130 = 0xc;
              }
              else {
                func_0x005a5b10(&uStack_b0,unaff_x22);
                uStack_128 = uStack_a8;
                uStack_130 = uStack_b0;
                uStack_118 = uStack_98;
                uStack_120 = uStack_a0;
                uStack_108 = uStack_88;
                uStack_110 = uStack_90;
                uStack_f8 = uStack_78;
                uStack_100 = uStack_80;
              }
              func_0x005a5b10(&uStack_f0,unaff_x22 + 8);
              uVar12 = uVar12 + 1;
              *(undefined8 *)(pdVar5 + 0x12) = uStack_e8;
              *(undefined8 *)(pdVar5 + 0x10) = uStack_f0;
              *(undefined8 *)(pdVar5 + 0x16) = uStack_d8;
              *(undefined8 *)(pdVar5 + 0x14) = uStack_e0;
              *(undefined8 *)(pdVar5 + 0x1a) = uStack_c8;
              *(undefined8 *)(pdVar5 + 0x18) = uStack_d0;
              *(undefined8 *)(pdVar5 + 0x1e) = uStack_b8;
              *(undefined8 *)(pdVar5 + 0x1c) = uStack_c0;
              *(undefined8 *)(pdVar5 + 2) = uStack_128;
              *(undefined8 *)pdVar5 = uStack_130;
              *(undefined8 *)(pdVar5 + 6) = uStack_118;
              *(undefined8 *)(pdVar5 + 4) = uStack_120;
              uVar9 = uVar9 - 0x80;
              *(undefined8 *)(pdVar5 + 10) = uStack_108;
              *(undefined8 *)(pdVar5 + 8) = uStack_110;
              *(undefined8 *)(pdVar5 + 0xe) = uStack_f8;
              *(undefined8 *)(pdVar5 + 0xc) = uStack_100;
              pdVar5 = pdVar5 + 0x20;
              unaff_x22 = unaff_x22 + 0x10;
            } while (uVar14 != uVar12);
          }
          goto LAB_0059ebfc;
        }
      }
      else {
        uVar11 = 0;
      }
      uVar6 = func_0x007a1f00(uVar11,uVar9,&UNK_009f1b50);
      uStack_138 = uVar11;
      func_0x0059cb44(&uStack_148);
      __Unwind_Resume(uVar6);
      func_0x007a2668();
      lVar4 = func_0x007a2668();
      uStack_158 = 0x59ec7c;
      uVar12 = *(ulong *)(lVar4 + 0x10);
      uVar9 = uVar12 * 0x40;
      uStack_190 = uVar14;
      uStack_188 = uVar11;
      plStack_180 = unaff_x22;
      puStack_160 = auStack_6 + -10;
      if (uVar12 >> 0x3a == 0 && uVar9 < 0x7ffffffffffffff9) {
        if (uVar9 == 0) {
          uStack_1e8 = 0;
          pdStack_1e0 = &MACH_HEADER.cpusubtype;
code_r0x0059ed30:
          extraout_x8_00[1] = (ulong)pdStack_1e0;
          *extraout_x8_00 = uStack_1e8;
          extraout_x8_00[2] = uVar12;
          return;
        }
        unaff_x21 = *(long *)(lVar4 + 8);
        pdVar5 = &MACH_HEADER.cpusubtype;
        pdVar7 = (dword *)func_0x00187bd0(uVar9,8);
        if (pdVar7 != (dword *)0x0) {
          uStack_1e8 = uVar12;
          pdStack_1e0 = pdVar7;
          if (uVar12 != 0) {
            uVar14 = 0;
            do {
              if (uVar9 == 0) break;
              func_0x005a5b10(&uStack_1d0,unaff_x21);
              uVar14 = uVar14 + 1;
              unaff_x21 = unaff_x21 + 0x40;
              *(undefined8 *)(pdVar7 + 2) = uStack_1c8;
              *(undefined8 *)pdVar7 = uStack_1d0;
              *(undefined8 *)(pdVar7 + 6) = uStack_1b8;
              *(undefined8 *)(pdVar7 + 4) = uStack_1c0;
              *(undefined8 *)(pdVar7 + 10) = uStack_1a8;
              *(undefined8 *)(pdVar7 + 8) = uStack_1b0;
              *(undefined8 *)(pdVar7 + 0xe) = uStack_198;
              *(undefined8 *)(pdVar7 + 0xc) = uStack_1a0;
              uVar9 = uVar9 - 0x40;
              pdVar7 = pdVar7 + 0x10;
            } while (uVar12 != uVar14);
          }
          goto code_r0x0059ed30;
        }
      }
      else {
        pdVar5 = (dword *)0x0;
      }
      uVar11 = func_0x007a1f00(pdVar5,uVar9,&UNK_009f1b50);
      pdStack_1d8 = pdVar5;
      func_0x0059e200(&uStack_1e8);
      __Unwind_Resume(uVar11);
      lVar4 = func_0x007a2668();
      uStack_1f8 = 0x59ed88;
      uStack_280 = *(ulong *)(lVar4 + 0x10);
      uVar14 = uStack_280 * 0x10;
      uStack_230 = uVar12;
      pdStack_228 = pdVar5;
      plStack_220 = unaff_x22;
      lStack_218 = unaff_x21;
      uStack_210 = uVar9;
      uStack_208 = uVar11;
      ppuStack_200 = &puStack_160;
      if (uStack_280 >> 0x3c == 0 && uVar14 < 0x7ffffffffffffff9) {
        if (uVar14 == 0) {
          uStack_248 = 0;
          uStack_240 = 8;
LAB_0059ee34:
          extraout_x8_01[1] = uStack_240;
          *extraout_x8_01 = uStack_248;
          extraout_x8_01[2] = uStack_280;
          return;
        }
        pdVar5 = *(dword **)(lVar4 + 8);
        uVar11 = 8;
        uStack_240 = func_0x00187bd0(uVar14,8);
        if (uStack_240 != 0) {
          uStack_248 = uStack_280;
          if (uStack_280 != 0) {
            uVar9 = 0;
            puVar10 = (undefined8 *)(uStack_240 + 8);
            do {
              if (uVar14 == 0) break;
              uVar11 = *(undefined8 *)pdVar5;
              plVar8 = *(long **)(pdVar5 + 2);
              lVar4 = *plVar8;
              *plVar8 = lVar4 + 1;
              if (lVar4 < 0) {
                func_0x007a05dc();
                    /* WARNING: Does not return */
                pcVar2 = (code *)SoftwareBreakpoint(1,0x59ee60);
                (*pcVar2)();
              }
              uVar9 = uVar9 + 1;
              pdVar5 = pdVar5 + 4;
              puVar10[-1] = uVar11;
              *puVar10 = plVar8;
              uVar14 = uVar14 - 0x10;
              puVar10 = puVar10 + 2;
            } while (uStack_280 != uVar9);
          }
          goto LAB_0059ee34;
        }
      }
      else {
        uVar11 = 0;
      }
      uVar6 = func_0x007a1f00(uVar11,uVar14,&UNK_009f1b50);
      uStack_238 = uVar11;
      func_0x0059e480(&uStack_248);
      __Unwind_Resume(uVar6);
      lVar4 = func_0x007a2668();
      uStack_258 = 0x59ee94;
      uVar13 = 0;
      uVar15 = *(ulong *)(lVar4 + 0x10);
      auVar1._8_8_ = 0;
      auVar1._0_8_ = uVar15;
      uVar9 = uVar15 * 0x30;
      uStack_290 = uVar12;
      pdStack_288 = pdVar5;
      uStack_278 = uVar11;
      uStack_270 = uVar14;
      uStack_268 = uVar6;
      pppuStack_260 = &ppuStack_200;
      if ((SUB168(auVar1 * ZEXT816(0x30),8) == 0) && (uVar9 < 0x7ffffffffffffff9)) {
        if (uVar9 == 0) {
          uStack_2d8 = 0;
          pdStack_2d0 = &MACH_HEADER.cpusubtype;
code_r0x0059ef58:
          extraout_x8_02[1] = (ulong)pdStack_2d0;
          *extraout_x8_02 = uStack_2d8;
          extraout_x8_02[2] = uVar15;
          return;
        }
        lVar4 = *(long *)(lVar4 + 8);
        uVar13 = 8;
        pdVar5 = (dword *)func_0x00187bd0(uVar9,8);
        if (pdVar5 != (dword *)0x0) {
          uStack_2d8 = uVar15;
          pdStack_2d0 = pdVar5;
          if (uVar15 != 0) {
            uVar14 = 0;
            do {
              if (uVar9 == 0) break;
              func_0x005a51dc(&uStack_2c0,lVar4);
              uVar14 = uVar14 + 1;
              lVar4 = lVar4 + 0x30;
              *(undefined8 *)(pdVar5 + 2) = uStack_2b8;
              *(undefined8 *)pdVar5 = uStack_2c0;
              *(undefined8 *)(pdVar5 + 6) = uStack_2a8;
              *(undefined8 *)(pdVar5 + 4) = uStack_2b0;
              *(undefined8 *)(pdVar5 + 10) = uStack_298;
              *(undefined8 *)(pdVar5 + 8) = uStack_2a0;
              uVar9 = uVar9 - 0x30;
              pdVar5 = pdVar5 + 0xc;
            } while (uVar15 != uVar14);
          }
          goto code_r0x0059ef58;
        }
      }
      uVar11 = func_0x007a1f00(uVar13,uVar9,&UNK_009f1b50);
      uStack_2c8 = uVar13;
      func_0x0059e598(&uStack_2d8);
      __Unwind_Resume(uVar11);
      lVar4 = func_0x007a2668();
      uVar14 = *(ulong *)(lVar4 + 0x10);
      uVar9 = uVar14 * 4;
      if (uVar14 >> 0x3e == 0 && uVar9 < 0x7ffffffffffffffd) {
        uVar6 = *(undefined8 *)(lVar4 + 8);
        if (uVar9 == 0) {
          uVar12 = 0;
          uVar15 = 4;
        }
        else {
          uVar11 = 4;
          uVar15 = func_0x00187bd0(uVar9,4);
          if (uVar15 == 0) goto code_r0x0059f04c;
          uVar12 = uVar14;
        }
        _memcpy(uVar15,uVar6,uVar9);
        *extraout_x8_03 = uVar12;
        extraout_x8_03[1] = uVar15;
        extraout_x8_03[2] = uVar14;
        return;
      }
      uVar11 = 0;
code_r0x0059f04c:
      lVar4 = func_0x007a1f00(uVar11,uVar9,&UNK_009f1b38);
      if (*(long *)(lVar4 + 0x10) != 0) {
        puVar10 = *(undefined8 **)(lVar4 + 8);
        lVar4 = 1 - *(long *)(lVar4 + 0x10);
        do {
          plVar8 = (long *)*puVar10;
          if (plVar8 != (long *)0x0) {
            lVar3 = *plVar8;
            *plVar8 = lVar3 + -1;
            LORelease();
            if (lVar3 == 1) {
              func_0x005d2c74(puVar10);
            }
          }
          puVar10 = puVar10 + 3;
          lVar4 = lVar4 + 1;
        } while (lVar4 != 1);
      }
      return;
    }
  }
  _memcpy(lVar4);
  *unaff_x20 = unaff_x19;
  unaff_x20[1] = lVar4;
  unaff_x20[2] = unaff_x19;
  return;
}

