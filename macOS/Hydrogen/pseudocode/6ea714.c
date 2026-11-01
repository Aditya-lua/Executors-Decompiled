
undefined8 FUN_006ea714(undefined8 param_1)

{
  undefined1 uVar1;
  undefined2 uVar2;
  uint uVar3;
  undefined4 uVar4;
  uint uVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  double dVar9;
  undefined8 uStack0000000000000008;
  ulong uStack_308;
  long lStack_300;
  undefined8 uStack_2f8;
  undefined8 ****ppppuStack_2f0;
  undefined *puStack_2e8;
  ulong uStack_2e0;
  ulong uStack_2d8;
  undefined8 ****ppppuStack_2b0;
  undefined *puStack_2a8;
  ulong uStack_298;
  undefined8 ****ppppuStack_270;
  undefined *puStack_268;
  ulong uStack_258;
  undefined8 ****ppppuStack_230;
  undefined *puStack_228;
  ulong uStack_218;
  undefined8 ****ppppuStack_1f0;
  undefined *puStack_1e8;
  ulong uStack_1d8;
  undefined8 ****ppppuStack_1b0;
  undefined *puStack_1a8;
  ulong uStack_198;
  undefined8 ****ppppuStack_170;
  undefined *puStack_168;
  ulong uStack_158;
  undefined8 ****ppppuStack_130;
  undefined8 uStack_128;
  ulong uStack_118;
  long ***ppplStack_f0;
  undefined *puStack_e8;
  ulong uStack_d8;
  undefined1 ***pppuStack_b0;
  undefined *puStack_a8;
  ulong uStack_98;
  undefined1 **ppuStack_70;
  undefined *puStack_68;
  ulong uStack_58;
  long lStack_50;
  undefined8 uStack_48;
  undefined1 *puStack_40;
  undefined8 uStack_38;
  ulong uStack_28;
  long lStack_20;
  undefined1 auStack_6 [6];
  
  lVar6 = func_0x006e6914(param_1,1,&uStack0000000000000008);
  uVar3 = func_0x006e6bc0();
  if ((ulong)uVar3 + 4 <= uStack0000000000000008) {
    uVar8 = NEON_ucvtf((ulong)*(uint *)(lVar6 + (int)uVar3));
    func_0x006e3850(uVar8);
    return 1;
  }
  uVar8 = func_0x006e644c();
  uStack_28 = 0;
  lStack_20 = lVar6;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_28);
  uVar3 = func_0x006e6bc0(uVar8,2);
  if ((ulong)uVar3 + 4 <= uStack_28) {
    func_0x006e3850((double)*(float *)(lVar6 + (int)uVar3),uVar8);
    return 1;
  }
  uVar7 = func_0x006e644c(uVar8,"buffer access out of bounds");
  uStack_38 = 0x6ea7f4;
  uStack_58 = 0;
  lStack_50 = lVar6;
  uStack_48 = uVar8;
  puStack_40 = auStack_6 + -10;
  lVar6 = func_0x006e6914(uVar7,1,&uStack_58);
  uVar3 = func_0x006e6bc0(uVar7,2);
  if ((ulong)uVar3 + 8 <= uStack_58) {
    func_0x006e3850(*(undefined8 *)(lVar6 + (int)uVar3),uVar7);
    return 1;
  }
  uVar8 = func_0x006e644c(uVar7,"buffer access out of bounds");
  puStack_68 = &DAT_006ea86c;
  uStack_98 = 0;
  ppuStack_70 = &puStack_40;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_98);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar1 = func_0x006e6c78(uVar8,3);
  if (uVar3 < uStack_98) {
    *(undefined1 *)(lVar6 + (int)uVar3) = uVar1;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_a8 = &DAT_006ea8ec;
  uStack_d8 = 0;
  pppuStack_b0 = &ppuStack_70;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_d8);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar1 = func_0x006e6c78(uVar8,3);
  if (uVar3 < uStack_d8) {
    *(undefined1 *)(lVar6 + (int)uVar3) = uVar1;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_e8 = &DAT_006ea96c;
  uStack_118 = 0;
  ppplStack_f0 = (long ***)&pppuStack_b0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_118);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar2 = func_0x006e6c78(uVar8,3);
  if ((ulong)uVar3 + 2 <= uStack_118) {
    *(undefined2 *)(lVar6 + (int)uVar3) = uVar2;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  uStack_128 = 0x6ea9f4;
  uStack_158 = 0;
  ppppuStack_130 = &ppplStack_f0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_158);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar2 = func_0x006e6c78(uVar8,3);
  if ((ulong)uVar3 + 2 <= uStack_158) {
    *(undefined2 *)(lVar6 + (int)uVar3) = uVar2;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_168 = &DAT_006eaa7c;
  uStack_198 = 0;
  ppppuStack_170 = &ppppuStack_130;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_198);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar4 = func_0x006e6c78(uVar8,3);
  if ((ulong)uVar3 + 4 <= uStack_198) {
    *(undefined4 *)(lVar6 + (int)uVar3) = uVar4;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_1a8 = &DAT_006eab04;
  uStack_1d8 = 0;
  ppppuStack_1b0 = &ppppuStack_170;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_1d8);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar4 = func_0x006e6c78(uVar8,3);
  if ((ulong)uVar3 + 4 <= uStack_1d8) {
    *(undefined4 *)(lVar6 + (int)uVar3) = uVar4;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_1e8 = &DAT_006eab8c;
  uStack_218 = 0;
  ppppuStack_1f0 = &ppppuStack_1b0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_218);
  uVar3 = func_0x006e6bc0(uVar8,2);
  dVar9 = (double)func_0x006e6a4c(uVar8,3);
  if ((ulong)uVar3 + 4 <= uStack_218) {
    *(float *)(lVar6 + (int)uVar3) = (float)dVar9;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_228 = &DAT_006eac18;
  uStack_258 = 0;
  ppppuStack_230 = &ppppuStack_1f0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_258);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar7 = func_0x006e6a4c(uVar8,3);
  if ((ulong)uVar3 + 8 <= uStack_258) {
    *(undefined8 *)(lVar6 + (int)uVar3) = uVar7;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_268 = &DAT_006eaca0;
  uStack_298 = 0;
  ppppuStack_270 = &ppppuStack_230;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_298);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar5 = func_0x006e6bc0(uVar8,3);
  if ((int)uVar5 < 0) {
    func_0x006e63b0(uVar8,3,"size");
  }
  else if ((ulong)uVar5 + (ulong)uVar3 <= uStack_298) {
    func_0x006e38d8(uVar8,lVar6 + (int)uVar3);
    return 1;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_2a8 = &DAT_006ead48;
  uStack_2d8 = 0;
  ppppuStack_2b0 = &ppppuStack_270;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_2d8);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uStack_2e0 = 0;
  uVar7 = func_0x006e67c8(uVar8,3,&uStack_2e0);
  uVar5 = func_0x006e6c08(uVar8,4,uStack_2e0 & 0xffffffff);
  if ((int)uVar5 < 0) {
    func_0x006e63b0(uVar8,4,"count");
  }
  else if (uVar5 <= uStack_2e0) {
    if ((ulong)uVar5 + (ulong)uVar3 <= uStack_2d8) {
      _memcpy(lVar6 + (int)uVar3,uVar7);
      return 0;
    }
    goto LAB_006eae18;
  }
  func_0x006e644c(uVar8,"string length overflow");
LAB_006eae18:
  uVar7 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_2e8 = &DAT_006eae28;
  uStack_308 = 0;
  lStack_300 = lVar6;
  uStack_2f8 = uVar8;
  ppppuStack_2f0 = &ppppuStack_2b0;
  func_0x006e6914(uVar7,1,&uStack_308);
  uVar8 = NEON_ucvtf(uStack_308 & 0xffffffff);
  func_0x006e3850(uVar8,uVar7);
  return 1;
}

