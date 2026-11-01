
ulong FUN_005c6a60(undefined1 *param_1)

{
  ulong uVar1;
  ulong uVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  uint uVar6;
  undefined8 unaff_x19;
  undefined8 unaff_x21;
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 uStack0000000000000050;
  
  auVar7._8_8_ = unaff_x19;
  auVar7._0_8_ = unaff_x21;
  while( true ) {
    auVar8 = func_0x005c5904(param_1);
    lVar5 = auVar8._0_8_;
    if (lVar5 == 0) {
      return 1;
    }
    uVar1 = *(ulong *)(auVar7._0_8_ + 0x10);
    uVar2 = *(ulong *)(lVar5 + 0x10);
    uVar4 = uVar1;
    if (uVar2 <= uVar1) {
      uVar4 = uVar2;
    }
    iVar3 = _memcmp(*(undefined8 *)(auVar7._0_8_ + 8),*(undefined8 *)(lVar5 + 8),uVar4);
    lVar5 = uVar1 - uVar2;
    if (iVar3 != 0) {
      lVar5 = (long)iVar3;
    }
    uVar6 = (uint)(0 < lVar5);
    if (lVar5 < 0) {
      uVar6 = 0xffffffff;
    }
    uVar4 = (ulong)uVar6;
    if (lVar5 == 0) {
      uVar4 = func_0x005c8a14(auVar7._8_8_,auVar8._8_8_);
    }
    if ((uVar4 & 0xff) != 0) break;
    auVar7 = func_0x005c5904();
    if (auVar7._0_8_ == 0) {
      lVar5 = func_0x005c5904(&uStack0000000000000050);
      return (ulong)-(uint)(lVar5 != 0);
    }
    param_1 = &uStack0000000000000050;
  }
  return uVar4;
}

