
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 *
FUN_0052abc0(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,
            long param_5)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  long lVar5;
  long extraout_x1;
  undefined8 *extraout_x1_00;
  long extraout_x1_01;
  undefined8 uVar6;
  undefined8 extraout_x1_02;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined8 *extraout_x8;
  undefined8 *extraout_x8_00;
  undefined8 *extraout_x8_01;
  undefined8 *extraout_x8_02;
  undefined8 *extraout_x8_03;
  undefined8 *extraout_x8_04;
  undefined8 *extraout_x8_05;
  undefined8 *extraout_x8_06;
  undefined8 *extraout_x8_07;
  undefined8 *unaff_x19;
  undefined8 *puVar10;
  undefined1 unaff_w20;
  ulong uVar11;
  long unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  undefined *puVar12;
  undefined8 uVar13;
  undefined *puVar14;
  undefined *unaff_x26;
  undefined1 auVar15 [16];
  long lStack_2f0;
  undefined8 uStack_2e8;
  undefined8 uStack_2e0;
  undefined8 *puStack_2d8;
  long lStack_2d0;
  undefined8 *puStack_2c8;
  undefined *puStack_2c0;
  undefined *puStack_2b8;
  undefined8 uStack_2b0;
  undefined8 uStack_2a8;
  undefined8 *puStack_2a0;
  long lStack_298;
  undefined8 uStack_290;
  undefined8 ****ppppuStack_280;
  undefined *puStack_278;
  ulong uStack_270;
  undefined8 ****ppppuStack_260;
  undefined *puStack_258;
  char cStack_250;
  byte bStack_24f;
  undefined8 uStack_248;
  undefined8 *puStack_240;
  undefined8 *puStack_238;
  undefined8 ****ppppuStack_230;
  undefined *puStack_228;
  long lStack_220;
  undefined8 uStack_218;
  undefined8 uStack_210;
  undefined8 *puStack_208;
  long lStack_200;
  undefined8 *puStack_1f8;
  undefined *puStack_1f0;
  undefined *puStack_1e8;
  undefined *puStack_1e0;
  undefined8 uStack_1d8;
  undefined8 *puStack_1d0;
  long lStack_1c8;
  ulong uStack_1c0;
  undefined8 ****ppppuStack_1b0;
  undefined *puStack_1a8;
  char cStack_1a0;
  byte bStack_19f;
  undefined8 uStack_198;
  undefined8 *puStack_190;
  undefined8 *puStack_188;
  long ***ppplStack_180;
  undefined *puStack_178;
  undefined *puStack_170;
  undefined8 *puStack_168;
  undefined8 *puStack_160;
  long lStack_158;
  undefined8 *puStack_150;
  undefined8 *puStack_148;
  undefined1 ***pppuStack_140;
  undefined *puStack_138;
  long lStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 *puStack_118;
  long lStack_110;
  undefined8 *puStack_108;
  undefined1 **ppuStack_c0;
  undefined *puStack_b8;
  char cStack_b0;
  undefined1 uStack_af;
  undefined8 uStack_a8;
  long lStack_a0;
  undefined8 *puStack_98;
  undefined1 *puStack_90;
  undefined8 uStack_88;
  long lStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  undefined1 auStack_6 [6];
  
  if (param_1 != (undefined8 *)0x0) {
    param_1[1] = 1;
    *param_1 = 1;
    *(undefined1 *)(param_1 + 2) = unaff_w20;
    *unaff_x19 = param_1;
    unaff_x19[1] = &UNK_009e9a50;
    uVar2 = _UNK_008a67f0;
    unaff_x19[3] = _UNK_008a67f8;
    unaff_x19[2] = uVar2;
    return param_1;
  }
  func_0x007a1f18(8,0x18);
  puVar3 = param_4;
  if (param_5 < 0) {
    puVar12 = (undefined *)0x0;
  }
  else {
    if (param_5 == 0) {
      lStack_60 = 1;
LAB_0052ac68:
      uVar2 = _memcpy(lStack_60,param_4,param_5);
      lStack_68 = param_5;
      lStack_58 = param_5;
      puVar3 = (undefined8 *)func_0x0052b7a0(&lStack_80,uVar2,extraout_x1);
      if (lStack_80 == -0x8000000000000000) {
        *extraout_x8 = 0;
        extraout_x8[1] = uStack_78;
      }
      else {
        puVar3 = (undefined8 *)func_0x00187bd0(0x28,8);
        if (puVar3 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
          pcVar1 = (code *)SoftwareBreakpoint(1,0x52ad18);
          (*pcVar1)();
        }
        puVar3[1] = 1;
        *puVar3 = 1;
        puVar3[2] = lStack_80;
        puVar3[3] = uStack_78;
        puVar3[4] = uStack_70;
        *extraout_x8 = puVar3;
        extraout_x8[1] = &UNK_009e9a70;
        uVar2 = _UNK_008a6800;
        extraout_x8[3] = _UNK_008a6808;
        extraout_x8[2] = uVar2;
      }
      return puVar3;
    }
    puVar12 = (undefined *)0x1;
    lStack_60 = func_0x00187bd0(param_5,1);
    unaff_x19 = extraout_x8;
    unaff_x21 = extraout_x1;
    unaff_x22 = param_4;
    if (lStack_60 != 0) goto LAB_0052ac68;
  }
  puVar7 = (undefined8 *)&UNK_009eaac8;
  puVar4 = (undefined8 *)func_0x007a1f00(puVar12,param_5);
  if (unaff_x21 != 0) {
    puVar7 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
    func_0x00187bd4(param_5,unaff_x21);
    unaff_x19 = puVar4;
  }
  auVar15 = __Unwind_Resume(puVar4);
  lVar5 = auVar15._8_8_;
  uStack_88 = 0x52ad50;
  lStack_a0 = param_5;
  puStack_98 = unaff_x19;
  puStack_90 = auStack_6 + -10;
  puVar4 = (undefined8 *)func_0x0052c198(&cStack_b0,auVar15._0_8_);
  if (cStack_b0 == '\x01') {
    *extraout_x8_00 = 0;
    extraout_x8_00[1] = uStack_a8;
  }
  else {
    puVar4 = (undefined8 *)func_0x00187bd0(0x18,8);
    if (puVar4 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x18);
      puStack_b8 = &DAT_0052adfc;
      puVar4 = puVar7;
      puVar8 = puVar3;
      ppuStack_c0 = &puStack_90;
      if ((long)puVar3 < 0) {
        puVar14 = (undefined *)0x0;
        puVar10 = extraout_x8_00;
      }
      else {
        unaff_x26 = &___rust_no_alloc_shim_is_unstable;
        if (puVar3 == (undefined8 *)0x0) {
          lStack_110 = 1;
code_r0x0052ae60:
          uVar2 = _memcpy(lStack_110,puVar7,puVar3);
          puStack_118 = puVar3;
          puStack_108 = puVar3;
          puVar3 = (undefined8 *)
                   func_0x0052babc(&lStack_130,uVar2,extraout_x1_00,lVar5,&puStack_118);
          if (lStack_130 == -0x8000000000000000) {
            *extraout_x8_01 = 0;
            extraout_x8_01[1] = uStack_128;
          }
          else {
            puVar3 = (undefined8 *)func_0x00187bd0(0x28,8);
            if (puVar3 == (undefined8 *)0x0) {
              func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
              pcVar1 = (code *)SoftwareBreakpoint(1,0x52af14);
              (*pcVar1)();
            }
            puVar3[1] = 1;
            *puVar3 = 1;
            puVar3[2] = lStack_130;
            puVar3[3] = uStack_128;
            puVar3[4] = uStack_120;
            *extraout_x8_01 = puVar3;
            extraout_x8_01[1] = &UNK_009e9a10;
            uVar2 = _UNK_008a67d0;
            extraout_x8_01[3] = _UNK_008a67d8;
            extraout_x8_01[2] = uVar2;
          }
          return puVar3;
        }
        puVar14 = (undefined *)0x1;
        lStack_110 = func_0x00187bd0(puVar3,1);
        puVar10 = extraout_x8_01;
        unaff_x21 = lVar5;
        unaff_x22 = extraout_x1_00;
        unaff_x23 = puVar7;
        if (lStack_110 != 0) {
          goto code_r0x0052ae60;
        }
      }
      puVar7 = (undefined8 *)func_0x007a1f00(puVar14,puVar3,&UNK_009eaac8);
      if (unaff_x21 != 0) {
        func_0x00187bd4(puVar3,unaff_x21,1);
        puVar10 = puVar7;
      }
      __Unwind_Resume(puVar7);
      puStack_138 = &DAT_0052af4c;
      puVar7 = puVar4;
      puVar9 = puVar8;
      puStack_170 = puVar12;
      puStack_168 = unaff_x23;
      puStack_160 = unaff_x22;
      lStack_158 = unaff_x21;
      puStack_150 = puVar3;
      puStack_148 = puVar10;
      pppuStack_140 = &ppuStack_c0;
      if ((long)puVar8 < 0) {
        uVar2 = 0;
      }
      else {
        if (puVar8 == (undefined8 *)0x0) {
          lVar5 = 1;
          puVar3 = (undefined8 *)func_0x00187bd0(0x28,8);
joined_r0x0052b00c:
          if (puVar3 == (undefined8 *)0x0) {
            func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
            pcVar1 = (code *)SoftwareBreakpoint(1,0x52b020);
            (*pcVar1)();
          }
          puVar3[1] = 1;
          *puVar3 = 1;
          puVar3[2] = puVar8;
          puVar3[3] = lVar5;
          puVar3[4] = puVar8;
          *extraout_x8_02 = puVar3;
          extraout_x8_02[1] = &UNK_009e9ab0;
          uVar2 = _UNK_008a6810;
          extraout_x8_02[3] = _UNK_008a6818;
          extraout_x8_02[2] = uVar2;
          return puVar3;
        }
        uVar2 = 1;
        lVar5 = func_0x00187bd0(puVar8,1);
        puVar3 = extraout_x8_02;
        unaff_x22 = puVar4;
        puVar12 = &___rust_no_alloc_shim_is_unstable;
        if (lVar5 != 0) {
          _memcpy(lVar5,puVar4,puVar8);
          puVar3 = (undefined8 *)func_0x00187bd0(0x28,8);
          goto joined_r0x0052b00c;
        }
      }
      puVar4 = (undefined8 *)func_0x007a1f00(uVar2,puVar8,&UNK_009eaac8);
      if (puVar8 != (undefined8 *)0x0) {
        func_0x00187bd4(unaff_x21,puVar8,1);
        puVar3 = puVar4;
      }
      __Unwind_Resume(puVar4);
      puStack_178 = &DAT_0052b058;
      puStack_190 = puVar3;
      puStack_188 = puVar8;
      ppplStack_180 = (long ***)&pppuStack_140;
      puVar3 = (undefined8 *)func_0x0052da6c(&cStack_1a0);
      if (cStack_1a0 == '\x01') {
        *extraout_x8_03 = 0;
        extraout_x8_03[1] = uStack_198;
      }
      else {
        uVar11 = (ulong)bStack_19f;
        puVar3 = (undefined8 *)func_0x00187bd0(0x18,8);
        if (puVar3 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x18);
          puStack_1a8 = &DAT_0052b0f0;
          puVar3 = puVar7;
          puVar4 = puVar9;
          puStack_1f0 = unaff_x26;
          puStack_1e8 = puVar14;
          puStack_1e0 = puVar12;
          uStack_1d8 = uVar2;
          puStack_1d0 = unaff_x22;
          lStack_1c8 = unaff_x21;
          uStack_1c0 = uVar11;
          ppppuStack_1b0 = &ppplStack_180;
          if ((long)puVar9 < 0) {
            uVar13 = 0;
            puVar8 = extraout_x8_03;
          }
          else {
            if (puVar9 == (undefined8 *)0x0) {
              lStack_200 = 1;
code_r0x0052b150:
              uVar2 = _memcpy(lStack_200,puVar7,puVar9);
              puStack_208 = puVar9;
              puStack_1f8 = puVar9;
              puVar3 = (undefined8 *)func_0x0052b7a0(&lStack_220,uVar2,extraout_x1_01);
              if (lStack_220 == -0x8000000000000000) {
                *extraout_x8_04 = 0;
                extraout_x8_04[1] = uStack_218;
              }
              else {
                puVar3 = (undefined8 *)func_0x00187bd0(0x28,8);
                if (puVar3 == (undefined8 *)0x0) {
                  func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
                  pcVar1 = (code *)SoftwareBreakpoint(1,0x52b200);
                  (*pcVar1)();
                }
                puVar3[1] = 1;
                *puVar3 = 1;
                puVar3[2] = lStack_220;
                puVar3[3] = uStack_218;
                puVar3[4] = uStack_210;
                *extraout_x8_04 = puVar3;
                extraout_x8_04[1] = &UNK_009e9a70;
                uVar2 = _UNK_008a6800;
                extraout_x8_04[3] = _UNK_008a6808;
                extraout_x8_04[2] = uVar2;
              }
              return puVar3;
            }
            uVar13 = 1;
            lStack_200 = func_0x00187bd0(puVar9,1);
            puVar8 = extraout_x8_04;
            unaff_x21 = extraout_x1_01;
            unaff_x22 = puVar7;
            puVar14 = &___rust_no_alloc_shim_is_unstable;
            if (lStack_200 != 0) {
              goto code_r0x0052b150;
            }
          }
          puVar12 = &UNK_009eaac8;
          puVar7 = (undefined8 *)func_0x007a1f00(uVar13,puVar9,&UNK_009eaac8);
          if (unaff_x21 != 0) {
            puVar12 = (undefined *)0x1;
            func_0x00187bd4(puVar9,unaff_x21,1);
            puVar8 = puVar7;
          }
          auVar15 = __Unwind_Resume(puVar7);
          lVar5 = auVar15._8_8_;
          puStack_228 = &DAT_0052b238;
          puStack_240 = puVar9;
          puStack_238 = puVar8;
          ppppuStack_230 = &ppppuStack_1b0;
          puVar4 = (undefined8 *)
                   func_0x0052c198(&cStack_250,auVar15._0_8_,lVar5,puVar12,puVar3,puVar4);
          if (cStack_250 == '\x01') {
            *extraout_x8_05 = 0;
            extraout_x8_05[1] = uStack_248;
          }
          else {
            puVar4 = (undefined8 *)func_0x00187bd0(0x18,8);
            if (puVar4 == (undefined8 *)0x0) {
              func_0x007a1f18(8,0x18);
              puStack_258 = &DAT_0052b2e4;
              uStack_270 = (ulong)bStack_24f;
              ppppuStack_260 = &ppppuStack_230;
              auVar15 = func_0x0052cecc();
              uVar6 = auVar15._8_8_;
              puVar4 = auVar15._0_8_;
              if (((ulong)puVar4 & 1) == 0) {
                puVar4 = (undefined8 *)func_0x00187bd0(0x18,8);
                if (puVar4 == (undefined8 *)0x0) {
                  func_0x007a1f18(8,0x18);
                  puStack_278 = &DAT_0052b364;
                  puStack_2c0 = unaff_x26;
                  puStack_2b8 = puVar14;
                  uStack_2b0 = uVar13;
                  uStack_2a8 = uVar2;
                  puStack_2a0 = unaff_x22;
                  lStack_298 = unaff_x21;
                  uStack_290 = uVar6;
                  ppppuStack_280 = &ppppuStack_260;
                  if ((long)puVar3 < 0) {
                    uVar2 = 0;
code_r0x0052b480:
                    uVar2 = func_0x007a1f00(uVar2,puVar3,&UNK_009eaac8);
                    if (unaff_x21 != 0) {
                      func_0x00187bd4(puVar3,unaff_x21,1);
                    }
                    __Unwind_Resume(uVar2);
                    return (undefined8 *)0x596b48cc04376e6;
                  }
                  if (puVar3 == (undefined8 *)0x0) {
                    lStack_2d0 = 1;
                  }
                  else {
                    uVar2 = 1;
                    lStack_2d0 = func_0x00187bd0(puVar3,1);
                    unaff_x21 = lVar5;
                    if (lStack_2d0 == 0) goto code_r0x0052b480;
                  }
                  uVar2 = _memcpy(lStack_2d0,puVar12,puVar3);
                  puStack_2d8 = puVar3;
                  puStack_2c8 = puVar3;
                  puVar3 = (undefined8 *)
                           func_0x0052babc(&lStack_2f0,uVar2,extraout_x1_02,lVar5,&puStack_2d8);
                  if (lStack_2f0 == -0x8000000000000000) {
                    *extraout_x8_07 = 0;
                    extraout_x8_07[1] = uStack_2e8;
                  }
                  else {
                    puVar3 = (undefined8 *)func_0x00187bd0(0x28,8);
                    if (puVar3 == (undefined8 *)0x0) {
                      func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
                      pcVar1 = (code *)SoftwareBreakpoint(1,0x52b47c);
                      (*pcVar1)();
                    }
                    puVar3[1] = 1;
                    *puVar3 = 1;
                    puVar3[2] = lStack_2f0;
                    puVar3[3] = uStack_2e8;
                    puVar3[4] = uStack_2e0;
                    *extraout_x8_07 = puVar3;
                    extraout_x8_07[1] = &UNK_009e9a10;
                    uVar2 = _UNK_008a67d0;
                    extraout_x8_07[3] = _UNK_008a67d8;
                    extraout_x8_07[2] = uVar2;
                  }
                  return puVar3;
                }
                puVar4[1] = 1;
                *puVar4 = 1;
                puVar4[2] = uVar6;
                *extraout_x8_06 = puVar4;
                extraout_x8_06[1] = &UNK_009e9a30;
                uVar2 = _UNK_008a67e0;
                extraout_x8_06[3] = _UNK_008a67e8;
                extraout_x8_06[2] = uVar2;
              }
              else {
                *extraout_x8_06 = 0;
                extraout_x8_06[1] = uVar6;
              }
              return puVar4;
            }
            puVar4[1] = 1;
            *puVar4 = 1;
            *(byte *)(puVar4 + 2) = bStack_24f;
            *extraout_x8_05 = puVar4;
            extraout_x8_05[1] = &UNK_009e9a90;
            uVar2 = _UNK_0089f380;
            extraout_x8_05[3] = _UNK_0089f388;
            extraout_x8_05[2] = uVar2;
          }
          return puVar4;
        }
        puVar3[1] = 1;
        *puVar3 = 1;
        *(byte *)(puVar3 + 2) = bStack_19f;
        *extraout_x8_03 = puVar3;
        extraout_x8_03[1] = &UNK_009e9a50;
        uVar2 = _UNK_008a67f0;
        extraout_x8_03[3] = _UNK_008a67f8;
        extraout_x8_03[2] = uVar2;
      }
      return puVar3;
    }
    puVar4[1] = 1;
    *puVar4 = 1;
    *(undefined1 *)(puVar4 + 2) = uStack_af;
    *extraout_x8_00 = puVar4;
    extraout_x8_00[1] = &UNK_009e9a90;
    uVar2 = _UNK_0089f380;
    extraout_x8_00[3] = _UNK_0089f388;
    extraout_x8_00[2] = uVar2;
  }
  return puVar4;
}

