
long FUN_0061c80c(void)

{
  undefined8 uVar1;
  long lVar2;
  
  __ZdlPv();
  uVar1 = __Unwind_Resume();
  __ZNSt9exceptionD2Ev();
  __ZdlPv();
  ___cxa_free_exception();
  uVar1 = __Unwind_Resume(uVar1);
  ___cxa_free_exception();
  lVar2 = __Unwind_Resume(uVar1);
  return *(long *)(lVar2 + 0x60) + *(long *)(lVar2 + 0x58);
}

