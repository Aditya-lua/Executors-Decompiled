
undefined1  [16] FUN_00194ec8(undefined8 *param_1)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 in_x4;
  undefined8 in_x5;
  long lVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 uStack0000000000000008;
  long lStack_58;
  long lStack_50;
  long lStack_48;
  
  _uStack0000000000000008 = 0;
  lVar1 = _SecTransformExecute(*param_1,&uStack0000000000000008);
  if (lVar1 == 0) {
    if (_uStack0000000000000008 == 0) {
      func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c15f0);
      func_0x00195c58(&lStack_58);
      auVar5 = func_0x00195930(&lStack_58,in_x4,in_x5);
      uVar2 = auVar5._8_8_;
      lVar1 = lStack_50;
      for (lVar3 = lStack_48; lVar3 != 0; lVar3 = lVar3 + -1) {
        func_0x0019fb28(lVar1);
        func_0x0019e6a4(lVar1 + 8);
        uVar2 = extraout_x1;
        lVar1 = lVar1 + 0x10;
      }
      if (lStack_58 != 0) {
        func_0x00187bd4(lStack_50,lStack_58 << 4,8);
        uVar2 = extraout_x1_00;
      }
      auVar5._8_8_ = uVar2;
      return auVar5;
    }
    uVar2 = 1;
  }
  else {
    uVar2 = 0;
    _uStack0000000000000008 = lVar1;
  }
  auVar4._8_8_ = _uStack0000000000000008;
  auVar4._0_8_ = uVar2;
  return auVar4;
}

