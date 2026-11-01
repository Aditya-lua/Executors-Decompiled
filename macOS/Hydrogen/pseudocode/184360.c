
undefined8 FUN_00184360(undefined8 param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  undefined1 auVar2 [16];
  
  func_0x00187bd4(param_1,param_2,8);
  auVar2 = func_0x007a116c();
  puVar1 = auVar2._8_8_;
  if ((code *)*puVar1 != (code *)0x0) {
    (*(code *)*puVar1)(auVar2._0_8_);
  }
  if (puVar1[1] != 0) {
    func_0x00187bd4(auVar2._0_8_,puVar1[1],puVar1[2]);
  }
  return 0x16;
}

