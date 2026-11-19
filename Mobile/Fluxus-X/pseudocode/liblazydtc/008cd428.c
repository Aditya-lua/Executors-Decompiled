/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cd428
 */

void FUN_008cd428(undefined8 param_1,double *param_2,double *param_3,long *param_4)

{
  int iVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  float fVar5;
  double *pdVar6;
  double local_58;
  double local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  iVar3 = *(int *)((long)param_3 + 0xc);
  iVar1 = *(int *)((long)param_4 + 0xc);
  pdVar6 = param_3;
  if (iVar3 != 4) {
    pdVar6 = (double *)0x0;
  }
  if ((pdVar6 == (double *)0x0) || (param_4 == (long *)0x0 || iVar1 != 4)) {
    if (pdVar6 == (double *)0x0) {
      if (((iVar3 != 3 && (param_4 != (long *)0x0 && iVar1 == 4)) && (iVar3 == 5)) &&
         (iVar3 = FUN_008b93c8((long)*param_3 + 0x18,&local_50), iVar3 != 0)) {
        local_58 = local_50;
      }
    }
    else if ((iVar1 != 3) && (iVar1 == 5)) {
      FUN_008b93c8(*param_4 + 0x18,&local_50);
    }
    pdVar6 = param_3;
    if (*(int *)((long)param_3 + 0xc) == 3) {
LAB_008cd540:
      if ((*(int *)((long)param_4 + 0xc) == 3) ||
         ((*(int *)((long)param_4 + 0xc) == 5 &&
          (iVar3 = FUN_008b93c8(*param_4 + 0x18,&local_50), iVar3 != 0)))) {
        fVar5 = 4.2039e-45;
        *param_2 = -*pdVar6;
        goto LAB_008cd578;
      }
    }
    else if ((*(int *)((long)param_3 + 0xc) == 5) &&
            (iVar3 = FUN_008b93c8((long)*param_3 + 0x18,&local_50), iVar3 != 0)) {
      pdVar6 = &local_58;
      local_58 = local_50;
      goto LAB_008cd540;
    }
    lVar4 = FUN_008be028(param_1,param_3,0xf);
    if ((*(int *)(lVar4 + 0xc) == 0) &&
       (lVar4 = FUN_008be028(param_1,param_4,0xf), *(int *)(lVar4 + 0xc) == 0)) {
      if (*(long *)(lVar2 + 0x28) == local_48) {
        FUN_008b3afc(param_1,param_3,param_4,0xf);
      }
      goto LAB_008cd614;
    }
    FUN_008cb070(param_1,param_2,lVar4,param_3,param_4);
  }
  else {
    fVar5 = 5.60519e-45;
    *(float *)param_2 = -*(float *)pdVar6;
    *(float *)((long)param_2 + 4) = -*(float *)((long)pdVar6 + 4);
    *(float *)(param_2 + 1) = -*(float *)(pdVar6 + 1);
LAB_008cd578:
    *(float *)((long)param_2 + 0xc) = fVar5;
  }
  if (*(long *)(lVar2 + 0x28) == local_48) {
    return;
  }
LAB_008cd614:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

