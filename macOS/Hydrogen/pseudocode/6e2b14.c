
int FUN_006e2b14(long param_1,int param_2)

{
  int iVar1;
  int iVar2;
  double *pdVar3;
  undefined4 uVar4;
  undefined4 *unaff_x19;
  
  pdVar3 = (double *)(*(long *)(param_1 + 8) + (long)param_2 * 0x10);
  if ((*(int *)((long)pdVar3 + 0xc) == 3) ||
     (pdVar3 = (double *)func_0x00702288(), pdVar3 != (double *)0x0)) {
    iVar1 = (int)*pdVar3;
    if (unaff_x19 != (undefined4 *)0x0) {
      uVar4 = 1;
      iVar2 = iVar1;
      goto LAB_006e2b6c;
    }
  }
  else {
    uVar4 = 0;
    iVar1 = 0;
    iVar2 = 0;
    if (unaff_x19 != (undefined4 *)0x0) {
LAB_006e2b6c:
      *unaff_x19 = uVar4;
      return iVar2;
    }
  }
  return iVar1;
}

