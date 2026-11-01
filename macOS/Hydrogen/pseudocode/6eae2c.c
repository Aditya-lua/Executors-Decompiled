
undefined8 FUN_006eae2c(undefined8 param_1)

{
  undefined8 uVar1;
  undefined1 uStack0000000000000008;
  
  _uStack0000000000000008 = 0;
  func_0x006e6914(param_1,1,&uStack0000000000000008);
  uVar1 = NEON_ucvtf(_uStack0000000000000008 & 0xffffffff);
  func_0x006e3850(uVar1,param_1);
  return 1;
}

