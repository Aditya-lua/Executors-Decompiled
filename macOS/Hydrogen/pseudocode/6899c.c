
long * FUN_0006899c(long *param_1)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  
  plVar2 = param_1 + 4;
  plVar1 = (long *)param_1[7];
  if (plVar1 == plVar2) {
    lVar3 = 4;
  }
  else {
    if (plVar1 == (long *)0x0) goto LAB_000689d8;
    lVar3 = 5;
    plVar2 = plVar1;
  }
  (**(code **)(*plVar2 + lVar3 * 8))();
LAB_000689d8:
  plVar2 = (long *)param_1[3];
  if (plVar2 == param_1) {
    lVar3 = 4;
    plVar2 = param_1;
  }
  else {
    if (plVar2 == (long *)0x0) {
      return param_1;
    }
    lVar3 = 5;
  }
  (**(code **)(*plVar2 + lVar3 * 8))();
  return param_1;
}

