
undefined4 FUN_0064a904(undefined8 param_1)

{
  undefined4 uVar1;
  undefined8 uVar2;
  long *extraout_x1;
  
  __ZNSt9exceptionD2Ev();
  __ZdlPv();
  ___cxa_free_exception();
  uVar2 = __Unwind_Resume(param_1);
  ___cxa_free_exception();
  __Unwind_Resume(uVar2);
  (**(code **)(*extraout_x1 + 0xa0))(extraout_x1);
  uVar1 = func_0x005fe4e8();
  return uVar1;
}

