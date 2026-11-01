
ulong FUN_005c6a74(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  uint uVar5;
  ulong in_x9;
  ulong in_x10;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined1 auVar6 [16];
  undefined1 uStack0000000000000050;
  
  while( true ) {
    uVar3 = in_x9;
    if (in_x10 <= in_x9) {
      uVar3 = in_x10;
    }
    iVar1 = _memcmp(param_1,param_3,uVar3);
    lVar4 = in_x9 - in_x10;
    if (iVar1 != 0) {
      lVar4 = (long)iVar1;
    }
    uVar5 = (uint)(0 < lVar4);
    if (lVar4 < 0) {
      uVar5 = 0xffffffff;
    }
    uVar3 = (ulong)uVar5;
    if (lVar4 == 0) {
      uVar3 = func_0x005c8a14(unaff_x19,unaff_x20);
    }
    if ((uVar3 & 0xff) != 0) {
      return uVar3;
    }
    auVar6 = func_0x005c5904();
    unaff_x19 = auVar6._8_8_;
    lVar4 = auVar6._0_8_;
    if (lVar4 == 0) {
      lVar4 = func_0x005c5904(&uStack0000000000000050);
      return (ulong)-(uint)(lVar4 != 0);
    }
    auVar6 = func_0x005c5904(&uStack0000000000000050);
    unaff_x20 = auVar6._8_8_;
    lVar2 = auVar6._0_8_;
    if (lVar2 == 0) break;
    param_1 = *(undefined8 *)(lVar4 + 8);
    in_x9 = *(ulong *)(lVar4 + 0x10);
    param_3 = *(undefined8 *)(lVar2 + 8);
    in_x10 = *(ulong *)(lVar2 + 0x10);
  }
  return 1;
}

