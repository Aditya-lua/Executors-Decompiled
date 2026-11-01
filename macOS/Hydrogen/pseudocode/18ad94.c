
void FUN_0018ad94(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 long param_5)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 uVar3;
  long *extraout_x8;
  short *psVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  undefined1 auVar9 [16];
  long lStack_308;
  long lStack_300;
  long lStack_2f8;
  long lStack_2f0;
  long lStack_2e8;
  long lStack_2e0;
  long lStack_2d8;
  long lStack_2d0;
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
  long lStack_1f0;
  long lStack_1e8;
  long lStack_1d0;
  long lStack_1c8;
  long lStack_1c0;
  long lStack_1b8;
  long lStack_1b0;
  long lStack_1a8;
  long lStack_1a0;
  long lStack_198;
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
  long alStack_d8 [7];
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  
  uVar3 = 1;
  func_0x00187bd4(param_1,param_2,1);
  __Unwind_Resume();
  auVar9 = func_0x007a2668();
  lVar2 = auVar9._0_8_;
  if (*(long *)(lVar2 + 0x18) != 2) {
    func_0x0079a28c(lVar2 + 0x18);
  }
  lVar5 = *(long *)(*(long *)(lVar2 + 0x20) + 0x58);
  if (lVar5 != 0) {
    psVar4 = *(short **)(*(long *)(lVar2 + 0x20) + 0x50);
    if (*(short *)(param_5 + 0x18) == 0xd) {
      lVar5 = lVar5 * 0x18;
      do {
        if ((*psVar4 == 0xd) && (psVar4[1] == *(short *)(param_5 + 0x1a))) goto code_r0x00228ae0;
        lVar5 = lVar5 + -0x18;
        psVar4 = psVar4 + 0xc;
      } while (lVar5 != 0);
    }
    else {
      lVar5 = lVar5 * 0x18;
      do {
        if (*psVar4 == *(short *)(param_5 + 0x18)) goto code_r0x00228ae0;
        psVar4 = psVar4 + 0xc;
        lVar5 = lVar5 + -0x18;
      } while (lVar5 != 0);
    }
  }
  *extraout_x8 = -0x7fffffffffffffe6;
  extraout_x8[1] = 0x3e;
  return;
code_r0x00228ae0:
  puVar8 = *(undefined8 **)(psVar4 + 4);
  lVar2 = *(long *)(psVar4 + 8);
  func_0x00269c70(&lStack_1d0,param_4);
  if (lStack_1d0 == -0x7fffffffffffffff) {
    func_0x001d9f3c(&lStack_a0,&lStack_1c8);
    extraout_x8[1] = lStack_98;
    *extraout_x8 = lStack_a0;
    extraout_x8[3] = lStack_88;
    extraout_x8[2] = lStack_90;
    extraout_x8[5] = lStack_78;
    extraout_x8[4] = lStack_80;
    extraout_x8[6] = lStack_70;
  }
  else {
    lStack_98 = lStack_1c0;
    lStack_a0 = lStack_1c8;
    lStack_88 = lStack_1b0;
    lStack_90 = lStack_1b8;
    lStack_78 = lStack_1a0;
    lStack_80 = lStack_1a8;
    lStack_70 = lStack_198;
    uStack_240 = uStack_108;
    uStack_248 = uStack_110;
    uStack_230 = uStack_f8;
    uStack_238 = uStack_100;
    uStack_220 = uStack_e8;
    uStack_228 = uStack_f0;
    uStack_218 = uStack_e0;
    uStack_280 = uStack_148;
    uStack_288 = uStack_150;
    uStack_270 = uStack_138;
    uStack_278 = uStack_140;
    uStack_260 = uStack_128;
    uStack_268 = uStack_130;
    uStack_250 = uStack_118;
    uStack_258 = uStack_120;
    uStack_2c0 = uStack_188;
    uStack_2c8 = uStack_190;
    uStack_2b0 = uStack_178;
    uStack_2b8 = uStack_180;
    uStack_2a0 = uStack_168;
    uStack_2a8 = uStack_170;
    uStack_290 = uStack_158;
    uStack_298 = uStack_160;
    lStack_1e8 = lStack_1a0;
    lStack_1f0 = lStack_1a8;
    lStack_2f8 = lStack_1c0;
    lStack_300 = lStack_1c8;
    lStack_2e8 = lStack_1b0;
    lStack_2f0 = lStack_1b8;
    lStack_2d8 = lStack_1a0;
    lStack_2e0 = lStack_1a8;
    lStack_2d0 = lStack_198;
    lStack_308 = lStack_1d0;
    if (lVar2 != 0) {
      puVar1 = puVar8 + lVar2 * 2;
      uVar6 = *(undefined8 *)(param_5 + 8);
      uVar7 = *(undefined8 *)(param_5 + 0x10);
      do {
        func_0x00269e94(alStack_d8,&lStack_308,*puVar8,puVar8[1],auVar9._8_8_,uVar3,uVar6,uVar7);
        if (alStack_d8[0] == -0x7fffffffffffffd4) {
          *extraout_x8 = -0x7fffffffffffffd9;
code_r0x00228cec:
          if (lStack_308 == -0x8000000000000000 || lStack_308 == 0) {
            return;
          }
          goto code_r0x00228d00;
        }
        if (alStack_d8[0] != -0x7fffffffffffffd5) {
          func_0x001d9f3c(&lStack_1d0,alStack_d8);
          extraout_x8[1] = lStack_1c8;
          *extraout_x8 = lStack_1d0;
          extraout_x8[3] = lStack_1b8;
          extraout_x8[2] = lStack_1c0;
          extraout_x8[5] = lStack_1a8;
          extraout_x8[4] = lStack_1b0;
          extraout_x8[6] = lStack_1a0;
          goto code_r0x00228cec;
        }
        puVar8 = puVar8 + 2;
      } while (puVar8 != puVar1);
    }
    lStack_1d0 = -0x7fffffffffffffd5;
    func_0x001d9f3c(&lStack_a0,&lStack_1d0);
    extraout_x8[1] = lStack_98;
    *extraout_x8 = lStack_a0;
    extraout_x8[3] = lStack_88;
    extraout_x8[2] = lStack_90;
    extraout_x8[5] = lStack_78;
    extraout_x8[4] = lStack_80;
    extraout_x8[6] = lStack_70;
    if ((lStack_308 != -0x8000000000000000) && (lStack_308 != 0)) {
code_r0x00228d00:
      func_0x00187bd4(lStack_300,lStack_308,1);
    }
  }
  return;
}

