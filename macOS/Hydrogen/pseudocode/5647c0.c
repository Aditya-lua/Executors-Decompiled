
undefined8 FUN_005647c0(long *param_1)

{
  long lVar1;
  long *plStack0000000000000000;
  
  lVar1 = *param_1;
  *param_1 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    plStack0000000000000000 = param_1;
    func_0x005d2ac4();
  }
  return 1;
}

