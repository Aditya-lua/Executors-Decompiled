
undefined8 FUN_006ea610(undefined8 param_1)

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
  undefined1 uStack0000000000000008;
  ulong uStack_368;
  long lStack_360;
  undefined8 uStack_358;
  undefined8 ****ppppuStack_350;
  undefined *puStack_348;
  ulong uStack_340;
  ulong uStack_338;
  undefined8 ****ppppuStack_310;
  undefined *puStack_308;
  ulong uStack_2f8;
  undefined8 ****ppppuStack_2d0;
  undefined *puStack_2c8;
  ulong uStack_2b8;
  undefined8 ****ppppuStack_290;
  undefined *puStack_288;
  ulong uStack_278;
  undefined8 ****ppppuStack_250;
  undefined *puStack_248;
  ulong uStack_238;
  undefined8 ****ppppuStack_210;
  undefined *puStack_208;
  ulong uStack_1f8;
  undefined8 ****ppppuStack_1d0;
  undefined *puStack_1c8;
  ulong uStack_1b8;
  undefined8 ****ppppuStack_190;
  undefined8 uStack_188;
  ulong uStack_178;
  undefined8 ****ppppuStack_150;
  undefined *puStack_148;
  ulong uStack_138;
  undefined8 ****ppppuStack_110;
  undefined *puStack_108;
  ulong uStack_f8;
  long ***ppplStack_d0;
  undefined *puStack_c8;
  ulong uStack_b8;
  long lStack_b0;
  undefined8 uStack_a8;
  long ***ppplStack_a0;
  undefined8 uStack_98;
  ulong uStack_88;
  long lStack_80;
  undefined8 uStack_78;
  long **pplStack_70;
  undefined8 uStack_68;
  ulong uStack_58;
  long lStack_50;
  undefined8 uStack_48;
  long *plStack_40;
  undefined8 uStack_38;
  ulong uStack_28;
  long lStack_20;
  long lStack_18;
  
  _uStack0000000000000008 = 0;
  lVar6 = func_0x006e6914(param_1,1,&uStack0000000000000008);
  uVar3 = func_0x006e6bc0(param_1,2);
  if ((ulong)uVar3 + 2 <= _uStack0000000000000008) {
    uVar8 = NEON_ucvtf((ulong)*(ushort *)(lVar6 + (int)uVar3));
    func_0x006e3850(uVar8,param_1);
    return 1;
  }
  uVar8 = func_0x006e644c(param_1,"buffer access out of bounds");
  uStack_28 = 0;
  lStack_20 = lVar6;
  lStack_18 = param_1;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_28);
  uVar3 = func_0x006e6bc0(uVar8,2);
  if ((ulong)uVar3 + 4 <= uStack_28) {
    func_0x006e3850((double)(long)*(int *)(lVar6 + (int)uVar3),uVar8);
    return 1;
  }
  uVar7 = func_0x006e644c(uVar8,"buffer access out of bounds");
  uStack_38 = 0x6ea6fc;
  uStack_58 = 0;
  lStack_50 = lVar6;
  uStack_48 = uVar8;
  plStack_40 = (long *)((long)register0x00000008 + -0x10);
  lVar6 = func_0x006e6914(uVar7,1,&uStack_58);
  uVar3 = func_0x006e6bc0(uVar7,2);
  if ((ulong)uVar3 + 4 <= uStack_58) {
    uVar8 = NEON_ucvtf((ulong)*(uint *)(lVar6 + (int)uVar3));
    func_0x006e3850(uVar8,uVar7);
    return 1;
  }
  uVar8 = func_0x006e644c(uVar7,"buffer access out of bounds");
  uStack_68 = 0x6ea778;
  uStack_88 = 0;
  lStack_80 = lVar6;
  uStack_78 = uVar7;
  pplStack_70 = &plStack_40;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_88);
  uVar3 = func_0x006e6bc0(uVar8,2);
  if ((ulong)uVar3 + 4 <= uStack_88) {
    func_0x006e3850((double)*(float *)(lVar6 + (int)uVar3),uVar8);
    return 1;
  }
  uVar7 = func_0x006e644c(uVar8,"buffer access out of bounds");
  uStack_98 = 0x6ea7f4;
  uStack_b8 = 0;
  lStack_b0 = lVar6;
  uStack_a8 = uVar8;
  ppplStack_a0 = &pplStack_70;
  lVar6 = func_0x006e6914(uVar7,1,&uStack_b8);
  uVar3 = func_0x006e6bc0(uVar7,2);
  if ((ulong)uVar3 + 8 <= uStack_b8) {
    func_0x006e3850(*(undefined8 *)(lVar6 + (int)uVar3),uVar7);
    return 1;
  }
  uVar8 = func_0x006e644c(uVar7,"buffer access out of bounds");
  puStack_c8 = &DAT_006ea86c;
  uStack_f8 = 0;
  ppplStack_d0 = (long ***)&ppplStack_a0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_f8);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar1 = func_0x006e6c78(uVar8,3);
  if (uVar3 < uStack_f8) {
    *(undefined1 *)(lVar6 + (int)uVar3) = uVar1;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_108 = &DAT_006ea8ec;
  uStack_138 = 0;
  ppppuStack_110 = &ppplStack_d0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_138);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar1 = func_0x006e6c78(uVar8,3);
  if (uVar3 < uStack_138) {
    *(undefined1 *)(lVar6 + (int)uVar3) = uVar1;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_148 = &DAT_006ea96c;
  uStack_178 = 0;
  ppppuStack_150 = &ppppuStack_110;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_178);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar2 = func_0x006e6c78(uVar8,3);
  if ((ulong)uVar3 + 2 <= uStack_178) {
    *(undefined2 *)(lVar6 + (int)uVar3) = uVar2;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  uStack_188 = 0x6ea9f4;
  uStack_1b8 = 0;
  ppppuStack_190 = &ppppuStack_150;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_1b8);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar2 = func_0x006e6c78(uVar8,3);
  if ((ulong)uVar3 + 2 <= uStack_1b8) {
    *(undefined2 *)(lVar6 + (int)uVar3) = uVar2;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_1c8 = &DAT_006eaa7c;
  uStack_1f8 = 0;
  ppppuStack_1d0 = &ppppuStack_190;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_1f8);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar4 = func_0x006e6c78(uVar8,3);
  if ((ulong)uVar3 + 4 <= uStack_1f8) {
    *(undefined4 *)(lVar6 + (int)uVar3) = uVar4;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_208 = &DAT_006eab04;
  uStack_238 = 0;
  ppppuStack_210 = &ppppuStack_1d0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_238);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar4 = func_0x006e6c78(uVar8,3);
  if ((ulong)uVar3 + 4 <= uStack_238) {
    *(undefined4 *)(lVar6 + (int)uVar3) = uVar4;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_248 = &DAT_006eab8c;
  uStack_278 = 0;
  ppppuStack_250 = &ppppuStack_210;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_278);
  uVar3 = func_0x006e6bc0(uVar8,2);
  dVar9 = (double)func_0x006e6a4c(uVar8,3);
  if ((ulong)uVar3 + 4 <= uStack_278) {
    *(float *)(lVar6 + (int)uVar3) = (float)dVar9;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_288 = &DAT_006eac18;
  uStack_2b8 = 0;
  ppppuStack_290 = &ppppuStack_250;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_2b8);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar7 = func_0x006e6a4c(uVar8,3);
  if ((ulong)uVar3 + 8 <= uStack_2b8) {
    *(undefined8 *)(lVar6 + (int)uVar3) = uVar7;
    return 0;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_2c8 = &DAT_006eaca0;
  uStack_2f8 = 0;
  ppppuStack_2d0 = &ppppuStack_290;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_2f8);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uVar5 = func_0x006e6bc0(uVar8,3);
  if ((int)uVar5 < 0) {
    func_0x006e63b0(uVar8,3,"size");
  }
  else if ((ulong)uVar5 + (ulong)uVar3 <= uStack_2f8) {
    func_0x006e38d8(uVar8,lVar6 + (int)uVar3);
    return 1;
  }
  uVar8 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_308 = &DAT_006ead48;
  uStack_338 = 0;
  ppppuStack_310 = &ppppuStack_2d0;
  lVar6 = func_0x006e6914(uVar8,1,&uStack_338);
  uVar3 = func_0x006e6bc0(uVar8,2);
  uStack_340 = 0;
  uVar7 = func_0x006e67c8(uVar8,3,&uStack_340);
  uVar5 = func_0x006e6c08(uVar8,4,uStack_340 & 0xffffffff);
  if ((int)uVar5 < 0) {
    func_0x006e63b0(uVar8,4,"count");
  }
  else if (uVar5 <= uStack_340) {
    if ((ulong)uVar5 + (ulong)uVar3 <= uStack_338) {
      _memcpy(lVar6 + (int)uVar3,uVar7);
      return 0;
    }
    goto LAB_006eae18;
  }
  func_0x006e644c(uVar8,"string length overflow");
LAB_006eae18:
  uVar7 = func_0x006e644c(uVar8,"buffer access out of bounds");
  puStack_348 = &DAT_006eae28;
  uStack_368 = 0;
  lStack_360 = lVar6;
  uStack_358 = uVar8;
  ppppuStack_350 = &ppppuStack_310;
  func_0x006e6914(uVar7,1,&uStack_368);
  uVar8 = NEON_ucvtf(uStack_368 & 0xffffffff);
  func_0x006e3850(uVar8,uVar7);
  return 1;
}

