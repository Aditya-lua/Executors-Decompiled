
void FUN_00228d14(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4,long param_5
                 ,undefined8 param_6,undefined8 param_7,undefined8 param_8,undefined8 param_9,
                 ulong param_10,undefined8 param_11)

{
  undefined8 uVar1;
  ushort uVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined *puVar5;
  long lVar6;
  ulong *extraout_x8;
  undefined8 *extraout_x8_00;
  undefined8 *puVar7;
  undefined8 *extraout_x8_01;
  long lVar8;
  long lVar9;
  undefined1 auVar10 [16];
  long lStack_a50;
  undefined1 auStack_a48 [1504];
  undefined8 uStack_468;
  undefined *puStack_460;
  undefined8 uStack_458;
  undefined8 uStack_418;
  undefined8 uStack_410;
  long lStack_408;
  undefined8 uStack_400;
  undefined8 uStack_3f8;
  long alStack_3d0 [7];
  undefined8 uStack_398;
  undefined8 uStack_390;
  undefined8 uStack_388;
  undefined8 uStack_380;
  undefined8 uStack_378;
  undefined8 uStack_370;
  undefined8 uStack_368;
  ulong uStack_308;
  ulong uStack_300;
  ulong uStack_2f8;
  ulong uStack_2f0;
  ulong uStack_2e8;
  ulong uStack_2e0;
  ulong uStack_2d8;
  undefined8 uStack_2d0;
  undefined8 uStack_2c8;
  undefined8 uStack_2c0;
  undefined8 uStack_2b8;
  undefined8 uStack_2b0;
  undefined8 uStack_2a8;
  undefined8 uStack_2a0;
  undefined8 uStack_298;
  undefined8 uStack_290;
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
  undefined8 uStack_230;
  undefined8 uStack_228;
  undefined8 uStack_220;
  undefined8 uStack_218;
  ulong uStack_1f0;
  ulong uStack_1e8;
  ulong uStack_1d0;
  ulong uStack_1c8;
  ulong uStack_1c0;
  ulong uStack_1b8;
  ulong uStack_1b0;
  ulong uStack_1a8;
  ulong uStack_1a0;
  ulong uStack_190;
  ulong uStack_188;
  ulong uStack_180;
  ulong uStack_178;
  ulong uStack_170;
  ulong uStack_168;
  ulong uStack_160;
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
  long alStack_98 [7];
  
  if ((param_10 | 0x8000000000000000) != 0x8000000000000000) {
    param_3 = 1;
    func_0x00187bd4(param_11,param_10,1);
  }
  auVar10 = __Unwind_Resume(param_1);
  uVar2 = *(ushort *)(param_4 + 0x18);
  if (uVar2 < 0xc && (1 << (ulong)(uVar2 & 0x1f) & 0xfa8U) != 0) {
    if (*(long *)(param_5 + 0x18) != 0) {
      puVar7 = (undefined8 *)(*(long *)(param_5 + 0x10) + 8);
      lVar9 = *(long *)(param_5 + 0x18) * 0x18;
      do {
        if ((uint)*(ushort *)(puVar7 + -1) == (uint)uVar2) {
          if (puVar7[1] != 0) {
            uVar4 = *(undefined8 *)*puVar7;
            uVar1 = ((undefined8 *)*puVar7)[1];
            func_0x00269c70(&uStack_190,param_3);
            uVar3 = uStack_190;
            if (uStack_190 == 0x8000000000000001) {
              func_0x001d9f3c(&uStack_1d0,&uStack_188);
              extraout_x8[1] = uStack_1c8;
              *extraout_x8 = uStack_1d0;
              extraout_x8[3] = uStack_1b8;
              extraout_x8[2] = uStack_1c0;
              extraout_x8[5] = uStack_1a8;
              extraout_x8[4] = uStack_1b0;
              extraout_x8[6] = uStack_1a0;
              return;
            }
            uStack_1c8 = uStack_180;
            uStack_1d0 = uStack_188;
            uStack_1b8 = uStack_170;
            uStack_1c0 = uStack_178;
            uStack_1a8 = uStack_160;
            uStack_1b0 = uStack_168;
            uStack_1a0 = uStack_158;
            uStack_240 = uStack_c8;
            uStack_248 = uStack_d0;
            uStack_230 = uStack_b8;
            uStack_238 = uStack_c0;
            uStack_220 = uStack_a8;
            uStack_228 = uStack_b0;
            uStack_218 = uStack_a0;
            uStack_280 = uStack_108;
            uStack_288 = uStack_110;
            uStack_270 = uStack_f8;
            uStack_278 = uStack_100;
            uStack_260 = uStack_e8;
            uStack_268 = uStack_f0;
            uStack_250 = uStack_d8;
            uStack_258 = uStack_e0;
            uStack_2c0 = uStack_148;
            uStack_2c8 = uStack_150;
            uStack_2b0 = uStack_138;
            uStack_2b8 = uStack_140;
            uStack_2a0 = uStack_128;
            uStack_2a8 = uStack_130;
            uStack_290 = uStack_118;
            uStack_298 = uStack_120;
            uStack_1e8 = uStack_160;
            uStack_1f0 = uStack_168;
            uStack_2f8 = uStack_180;
            uStack_300 = uStack_188;
            uStack_2e8 = uStack_170;
            uStack_2f0 = uStack_178;
            uStack_2d8 = uStack_160;
            uStack_2e0 = uStack_168;
            uStack_2d0 = uStack_158;
            uStack_308 = uStack_190;
            func_0x00269e94(alStack_98,&uStack_308,uVar4,uVar1,auVar10._0_8_,auVar10._8_8_,
                            *(undefined8 *)(param_4 + 8),*(undefined8 *)(param_4 + 0x10));
            if (alStack_98[0] == -0x7fffffffffffffd4) {
              *extraout_x8 = 0x8000000000000027;
            }
            else {
              func_0x001d9f3c(&uStack_190,alStack_98);
              extraout_x8[1] = uStack_188;
              *extraout_x8 = uStack_190;
              extraout_x8[3] = uStack_178;
              extraout_x8[2] = uStack_180;
              extraout_x8[5] = uStack_168;
              extraout_x8[4] = uStack_170;
              extraout_x8[6] = uStack_160;
              uVar3 = uStack_308;
            }
            if (uVar3 == 0x8000000000000000) {
              return;
            }
            if (uVar3 == 0) {
              return;
            }
            func_0x00187bd4(uStack_300,uVar3,1);
            return;
          }
          puVar5 = &UNK_009c8430;
          uVar4 = func_0x007a2570(0,0,&UNK_009c8430);
          if ((uStack_308 | 0x8000000000000000) != 0x8000000000000000) {
            puVar5 = (undefined *)0x1;
            func_0x00187bd4(uStack_300,uStack_308,1);
          }
          auVar10 = __Unwind_Resume(uVar4);
          uVar2 = *(ushort *)(param_4 + 0x18);
          if (0xb < uVar2 || (1 << (ulong)(uVar2 & 0x1f) & 0xfa8U) == 0) {
            *extraout_x8_00 = 0x800000000000001a;
            *(undefined1 *)(extraout_x8_00 + 1) = 0x3e;
            return;
          }
          lVar9 = param_4;
          lVar6 = param_5;
          func_0x0026af7c(&lStack_408,puVar5);
          if (lStack_408 != -0x7fffffffffffffd4) {
            func_0x001d9f3c(&uStack_398,&lStack_408);
            extraout_x8_00[4] = uStack_378;
            extraout_x8_00[3] = uStack_380;
            extraout_x8_00[6] = uStack_368;
            extraout_x8_00[5] = uStack_370;
            extraout_x8_00[1] = uStack_390;
            *extraout_x8_00 = uStack_398;
            extraout_x8_00[2] = uStack_388;
            return;
          }
          uStack_418 = uStack_400;
          uStack_410 = uStack_3f8;
          if (*(long *)(param_5 + 0x18) != 0) {
            puVar7 = (undefined8 *)(*(long *)(param_5 + 0x10) + 8);
            lVar8 = *(long *)(param_5 + 0x18) * 0x18;
            do {
              if ((uint)*(ushort *)(puVar7 + -1) == (uint)uVar2) {
                if (puVar7[1] == 0) {
                  puVar5 = &UNK_009c8448;
                  auVar10 = func_0x007a2570(0,0,&UNK_009c8448);
                  uStack_468 = 1;
                  puStack_460 = &UNK_00828a9b;
                  uStack_458 = 8;
                  func_0x00269e04(&lStack_a50,auVar10._0_8_,param_7,param_8,
                                  *(undefined8 *)(auVar10._8_8_ + 8),
                                  *(undefined8 *)(auVar10._8_8_ + 0x10),puVar5,lVar9,param_6,
                                  &uStack_468,lVar6,0);
                  if (lStack_a50 == -0x7ffffffffffffffd) {
                    func_0x001d9f3c(extraout_x8_01,auStack_a48);
                  }
                  else {
                    *extraout_x8_01 = 0x8000000000000027;
                    func_0x00221c78(&lStack_a50);
                  }
                  return;
                }
                func_0x0026aff8(alStack_3d0,&uStack_418,*(undefined8 *)*puVar7,
                                ((undefined8 *)*puVar7)[1],auVar10._0_8_,auVar10._8_8_,
                                *(undefined8 *)(param_4 + 8),*(undefined8 *)(param_4 + 0x10));
                if (alStack_3d0[0] == -0x7fffffffffffffd4) {
                  *extraout_x8_00 = 0x8000000000000027;
                  return;
                }
                func_0x001d9f3c(extraout_x8_00,alStack_3d0);
                return;
              }
              puVar7 = puVar7 + 3;
              lVar8 = lVar8 + -0x18;
            } while (lVar8 != 0);
          }
          *extraout_x8_00 = 0x800000000000001a;
          extraout_x8_00[1] = 0x3e;
          return;
        }
        puVar7 = puVar7 + 3;
        lVar9 = lVar9 + -0x18;
      } while (lVar9 != 0);
    }
    *extraout_x8 = 0x800000000000001a;
    extraout_x8[1] = 0x3e;
  }
  else {
    *extraout_x8 = 0x800000000000001a;
    *(undefined1 *)(extraout_x8 + 1) = 0x3e;
  }
  return;
}

