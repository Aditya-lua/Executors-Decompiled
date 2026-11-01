
void FUN_0008d76c(void)

{
  long lVar1;
  
  lVar1 = _class_getInstanceMethod();
  if (lVar1 != 0) {
    uRam0000000000a33478 = _method_setImplementation(lVar1,&DAT_0008d6cc);
    lVar1 = _class_getInstanceMethod();
    if (lVar1 != 0) {
      uRam0000000000a33470 = _method_setImplementation(lVar1,&DAT_0008d488);
    }
  }
  return;
}

