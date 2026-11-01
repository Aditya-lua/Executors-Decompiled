
void FUN_006229e0(undefined8 param_1,undefined1 param_2 [16],long param_3)

{
  long unaff_x19;
  undefined1 uStack0000000000000008;
  long lStack0000000000000010;
  undefined8 uStack0000000000000020;
  
  *(long *)(unaff_x19 + 0x10) = param_2._8_8_;
  *(long *)(unaff_x19 + 8) = param_2._0_8_;
  _uStack0000000000000008 = param_3;
  lStack0000000000000010 = param_3;
  uStack0000000000000020 = param_1;
  func_0x0064c1b0(&uStack0000000000000008,param_3);
  if (_uStack0000000000000008 != 0) {
    __ZdlPv();
  }
  return;
}

