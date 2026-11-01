
undefined8 FUN_000599a0(void)

{
  undefined8 uVar1;
  long *plVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined1 uStack0000000000000008;
  
  __ZdlPv();
  uVar1 = __Unwind_Resume();
  func_0x00051310();
  func_0x00051358(&uStack0000000000000008);
  plVar2 = (long *)__Unwind_Resume(uVar1);
  puVar3 = (undefined8 *)__ZNSt3__119__thread_local_dataEv();
  lVar4 = *plVar2;
  *plVar2 = 0;
  _pthread_setspecific(*puVar3,lVar4);
  func_0x00059a40(plVar2 + 1);
  lVar4 = *plVar2;
  *plVar2 = 0;
  if (lVar4 != 0) {
    __ZNSt3__115__thread_structD1Ev();
    __ZdlPv();
  }
  __ZdlPv(plVar2);
  return 0;
}

