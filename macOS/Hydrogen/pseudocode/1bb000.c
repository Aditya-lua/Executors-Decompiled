
undefined8 FUN_001bb000(long param_1)

{
  undefined8 uVar1;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  
  _uStack0000000000000008 = 0;
  uStack0000000000000010 = 1;
  uStack0000000000000018 = 0;
  func_0x001a5ffc(param_1 + -0x20,&uStack0000000000000008);
  uVar1 = uStack0000000000000018;
  if (_uStack0000000000000008 != 0) {
    func_0x00187bd4(uStack0000000000000010,_uStack0000000000000008,1);
  }
  return uVar1;
}

