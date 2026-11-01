
void FUN_005b8b18(undefined8 *param_1)

{
  long lVar1;
  undefined8 uStack0000000000000040;
  
  *param_1 = 0xc;
  func_0x005adc80();
  lVar1 = *uStack0000000000000040;
  *uStack0000000000000040 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(&uStack0000000000000040);
  }
  return;
}

