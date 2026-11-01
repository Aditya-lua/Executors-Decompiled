
undefined8 FUN_00050de0(long param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  
  __ZNSt3__15mutex6unlockEv(param_1 + 0x8e8);
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
  }
  uVar2 = __Unwind_Resume();
  uVar3 = __Znwm(8);
  __ZNSt3__115__thread_structC1Ev();
  puVar4 = (undefined8 *)__Znwm(8);
  *puVar4 = uVar3;
  uVar3 = _pthread_create(uVar2,0,&DAT_00051298,puVar4);
  if ((int)uVar3 != 0) {
    __ZNSt3__120__throw_system_errorEiPKc(uVar3,"thread constructor failed");
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x50e8c);
    (*pcVar1)();
  }
  return uVar2;
}

