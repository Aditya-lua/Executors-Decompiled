/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cc36c
 */

void FUN_008cc36c(undefined8 param_1,double *param_2,double *param_3,double *param_4)

{
  int iVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  float fVar5;
  double *pdVar6;
  double *pdVar7;
  double local_68;
  double local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  iVar3 = *(int *)((long)param_3 + 0xc);
  iVar1 = *(int *)((long)param_4 + 0xc);
  pdVar6 = param_3;
  if (iVar3 != 4) {
    pdVar6 = (double *)0x0;
  }
  pdVar7 = param_4;
  if (iVar1 != 4) {
    pdVar7 = (double *)0x0;
  }
  if ((pdVar6 == (double *)0x0) || (pdVar7 == (double *)0x0)) {
    if (pdVar6 == (double *)0x0) {
      if ((((iVar3 != 3) && (pdVar7 != (double *)0x0)) && (iVar3 == 5)) &&
         (iVar3 = FUN_008b93c8((long)*param_3 + 0x18,&local_60), iVar3 != 0)) {
        local_68 = local_60;
      }
    }
    else if ((iVar1 != 3) && (iVar1 == 5)) {
      FUN_008b93c8((long)*param_4 + 0x18,&local_60);
    }
    pdVar6 = param_3;
    if (*(int *)((long)param_3 + 0xc) == 3) {
LAB_008cc48c:
      if (*(int *)((long)param_4 + 0xc) == 3) {
        pdVar7 = param_4;
LAB_008cc508:
        fVar5 = 4.2039e-45;
        *param_2 = *pdVar6 + *pdVar7;
        goto LAB_008cc51c;
      }
      if (*(int *)((long)param_4 + 0xc) == 5) {
        iVar3 = FUN_008b93c8((long)*param_4 + 0x18,&local_60);
        pdVar7 = &local_60;
        if (iVar3 != 0) goto LAB_008cc508;
      }
    }
    else if ((*(int *)((long)param_3 + 0xc) == 5) &&
            (iVar3 = FUN_008b93c8((long)*param_3 + 0x18,&local_60), iVar3 != 0)) {
      pdVar6 = &local_68;
      local_68 = local_60;
      goto LAB_008cc48c;
    }
    lVar4 = FUN_008be028(param_1,param_3,8);
    if (*(int *)(lVar4 + 0xc) == 0) {
      lVar4 = FUN_008be028(param_1,param_4,8);
      if (*(int *)(lVar4 + 0xc) == 0) {
        if (*(long *)(lVar2 + 0x28) == local_58) {
          FUN_008b3afc(param_1,param_3,param_4,8);
        }
        goto LAB_008cc570;
      }
    }
    FUN_008cb070(param_1,param_2,lVar4,param_3,param_4);
  }
  else {
    fVar5 = 5.60519e-45;
    *(float *)param_2 = *(float *)pdVar6 + *(float *)pdVar7;
    *(float *)((long)param_2 + 4) = *(float *)((long)pdVar6 + 4) + *(float *)((long)pdVar7 + 4);
    *(float *)(param_2 + 1) = *(float *)(pdVar6 + 1) + *(float *)(pdVar7 + 1);
LAB_008cc51c:
    *(float *)((long)param_2 + 0xc) = fVar5;
  }
  if (*(long *)(lVar2 + 0x28) == local_58) {
    return;
  }
LAB_008cc570:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

