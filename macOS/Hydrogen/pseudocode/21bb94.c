
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void thunk_FUN_0021bc10(undefined8 param_1,undefined8 param_2,long param_3,byte *param_4,
                       undefined8 param_5)

{
  undefined1 uVar1;
  undefined8 *puVar2;
  int iVar3;
  long lVar4;
  undefined4 *puVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 uVar8;
  long *extraout_x8;
  code *pcVar9;
  long lVar10;
  undefined8 uVar11;
  undefined1 auVar12 [16];
  undefined8 in_stack_00000008;
  ulong *in_stack_00000018;
  undefined8 uStack_388;
  undefined1 uStack_37d;
  undefined4 uStack_37c;
  ushort uStack_378;
  undefined2 uStack_376;
  long lStack_370;
  long lStack_368;
  long lStack_360;
  long lStack_358;
  long lStack_350;
  long lStack_348;
  long lStack_340;
  long lStack_338;
  undefined8 uStack_330;
  undefined8 uStack_328;
  long lStack_320;
  undefined8 uStack_318;
  undefined8 uStack_310;
  undefined8 uStack_308;
  ulong uStack_300;
  long lStack_2f8;
  long lStack_2f0;
  undefined8 uStack_2e8;
  undefined8 uStack_2e0;
  undefined8 uStack_2d8;
  undefined8 uStack_2d0;
  undefined8 *puStack_2c8;
  long lStack_2c0;
  undefined8 *puStack_2b8;
  undefined8 uStack_2b0;
  undefined8 uStack_2a8;
  undefined8 uStack_2a0;
  undefined8 uStack_298;
  undefined8 uStack_290;
  undefined8 uStack_288;
  long lStack_280;
  long lStack_278;
  long lStack_270;
  long lStack_268;
  long lStack_260;
  long lStack_258;
  long lStack_250;
  long lStack_240;
  long lStack_238;
  long lStack_230;
  long lStack_228;
  long lStack_220;
  long lStack_218;
  long lStack_210;
  long lStack_208;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  long lStack_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  ulong uStack_1d0;
  long lStack_1c8;
  long lStack_1c0;
  undefined8 uStack_1b8;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 *puStack_198;
  long lStack_190;
  undefined8 *puStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  long lStack_150;
  long lStack_148;
  long lStack_140;
  undefined8 uStack_138;
  undefined4 *puStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  long lStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined1 uStack_e8;
  undefined8 uStack_e0;
  long lStack_d8;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  undefined8 uStack_b0;
  undefined4 *puStack_a8;
  undefined8 uStack_a0;
  undefined2 uStack_98;
  undefined2 uStack_96;
  undefined4 uStack_94;
  long lStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined1 auStack_71 [17];
  
  if ((*in_stack_00000018 | 0x8000000000000000) != 0x8000000000000000) {
    param_3 = 1;
    func_0x00187bd4(in_stack_00000008);
  }
  __Unwind_Resume();
  auVar12 = func_0x007a2668();
  uVar6 = auVar12._8_8_;
  lVar4 = auVar12._0_8_;
  uStack_37d = 0;
  pcVar9 = *(code **)(param_3 + 0x20);
  iVar3 = (*pcVar9)(uVar6,&uStack_37d,1);
  lVar7 = _UNK_00828170;
  if (iVar3 != 0) {
    extraout_x8[1] = _UNK_00828178;
    *extraout_x8 = lVar7;
    if ((*param_4 & 1) != 0) {
      return;
    }
    lVar7 = *(long *)(param_4 + 8);
    if (lVar7 == -0x8000000000000000 || lVar7 == 0) {
      return;
    }
    uVar8 = 1;
    uVar6 = *(undefined8 *)(param_4 + 0x10);
    goto LAB_0021c13c;
  }
  uVar8 = *(undefined8 *)(lVar4 + 0x18);
  lVar7 = *(long *)(lVar4 + 0x20);
  (**(code **)(lVar7 + 0x50))(&uStack_37c,uVar8);
  uVar1 = uStack_37d;
  lVar10 = *(long *)(lVar4 + 0x10);
  if (lVar10 < 0) {
    uStack_388 = 0;
LAB_0021c1ac:
    func_0x007a1f00(uStack_388,lVar10,&UNK_009c24c0);
    goto LAB_0021c1dc;
  }
  uVar11 = *(undefined8 *)(lVar4 + 8);
  if (lVar10 == 0) {
    lVar4 = 1;
  }
  else {
    uStack_388 = 1;
    lVar4 = func_0x00187bd0(lVar10,1);
    if (lVar4 == 0) goto LAB_0021c1ac;
  }
  _memcpy(lVar4,uVar11,lVar10);
  puVar5 = (undefined4 *)func_0x00187bd0(8,2);
  if (puVar5 == (undefined4 *)0x0) {
    func_0x007a1f18(2,8);
    goto LAB_0021c1dc;
  }
  *puVar5 = uStack_37c;
  *(ushort *)(puVar5 + 1) = uStack_378;
  *(undefined2 *)((long)puVar5 + 6) = uStack_376;
  uStack_94 = CONCAT31(uStack_94._1_3_,uVar1);
  uStack_98 = 0;
  uStack_b0 = 1;
  uStack_a0 = 1;
  lStack_c8 = lVar10;
  lStack_c0 = lVar4;
  lStack_b8 = lVar10;
  puStack_a8 = puVar5;
  func_0x003f0da0(&lStack_90,&UNK_00827e1c,6);
  if (lStack_90 == -0x7fffffffffffffff) {
    func_0x007a2810(&UNK_00827aba,0x2b,auStack_71,&UNK_009c69d8,&UNK_009c6c20);
    goto LAB_0021c1dc;
  }
  uStack_f8 = uStack_88;
  lStack_100 = lStack_90;
  uStack_f0 = uStack_80;
  lStack_148 = lStack_c0;
  lStack_150 = lStack_c8;
  uStack_138 = uStack_b0;
  lStack_140 = lStack_b8;
  uStack_128 = uStack_a0;
  puStack_130 = puStack_a8;
  uStack_120 = CONCAT44(uStack_94,CONCAT22(uStack_96,uStack_98));
  uStack_118 = 0;
  uStack_110 = 8;
  uStack_108 = 0;
  uStack_e8 = 0;
  uStack_e0 = uVar8;
  lStack_d8 = lVar7;
  func_0x0021c3f4(&lStack_240,&lStack_150,param_4,0,uVar6,param_3,0);
  lStack_278 = lStack_230;
  lStack_280 = lStack_238;
  lStack_268 = lStack_220;
  lStack_270 = lStack_228;
  lStack_258 = lStack_210;
  lStack_260 = lStack_218;
  lStack_250 = lStack_208;
  if (lStack_240 == -0x8000000000000000) {
    extraout_x8[2] = lStack_230;
    extraout_x8[1] = lStack_238;
    extraout_x8[4] = lStack_220;
    extraout_x8[3] = lStack_228;
    extraout_x8[6] = lStack_210;
    extraout_x8[5] = lStack_218;
    extraout_x8[7] = lStack_208;
    *extraout_x8 = -0x7fffffffffffffe8;
    func_0x0016af10(&lStack_150);
    return;
  }
  uStack_2a8 = uStack_178;
  uStack_2b0 = uStack_180;
  uStack_298 = uStack_168;
  uStack_2a0 = uStack_170;
  uStack_288 = uStack_158;
  uStack_290 = uStack_160;
  uStack_2e8 = uStack_1b8;
  lStack_2f0 = lStack_1c0;
  uStack_2d8 = uStack_1a8;
  uStack_2e0 = uStack_1b0;
  puStack_2c8 = puStack_198;
  uStack_2d0 = uStack_1a0;
  puStack_2b8 = puStack_188;
  lStack_2c0 = lStack_190;
  uStack_328 = uStack_1f8;
  uStack_330 = uStack_200;
  uStack_318 = uStack_1e8;
  lStack_320 = lStack_1f0;
  uStack_308 = uStack_1d8;
  uStack_310 = uStack_1e0;
  lStack_2f8 = lStack_1c8;
  uStack_300 = uStack_1d0;
  lStack_360 = lStack_230;
  lStack_368 = lStack_238;
  lStack_350 = lStack_220;
  lStack_358 = lStack_228;
  lStack_340 = lStack_210;
  lStack_348 = lStack_218;
  lStack_338 = lStack_208;
  lStack_370 = lStack_240;
  func_0x0016af10(&lStack_150);
  func_0x0021ddd0(&lStack_240,&lStack_370,param_5,0,0);
  if (2 < uStack_378) {
    func_0x007a23bc(&UNK_009c6c50);
    goto LAB_0021c1dc;
  }
  lVar7 = lStack_230 + 0x10;
  if (lVar7 < 0) {
    uVar8 = 0;
  }
  else {
    uVar8 = 1;
    lVar4 = func_0x00187bdc(lVar7,1);
    if (lVar4 != 0) {
      iVar3 = (*pcVar9)(uVar6,lVar4,lVar7);
      lVar10 = _UNK_00828170;
      if (iVar3 == 0) {
        extraout_x8[1] = lStack_348;
        *extraout_x8 = lStack_350;
        extraout_x8[2] = lStack_340;
        extraout_x8[3] = lVar7;
        extraout_x8[4] = lVar4;
        extraout_x8[5] = lVar7;
        *(undefined4 *)(extraout_x8 + 6) = uStack_37c;
        *(ushort *)((long)extraout_x8 + 0x34) = uStack_378;
        *(undefined2 *)((long)extraout_x8 + 0x36) = uStack_376;
        *(undefined1 *)(extraout_x8 + 7) = uStack_37d;
        if (lStack_240 != 0) {
          func_0x00187bd4(lStack_238,lStack_240,1);
        }
        if ((lStack_320 != -0x8000000000000000) && (lStack_320 != 0)) {
          func_0x00187bd4(uStack_318,lStack_320,1);
        }
        puVar2 = puStack_2b8;
        lVar7 = lStack_2c0;
        if (lStack_2c0 != 0) {
          if ((code *)*puStack_2b8 != (code *)0x0) {
            (*(code *)*puStack_2b8)(lStack_2c0);
          }
          lVar4 = puVar2[1];
          if (lVar4 != 0) {
            func_0x00187bd4(lVar7,lVar4,puVar2[2]);
          }
        }
        if (lStack_370 != 0) {
          func_0x00187bd4(lStack_368,lStack_370,1);
        }
        puVar2 = puStack_2c8;
        uVar6 = uStack_2d0;
        if ((code *)*puStack_2c8 != (code *)0x0) {
          (*(code *)*puStack_2c8)(uStack_2d0);
        }
        lVar7 = puVar2[1];
        if (lVar7 != 0) {
          func_0x00187bd4(uVar6,lVar7,puVar2[2]);
        }
        if ((((uStack_300 & 1) == 0) && (lStack_2f8 != -0x8000000000000000)) && (lStack_2f8 != 0)) {
          lVar7 = lStack_2f0;
          lVar4 = lStack_2f8;
          goto LAB_0021c024;
        }
      }
      else {
        extraout_x8[1] = _UNK_00828178;
        *extraout_x8 = lVar10;
        func_0x00187bd4(lVar4,lVar7,1);
        if (lStack_240 != 0) {
          func_0x00187bd4(lStack_238,lStack_240,1);
        }
        if ((lStack_320 != -0x8000000000000000) && (lStack_320 != 0)) {
          func_0x00187bd4(uStack_318,lStack_320,1);
        }
        puVar2 = puStack_2b8;
        lVar7 = lStack_2c0;
        if (lStack_2c0 != 0) {
          if ((code *)*puStack_2b8 != (code *)0x0) {
            (*(code *)*puStack_2b8)(lStack_2c0);
          }
          lVar4 = puVar2[1];
          if (lVar4 != 0) {
            func_0x00187bd4(lVar7,lVar4,puVar2[2]);
          }
        }
        if (lStack_370 != 0) {
          func_0x00187bd4(lStack_368,lStack_370,1);
        }
        puVar2 = puStack_2c8;
        uVar6 = uStack_2d0;
        if ((code *)*puStack_2c8 != (code *)0x0) {
          (*(code *)*puStack_2c8)(uStack_2d0);
        }
        lVar7 = puVar2[1];
        if (lVar7 != 0) {
          func_0x00187bd4(uVar6,lVar7,puVar2[2]);
        }
        if ((((uStack_300 & 1) == 0) && (lStack_2f8 != -0x8000000000000000)) && (lStack_2f8 != 0)) {
          func_0x00187bd4(lStack_2f0,lStack_2f8,1);
        }
        if (lStack_350 != 0) {
          lVar7 = lStack_348;
          lVar4 = lStack_350;
LAB_0021c024:
          func_0x00187bd4(lVar7,lVar4,1);
        }
      }
      if (lStack_338 == 0) {
        return;
      }
      lVar7 = lStack_338 << 2;
      uVar8 = 2;
      uVar6 = uStack_330;
LAB_0021c13c:
      func_0x00187bd4(uVar6,lVar7,uVar8);
      return;
    }
  }
  func_0x007a1f00(uVar8,lVar7,&UNK_009c6c38);
LAB_0021c1dc:
                    /* WARNING: Does not return */
  pcVar9 = (code *)SoftwareBreakpoint(1,0x21c1e0);
  (*pcVar9)();
}

