/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cd058
 */

void FUN_008cd058(undefined8 param_1,double *param_2,double *param_3,double *param_4)

{
  int iVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  double *pdVar5;
  double *pdVar6;
  double dVar7;
  double dVar8;
  double local_68;
  double local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  iVar3 = *(int *)((long)param_3 + 0xc);
  iVar1 = *(int *)((long)param_4 + 0xc);
  if ((param_3 == (double *)0x0 || iVar3 != 4) || (param_4 == (double *)0x0 || iVar1 != 4)) {
    if (param_3 == (double *)0x0 || iVar3 != 4) {
      if (((iVar3 != 3 && (param_4 != (double *)0x0 && iVar1 == 4)) && (iVar3 == 5)) &&
         (iVar3 = FUN_008b93c8((long)*param_3 + 0x18,&local_60), iVar3 != 0)) {
        local_68 = local_60;
      }
    }
    else if ((iVar1 != 3) && (iVar1 == 5)) {
      FUN_008b93c8((long)*param_4 + 0x18,&local_60);
    }
  }
  pdVar5 = param_3;
  if (*(int *)((long)param_3 + 0xc) == 3) {
LAB_008cd0f4:
    if (*(int *)((long)param_4 + 0xc) != 3) {
      if (*(int *)((long)param_4 + 0xc) == 5) {
        iVar3 = FUN_008b93c8((long)*param_4 + 0x18,&local_60);
        pdVar6 = &local_60;
        if (iVar3 != 0) goto LAB_008cd1d0;
      }
      goto LAB_008cd120;
    }
    pdVar6 = param_4;
LAB_008cd1d0:
    dVar7 = *pdVar6;
    dVar8 = *pdVar5;
    *(undefined4 *)((long)param_2 + 0xc) = 3;
    *param_2 = dVar8 - dVar7 * (double)(long)(dVar8 / dVar7);
  }
  else {
    if ((*(int *)((long)param_3 + 0xc) == 5) &&
       (iVar3 = FUN_008b93c8((long)*param_3 + 0x18,&local_60), iVar3 != 0)) {
      pdVar5 = &local_68;
      local_68 = local_60;
      goto LAB_008cd0f4;
    }
LAB_008cd120:
    lVar4 = FUN_008be028(param_1,param_3,0xd);
    if ((*(int *)(lVar4 + 0xc) == 0) &&
       (lVar4 = FUN_008be028(param_1,param_4,0xd), *(int *)(lVar4 + 0xc) == 0)) {
      if (*(long *)(lVar2 + 0x28) == local_58) {
        FUN_008b3afc(param_1,param_3,param_4,0xd);
      }
      goto LAB_008cd240;
    }
    FUN_008cb070(param_1,param_2,lVar4,param_3,param_4);
  }
  if (*(long *)(lVar2 + 0x28) == local_58) {
    return;
  }
LAB_008cd240:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

