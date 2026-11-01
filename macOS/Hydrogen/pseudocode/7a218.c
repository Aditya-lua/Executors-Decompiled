
/* WARNING: Removing unreachable block (ram,0x0007a27c) */

long * FUN_0007a218(long *param_1)

{
  long lVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  
  if ((char)param_1[1] == '\0') {
    plVar2 = (long *)*param_1;
    lVar3 = *plVar2;
    if (lVar3 != 0) {
      lVar4 = plVar2[1];
      lVar1 = lVar3;
      if (lVar4 != lVar3) {
        do {
          lVar4 = lVar4 + -0x18;
        } while (lVar4 != lVar3);
        lVar1 = *(long *)*param_1;
      }
      plVar2[1] = lVar3;
      __ZdlPv(lVar1);
      return param_1;
    }
  }
  return param_1;
}

