
undefined8 FUN_006ea9e8(void)

{
  undefined2 uVar1;
  uint uVar2;
  undefined4 uVar3;
  uint uVar4;
  undefined8 uVar5;
  long lVar6;
  double dVar7;
  undefined8 uVar8;
  ulong uStack_1e8;
  long lStack_1e0;
  undefined8 uStack_1d8;
  undefined8 ****ppppuStack_1d0;
  undefined *puStack_1c8;
  ulong uStack_1c0;
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
  undefined *puStack_88;
  ulong uStack_78;
  undefined1 *puStack_50;
  undefined *puStack_48;
  ulong uStack_38;
  undefined1 auStack_6 [6];
  
  uVar5 = func_0x006e644c();
  uStack_38 = 0;
  lVar6 = func_0x006e6914(uVar5,1,&uStack_38);
  uVar2 = func_0x006e6bc0(uVar5,2);
  uVar1 = func_0x006e6c78(uVar5,3);
  if ((ulong)uVar2 + 2 <= uStack_38) {
    *(undefined2 *)(lVar6 + (int)uVar2) = uVar1;
    return 0;
  }
  uVar5 = func_0x006e644c(uVar5,"buffer access out of bounds");
  puStack_48 = &DAT_006eaa7c;
  uStack_78 = 0;
  puStack_50 = auStack_6 + -10;
  lVar6 = func_0x006e6914(uVar5,1,&uStack_78);
  uVar2 = func_0x006e6bc0(uVar5,2);
  uVar3 = func_0x006e6c78(uVar5,3);
  if ((ulong)uVar2 + 4 <= uStack_78) {
    *(undefined4 *)(lVar6 + (int)uVar2) = uVar3;
    return 0;
  }
  uVar5 = func_0x006e644c(uVar5,"buffer access out of bounds");
  puStack_88 = &DAT_006eab04;
  uStack_b8 = 0;
  ppuStack_90 = &puStack_50;
  lVar6 = func_0x006e6914(uVar5,1,&uStack_b8);
  uVar2 = func_0x006e6bc0(uVar5,2);
  uVar3 = func_0x006e6c78(uVar5,3);
  if ((ulong)uVar2 + 4 <= uStack_b8) {
    *(undefined4 *)(lVar6 + (int)uVar2) = uVar3;
    return 0;
  }
  uVar5 = func_0x006e644c(uVar5,"buffer access out of bounds");
  puStack_c8 = &DAT_006eab8c;
  uStack_f8 = 0;
  pppuStack_d0 = &ppuStack_90;
  lVar6 = func_0x006e6914(uVar5,1,&uStack_f8);
  uVar2 = func_0x006e6bc0(uVar5,2);
  dVar7 = (double)func_0x006e6a4c(uVar5,3);
  if ((ulong)uVar2 + 4 <= uStack_f8) {
    *(float *)(lVar6 + (int)uVar2) = (float)dVar7;
    return 0;
  }
  uVar5 = func_0x006e644c(uVar5,"buffer access out of bounds");
  puStack_108 = &DAT_006eac18;
  uStack_138 = 0;
  ppplStack_110 = (long ***)&pppuStack_d0;
  lVar6 = func_0x006e6914(uVar5,1,&uStack_138);
  uVar2 = func_0x006e6bc0(uVar5,2);
  uVar8 = func_0x006e6a4c(uVar5,3);
  if ((ulong)uVar2 + 8 <= uStack_138) {
    *(undefined8 *)(lVar6 + (int)uVar2) = uVar8;
    return 0;
  }
  uVar5 = func_0x006e644c(uVar5,"buffer access out of bounds");
  puStack_148 = &DAT_006eaca0;
  uStack_178 = 0;
  ppppuStack_150 = &ppplStack_110;
  lVar6 = func_0x006e6914(uVar5,1,&uStack_178);
  uVar2 = func_0x006e6bc0(uVar5,2);
  uVar4 = func_0x006e6bc0(uVar5,3);
  if ((int)uVar4 < 0) {
    func_0x006e63b0(uVar5,3,"size");
  }
  else if ((ulong)uVar4 + (ulong)uVar2 <= uStack_178) {
    func_0x006e38d8(uVar5,lVar6 + (int)uVar2);
    return 1;
  }
  uVar5 = func_0x006e644c(uVar5,"buffer access out of bounds");
  puStack_188 = &DAT_006ead48;
  uStack_1b8 = 0;
  ppppuStack_190 = &ppppuStack_150;
  lVar6 = func_0x006e6914(uVar5,1,&uStack_1b8);
  uVar2 = func_0x006e6bc0(uVar5,2);
  uStack_1c0 = 0;
  uVar8 = func_0x006e67c8(uVar5,3,&uStack_1c0);
  uVar4 = func_0x006e6c08(uVar5,4,uStack_1c0 & 0xffffffff);
  if ((int)uVar4 < 0) {
    func_0x006e63b0(uVar5,4,"count");
  }
  else if (uVar4 <= uStack_1c0) {
    if ((ulong)uVar4 + (ulong)uVar2 <= uStack_1b8) {
      _memcpy(lVar6 + (int)uVar2,uVar8);
      return 0;
    }
    goto LAB_006eae18;
  }
  func_0x006e644c(uVar5,"string length overflow");
LAB_006eae18:
  uVar8 = func_0x006e644c(uVar5,"buffer access out of bounds");
  puStack_1c8 = &DAT_006eae28;
  uStack_1e8 = 0;
  lStack_1e0 = lVar6;
  uStack_1d8 = uVar5;
  ppppuStack_1d0 = &ppppuStack_190;
  func_0x006e6914(uVar8,1,&uStack_1e8);
  uVar5 = NEON_ucvtf(uStack_1e8 & 0xffffffff);
  func_0x006e3850(uVar5,uVar8);
  return 1;
}

