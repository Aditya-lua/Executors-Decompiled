
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004980e0(undefined8 param_1,undefined8 param_2,undefined1 param_3)

{
  undefined1 uVar1;
  ulong uVar2;
  ulong uVar3;
  code *pcVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  char cVar9;
  int iVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  undefined8 *extraout_x8;
  dword *pdVar13;
  undefined *puVar14;
  dword *pdVar15;
  dword *pdVar16;
  undefined8 uVar17;
  long lVar18;
  dword *pdVar19;
  ulong uVar20;
  undefined1 auVar21 [16];
  undefined1 auStack_7ffffffe [2147482765];
  undefined1 uStack_371;
  dword *pdStack_370;
  dword *pdStack_368;
  dword *pdStack_360;
  dword *pdStack_358;
  long lStack_350;
  long lStack_340;
  dword *pdStack_338;
  dword *pdStack_330;
  dword *pdStack_320;
  dword *pdStack_318;
  dword *pdStack_310;
  dword *pdStack_308;
  dword *pdStack_300;
  dword *pdStack_2f8;
  dword *pdStack_2f0;
  long lStack_2e8;
  dword *pdStack_2e0;
  dword *pdStack_2d8;
  dword *pdStack_2d0;
  dword *pdStack_2c8;
  undefined *puStack_2c0;
  long lStack_2b8;
  undefined8 *puStack_2b0;
  long lStack_2a8;
  dword *pdStack_2a0;
  long lStack_298;
  dword *pdStack_290;
  undefined8 uStack_288;
  dword *pdStack_280;
  dword *pdStack_278;
  dword *pdStack_270;
  dword *pdStack_268;
  long lStack_260;
  dword *pdStack_258;
  dword *pdStack_250;
  long lStack_248;
  dword *pdStack_240;
  undefined8 uStack_238;
  undefined8 uStack_230;
  ulong uStack_228;
  dword *pdStack_220;
  undefined8 uStack_218;
  undefined8 uStack_210;
  undefined4 uStack_208;
  undefined4 uStack_204;
  undefined8 uStack_200;
  undefined1 uStack_1f8;
  undefined7 uStack_1f7;
  dword *pdStack_1f0;
  long lStack_1e8;
  undefined8 *puStack_1e0;
  dword *pdStack_1d8;
  long lStack_1d0;
  dword *pdStack_1c8;
  undefined8 uStack_1c0;
  dword *pdStack_1b0;
  dword *pdStack_1a8;
  dword *pdStack_1a0;
  dword *pdStack_198;
  long lStack_190;
  dword *pdStack_188;
  dword *pdStack_180;
  long lStack_178;
  dword *pdStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  ulong uStack_158;
  dword *pdStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  dword *pdStack_120;
  dword *pdStack_118;
  long lStack_110;
  undefined8 *puStack_108;
  long lStack_100;
  long lStack_f8;
  dword *pdStack_f0;
  dword *pdStack_e8;
  ulong uStack_e0;
  dword *pdStack_d8;
  undefined *puStack_d0;
  undefined8 uStack_c8;
  dword *pdStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  dword *pdStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  dword *pdStack_90;
  long lStack_88;
  dword *pdStack_80;
  undefined1 auStack_71 [17];
  
  uStack_371 = param_3;
  func_0x004a1f14(auStack_7ffffffe + 0x8000087e);
  __Unwind_Resume();
  auVar21 = func_0x007a2668();
  uVar3 = ___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E;
  if (___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3) {
    if (((___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3) &&
        ((bRam0000000000a2a690 - 1 < 2 ||
         ((bRam0000000000a2a690 != 0 && (cVar9 = func_0x007b1274(0xa2a680), cVar9 != '\0')))))) &&
       (iVar10 = func_0x005e7964(lRam0000000000a2a680), iVar10 != 0)) {
      if (*(long *)(lRam0000000000a2a680 + 0x38) != 0) {
        pdVar13 = *(dword **)(lRam0000000000a2a680 + 0x30);
        if (pdVar13 != (dword *)0x0) {
          pdStack_270 = *(dword **)(lRam0000000000a2a680 + 0x40);
          pdStack_278 = *(dword **)(lRam0000000000a2a680 + 0x38);
          pdStack_268 = *(dword **)(lRam0000000000a2a680 + 0x48);
          lStack_260 = 0;
          pdStack_308 = (dword *)&pdStack_280;
          pdStack_300 = (dword *)&uStack_371;
          pdStack_2f8 = (dword *)&UNK_009e2208;
          pdStack_370 = (dword *)&pdStack_308;
          pdStack_368 = (dword *)0x1;
          pdStack_360 = (dword *)(lRam0000000000a2a680 + 0x30);
          pdStack_280 = pdVar13;
          func_0x005e699c(&pdStack_1b0,lRam0000000000a2a680,&pdStack_370);
          goto code_r0x004981ac;
        }
      }
      func_0x007a23d8(&UNK_0089f1aa,0x22,&UNK_009e21f0);
      goto code_r0x00498b4c;
    }
    pdStack_1b0 = (dword *)((long)&MACH_HEADER.magic + 2);
    lStack_190 = 0;
code_r0x004981ac:
    pdStack_368 = pdStack_1a8;
    pdStack_370 = pdStack_1b0;
    pdStack_358 = pdStack_198;
    pdStack_360 = pdStack_1a0;
    lStack_350 = lStack_190;
    if (pdStack_1b0 != (dword *)((long)&MACH_HEADER.magic + 2)) {
      func_0x005ec344(&pdStack_370,&pdStack_358);
    }
  }
  func_0x004bab5c(&pdStack_280,auVar21._0_8_,auVar21._8_8_,uStack_371);
  if (pdStack_280 == (dword *)0x8000000000000001) {
    pdStack_1a8 = pdStack_270;
    pdStack_1b0 = pdStack_278;
    pdStack_1a0 = pdStack_268;
    func_0x007a2810(&UNK_0089ef3a,0x2b,&pdStack_1b0,&UNK_009e2160,&UNK_009e2228);
  }
  else {
    pdStack_318 = pdStack_270;
    pdStack_320 = pdStack_278;
    pdStack_310 = pdStack_268;
    pdStack_338 = pdStack_258;
    lStack_340 = lStack_260;
    pdStack_330 = pdStack_250;
    if (pdStack_280 == (dword *)0x8000000000000000) {
      extraout_x8[1] = pdStack_270;
      *extraout_x8 = pdStack_278;
      extraout_x8[2] = pdStack_268;
code_r0x00498940:
      if ((((uVar3 < 3) && (pdStack_370 != (dword *)((long)&MACH_HEADER.magic + 2))) &&
          (func_0x005ec378(&pdStack_370,&pdStack_358), pdVar13 = pdStack_370,
          pdStack_370 != (dword *)((long)&MACH_HEADER.magic + 2))) &&
         (func_0x005ec3ac(&pdStack_370,pdStack_358), pdVar13 != (dword *)0x0)) {
        lVar8 = *(long *)pdStack_368;
        *(long *)pdStack_368 = lVar8 + -1;
        LORelease();
        if (lVar8 == 1) {
          DataMemoryBarrier(2,1);
          func_0x005e80f0((ulong)&pdStack_370 | 8);
        }
      }
      return;
    }
    pdStack_308 = pdStack_280;
    pdStack_2f8 = pdStack_270;
    pdStack_300 = pdStack_278;
    pdStack_2f0 = pdStack_268;
    pdStack_2e0 = pdStack_258;
    lStack_2e8 = lStack_260;
    pdStack_2d8 = pdStack_250;
    pdStack_2d0 = (dword *)0x0;
    pdStack_2c8 = &MACH_HEADER.cpusubtype;
    puStack_2c0 = (undefined *)0x0;
    puVar11 = (undefined8 *)func_0x00187bd0(0x10,8);
    if (puVar11 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x10);
    }
    else {
      pdStack_280 = (dword *)((long)&MACH_HEADER.magic + 1);
      pdStack_278 = (dword *)0x0;
      pdStack_270 = (dword *)0x0;
      pdStack_268 = &MACH_HEADER.cpusubtype;
      lStack_260 = 0;
      pdStack_258 = (dword *)0x0;
      pdStack_250 = &MACH_HEADER.cpusubtype;
      pdStack_240 = _UNK_007fc118;
      lStack_248 = _UNK_007fc110;
      uStack_228 = uStack_228 & 0xffffffffffffff00;
      puVar12 = (undefined8 *)func_0x00187bd0(0x60,8);
      if (puVar12 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x60);
      }
      else {
        puVar12[5] = pdStack_258;
        puVar12[4] = lStack_260;
        puVar12[7] = lStack_248;
        puVar12[6] = pdStack_250;
        puVar12[9] = uStack_238;
        puVar12[8] = pdStack_240;
        puVar12[0xb] = uStack_228;
        puVar12[10] = uStack_230;
        puVar12[1] = pdStack_278;
        *puVar12 = pdStack_280;
        puVar12[3] = pdStack_268;
        puVar12[2] = pdStack_270;
        lStack_2a8 = 1;
        *puVar11 = puVar12;
        puVar11[1] = pdStack_2d8;
        lStack_2b8 = 1;
        puStack_2b0 = puVar11;
        do {
          lStack_2a8 = lStack_2a8 + -1;
          pdVar13 = (dword *)puStack_2b0[lStack_2a8 * 2];
          pdStack_90 = pdVar13;
          func_0x0047bad8(&pdStack_280,&pdStack_2f0,&pdStack_308,(puStack_2b0 + lStack_2a8 * 2)[1]);
          puVar14 = puStack_2c0;
          uStack_138 = CONCAT44(uStack_204,uStack_208);
          uStack_148 = uStack_218;
          pdStack_150 = pdStack_220;
          uStack_140 = uStack_210;
          uStack_128 = CONCAT71(uStack_1f7,uStack_1f8);
          uStack_130 = uStack_200;
          pdStack_188 = pdStack_258;
          lStack_190 = lStack_260;
          lStack_178 = lStack_248;
          pdStack_180 = pdStack_250;
          uStack_168 = uStack_238;
          pdStack_170 = pdStack_240;
          uStack_158 = uStack_228;
          uStack_160 = uStack_230;
          pdStack_1a8 = pdStack_278;
          pdStack_1b0 = pdStack_280;
          pdStack_198 = pdStack_268;
          pdStack_1a0 = pdStack_270;
          lStack_110 = lStack_1e8;
          pdStack_118 = pdStack_1f0;
          puStack_108 = puStack_1e0;
          lStack_298 = lStack_1d0;
          pdStack_2a0 = pdStack_1d8;
          uStack_288 = uStack_1c0;
          pdStack_290 = pdStack_1c8;
          pdStack_120 = pdVar13;
          if ((dword *)puStack_2c0 == pdStack_2d0) {
            func_0x004ab120(&pdStack_2d0,&UNK_009e2240);
          }
          pdVar13 = pdStack_2c8 + (long)puVar14 * 0x2c;
          *(dword **)(pdVar13 + 6) = pdStack_198;
          *(dword **)(pdVar13 + 4) = pdStack_1a0;
          *(dword **)(pdVar13 + 10) = pdStack_188;
          *(long *)(pdVar13 + 8) = lStack_190;
          *(ulong *)(pdVar13 + 0x16) = uStack_158;
          *(undefined8 *)(pdVar13 + 0x14) = uStack_160;
          *(undefined8 *)(pdVar13 + 0x1a) = uStack_148;
          *(dword **)(pdVar13 + 0x18) = pdStack_150;
          *(long *)(pdVar13 + 0xe) = lStack_178;
          *(dword **)(pdVar13 + 0xc) = pdStack_180;
          *(undefined8 *)(pdVar13 + 0x12) = uStack_168;
          *(dword **)(pdVar13 + 0x10) = pdStack_170;
          *(dword **)(pdVar13 + 0x26) = pdStack_118;
          *(dword **)(pdVar13 + 0x24) = pdStack_120;
          *(undefined8 **)(pdVar13 + 0x2a) = puStack_108;
          *(long *)(pdVar13 + 0x28) = lStack_110;
          *(undefined8 *)(pdVar13 + 0x1e) = uStack_138;
          *(undefined8 *)(pdVar13 + 0x1c) = uStack_140;
          *(undefined8 *)(pdVar13 + 0x22) = uStack_128;
          *(undefined8 *)(pdVar13 + 0x20) = uStack_130;
          *(dword **)(pdVar13 + 2) = pdStack_1a8;
          *(dword **)pdVar13 = pdStack_1b0;
          puStack_2c0 = puVar14 + 1;
          puStack_d0 = (undefined *)((long)pdStack_2a0 + lStack_298 + 1);
          pdStack_f0 = pdStack_2a0 + (lStack_298 * -2 + -2) * 2;
          pdStack_e8 = pdStack_2a0;
          pdStack_d8 = pdStack_2a0 + 2;
          lVar8 = *(long *)pdStack_2a0;
          uStack_e0 = CONCAT17(-(-1 < lVar8),
                               CONCAT16(-(-1 < (char)((ulong)lVar8 >> 0x30)),
                                        CONCAT15(-(-1 < (char)((ulong)lVar8 >> 0x28)),
                                                 CONCAT14(-(-1 < (char)((ulong)lVar8 >> 0x20)),
                                                          CONCAT13(-(-1 < (char)((ulong)lVar8 >>
                                                                                0x18)),
                                                                   CONCAT12(-(-1 < (char)((ulong)
                                                  lVar8 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar8 >> 8)),
                                                           -(-1 < (char)lVar8)))))))) &
                      0x8080808080808080;
          lStack_f8 = lStack_298 * 0x11 + 0x19;
          lStack_100 = (ulong)(lStack_298 != 0) << 3;
          uStack_c8 = uStack_288;
          func_0x0048bc28(&lStack_2b8,&lStack_100,&UNK_009e2258);
          pdVar13 = pdStack_2c8;
        } while (lStack_2a8 != 0);
        if (puStack_2c0 == (undefined *)0x0) {
          func_0x007a23bc(&UNK_009e2270);
        }
        else {
          pdVar16 = *(dword **)(pdStack_2c8 + 0x24);
          lVar8 = *(long *)pdVar16;
          *(long *)pdVar16 = lVar8 + 1;
          if (lVar8 < 0) {
            func_0x007a05dc();
          }
          else {
            uVar17 = *(undefined8 *)(pdStack_2c8 + 0x20);
            pdStack_1f0 = pdVar16;
            if (*(long *)(pdStack_2c8 + 0x18) == -0x8000000000000000) {
              pdStack_c0 = (dword *)0x8000000000000000;
            }
            else {
              func_0x0045cd08(&pdStack_c0);
            }
            func_0x0048c4ac(&pdStack_a8,pdVar13,&UNK_009e2180);
            uVar1 = *(undefined1 *)(pdVar13 + 0x22);
            func_0x0048d344(&pdStack_90,pdVar13 + 6,&UNK_009e5310);
            func_0x0048d5d8(&pdStack_2a0,pdVar13 + 0xc,&UNK_009e5328);
            pdStack_1a0 = pdStack_80;
            lStack_190 = lStack_298;
            pdStack_198 = pdStack_2a0;
            pdStack_188 = pdStack_290;
            lStack_260 = lStack_88;
            pdStack_268 = pdStack_90;
            pdStack_250 = pdStack_2a0;
            pdStack_258 = pdStack_80;
            pdStack_240 = pdStack_290;
            lStack_248 = lStack_298;
            uStack_208 = pdVar13[0x1e];
            uStack_204 = pdVar13[0x1f];
            uStack_210 = uStack_b0;
            uStack_218 = uStack_b8;
            pdStack_220 = pdStack_c0;
            pdStack_270 = (dword *)uStack_98;
            pdStack_278 = (dword *)uStack_a0;
            pdStack_280 = pdStack_a8;
            uStack_230 = *(undefined8 *)(pdVar13 + 0x14);
            uStack_238 = *(undefined8 *)(pdVar13 + 0x12);
            uStack_228 = *(ulong *)(pdVar13 + 0x16);
            uStack_200 = uVar17;
            uStack_1f8 = uVar1;
            func_0x0048c4ac(&lStack_1e8,pdVar13 + 0x26,&UNK_009e20e8);
            pdVar13 = pdStack_1f0;
            pdStack_c0 = pdStack_1f0;
            func_0x00492f7c(&pdStack_280);
            if (pdStack_1d8 != (dword *)0x0) {
              lVar8 = 1 - (long)pdStack_1d8;
              puVar11 = puStack_1e0;
              do {
                lVar5 = *(long *)*puVar11;
                *(long *)*puVar11 = lVar5 + -1;
                LORelease();
                if (lVar5 == 1) {
                  func_0x005d2ac4(puVar11);
                }
                puVar11 = puVar11 + 1;
                lVar8 = lVar8 + 1;
              } while (lVar8 != 1);
            }
            if (lStack_1e8 != 0) {
              func_0x00187bd4(puStack_1e0,lStack_1e8 << 3,8);
            }
            pdStack_268 = pdStack_2c8 + (long)puStack_2c0 * 0x2c;
            pdStack_280 = pdStack_2c8;
            pdStack_278 = pdStack_2c8;
            pdStack_270 = pdStack_2d0;
            func_0x004b5a44(&pdStack_1b0,&pdStack_280);
            pdStack_a8 = pdVar13;
            func_0x00491bc4(&pdStack_280,&pdStack_1b0,(long)(pdVar13 + 2) * 0x517cc1b727220a95,
                            &pdStack_a8);
            pdVar19 = pdStack_268;
            pdVar16 = pdStack_270;
            pdVar13 = pdStack_278;
            if (pdStack_278 != (dword *)0x8000000000000000) {
              lVar8 = *(long *)pdStack_280;
              *(long *)pdStack_280 = lVar8 + -1;
              LORelease();
              if (lVar8 == 1) {
                func_0x005d2b20(&pdStack_280);
              }
              if (pdVar19 != (dword *)0x0) {
                lVar8 = 0;
                lVar5 = 1 - (long)pdVar19;
                do {
                  lVar6 = **(long **)((long)pdVar16 + lVar8);
                  **(long **)((long)pdVar16 + lVar8) = lVar6 + -1;
                  LORelease();
                  if (lVar6 == 1) {
                    func_0x005d2ac4((undefined *)((long)pdVar16 + lVar8));
                  }
                  lVar8 = lVar8 + 8;
                  lVar5 = lVar5 + 1;
                } while (lVar5 != 1);
              }
              if (pdVar13 != (dword *)0x0) {
                func_0x00187bd4(pdVar16,(long)pdVar13 << 3,8);
              }
            }
            if (*(long *)pdStack_a8 == 1) {
              lVar5 = *(long *)(pdStack_a8 + 4);
              lVar6 = *(long *)(pdStack_a8 + 6);
              lVar8 = *(long *)(pdStack_a8 + 8);
              pdStack_278 = *(dword **)(pdStack_a8 + 0xc);
              pdStack_280 = *(dword **)(pdStack_a8 + 10);
              pdStack_270 = *(dword **)(pdStack_a8 + 0xe);
              uVar20 = *(ulong *)(pdStack_a8 + 0x10);
              uVar17 = *(undefined8 *)(pdStack_a8 + 0x12);
              func_0x00187bd4(pdStack_a8,0x60,8);
              lStack_88 = (long)pdStack_278;
              pdStack_90 = pdStack_280;
              pdStack_80 = pdStack_270;
              if ((uVar20 | 0x8000000000000000) != 0x8000000000000000) {
                func_0x00187bd4(uVar17,uVar20,1);
              }
              if (lVar8 != 0) {
                lVar18 = 0;
                lVar8 = 1 - lVar8;
                do {
                  lVar7 = **(long **)(lVar6 + lVar18);
                  **(long **)(lVar6 + lVar18) = lVar7 + -1;
                  LORelease();
                  if (lVar7 == 1) {
                    func_0x005d2ac4(lVar6 + lVar18);
                  }
                  lVar18 = lVar18 + 8;
                  lVar8 = lVar8 + 1;
                } while (lVar8 != 1);
              }
              if (lVar5 != 0) {
                func_0x00187bd4(lVar6,lVar5 << 3,8);
              }
              func_0x00499fc8(&pdStack_90,&pdStack_1b0);
              func_0x005d731c(&pdStack_90,1);
              pdStack_2a0 = (dword *)0x0;
              lStack_298 = 1;
              pdStack_290 = (dword *)0x0;
              pdStack_270 = (dword *)0xe0000020;
              pdStack_280 = (dword *)&pdStack_2a0;
              pdStack_278 = (dword *)&UNK_009e2088;
              iVar10 = func_0x005afc10(&pdStack_90,&pdStack_280);
              if (iVar10 == 0) {
                extraout_x8[1] = lStack_298;
                *extraout_x8 = pdStack_2a0;
                extraout_x8[2] = pdStack_290;
                puVar14 = (undefined *)((long)pdStack_80 + 1);
                lVar8 = lStack_88;
                while (puVar14 = puVar14 + -1, puVar14 != (undefined *)0x0) {
                  func_0x00488488(lVar8);
                  lVar8 = lVar8 + 0x108;
                }
                if (pdStack_90 != (dword *)0x0) {
                  func_0x00187bd4(lStack_88,(long)pdStack_90 * 0x108,8);
                }
                pdVar13 = pdStack_1a8;
                if (pdStack_1a8 != (dword *)0x0) {
                  if (pdStack_198 != (dword *)0x0) {
                    pdVar19 = pdStack_1b0 + 2;
                    lVar8 = *(long *)pdStack_1b0;
                    uVar20 = CONCAT17(-(-1 < lVar8),
                                      CONCAT16(-(-1 < (char)((ulong)lVar8 >> 0x30)),
                                               CONCAT15(-(-1 < (char)((ulong)lVar8 >> 0x28)),
                                                        CONCAT14(-(-1 < (char)((ulong)lVar8 >> 0x20)
                                                                  ),CONCAT13(-(-1 < (char)((ulong)
                                                  lVar8 >> 0x18)),
                                                  CONCAT12(-(-1 < (char)((ulong)lVar8 >> 0x10)),
                                                           CONCAT11(-(-1 < (char)((ulong)lVar8 >> 8)
                                                                     ),-(-1 < (char)lVar8)))))))) &
                             0x8080808080808080;
                    pdVar16 = pdStack_1b0;
                    pdVar15 = pdStack_198;
                    do {
                      while (uVar20 == 0) {
                        lVar8 = *(long *)pdVar19;
                        pdVar16 = pdVar16 + -0x40;
                        pdVar19 = pdVar19 + 2;
                        uVar20 = CONCAT17(-(-1 < lVar8),
                                          CONCAT16(-(-1 < (char)((ulong)lVar8 >> 0x30)),
                                                   CONCAT15(-(-1 < (char)((ulong)lVar8 >> 0x28)),
                                                            CONCAT14(-(-1 < (char)((ulong)lVar8 >>
                                                                                  0x20)),
                                                                     CONCAT13(-(-1 < (char)((ulong)
                                                  lVar8 >> 0x18)),
                                                  CONCAT12(-(-1 < (char)((ulong)lVar8 >> 0x10)),
                                                           CONCAT11(-(-1 < (char)((ulong)lVar8 >> 8)
                                                                     ),-(-1 < (char)lVar8)))))))) &
                                 0x8080808080808080;
                      }
                      uVar2 = (uVar20 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                              (uVar20 >> 7 & 0xff00ff00ff00ff) << 8;
                      uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 |
                              (uVar2 & 0xffff0000ffff) << 0x10;
                      func_0x00490a30(pdVar16 + (-8 - (LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) &
                                                      0x78U)));
                      uVar20 = uVar20 - 1 & uVar20;
                      pdVar15 = (dword *)((long)pdVar15 + -1);
                    } while (pdVar15 != (dword *)0x0);
                  }
                  lVar8 = (long)pdVar13 * 0x21 + 0x29;
                  if (lVar8 != 0) {
                    func_0x00187bd4(pdStack_1b0 + ((long)pdVar13 * -4 + -4) * 2,lVar8,8);
                  }
                }
                if (lStack_2a8 != 0) {
                  lVar8 = 1 - lStack_2a8;
                  puVar11 = puStack_2b0;
                  do {
                    lVar5 = *(long *)*puVar11;
                    *(long *)*puVar11 = lVar5 + -1;
                    LORelease();
                    if (lVar5 == 1) {
                      func_0x005d2b20(puVar11);
                    }
                    puVar11 = puVar11 + 2;
                    lVar8 = lVar8 + 1;
                  } while (lVar8 != 1);
                }
                if (lStack_2b8 != 0) {
                  func_0x00187bd4(puStack_2b0,lStack_2b8 << 4,8);
                }
                func_0x00493bd8(&pdStack_308);
                goto code_r0x00498940;
              }
              func_0x007a2810(&UNK_0089edb1,0x37,auStack_71,&UNK_009e2100,&UNK_009e20b8);
            }
            else {
              pdStack_280 = pdStack_a8;
              func_0x007a2810(&UNK_0089ef3a,0x2b,&pdStack_280,&UNK_009e2120,&UNK_009e2288);
            }
          }
        }
      }
    }
  }
code_r0x00498b4c:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x498b50);
  (*pcVar4)();
}

