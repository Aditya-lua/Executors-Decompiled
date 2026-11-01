
void FUN_005b842c(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000040;
  
  param_1[1] = &UNK_008b2f95;
  param_1[2] = 0x31;
  *param_1 = 0x8000000000000000;
  uStack0000000000000000 = param_3;
  uStack0000000000000010 = param_2;
  func_0x005adc80();
  lVar1 = *uStack0000000000000040;
  *uStack0000000000000040 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(&uStack0000000000000040);
  }
  return;
}

