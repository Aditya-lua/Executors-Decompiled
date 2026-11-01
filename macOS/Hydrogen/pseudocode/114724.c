
uint FUN_00114724(undefined4 param_1,float param_2,float param_3,undefined8 param_4,float *param_5,
                 float *param_6,undefined8 param_7,undefined8 param_8,uint param_9)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  long unaff_x26;
  float fVar4;
  undefined1 uStack0000000000000004;
  undefined4 uStack0000000000000008;
  undefined1 uStack000000000000000c;
  
  func_0x000d4e10();
  func_0x000d8a9c();
  func_0x000d890c();
  func_0x000d876c(2);
  _uStack000000000000000c = -3.4028235e+38;
  if (param_2 < param_3) {
    _uStack000000000000000c = param_2;
  }
  uStack0000000000000008 = *param_6;
  fVar4 = param_3;
  if (uStack0000000000000008 <= param_3) {
    fVar4 = uStack0000000000000008;
  }
  if (param_2 < param_3) {
    uStack0000000000000008 = fVar4;
  }
  uVar1 = func_0x00113a24(param_1,"##min",8,param_5,&uStack000000000000000c,&uStack0000000000000008,
                          param_7,param_9 | (uint)(_uStack000000000000000c == uStack0000000000000008
                                                  ) << 0x15);
  func_0x000d88dc();
  func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + unaff_x26));
  _uStack0000000000000004 = *param_5;
  fVar4 = param_2;
  if (param_2 < _uStack0000000000000004) {
    fVar4 = _uStack0000000000000004;
  }
  if (param_2 < param_3) {
    _uStack0000000000000004 = fVar4;
  }
  uVar2 = func_0x00113a24(param_1,"##max",8,param_6,&uStack0000000000000004);
  func_0x000d88dc();
  func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + unaff_x26));
  uVar3 = func_0x000bc0e8(param_4,0);
  func_0x0010aa24(param_4,uVar3,0);
  func_0x000d818c();
  func_0x000d53d0();
  return uVar1 | uVar2;
}

