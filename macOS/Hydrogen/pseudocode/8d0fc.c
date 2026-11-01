
void FUN_0008d0fc(undefined8 param_1)

{
  long lVar1;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = uRam0000000000a275c0;
  uStack0000000000000000 = param_1;
  _objc_msgSendSuper2();
  func_0x007b7ee0();
  lVar1 = func_0x007b7f20();
  if (lVar1 != 0) {
    func_0x007b7ee0();
    func_0x007b7f20();
    lVar1 = func_0x007b6820();
    if (lVar1 == 0) {
      func_0x007b7ee0();
      func_0x007b7f20();
      func_0x007b7600();
      return;
    }
  }
  return;
}

