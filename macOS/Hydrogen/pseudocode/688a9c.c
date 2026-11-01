
undefined8 FUN_00688a9c(void)

{
  undefined8 uVar1;
  
  uVar1 = __Unwind_Resume();
  ___cxa_free_exception();
  __Unwind_Resume(uVar1);
  return 0;
}

