
long * FUN_000839c0(long *param_1,long *param_2)

{
  bool bVar1;
  long *plVar2;
  long *plVar3;
  
  plVar2 = (long *)param_2[1];
  if ((long *)param_2[1] == (long *)0x0) {
    plVar2 = param_2;
    do {
      plVar3 = (long *)plVar2[2];
      bVar1 = (long *)*plVar3 != plVar2;
      plVar2 = plVar3;
    } while (bVar1);
  }
  else {
    do {
      plVar3 = plVar2;
      plVar2 = (long *)*plVar3;
    } while ((long *)*plVar3 != (long *)0x0);
  }
  if ((long *)*param_1 == param_2) {
    *param_1 = (long)plVar3;
  }
  param_1[2] = param_1[2] + -1;
  func_0x00037ca0(param_1[1],param_2);
  func_0x00078220(param_2 + 8,(char)param_2[7]);
  if (*(char *)((long)param_2 + 0x37) < '\0') {
    __ZdlPv(param_2[4]);
    __ZdlPv(param_2);
    return plVar3;
  }
  __ZdlPv(param_2);
  return plVar3;
}

