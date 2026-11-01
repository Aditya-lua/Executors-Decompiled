
long * FUN_00071ae8(void)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  
  plVar2 = (long *)__Unwind_Resume();
  plVar1 = (long *)plVar2[2];
  while (plVar1 != (long *)0x0) {
    lVar3 = *plVar1;
    if (*(char *)((long)plVar1 + 0x27) < '\0') {
      __ZdlPv(plVar1[2]);
    }
    __ZdlPv(plVar1);
    plVar1 = (long *)lVar3;
  }
  lVar3 = *plVar2;
  *plVar2 = 0;
  if (lVar3 != 0) {
    __ZdlPv();
  }
  return plVar2;
}

