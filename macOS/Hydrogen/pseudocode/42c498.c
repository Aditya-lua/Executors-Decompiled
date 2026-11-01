
undefined8 FUN_0042c498(undefined8 param_1,ulong param_2)

{
  int iVar1;
  undefined1 uStack0000000000000008;
  
  _uStack0000000000000008 = 0;
  if (param_2 < 9) {
    param_2 = 8;
  }
  iVar1 = _posix_memalign(&uStack0000000000000008,param_2);
  if (iVar1 != 0) {
    _uStack0000000000000008 = 0;
  }
  return _uStack0000000000000008;
}

