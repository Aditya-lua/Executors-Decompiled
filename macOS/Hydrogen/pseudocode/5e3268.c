
undefined1  [16] FUN_005e3268(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 uVar2;
  ulong *extraout_x8;
  ulong uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined *puStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  
  puStack0000000000000000 = &UNK_009f37a0;
  uStack0000000000000008 = 1;
  uStack0000000000000018 = 0;
  uStack0000000000000020 = 0;
  uStack0000000000000010 = 8;
  iVar1 = func_0x007a2420();
  if (iVar1 == 0) {
    auVar4._8_8_ = param_3;
    auVar4._0_8_ = extraout_x1;
    return auVar4;
  }
  auVar5 = func_0x007a1f18(extraout_x1,param_3);
  uVar2 = auVar5._8_8_;
  auVar5._0_8_ = auVar5._0_8_;
  uVar3 = auVar5._0_8_ >> 5;
  if ((auVar5._0_8_ & 0x1f) != 0) {
    uVar3 = uVar3 + 1;
  }
  if (uVar3 != 0) {
    auVar5 = func_0x00187bdc(uVar3 << 2,4);
    if (auVar5._0_8_ != 0) goto LAB_005e3320;
    func_0x007a1f00(4,uVar3 << 2,&UNK_009f37c8);
    uVar2 = extraout_x1_00;
  }
  auVar5._8_8_ = uVar2;
  auVar5._0_8_ = 4;
LAB_005e3320:
  *extraout_x8 = uVar3;
  extraout_x8[1] = auVar5._0_8_;
  extraout_x8[2] = uVar3;
  extraout_x8[3] = auVar5._0_8_;
  return auVar5;
}

