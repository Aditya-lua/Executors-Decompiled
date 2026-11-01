
undefined8 FUN_005f2710(void)

{
  undefined8 uVar1;
  
  uVar1 = __Unwind_Resume();
  ___cxa_free_exception();
  __Unwind_Resume(uVar1);
  return 0;
}

