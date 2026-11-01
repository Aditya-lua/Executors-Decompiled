
void FUN_00059930(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  
  puVar2 = (undefined8 *)__Znwm();
  uVar3 = *unaff_x20;
  *puVar2 = unaff_x21;
  puVar2[1] = uVar3;
  uVar3 = _pthread_create();
  if ((int)uVar3 != 0) {
    __ZNSt3__120__throw_system_errorEiPKc(uVar3,"thread constructor failed");
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x59984);
    (*pcVar1)();
  }
  return;
}

