
undefined8 FUN_00374020(int param_1)

{
  long lVar1;
  int iVar2;
  undefined8 unaff_x19;
  code *unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  
  if (param_1 == 0) {
    iVar2 = _pthread_mutex_lock(0xa29c58);
    if (iVar2 == 0) {
      lVar1 = (unaff_x21 & 0xffffffff) * 8;
      *(code **)(lVar1 + 0xa3bf30) = unaff_x20;
      _pthread_mutex_unlock(0xa29c58);
      *(undefined8 *)(unaff_x22 + lVar1) = unaff_x19;
      return 1;
    }
  }
  else {
    _free();
  }
  (*unaff_x20)();
  return 0;
}

