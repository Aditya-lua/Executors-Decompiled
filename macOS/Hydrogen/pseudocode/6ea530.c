
undefined8 FUN_006ea530(void)

{
  undefined1 uVar1;
  undefined2 uVar2;
  uint uVar3;
  undefined4 uVar4;
  uint uVar5;
  long lVar6;
  undefined8 uVar7;
  long unaff_x20;
  undefined8 uVar8;
  double dVar9;
  ulong in_stack_00000008;
  ulong uStack_3c8;
  long lStack_3c0;
  undefined8 uStack_3b8;
  undefined8 ****ppppuStack_3b0;
  undefined *puStack_3a8;
  ulong uStack_3a0;
  ulong uStack_398;
  undefined8 ****ppppuStack_370;
  undefined *puStack_368;
  ulong uStack_358;
  undefined8 ****ppppuStack_330;
  undefined *puStack_328;
  ulong uStack_318;
  undefined8 ****ppppuStack_2f0;
  undefined *puStack_2e8;
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
  undefined8 uStack_1e8;
  ulong uStack_1d8;
  undefined8 ****ppppuStack_1b0;
  undefined *puStack_1a8;
  ulong uStack_198;
  undefined8 ****ppppuStack_170;
  undefined *puStack_168;
  ulong uStack_158;
  undefined8 ****ppppuStack_130;
  undefined *puStack_128;
  ulong uStack_118;
  long lStack_110;
  undefined8 uStack_108;
  undefined8 ****ppppuStack_100;
  undefined8 uStack_f8;
  ulong uStack_e8;
  long lStack_e0;
  undefined8 uStack_d8;
  long ***ppplStack_d0;
  undefined8 uStack_c8;
  ulong uStack_b8;
  long lStack_b0;
  undefined8 uStack_a8;
  undefined1 ***pppuStack_a0;
  undefined8 uStack_98;
  ulong uStack_88;
  long lStack_80;
  undefined8 uStack_78;
  undefined1 **ppuStack_70;
  undefined8 uStack_68;
  ulong uStack_58;
  long lStack_50;
  undefined8 uStack_48;
  undefined1 *puStack_40;
  undefined *puStack_38;
  ulong uStack_28;
  undefined1 auStack_6 [6];
  
  uVar3 = func_0x006e6bc0();
  if (uVar3 < in_stack_00000008) {
    uVar8 = NEON_ucvtf((ulong)*(byte *)(unaff_x20 + (int)uVar3));
    func_0x006e3850(uVar8);
    return 1;
  }
  uVar8 = func_0x006e644c();
  uStack_28 = 0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_28);
  uVar3 = func_0x006e6bc0(uVar8,2);
  if ((ulong)uVar3 + 2 <= uStack_28) {
    func_0x006e3850((double)(long)(int)*(short *)(lVar6 + (int)uVar3),uVar8);
    return 1;
  }
  uVar7 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_38 = &DAT_006ea600;
  uStack_58 = 0;
  lStack_50 = lVar6;
  uStack_48 = uVar8;
  puStack_40 = auStack_6 + -10;
  lVar6 = func_0x006e6914(uVar7,1,&uStack_58);
  uVar3 = func_0x006e6bc0(uVar7,2);
  if ((ulong)uVar3 + 2 <= uStack_58) {
    uVar8 = NEON_ucvtf((ulong)*(ushort *)(lVar6 + (int)uVar3));
    func_0x006e3850(uVar8,uVar7);
    return 1;
  }
  uVar8 = func_0x006e644c(uVar7,"buffer access out of bounds");
  uStack_68 = 0x6ea67c;
  uStack_88 = 0;
  lStack_80 = lVar6;
  uStack_78 = uVar7;
  ppuStack_70 = &puStack_40;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_88);
  uVar3 = func_0x006e6bc0(uVar8,2);
  if ((ulong)uVar3 + 4 <= uStack_88) {
    func_0x006e3850((double)(long)*(int *)(lVar6 + (int)uVar3),uVar8);
    return 1;
  }
  uVar7 = func_0x006e644c(uVar8,"buffer access out of bounds");
  uStack_98 = 0x6ea6fc;
  uStack_b8 = 0;
  lStack_b0 = lVar6;
  uStack_a8 = uVar8;
  pppuStack_a0 = &ppuStack_70;
  lVar6 = func_0x006e6914(uVar7,1,&uStack_b8);
  uVar3 = func_0x006e6bc0(uVar7,2);
  if ((ulong)uVar3 + 4 <= uStack_b8) {
    uVar8 = NEON_ucvtf((ulong)*(uint *)(lVar6 + (int)uVar3));
    func_0x006e3850(uVar8,uVar7);
    return 1;
  }
  uVar8 = func_0x006e644c(uVar7,"buffer access out of bounds");
  uStack_c8 = 0x6ea778;
  uStack_e8 = 0;
  lStack_e0 = lVar6;
  uStack_d8 = uVar7;
  ppplStack_d0 = (long ***)&pppuStack_a0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_e8);
  uVar3 = func_0x006e6bc0(uVar8,2);
  if ((ulong)uVar3 + 4 <= uStack_e8) {
    func_0x006e3850((double)*(float *)(lVar6 + (int)uVar3),uVar8);
    return 1;
  }
  uVar7 = func_0x006e644c(uVar8,"buffer access out of bounds");
  uStack_f8 = 0x6ea7f4;
  uStack_118 = 0;
  lStack_110 = lVar6;
  uStack_108 = uVar8;
  ppppuStack_100 = &ppplStack_d0;
  lVar6 = func_0x006e6914(uVar7,1,&uStack_118);
  uVar3 = func_0x006e6bc0(uVar7,2);
  if ((ulong)uVar3 + 8 <= uStack_118) {
    func_0x006e3850(*(undefined8 *)(lVar6 + (int)uVar3),uVar7);
    return 1;
  }
  uVar8 = func_0x006e644c(uVar7,"buffer access out of bounds");
  puStack_128 = &DAT_006ea86c;
  uStack_158 = 0;
  ppppuStack_130 = &ppppuStack_100;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_158);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar1 = func_0x006e6c78(uVar8,3);
  if (uVar3 < uStack_158) {
    *(undefined1 *)(lVar6 + (int)uVar3) = uVar1;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_168 = &DAT_006ea8ec;
  uStack_198 = 0;
  ppppuStack_170 = &ppppuStack_130;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_198);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar1 = func_0x006e6c78(uVar8,3);
  if (uVar3 < uStack_198) {
    *(undefined1 *)(lVar6 + (int)uVar3) = uVar1;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_1a8 = &DAT_006ea96c;
  uStack_1d8 = 0;
  ppppuStack_1b0 = &ppppuStack_170;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_1d8);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar2 = func_0x006e6c78(uVar8,3);
  if ((ulong)uVar3 + 2 <= uStack_1d8) {
    *(undefined2 *)(lVar6 + (int)uVar3) = uVar2;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  uStack_1e8 = 0x6ea9f4;
  uStack_218 = 0;
  ppppuStack_1f0 = &ppppuStack_1b0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_218);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar2 = func_0x006e6c78(uVar8,3);
  if ((ulong)uVar3 + 2 <= uStack_218) {
    *(undefined2 *)(lVar6 + (int)uVar3) = uVar2;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_228 = &DAT_006eaa7c;
  uStack_258 = 0;
  ppppuStack_230 = &ppppuStack_1f0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_258);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar4 = func_0x006e6c78(uVar8,3);
  if ((ulong)uVar3 + 4 <= uStack_258) {
    *(undefined4 *)(lVar6 + (int)uVar3) = uVar4;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_268 = &DAT_006eab04;
  uStack_298 = 0;
  ppppuStack_270 = &ppppuStack_230;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_298);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar4 = func_0x006e6c78(uVar8,3);
  if ((ulong)uVar3 + 4 <= uStack_298) {
    *(undefined4 *)(lVar6 + (int)uVar3) = uVar4;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_2a8 = &DAT_006eab8c;
  uStack_2d8 = 0;
  ppppuStack_2b0 = &ppppuStack_270;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_2d8);
  uVar3 = func_0x006e6bc0(uVar8,2);
  dVar9 = (double)func_0x006e6a4c(uVar8,3);
  if ((ulong)uVar3 + 4 <= uStack_2d8) {
    *(float *)(lVar6 + (int)uVar3) = (float)dVar9;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_2e8 = &DAT_006eac18;
  uStack_318 = 0;
  ppppuStack_2f0 = &ppppuStack_2b0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_318);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar7 = func_0x006e6a4c(uVar8,3);
  if ((ulong)uVar3 + 8 <= uStack_318) {
    *(undefined8 *)(lVar6 + (int)uVar3) = uVar7;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_328 = &DAT_006eaca0;
  uStack_358 = 0;
  ppppuStack_330 = &ppppuStack_2f0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_358);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar5 = func_0x006e6bc0(uVar8,3);
  if ((int)uVar5 < 0) {
    func_0x006e63b0(uVar8,3,"size");
  }
  else if ((ulong)uVar5 + (ulong)uVar3 <= uStack_358) {
    func_0x006e38d8(uVar8,lVar6 + (int)uVar3);
    return 1;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_368 = &DAT_006ead48;
  uStack_398 = 0;
  ppppuStack_370 = &ppppuStack_330;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_398);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uStack_3a0 = 0;
  uVar7 = func_0x006e67c8(uVar8,3,&uStack_3a0);
  uVar5 = func_0x006e6c08(uVar8,4,uStack_3a0 & 0xffffffff);
  if ((int)uVar5 < 0) {
    func_0x006e63b0(uVar8,4,"count");
  }
  else if (uVar5 <= uStack_3a0) {
    if ((ulong)uVar5 + (ulong)uVar3 <= uStack_398) {
      _memcpy(lVar6 + (int)uVar3,uVar7);
      return 0;
    }
    goto LAB_006eae18;
  }
  func_0x006e644c(uVar8,"string length overflow");
LAB_006eae18:
  uVar7 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_3a8 = &DAT_006eae28;
  uStack_3c8 = 0;
  lStack_3c0 = lVar6;
  uStack_3b8 = uVar8;
  ppppuStack_3b0 = &ppppuStack_370;
  func_0x006e6914(uVar7,1,&uStack_3c8);
  uVar8 = NEON_ucvtf(uStack_3c8 & 0xffffffff);
  func_0x006e3850(uVar8,uVar7);
  return 1;
}

