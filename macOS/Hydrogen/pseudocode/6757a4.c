
undefined8 * FUN_006757a4(undefined8 param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  
  __ZdlPv();
  puVar4 = (undefined8 *)__Unwind_Resume(param_1);
  *puVar4 = &UNK_009b3698;
  iVar2 = __ZSt19uncaught_exceptionsv();
  if (((iVar2 == 0) && (*(char *)(puVar4 + 2) != '\0')) && (*(char *)((long)puVar4 + 0x11) == '\0'))
  {
    uVar3 = ___cxa_allocate_exception(0x28);
    func_0x0003ecec(uVar3,puVar4[1]);
    ___cxa_throw(uVar3,&UNK_009b36b8,&DAT_0003eca0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x3ec68);
    (*pcVar1)();
  }
  if ((long *)puVar4[3] != (long *)0x0) {
    (**(code **)(*(long *)puVar4[3] + 8))();
  }
  return puVar4;
}

