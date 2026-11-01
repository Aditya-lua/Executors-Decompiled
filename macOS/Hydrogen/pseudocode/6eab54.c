
undefined8 FUN_006eab54(ulong param_1,undefined4 param_2)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  long lVar4;
  long unaff_x20;
  int unaff_w21;
  double dVar5;
  undefined8 uVar6;
  ulong in_stack_00000008;
  ulong uStack_128;
  long lStack_120;
  undefined8 uStack_118;
  long ***ppplStack_110;
  undefined *puStack_108;
  ulong uStack_100;
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
  
  if (param_1 <= in_stack_00000008) {
    *(undefined4 *)(unaff_x20 + unaff_w21) = param_2;
    return 0;
  }
  uVar3 = func_0x006e644c();
  uStack_38 = 0;
  lVar4 = func_0x006e6914(uVar3,1,&uStack_38);
  uVar1 = func_0x006e6bc0(uVar3,2);
  dVar5 = (double)func_0x006e6a4c(uVar3,3);
  if ((ulong)uVar1 + 4 <= uStack_38) {
    *(float *)(lVar4 + (int)uVar1) = (float)dVar5;
    return 0;
  }
  uVar3 = func_0x006e644c(uVar3,"buffer access out of bounds");
  puStack_48 = &DAT_006eac18;
  uStack_78 = 0;
  puStack_50 = auStack_6 + -10;
  lVar4 = func_0x006e6914(uVar3,1,&uStack_78);
  uVar1 = func_0x006e6bc0(uVar3,2);
  uVar6 = func_0x006e6a4c(uVar3,3);
  if ((ulong)uVar1 + 8 <= uStack_78) {
    *(undefined8 *)(lVar4 + (int)uVar1) = uVar6;
    return 0;
  }
  uVar3 = func_0x006e644c(uVar3,"buffer access out of bounds");
  puStack_88 = &DAT_006eaca0;
  uStack_b8 = 0;
  ppuStack_90 = &puStack_50;
  lVar4 = func_0x006e6914(uVar3,1,&uStack_b8);
  uVar1 = func_0x006e6bc0(uVar3,2);
  uVar2 = func_0x006e6bc0(uVar3,3);
  if ((int)uVar2 < 0) {
    func_0x006e63b0(uVar3,3,"size");
  }
  else if ((ulong)uVar2 + (ulong)uVar1 <= uStack_b8) {
    func_0x006e38d8(uVar3,lVar4 + (int)uVar1);
    return 1;
  }
  uVar3 = func_0x006e644c(uVar3,"buffer access out of bounds");
  puStack_c8 = &DAT_006ead48;
  uStack_f8 = 0;
  pppuStack_d0 = &ppuStack_90;
  lVar4 = func_0x006e6914(uVar3,1,&uStack_f8);
  uVar1 = func_0x006e6bc0(uVar3,2);
  uStack_100 = 0;
  uVar6 = func_0x006e67c8(uVar3,3,&uStack_100);
  uVar2 = func_0x006e6c08(uVar3,4,uStack_100 & 0xffffffff);
  if ((int)uVar2 < 0) {
    func_0x006e63b0(uVar3,4,"count");
  }
  else if (uVar2 <= uStack_100) {
    if ((ulong)uVar2 + (ulong)uVar1 <= uStack_f8) {
      _memcpy(lVar4 + (int)uVar1,uVar6);
      return 0;
    }
    goto LAB_006eae18;
  }
  func_0x006e644c(uVar3,"string length overflow");
LAB_006eae18:
  uVar6 = func_0x006e644c(uVar3,"buffer access out of bounds");
  puStack_108 = &DAT_006eae28;
  uStack_128 = 0;
  lStack_120 = lVar4;
  uStack_118 = uVar3;
  ppplStack_110 = (long ***)&pppuStack_d0;
  func_0x006e6914(uVar6,1,&uStack_128);
  uVar3 = NEON_ucvtf(uStack_128 & 0xffffffff);
  func_0x006e3850(uVar3,uVar6);
  return 1;
}

