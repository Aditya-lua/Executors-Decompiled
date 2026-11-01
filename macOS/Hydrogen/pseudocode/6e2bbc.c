
long FUN_006e2bbc(long param_1,long param_2)

{
  double *pdVar1;
  long lVar2;
  undefined4 uVar3;
  undefined4 *unaff_x19;
  
  pdVar1 = (double *)(param_2 + param_1);
  if ((*(int *)((long)pdVar1 + 0xc) == 3) ||
     (pdVar1 = (double *)func_0x00702288(), pdVar1 != (double *)0x0)) {
    lVar2 = (long)*pdVar1;
    if (unaff_x19 == (undefined4 *)0x0) {
      return lVar2;
    }
    uVar3 = 1;
  }
  else {
    uVar3 = 0;
    lVar2 = 0;
    if (unaff_x19 == (undefined4 *)0x0) {
      return 0;
    }
  }
  *unaff_x19 = uVar3;
  return lVar2;
}

