
long FUN_0004137c(void)

{
  undefined8 uVar1;
  long lVar2;
  
  __ZNSt9exceptionD2Ev();
  __ZdlPv();
  ___cxa_free_exception();
  uVar1 = __Unwind_Resume();
  ___cxa_free_exception();
  lVar2 = __Unwind_Resume(uVar1);
  return lVar2 + 8;
}

