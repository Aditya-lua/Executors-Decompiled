
undefined8 FUN_00563a3c(long *param_1)

{
  long lVar1;
  undefined8 uStack0000000000000008;
  
  lVar1 = *param_1;
  *param_1 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2ac4(&uStack0000000000000008);
  }
  return 1;
}

