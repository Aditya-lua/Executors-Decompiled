
void FUN_006b74f4(undefined8 param_1,long param_2)

{
  undefined8 in_x9;
  long unaff_x19;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000020;
  
  *(undefined8 *)(unaff_x19 + 0x10) = in_x9;
  _uStack0000000000000008 = param_2;
  uStack0000000000000020 = param_1;
  func_0x006b71e4(&uStack0000000000000008,param_2);
  if (_uStack0000000000000008 != 0) {
    __ZdlPv();
  }
  return;
}

