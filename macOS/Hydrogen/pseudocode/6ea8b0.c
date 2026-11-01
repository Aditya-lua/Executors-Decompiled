
undefined8 FUN_006ea8b0(void)

{
  undefined1 uVar1;
  undefined2 uVar2;
  uint uVar3;
  undefined4 uVar4;
  uint uVar5;
  undefined8 uVar6;
  long lVar7;
  long unaff_x20;
  uint unaff_w21;
  double dVar8;
  undefined8 uVar9;
  ulong in_stack_00000008;
  ulong uStack_268;
  long lStack_260;
  undefined8 uStack_258;
  undefined8 ****ppppuStack_250;
  undefined *puStack_248;
  ulong uStack_240;
  ulong uStack_238;
  undefined8 ****ppppuStack_210;
  undefined *puStack_208;
  ulong uStack_1f8;
  undefined8 ****ppppuStack_1d0;
  undefined *puStack_1c8;
  ulong uStack_1b8;
  undefined8 ****ppppuStack_190;
  undefined *puStack_188;
  ulong uStack_178;
  undefined8 ****ppppuStack_150;
  undefined *puStack_148;
  ulong uStack_138;
  long ***ppplStack_110;
  undefined *puStack_108;
  ulong uStack_f8;
  undefined1 ***pppuStack_d0;
  undefined *puStack_c8;
  ulong uStack_b8;
  undefined1 **ppuStack_90;
  undefined8 uStack_88;
  ulong uStack_78;
  undefined1 *puStack_50;
  undefined *puStack_48;
  ulong uStack_38;
  undefined1 auStack_6 [6];
  
  uVar1 = func_0x006e6c78();
  if (unaff_w21 < in_stack_00000008) {
    *(undefined1 *)(unaff_x20 + (int)unaff_w21) = uVar1;
    return 0;
  }
  uVar6 = func_0x006e644c();
  uStack_38 = 0;
  lVar7 = func_0x006e6914(uVar6,1,&uStack_38);
  uVar3 = func_0x006e6bc0(uVar6,2);
  uVar1 = func_0x006e6c78(uVar6,3);
  if (uVar3 < uStack_38) {
    *(undefined1 *)(lVar7 + (int)uVar3) = uVar1;
    return 0;
  }
  uVar6 = func_0x006e644c(uVar6,"buffer access out of bounds");
  puStack_48 = &DAT_006ea96c;
  uStack_78 = 0;
  puStack_50 = auStack_6 + -10;
  lVar7 = func_0x006e6914(uVar6,1,&uStack_78);
  uVar3 = func_0x006e6bc0(uVar6,2);
  uVar2 = func_0x006e6c78(uVar6,3);
  if ((ulong)uVar3 + 2 <= uStack_78) {
    *(undefined2 *)(lVar7 + (int)uVar3) = uVar2;
    return 0;
  }
  uVar6 = func_0x006e644c(uVar6,"buffer access out of bounds");
  uStack_88 = 0x6ea9f4;
  uStack_b8 = 0;
  ppuStack_90 = &puStack_50;
  lVar7 = func_0x006e6914(uVar6,1,&uStack_b8);
  uVar3 = func_0x006e6bc0(uVar6,2);
  uVar2 = func_0x006e6c78(uVar6,3);
  if ((ulong)uVar3 + 2 <= uStack_b8) {
    *(undefined2 *)(lVar7 + (int)uVar3) = uVar2;
    return 0;
  }
  uVar6 = func_0x006e644c(uVar6,"buffer access out of bounds");
  puStack_c8 = &DAT_006eaa7c;
  uStack_f8 = 0;
  pppuStack_d0 = &ppuStack_90;
  lVar7 = func_0x006e6914(uVar6,1,&uStack_f8);
  uVar3 = func_0x006e6bc0(uVar6,2);
  uVar4 = func_0x006e6c78(uVar6,3);
  if ((ulong)uVar3 + 4 <= uStack_f8) {
    *(undefined4 *)(lVar7 + (int)uVar3) = uVar4;
    return 0;
  }
  uVar6 = func_0x006e644c(uVar6,"buffer access out of bounds");
  puStack_108 = &DAT_006eab04;
  uStack_138 = 0;
  ppplStack_110 = (long ***)&pppuStack_d0;
  lVar7 = func_0x006e6914(uVar6,1,&uStack_138);
  uVar3 = func_0x006e6bc0(uVar6,2);
  uVar4 = func_0x006e6c78(uVar6,3);
  if ((ulong)uVar3 + 4 <= uStack_138) {
    *(undefined4 *)(lVar7 + (int)uVar3) = uVar4;
    return 0;
  }
  uVar6 = func_0x006e644c(uVar6,"buffer access out of bounds");
  puStack_148 = &DAT_006eab8c;
  uStack_178 = 0;
  ppppuStack_150 = &ppplStack_110;
  lVar7 = func_0x006e6914(uVar6,1,&uStack_178);
  uVar3 = func_0x006e6bc0(uVar6,2);
  dVar8 = (double)func_0x006e6a4c(uVar6,3);
  if ((ulong)uVar3 + 4 <= uStack_178) {
    *(float *)(lVar7 + (int)uVar3) = (float)dVar8;
    return 0;
  }
  uVar6 = func_0x006e644c(uVar6,"buffer access out of bounds");
  puStack_188 = &DAT_006eac18;
  uStack_1b8 = 0;
  ppppuStack_190 = &ppppuStack_150;
  lVar7 = func_0x006e6914(uVar6,1,&uStack_1b8);
  uVar3 = func_0x006e6bc0(uVar6,2);
  uVar9 = func_0x006e6a4c(uVar6,3);
  if ((ulong)uVar3 + 8 <= uStack_1b8) {
    *(undefined8 *)(lVar7 + (int)uVar3) = uVar9;
    return 0;
  }
  uVar6 = func_0x006e644c(uVar6,"buffer access out of bounds");
  puStack_1c8 = &DAT_006eaca0;
  uStack_1f8 = 0;
  ppppuStack_1d0 = &ppppuStack_190;
  lVar7 = func_0x006e6914(uVar6,1,&uStack_1f8);
  uVar3 = func_0x006e6bc0(uVar6,2);
  uVar5 = func_0x006e6bc0(uVar6,3);
  if ((int)uVar5 < 0) {
    func_0x006e63b0(uVar6,3,"size");
  }
  else if ((ulong)uVar5 + (ulong)uVar3 <= uStack_1f8) {
    func_0x006e38d8(uVar6,lVar7 + (int)uVar3);
    return 1;
  }
  uVar6 = func_0x006e644c(uVar6,"buffer access out of bounds");
  puStack_208 = &DAT_006ead48;
  uStack_238 = 0;
  ppppuStack_210 = &ppppuStack_1d0;
  lVar7 = func_0x006e6914(uVar6,1,&uStack_238);
  uVar3 = func_0x006e6bc0(uVar6,2);
  uStack_240 = 0;
  uVar9 = func_0x006e67c8(uVar6,3,&uStack_240);
  uVar5 = func_0x006e6c08(uVar6,4,uStack_240 & 0xffffffff);
  if ((int)uVar5 < 0) {
    func_0x006e63b0(uVar6,4,"count");
  }
  else if (uVar5 <= uStack_240) {
    if ((ulong)uVar5 + (ulong)uVar3 <= uStack_238) {
      _memcpy(lVar7 + (int)uVar3,uVar9);
      return 0;
    }
    goto LAB_006eae18;
  }
  func_0x006e644c(uVar6,"string length overflow");
LAB_006eae18:
  uVar9 = func_0x006e644c(uVar6,"buffer access out of bounds");
  puStack_248 = &DAT_006eae28;
  uStack_268 = 0;
  lStack_260 = lVar7;
  uStack_258 = uVar6;
  ppppuStack_250 = &ppppuStack_210;
  func_0x006e6914(uVar9,1,&uStack_268);
  uVar6 = NEON_ucvtf(uStack_268 & 0xffffffff);
  func_0x006e3850(uVar6,uVar9);
  return 1;
}

