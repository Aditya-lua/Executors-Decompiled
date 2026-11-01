
undefined8 FUN_00374004(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined8 unaff_x19;
  code *unaff_x20;
  ulong unaff_x21;
  long unaff_x23;
  
  lVar3 = _calloc(param_1,0x28);
  if (lVar3 != 0) {
    iVar2 = _pthread_setspecific(*(undefined8 *)(unaff_x23 + 0xf28),lVar3);
    if (iVar2 == 0) {
      iVar2 = _pthread_mutex_lock(0xa29c58);
      if (iVar2 == 0) {
        lVar1 = (unaff_x21 & 0xffffffff) * 8;
        *(code **)(lVar1 + 0xa3bf30) = unaff_x20;
        _pthread_mutex_unlock(0xa29c58);
        *(undefined8 *)(lVar3 + lVar1) = unaff_x19;
        return 1;
      }
    }
    else {
      _free(lVar3);
    }
  }
  (*unaff_x20)();
  return 0;
}

