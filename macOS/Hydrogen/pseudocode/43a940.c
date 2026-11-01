
void FUN_0043a940(void)

{
  ulong uVar1;
  long lVar2;
  undefined4 uVar3;
  long lVar4;
  int iVar5;
  ulong uVar6;
  undefined8 uVar7;
  ulong *puVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  ulong *puVar12;
  ulong extraout_x8;
  undefined1 uVar13;
  ulong uVar14;
  long lVar15;
  undefined8 *puVar16;
  undefined1 auVar17 [16];
  undefined8 in_stack_000000b0;
  long *in_stack_00000130;
  long in_stack_00000138;
  long *in_stack_00000140;
  long *in_stack_00000148;
  long in_stack_00000340;
  undefined8 in_stack_00000348;
  long in_stack_00000370;
  undefined8 in_stack_00000378;
  undefined1 auStack_7ffffffe [2147482546];
  undefined4 uStack_44c;
  undefined2 uStack_448;
  undefined4 uStack_446;
  undefined2 uStack_442;
  undefined8 uStack_440;
  ulong uStack_438;
  undefined8 uStack_430;
  undefined8 uStack_428;
  undefined8 uStack_420;
  undefined8 uStack_418;
  undefined8 uStack_410;
  undefined8 uStack_408;
  undefined8 uStack_400;
  undefined8 uStack_3f8;
  undefined8 uStack_3f0;
  undefined8 uStack_3e8;
  ulong uStack_3e0;
  undefined8 uStack_3d8;
  undefined8 uStack_3d0;
  undefined8 uStack_3c8;
  undefined8 uStack_3c0;
  undefined8 uStack_3b8;
  ulong *puStack_380;
  long lStack_378;
  long lStack_370;
  undefined8 uStack_368;
  undefined8 uStack_360;
  undefined8 uStack_358;
  long lStack_350;
  long *plStack_348;
  long lStack_340;
  undefined8 uStack_338;
  undefined8 uStack_330;
  undefined8 uStack_318;
  undefined8 uStack_310;
  undefined8 uStack_308;
  undefined8 uStack_300;
  undefined8 uStack_2f8;
  undefined8 uStack_2f0;
  undefined8 uStack_2e8;
  undefined8 uStack_2e0;
  undefined8 uStack_2d8;
  undefined8 uStack_2d0;
  undefined8 uStack_2c8;
  long lStack_2c0;
  long *plStack_2b8;
  long lStack_2b0;
  undefined8 auStack_2a0 [3];
  undefined8 uStack_288;
  undefined8 uStack_280;
  undefined8 uStack_278;
  undefined8 uStack_270;
  undefined8 uStack_268;
  undefined8 uStack_260;
  undefined8 uStack_258;
  undefined8 uStack_250;
  undefined8 uStack_248;
  undefined8 uStack_240;
  undefined8 uStack_238;
  ulong *puStack_230;
  long lStack_228;
  long lStack_220;
  ulong *puStack_1f8;
  long lStack_1f0;
  long lStack_1e8;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  long lStack_1c8;
  long *plStack_1c0;
  long lStack_1b8;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
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
  ulong uStack_138;
  ulong *puStack_130;
  long lStack_128;
  long lStack_120;
  ulong uStack_118;
  ulong uStack_110;
  ulong *puStack_108;
  long lStack_100;
  ulong uStack_f8;
  ulong uStack_f0;
  undefined1 uStack_e8;
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
  
  uVar11 = 8;
  func_0x00187bd4();
  if (in_stack_00000370 != 0) {
    uVar11 = 8;
    func_0x00187bd4(in_stack_00000378,in_stack_00000370 << 5);
  }
  if (in_stack_00000340 != 0) {
    uVar11 = 8;
    func_0x00187bd4(in_stack_00000348,in_stack_00000340 << 4);
  }
  lVar4 = *in_stack_00000130;
  *in_stack_00000130 = lVar4 + -1;
  LORelease();
  if (lVar4 == 1) {
    DataMemoryBarrier(2,1);
    func_0x00403ad4(auStack_7ffffffe + 0x80000316);
  }
  if (*in_stack_00000140 != -0x8000000000000000) {
    func_0x003f73ec(in_stack_00000140);
  }
  if ((in_stack_00000138 == -0x8000000000000000) && (*in_stack_00000148 != -0x8000000000000000)) {
    func_0x003f73ec(in_stack_00000148);
  }
  func_0x003f73ec(in_stack_000000b0);
  __Unwind_Resume();
  func_0x007a2668();
  auVar17 = func_0x007a2668();
  lVar10 = auVar17._8_8_;
  puVar16 = auVar17._0_8_;
  lVar2 = *(long *)(lVar10 + 0x1d8);
  uVar9 = *(ulong *)(lVar10 + 0x1e0);
  lVar4 = 0;
  lVar15 = 0;
  if (uVar9 != 0) {
    if (uVar9 == 1) {
      lVar4 = 0;
    }
    else {
      lVar4 = 0;
      uVar14 = uVar9;
      do {
        lVar15 = (uVar14 >> 1) + lVar4;
        if (*(ulong *)(lVar2 + lVar15 * 0x20 + 8) <= uVar11) {
          lVar4 = lVar15;
        }
        uVar14 = uVar14 - (uVar14 >> 1);
      } while (1 < uVar14);
    }
    uVar14 = *(ulong *)(lVar2 + lVar4 * 0x20 + 8);
    if (uVar14 == uVar11) {
      lVar15 = 1;
    }
    else {
      lVar15 = 0;
      if (uVar14 < uVar11) {
        lVar4 = lVar4 + 1;
      }
    }
  }
  uVar14 = lVar15 + lVar4;
  if (uVar9 < uVar14) {
    uVar6 = func_0x007a28a4(uVar14,uVar9,&UNK_009d9cd8);
    uVar14 = extraout_x8;
code_r0x0043ada8:
    uVar7 = func_0x007a2570(uVar6,uVar14,&UNK_009d9cf0);
    if ((char)uStack_2c8 == '\x02') {
      func_0x003f6210(&puStack_380);
    }
    puVar8 = (ulong *)__Unwind_Resume(uVar7);
    uStack_44c = 0;
    uStack_448 = 0x1b6;
    uStack_442 = 0;
    uStack_446 = 1;
    func_0x00416de4(&uStack_440,&uStack_44c);
    uVar3 = uStack_440._4_4_;
    if ((uStack_440 & 1) == 0) {
      uStack_3c8 = 0;
      uStack_3d0 = 0;
      uStack_3b8 = 0;
      uStack_3c0 = 0;
      uStack_3e8 = 0;
      uStack_3f0 = 0;
      uStack_3d8 = 0;
      uStack_3e0 = 0;
      uStack_408 = 0;
      uStack_410 = 0;
      uStack_3f8 = 0;
      uStack_400 = 0;
      uStack_428 = 0;
      uStack_430 = 0;
      uStack_418 = 0;
      uStack_420 = 0;
      uStack_438 = 0;
      uStack_440 = 0;
      iVar5 = _fstat(uVar3,&uStack_440);
      uVar11 = uStack_3e0;
      if (iVar5 == -1) {
        ___error();
        *puVar8 = 0;
      }
      else {
        uVar9 = _mmap(0,uStack_3e0,1,2,uVar3,0);
        if (uVar9 != 0xffffffffffffffff) {
          puVar8[1] = uVar9;
          puVar8[2] = uVar11;
        }
        *puVar8 = (ulong)(uVar9 != 0xffffffffffffffff);
      }
      _close(uVar3);
    }
    else if ((int)uStack_440 == 0) {
      _close(uStack_440._4_4_);
      *puVar8 = 0;
    }
    else {
      if ((uStack_438 & 3) == 1) {
        uVar7 = *(undefined8 *)(uStack_438 - 1);
        puVar16 = *(undefined8 **)(uStack_438 + 7);
        if ((code *)*puVar16 != (code *)0x0) {
          (*(code *)*puVar16)(uVar7);
        }
        if (puVar16[1] != 0) {
          func_0x00187bd4(uVar7,puVar16[1],puVar16[2]);
        }
        func_0x00187bd4((undefined8 *)(uStack_438 - 1),0x18,8);
      }
      *puVar8 = 0;
    }
    return;
  }
  if (uVar14 != uVar9) {
    uVar1 = uVar11 + 1;
    lVar4 = uVar9 * 0x20 + uVar14 * -0x20;
    puVar8 = (ulong *)(lVar2 + uVar14 * 0x20);
    do {
      if (uVar1 <= puVar8[3]) break;
      if ((uVar11 < puVar8[1]) && (*puVar8 < uVar1)) {
        uVar6 = puVar8[2];
        uVar14 = *(ulong *)(lVar10 + 0x1f0);
        if (uVar14 <= uVar6) goto code_r0x0043ada8;
        puVar12 = (ulong *)(*(long *)(lVar10 + 0x1e8) + uVar6 * 0x230);
        puStack_380 = puVar8;
        if (puVar12 != (ulong *)0x0) {
          puStack_1f8 = puVar12;
          func_0x0040e04c(&puStack_1f8,puVar12);
          uStack_138 = uVar11;
          puStack_130 = puVar12;
          lStack_128 = lVar10 + 0x1d0;
          lStack_120 = lVar10 + 0x1d8;
          uStack_118 = uVar11;
          uStack_110 = uVar1;
          puStack_108 = puVar8 + 4;
          lStack_100 = lVar2 + uVar9 * 0x20;
          uStack_f8 = uVar11;
          uStack_f0 = uVar1;
          uStack_e8 = 0;
          func_0x0040fb84(&puStack_380,&puStack_1f8,&uStack_138);
          uStack_288 = uStack_318;
          uStack_280 = uStack_310;
          uStack_278 = uStack_308;
          uStack_270 = uStack_300;
          uStack_268 = uStack_2f8;
          uStack_260 = uStack_2f0;
          uStack_258 = uStack_2e8;
          uStack_250 = uStack_2e0;
          uStack_248 = uStack_2d8;
          uStack_240 = uStack_2d0;
          uStack_238 = uStack_2c8;
          goto joined_r0x0043ac44;
        }
        break;
      }
      lVar4 = lVar4 + -0x20;
      puVar8 = puVar8 + 4;
    } while (lVar4 != 0);
  }
  puStack_380 = (ulong *)CONCAT44(puStack_380._4_4_,3);
code_r0x0043aaf8:
  puVar16[5] = uStack_358;
  puVar16[4] = uStack_360;
  puVar16[7] = plStack_348;
  puVar16[6] = lStack_350;
  puVar16[9] = uStack_338;
  puVar16[8] = lStack_340;
  puVar16[10] = uStack_330;
  puVar16[1] = lStack_378;
  *puVar16 = puStack_380;
  puVar16[3] = uStack_368;
  puVar16[2] = lStack_370;
  return;
joined_r0x0043ac44:
  if ((char)uStack_2c8 == '\x02') goto code_r0x0043aaf8;
  uVar11 = *puStack_380;
  *puStack_380 = uVar11 - 1;
  LORelease();
  lStack_2c0 = lStack_350;
  plStack_2b8 = plStack_348;
  lStack_2b0 = lStack_340;
  puStack_230 = puStack_380;
  lStack_228 = lStack_378;
  lStack_220 = lStack_370;
  if (uVar11 == 1) {
    DataMemoryBarrier(2,1);
    func_0x00403ad4(&puStack_230);
  }
  if (*(char *)(lStack_2b0 + 0x218) == 'P') {
    *(undefined1 *)(lStack_2b0 + 0x218) = 0x4f;
    *(undefined8 *)(lStack_2b0 + 0x220) = 0;
code_r0x0043acc4:
    uVar13 = 0;
    lStack_1f0 = *plStack_2b8 + 0x10;
    lStack_1e8 = lStack_2c0;
  }
  else if (*(char *)(lStack_2b0 + 0x218) == 'O') {
    lStack_1e8 = *(long *)(lStack_2b0 + 0x220);
    if (lStack_1e8 == 0) goto code_r0x0043acc4;
    lStack_1f0 = *(long *)(lStack_1e8 + 0x1c0) + 0x10;
    uVar13 = 2;
  }
  else {
    lStack_1f0 = *(long *)(lStack_2b0 + 0x218);
    lStack_1e8 = *(long *)(lStack_2b0 + 0x220);
    uVar13 = 3;
  }
  puStack_1f8 = (ulong *)CONCAT71(puStack_1f8._1_7_,uVar13);
  func_0x0040e428(&puStack_130,auStack_2a0,&puStack_1f8);
  uStack_138 = 0;
  uStack_a8 = uStack_260;
  uStack_b0 = uStack_268;
  uStack_98 = uStack_250;
  uStack_a0 = uStack_258;
  uStack_88 = uStack_240;
  uStack_90 = uStack_248;
  uStack_80 = uStack_238;
  uStack_c8 = uStack_280;
  uStack_d0 = uStack_288;
  uStack_b8 = uStack_270;
  uStack_c0 = uStack_278;
  func_0x0040fb84(&puStack_1f8,&uStack_138,&uStack_d0);
  uStack_2c8._0_1_ = (char)uStack_140;
  puStack_380 = puStack_1f8;
  lStack_378 = lStack_1f0;
  lStack_370 = lStack_1e8;
  uStack_368 = uStack_1e0;
  uStack_360 = uStack_1d8;
  uStack_358 = uStack_1d0;
  lStack_350 = lStack_1c8;
  plStack_348 = plStack_1c0;
  lStack_340 = lStack_1b8;
  uStack_338 = uStack_1b0;
  uStack_330 = uStack_1a8;
  uStack_288 = uStack_190;
  uStack_280 = uStack_188;
  uStack_278 = uStack_180;
  uStack_270 = uStack_178;
  uStack_268 = uStack_170;
  uStack_260 = uStack_168;
  uStack_258 = uStack_160;
  uStack_250 = uStack_158;
  uStack_248 = uStack_150;
  uStack_240 = uStack_148;
  uStack_238 = uStack_140;
  goto joined_r0x0043ac44;
}

