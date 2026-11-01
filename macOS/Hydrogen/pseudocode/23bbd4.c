
/* WARNING: Possible PIC construction at 0x0023bc90: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0023c25c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0023c260) */

void FUN_0023bbd4(undefined8 param_1,undefined8 param_2,long param_3,long param_4,long param_5,
                 long *param_6,long *param_7,ulong param_8,undefined8 param_9,long param_10,
                 undefined8 param_11,long param_12,long param_13)

{
  long lVar1;
  undefined1 *puVar2;
  long lVar3;
  dword *pdVar4;
  long *plVar5;
  long lVar6;
  undefined8 uVar7;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x29;
  undefined1 auVar8 [16];
  undefined1 uStack00000000000001c8;
  undefined1 auStack_410 [8];
  long lStack_408;
  long lStack_400;
  undefined8 uStack_3f8;
  long lStack_3f0;
  long lStack_3e8;
  long lStack_3e0;
  long lStack_3d8;
  dword *pdStack_3d0;
  long lStack_3c8;
  long lStack_3c0;
  long lStack_3b8;
  long lStack_3b0;
  long lStack_3a8;
  dword *pdStack_3a0;
  long lStack_398;
  long lStack_390;
  long lStack_388;
  long lStack_380;
  long lStack_378;
  long lStack_370;
  long lStack_368;
  dword *pdStack_360;
  long lStack_358;
  long lStack_350;
  long lStack_348;
  undefined8 uStack_340;
  undefined8 uStack_338;
  undefined8 uStack_330;
  undefined8 uStack_328;
  long lStack_320;
  dword *pdStack_318;
  long lStack_310;
  long lStack_308;
  long lStack_300;
  long lStack_2f8;
  long lStack_2f0;
  long lStack_2e8;
  long lStack_2e0;
  long lStack_2d8;
  long lStack_2d0;
  long lStack_2c8;
  long lStack_2c0;
  long lStack_2b8;
  long lStack_2b0;
  long lStack_2a8;
  long lStack_2a0;
  undefined8 uStack_298;
  undefined8 uStack_290;
  undefined2 uStack_288;
  undefined6 uStack_286;
  undefined8 uStack_280;
  long lStack_278;
  dword *pdStack_270;
  long lStack_268;
  long lStack_260;
  long lStack_258;
  long lStack_250;
  long lStack_248;
  long lStack_240;
  long lStack_238;
  long lStack_230;
  long lStack_228;
  long lStack_220;
  undefined2 uStack_218;
  undefined2 uStack_216;
  undefined4 uStack_214;
  undefined1 uStack_210;
  undefined7 uStack_20f;
  long lStack_208;
  long lStack_200;
  long lStack_1f8;
  undefined8 uStack_1f0;
  undefined1 uStack_1e8;
  undefined7 uStack_1e7;
  undefined1 auStack_1e0 [24];
  undefined1 auStack_1c8 [72];
  long lStack_180;
  long lStack_178;
  long lStack_170;
  dword *pdStack_168;
  long lStack_160;
  long lStack_158;
  long lStack_150;
  undefined1 auStack_148 [16];
  long lStack_138;
  undefined1 auStack_130 [12];
  undefined4 uStack_124;
  long lStack_120;
  long lStack_118;
  long lStack_110;
  dword *pdStack_108;
  long lStack_100;
  long lStack_f8;
  long lStack_f0;
  long lStack_e8;
  long lStack_e0;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_60;
  undefined8 uStack_8;
  
  func_0x0016b09c();
  func_0x001a1118(&uStack00000000000001c8);
  if (*unaff_x20 != 0) {
    uVar7 = 2;
    uStack_8 = (undefined *)0x23bc94;
    puVar2 = (undefined1 *)register0x00000008;
    pdVar4 = (dword *)unaff_x20[1];
    lVar6 = *unaff_x20 << 2;
    lVar3 = unaff_x29;
code_r0x00187bd4:
    *(long *)(puVar2 + -0x10) = lVar3;
    *(undefined **)(puVar2 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(pdVar4,lVar6,uVar7);
    return;
  }
  lVar3 = **(long **)(unaff_x19 + 0x50);
  **(long **)(unaff_x19 + 0x50) = lVar3 + -1;
  LORelease();
  if (lVar3 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa1d4();
  }
  func_0x00230538(unaff_x19 + 0x18);
  func_0x002314e0();
  __Unwind_Resume();
  auVar8 = func_0x007a2668();
  lVar1 = param_13;
  lVar6 = param_12;
  uVar7 = param_9;
  lStack_3e8 = auVar8._8_8_;
  plVar5 = auVar8._0_8_;
  uStack_60 = 1;
  uStack_8 = (undefined *)0x23bd20;
  lVar3 = (long)register0x00000008 + -0x10;
  puVar2 = auStack_410;
  uStack_3f8 = param_11;
  lStack_3f0 = param_10;
  lStack_3d8 = 0;
  pdStack_3d0 = &MACH_HEADER.cpusubtype;
  lStack_3c8 = 0;
  lStack_3e0 = param_4;
  (**(code **)(param_7[2] + 0x28))
            (&lStack_380,param_7[1],*(undefined8 *)(*param_7 + 8),*(undefined8 *)(*param_7 + 0x10));
  if (lStack_380 == -0x8000000000000000) {
    lStack_178 = lStack_370;
    lStack_180 = lStack_378;
    pdStack_168 = pdStack_360;
    lStack_170 = lStack_368;
    lStack_158 = lStack_350;
    lStack_160 = lStack_358;
    lStack_150 = lStack_348;
    uStack_78 = CONCAT62(uStack_78._2_6_,4);
    auStack_130._0_8_ = 0x8000000000000001;
    stack0xfffffffffffffed8 = (dword *)CONCAT44(uStack_124,0xd0001);
    func_0x00248ae4(param_5,auStack_130,*(char *)(param_5 + 0x49) == '\x02');
    *(undefined1 *)(param_5 + 0x335) = 1;
    plVar5[2] = lStack_370;
    plVar5[1] = lStack_378;
    plVar5[4] = (long)pdStack_360;
    plVar5[3] = lStack_368;
    plVar5[6] = lStack_350;
    plVar5[5] = lStack_358;
    plVar5[7] = lStack_348;
    *plVar5 = 0;
    lVar3 = lStack_3c8 + 1;
    pdVar4 = pdStack_3d0;
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x0016abd8(pdVar4);
      pdVar4 = pdVar4 + 10;
    }
    if (lStack_3d8 != 0) {
      uVar7 = 8;
      puVar2 = (undefined1 *)register0x00000008;
      pdVar4 = pdStack_3d0;
      lVar6 = lStack_3d8 * 0x28;
      lVar3 = unaff_x29;
      goto code_r0x00187bd4;
    }
  }
  else {
    lStack_408 = lVar6;
    lStack_400 = lVar1;
    lStack_3b0 = lStack_370;
    lStack_3b8 = lStack_378;
    pdStack_3a0 = pdStack_360;
    lStack_3a8 = lStack_368;
    lStack_390 = lStack_350;
    lStack_398 = lStack_358;
    lStack_388 = lStack_348;
    lVar6 = lStack_388;
    lStack_3c0 = lStack_380;
    if (*(long *)(param_5 + 0x2c0) == 1) {
      *(undefined8 *)(param_5 + 0x2c0) = 2;
    }
    lStack_388._0_4_ = (undefined4)lStack_348;
    lStack_120 = lStack_378;
    stack0xfffffffffffffed8 = (dword *)lStack_380;
    lStack_118 = lStack_370;
    lStack_110 = CONCAT44(lStack_110._4_4_,(undefined4)lStack_388);
    auStack_130[0] = 5;
    lStack_388 = lVar6;
    func_0x001d9010(&lStack_3d8,&UNK_009c9638);
    *(dword **)(pdStack_3d0 + 2) = stack0xfffffffffffffed8;
    *(undefined8 *)pdStack_3d0 = auStack_130._0_8_;
    *(long *)(pdStack_3d0 + 6) = lStack_118;
    *(long *)(pdStack_3d0 + 4) = lStack_120;
    *(long *)(pdStack_3d0 + 8) = lStack_110;
    lStack_3c8 = 1;
    auStack_130._2_2_ = 5;
    auStack_130[0] = 0xb;
    if (lStack_3d8 == 1) {
      func_0x001d9010(&lStack_3d8,&UNK_009c9650);
    }
    *(dword **)(pdStack_3d0 + 0xc) = stack0xfffffffffffffed8;
    *(undefined8 *)(pdStack_3d0 + 10) = auStack_130._0_8_;
    *(long *)(pdStack_3d0 + 0x10) = lStack_118;
    *(long *)(pdStack_3d0 + 0xe) = lStack_120;
    *(long *)(pdStack_3d0 + 0x12) = lStack_110;
    lStack_3c8 = 2;
    if ((param_8 & 1) != 0) {
      auStack_130._2_2_ = (short)uVar7;
      auStack_130[0] = 6;
      if (lStack_3d8 == 2) {
        func_0x001d9010(&lStack_3d8,&UNK_009c9668);
      }
      *(dword **)(pdStack_3d0 + 0x16) = stack0xfffffffffffffed8;
      *(undefined8 *)(pdStack_3d0 + 0x14) = auStack_130._0_8_;
      *(long *)(pdStack_3d0 + 0x1a) = lStack_118;
      *(long *)(pdStack_3d0 + 0x18) = lStack_120;
      *(long *)(pdStack_3d0 + 0x1c) = lStack_110;
      lStack_3c8 = 3;
    }
    lStack_258 = *(long *)(param_3 + 0x28);
    lStack_260 = *(long *)(param_3 + 0x20);
    lStack_248 = *(long *)(param_3 + 0x38);
    lStack_250 = *(long *)(param_3 + 0x30);
    stack0xfffffffffffffed8 = pdStack_3d0;
    lStack_120 = lStack_3c8;
    uStack_214 = *(undefined4 *)(lStack_3e0 + 0x48);
    lStack_238 = param_6[1];
    lStack_240 = *param_6;
    lStack_228 = param_6[3];
    lStack_230 = param_6[2];
    lStack_220 = param_6[4];
    lStack_268 = lStack_3c8;
    pdStack_270 = pdStack_3d0;
    lStack_278 = lStack_3d8;
    uStack_1e8 = 2;
    uStack_280 = 0x8000000000000002;
    uStack_218 = 4;
    uStack_210 = 0;
    auStack_148._0_8_ = 0;
    auStack_148._8_8_ = 1;
    lStack_138 = 0;
    auStack_130._0_8_ = 0x8000000000000000;
    lStack_118 = lStack_260;
    lStack_110 = lStack_258;
    pdStack_108 = (dword *)lStack_250;
    lStack_100 = lStack_248;
    lStack_f8 = lStack_240;
    lStack_f0 = lStack_238;
    lStack_e8 = lStack_230;
    lStack_e0 = lStack_228;
    lStack_d8 = lStack_220;
    func_0x001bb074(&uStack_280,auStack_148,auStack_130);
    lVar6 = lStack_3e8;
    stack0xfffffffffffffed8 = (dword *)auStack_148._8_8_;
    auStack_130._0_8_ = auStack_148._0_8_;
    lStack_120 = lStack_138;
    lStack_2c0 = CONCAT44(uStack_214,CONCAT22(uStack_216,uStack_218));
    lStack_2b8 = CONCAT71(uStack_20f,uStack_210);
    lStack_b8 = lStack_220;
    lStack_a0 = lStack_208;
    uStack_290 = CONCAT71(uStack_1e7,uStack_1e8);
    lStack_90 = lStack_1f8;
    lStack_98 = lStack_200;
    uStack_88 = uStack_1f0;
    lStack_f0 = lStack_258;
    lStack_f8 = lStack_260;
    lStack_e0 = lStack_248;
    lStack_e8 = lStack_250;
    lStack_d0 = lStack_238;
    lStack_d8 = lStack_240;
    lStack_c0 = lStack_228;
    lStack_c8 = lStack_230;
    lStack_110 = lStack_278;
    lStack_118 = uStack_280;
    lStack_100 = lStack_268;
    pdStack_108 = pdStack_270;
    uStack_288 = 4;
    lStack_2a8 = lStack_200;
    lStack_2b0 = lStack_208;
    uStack_298 = uStack_1f0;
    lStack_2a0 = lStack_1f8;
    lStack_2f8 = lStack_250;
    lStack_300 = lStack_258;
    lStack_2e8 = lStack_240;
    lStack_2f0 = lStack_248;
    lStack_2d8 = lStack_230;
    lStack_2e0 = lStack_238;
    lStack_2c8 = lStack_220;
    lStack_2d0 = lStack_228;
    uStack_338 = auStack_148._8_8_;
    uStack_340 = auStack_148._0_8_;
    uStack_328 = uStack_280;
    uStack_330 = lStack_138;
    pdStack_318 = pdStack_270;
    lStack_320 = lStack_278;
    lStack_308 = lStack_260;
    lStack_310 = lStack_268;
    lStack_b0 = lStack_2c0;
    lStack_a8 = lStack_2b8;
    uStack_80 = uStack_290;
    if ((*(byte *)(param_5 + 0x331) & 1) == 0) {
      uStack_78 = CONCAT62(uStack_78._2_6_,4);
      auStack_130._0_8_ = 0x8000000000000001;
      uStack_124 = auStack_148._12_4_;
      stack0xfffffffffffffed8 = (dword *)CONCAT44(uStack_124,0x10001);
      func_0x00248ae4(param_5,auStack_130,*(char *)(param_5 + 0x49) == '\x02');
      *(undefined1 *)(param_5 + 0x335) = 1;
      *(undefined1 *)(plVar5 + 2) = 0x1b;
      *plVar5 = 0;
      plVar5[1] = -0x7fffffffffffffe6;
      func_0x00230610(&uStack_340);
      if (lStack_398 != 0) {
        pdVar4 = pdStack_3a0;
        do {
          *(undefined1 *)pdVar4 = 0;
          lStack_398 = lStack_398 + -1;
          pdVar4 = (dword *)((long)pdVar4 + 1);
        } while (lStack_398 != 0);
      }
      lStack_398 = 0;
      pdVar4 = pdStack_3a0;
      for (lVar6 = lStack_3a8; lVar6 != 0; lVar6 = lVar6 + -1) {
        *(undefined1 *)pdVar4 = 0;
        pdVar4 = (dword *)((long)pdVar4 + 1);
      }
      if (lStack_3a8 != 0) {
        uVar7 = 1;
        uStack_8 = &UNK_0023c260;
        pdVar4 = pdStack_3a0;
        lVar6 = lStack_3a8;
        goto code_r0x00187bd4;
      }
    }
    else {
      auVar8 = (**(code **)(*(long *)(lStack_3e8 + 0x30) + 0x20))
                         (*(undefined8 *)(lStack_3e8 + 0x28));
      (**(code **)(auVar8._8_8_ + 0x30))(auVar8._0_8_,1,0);
      (**(code **)(auVar8._8_8_ + 0x28))(&uStack_280,auVar8._0_8_);
      func_0x001d9854(lVar6,&uStack_340);
      lStack_a8 = lStack_2b8;
      lStack_b0 = lStack_2c0;
      lStack_98 = lStack_2a8;
      lStack_a0 = lStack_2b0;
      uStack_78 = CONCAT62(uStack_286,uStack_288);
      uStack_88 = uStack_298;
      lStack_90 = lStack_2a0;
      uStack_80 = uStack_290;
      lStack_e8 = lStack_2f8;
      lStack_f0 = lStack_300;
      lStack_d8 = lStack_2e8;
      lStack_e0 = lStack_2f0;
      lStack_c8 = lStack_2d8;
      lStack_d0 = lStack_2e0;
      lStack_b8 = lStack_2c8;
      lStack_c0 = lStack_2d0;
      stack0xfffffffffffffed8 = (dword *)uStack_338;
      auStack_130._0_8_ = uStack_340;
      lStack_118 = uStack_328;
      lStack_120 = uStack_330;
      pdStack_108 = pdStack_318;
      lStack_110 = lStack_320;
      lStack_f8 = lStack_308;
      lStack_100 = lStack_310;
      func_0x00248ae4(param_5,auStack_130,0);
      if (lStack_3f0 == 0) {
        auVar8 = (**(code **)(*(long *)(lStack_3e0 + 0x18) + 0x18))
                           (*(undefined8 *)(lStack_3e0 + 0x10),0);
      }
      else {
        auVar8 = (**(code **)(*(long *)(lStack_3e0 + 0x18) + 0x20))
                           (*(undefined8 *)(lStack_3e0 + 0x10),0);
        lStack_120 = lStack_3e0;
        _auStack_130 = auVar8;
        func_0x0023482c(auStack_130,&uStack_280,
                        lStack_408 + (*(long *)(lStack_400 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10
                        ,lStack_400,param_3,param_5);
      }
      lStack_138 = lStack_3e0;
      stack0xfffffffffffffed8 = pdStack_3a0;
      auStack_130._0_8_ = lStack_3a8;
      lStack_118 = lStack_390;
      lStack_120 = lStack_398;
      auStack_148 = auVar8;
      func_0x00234b64(auStack_1e0,auStack_148,auStack_130);
      (**(code **)(*(long *)(lVar6 + 0x30) + 0x18))(auStack_1c8,*(undefined8 *)(lVar6 + 0x28));
      func_0x00235094(auStack_130,auStack_1e0,auStack_1c8,
                      lStack_408 + (*(long *)(lStack_400 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10,
                      *(undefined8 *)(lStack_400 + 0x20),*(undefined8 *)(lStack_400 + 0x28),param_3,
                      param_5);
      func_0x00236e70(lStack_120,&lStack_d0,param_5);
      plVar5[0x11] = lStack_a8;
      plVar5[0x10] = lStack_b0;
      plVar5[0x13] = lStack_98;
      plVar5[0x12] = lStack_a0;
      plVar5[0x14] = lStack_90;
      plVar5[9] = lStack_e8;
      plVar5[8] = lStack_f0;
      plVar5[0xb] = lStack_d8;
      plVar5[10] = lStack_e0;
      plVar5[0xd] = lStack_c8;
      plVar5[0xc] = lStack_d0;
      plVar5[0xf] = lStack_b8;
      plVar5[0xe] = lStack_c0;
      plVar5[1] = (long)stack0xfffffffffffffed8;
      *plVar5 = auStack_130._0_8_;
      plVar5[3] = lStack_118;
      plVar5[2] = lStack_120;
      plVar5[5] = (long)pdStack_108;
      plVar5[4] = lStack_110;
      plVar5[7] = lStack_f8;
      plVar5[6] = lStack_100;
    }
  }
  return;
}

