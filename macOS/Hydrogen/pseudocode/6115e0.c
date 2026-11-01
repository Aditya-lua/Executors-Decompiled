
void FUN_006115e0(void)

{
  long lVar1;
  code *pcVar2;
  undefined8 uVar3;
  
  lVar1 = _malloc();
  while( true ) {
    if (lVar1 != 0) {
      return;
    }
    pcVar2 = (code *)__ZSt15set_new_handlerPFvvE(0);
    if (pcVar2 == (code *)0x0) break;
    __ZSt15set_new_handlerPFvvE();
    (*pcVar2)();
    lVar1 = _malloc();
  }
  ___cxa_allocate_exception(8);
  uVar3 = __ZNSt9bad_allocC1Ev();
  lVar1 = ___cxa_throw(uVar3,PTR___ZTISt9bad_alloc_009b0150,PTR___ZNSt9bad_allocD1Ev_009b00b0);
  if (lVar1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

