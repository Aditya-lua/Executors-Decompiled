/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cc77c
 */

void FUN_008cc77c(undefined8 param_1,double *param_2,double *param_3,double *param_4)

{
  int iVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  double *pdVar5;
  double *pdVar6;
  float fVar7;
  float fVar8;
  double local_68;
  double local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  iVar3 = *(int *)((long)param_3 + 0xc);
  iVar1 = *(int *)((long)param_4 + 0xc);
  pdVar5 = param_3;
  if (iVar3 != 4) {
    pdVar5 = (double *)0x0;
  }
  pdVar6 = param_4;
  if (iVar1 != 4) {
    pdVar6 = (double *)0x0;
  }
  if ((pdVar5 == (double *)0x0) || (pdVar6 == (double *)0x0)) {
    if (pdVar5 != (double *)0x0) {
      if (iVar1 == 3) {
        local_60 = *param_4;
      }
      else if ((iVar1 != 5) || (iVar3 = FUN_008b93c8((long)*param_4 + 0x18,&local_60), iVar3 == 0))
      goto LAB_008cc918;
      fVar8 = (float)local_60;
      *(float *)param_2 = *(float *)pdVar5 * fVar8;
      *(float *)((long)param_2 + 4) = *(float *)((long)pdVar5 + 4) * fVar8;
      fVar7 = *(float *)(pdVar5 + 1);
LAB_008cc8dc:
      fVar7 = fVar7 * fVar8;
      goto LAB_008cc8e0;
    }
    if (pdVar6 != (double *)0x0) {
      if (iVar3 == 3) {
        local_60 = *param_3;
      }
      else if ((iVar3 != 5) || (iVar3 = FUN_008b93c8((long)*param_3 + 0x18,&local_60), iVar3 == 0))
      goto LAB_008cc918;
      fVar8 = (float)local_60;
      *(float *)param_2 = *(float *)pdVar6 * fVar8;
      *(float *)((long)param_2 + 4) = *(float *)((long)pdVar6 + 4) * fVar8;
      fVar7 = *(float *)(pdVar6 + 1);
      goto LAB_008cc8dc;
    }
LAB_008cc918:
    pdVar5 = param_3;
    if (*(int *)((long)param_3 + 0xc) == 3) {
LAB_008cc96c:
      if (*(int *)((long)param_4 + 0xc) != 3) {
        if (*(int *)((long)param_4 + 0xc) == 5) {
          iVar3 = FUN_008b93c8((long)*param_4 + 0x18,&local_60);
          pdVar6 = &local_60;
          if (iVar3 != 0) goto LAB_008cca0c;
        }
        goto LAB_008cc9b4;
      }
      pdVar6 = param_4;
LAB_008cca0c:
      fVar8 = 4.2039e-45;
      *param_2 = *pdVar5 * *pdVar6;
      goto LAB_008cc8e8;
    }
    if ((*(int *)((long)param_3 + 0xc) == 5) &&
       (iVar3 = FUN_008b93c8((long)*param_3 + 0x18,&local_60), iVar3 != 0)) {
      pdVar5 = &local_68;
      local_68 = local_60;
      goto LAB_008cc96c;
    }
LAB_008cc9b4:
    lVar4 = FUN_008be028(param_1,param_3,10);
    if ((*(int *)(lVar4 + 0xc) == 0) &&
       (lVar4 = FUN_008be028(param_1,param_4,10), *(int *)(lVar4 + 0xc) == 0)) {
      if (*(long *)(lVar2 + 0x28) == local_58) {
        FUN_008b3afc(param_1,param_3,param_4,10);
      }
      goto LAB_008cca48;
    }
    FUN_008cb070(param_1,param_2,lVar4,param_3,param_4);
  }
  else {
    *(float *)param_2 = *(float *)pdVar5 * *(float *)pdVar6;
    *(float *)((long)param_2 + 4) = *(float *)((long)pdVar5 + 4) * *(float *)((long)pdVar6 + 4);
    fVar7 = *(float *)(pdVar5 + 1) * *(float *)(pdVar6 + 1);
LAB_008cc8e0:
    fVar8 = 5.60519e-45;
    *(float *)(param_2 + 1) = fVar7;
LAB_008cc8e8:
    *(float *)((long)param_2 + 0xc) = fVar8;
  }
  if (*(long *)(lVar2 + 0x28) == local_58) {
    return;
  }
LAB_008cca48:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

