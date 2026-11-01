
undefined8 FUN_005468a0(long *param_1)

{
  long lVar1;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined1 uStack0000000000000090;
  
  _uStack0000000000000090 = param_1;
  if (param_1 != (long *)0x0) {
    lVar1 = *param_1;
    *param_1 = lVar1 + -1;
    if (lVar1 + -1 == 0) {
      func_0x0057e6ac(&uStack0000000000000090);
    }
  }
  lVar1 = *uStack0000000000000028;
  *uStack0000000000000028 = lVar1 + -1;
  if (lVar1 + -1 == 0) {
    func_0x0057e6ac(&uStack0000000000000028);
  }
  lVar1 = *uStack0000000000000020;
  *uStack0000000000000020 = lVar1 + -1;
  if (lVar1 + -1 == 0) {
    func_0x0057e6ac(&uStack0000000000000020);
  }
  return 0;
}

