
long FUN_0005a550(code *param_1)

{
  long *plVar1;
  long lVar2;
  long in_stack_00000050;
  
  while( true ) {
    (*param_1)();
    if (in_stack_00000050 != 0) break;
    plVar1 = (long *)__Unwind_Resume();
    param_1 = *(code **)(*plVar1 + 0x28);
  }
  __ZdlPv();
  lVar2 = __Unwind_Resume();
  if (*(long *)(lVar2 + 0x40) != 0) {
    *(long *)(lVar2 + 0x48) = *(long *)(lVar2 + 0x40);
    __ZdlPv();
  }
  return lVar2;
}

