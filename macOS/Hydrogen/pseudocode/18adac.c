
void FUN_0018adac(long *param_1,long param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,long param_6)

{
  undefined8 *puVar1;
  short *psVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  long lStack_2c8;
  long lStack_2c0;
  long lStack_2b8;
  long lStack_2b0;
  long lStack_2a8;
  long lStack_2a0;
  long lStack_298;
  long lStack_290;
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
  undefined8 uStack_210;
  undefined8 uStack_208;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  long lStack_1b0;
  long lStack_1a8;
  long lStack_190;
  long lStack_188;
  long lStack_180;
  long lStack_178;
  long lStack_170;
  long lStack_168;
  long lStack_160;
  long lStack_158;
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
  long lStack_60;
  long lStack_58;
  long lStack_50;
  long lStack_48;
  long lStack_40;
  long lStack_38;
  long lStack_30;
  
  if (*(long *)(param_2 + 0x18) != 2) {
    func_0x0079a28c(param_2 + 0x18);
  }
  lVar3 = *(long *)(*(long *)(param_2 + 0x20) + 0x58);
  if (lVar3 != 0) {
    psVar2 = *(short **)(*(long *)(param_2 + 0x20) + 0x50);
    if (*(short *)(param_6 + 0x18) == 0xd) {
      lVar3 = lVar3 * 0x18;
      do {
        if ((*psVar2 == 0xd) && (psVar2[1] == *(short *)(param_6 + 0x1a))) goto code_r0x00228ae0;
        lVar3 = lVar3 + -0x18;
        psVar2 = psVar2 + 0xc;
      } while (lVar3 != 0);
    }
    else {
      lVar3 = lVar3 * 0x18;
      do {
        if (*psVar2 == *(short *)(param_6 + 0x18)) goto code_r0x00228ae0;
        psVar2 = psVar2 + 0xc;
        lVar3 = lVar3 + -0x18;
      } while (lVar3 != 0);
    }
  }
  *param_1 = -0x7fffffffffffffe6;
  param_1[1] = 0x3e;
  return;
code_r0x00228ae0:
  puVar6 = *(undefined8 **)(psVar2 + 4);
  lVar3 = *(long *)(psVar2 + 8);
  func_0x00269c70(&lStack_190,param_5);
  if (lStack_190 == -0x7fffffffffffffff) {
    func_0x001d9f3c(&lStack_60,&lStack_188);
    param_1[1] = lStack_58;
    *param_1 = lStack_60;
    param_1[3] = lStack_48;
    param_1[2] = lStack_50;
    param_1[5] = lStack_38;
    param_1[4] = lStack_40;
    param_1[6] = lStack_30;
  }
  else {
    lStack_58 = lStack_180;
    lStack_60 = lStack_188;
    lStack_48 = lStack_170;
    lStack_50 = lStack_178;
    lStack_38 = lStack_160;
    lStack_40 = lStack_168;
    lStack_30 = lStack_158;
    uStack_200 = uStack_c8;
    uStack_208 = uStack_d0;
    uStack_1f0 = uStack_b8;
    uStack_1f8 = uStack_c0;
    uStack_1e0 = uStack_a8;
    uStack_1e8 = uStack_b0;
    uStack_1d8 = uStack_a0;
    uStack_240 = uStack_108;
    uStack_248 = uStack_110;
    uStack_230 = uStack_f8;
    uStack_238 = uStack_100;
    uStack_220 = uStack_e8;
    uStack_228 = uStack_f0;
    uStack_210 = uStack_d8;
    uStack_218 = uStack_e0;
    uStack_280 = uStack_148;
    uStack_288 = uStack_150;
    uStack_270 = uStack_138;
    uStack_278 = uStack_140;
    uStack_260 = uStack_128;
    uStack_268 = uStack_130;
    uStack_250 = uStack_118;
    uStack_258 = uStack_120;
    lStack_1a8 = lStack_160;
    lStack_1b0 = lStack_168;
    lStack_2b8 = lStack_180;
    lStack_2c0 = lStack_188;
    lStack_2a8 = lStack_170;
    lStack_2b0 = lStack_178;
    lStack_298 = lStack_160;
    lStack_2a0 = lStack_168;
    lStack_290 = lStack_158;
    lStack_2c8 = lStack_190;
    if (lVar3 != 0) {
      puVar1 = puVar6 + lVar3 * 2;
      uVar4 = *(undefined8 *)(param_6 + 8);
      uVar5 = *(undefined8 *)(param_6 + 0x10);
      do {
        func_0x00269e94(alStack_98,&lStack_2c8,*puVar6,puVar6[1],param_3,param_4,uVar4,uVar5);
        if (alStack_98[0] == -0x7fffffffffffffd4) {
          *param_1 = -0x7fffffffffffffd9;
code_r0x00228cec:
          if (lStack_2c8 == -0x8000000000000000 || lStack_2c8 == 0) {
            return;
          }
          goto code_r0x00228d00;
        }
        if (alStack_98[0] != -0x7fffffffffffffd5) {
          func_0x001d9f3c(&lStack_190,alStack_98);
          param_1[1] = lStack_188;
          *param_1 = lStack_190;
          param_1[3] = lStack_178;
          param_1[2] = lStack_180;
          param_1[5] = lStack_168;
          param_1[4] = lStack_170;
          param_1[6] = lStack_160;
          goto code_r0x00228cec;
        }
        puVar6 = puVar6 + 2;
      } while (puVar6 != puVar1);
    }
    lStack_190 = -0x7fffffffffffffd5;
    func_0x001d9f3c(&lStack_60,&lStack_190);
    param_1[1] = lStack_58;
    *param_1 = lStack_60;
    param_1[3] = lStack_48;
    param_1[2] = lStack_50;
    param_1[5] = lStack_38;
    param_1[4] = lStack_40;
    param_1[6] = lStack_30;
    if ((lStack_2c8 != -0x8000000000000000) && (lStack_2c8 != 0)) {
code_r0x00228d00:
      func_0x00187bd4(lStack_2c0,lStack_2c8,1);
    }
  }
  return;
}

