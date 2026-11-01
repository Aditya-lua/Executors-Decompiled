
undefined8 FUN_005f25d0(void)

{
  undefined8 uVar1;
  
  __ZdlPv();
  uVar1 = __Unwind_Resume();
  __ZNSt9exceptionD2Ev();
  __ZdlPv();
  ___cxa_free_exception();
  uVar1 = __Unwind_Resume(uVar1);
  ___cxa_free_exception();
  __Unwind_Resume(uVar1);
  return 0;
}

