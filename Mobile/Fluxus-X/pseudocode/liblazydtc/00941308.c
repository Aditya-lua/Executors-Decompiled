/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941308
 */

long * FUN_00941308(long param_1,int param_2,long *param_3)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  long *plVar4;
  long *plVar5;
  long local_50;
  long local_48;
  long local_18;
  
  lVar1 = tpidr_el0;
  local_18 = *(long *)(lVar1 + 0x28);
  if (param_3 == (long *)0x0) {
    plVar2 = (long *)0x0;
  }
  else {
    local_50 = 0;
    local_48 = 0;
    plVar3 = &local_50;
    plVar4 = &local_50;
LAB_00941340:
    while (param_3[4] <= param_1) {
      if (param_1 <= param_3[4]) {
        if (param_2 < (int)param_3[5]) break;
        if ((int)param_3[5] < param_2) goto LAB_00941390;
        goto LAB_00941404;
      }
LAB_00941390:
      plVar5 = param_3 + 1;
      plVar2 = (long *)*plVar5;
      if (plVar2 == (long *)0x0) goto LAB_00941404;
      if ((param_1 < plVar2[4]) || ((param_1 <= plVar2[4] && (param_2 <= (int)plVar2[5])))) {
        plVar2 = param_3;
      }
      else {
        param_3[1] = *plVar2;
        plVar5 = plVar2 + 1;
        *plVar2 = (long)param_3;
        if (*plVar5 == 0) goto LAB_00941408;
      }
      plVar3[1] = (long)plVar2;
      plVar3 = plVar2;
      param_3 = (long *)*plVar5;
    }
    plVar2 = (long *)*param_3;
    if (plVar2 != (long *)0x0) {
      if ((param_1 < plVar2[4]) || ((param_1 <= plVar2[4] && (param_2 < (int)plVar2[5])))) {
        *param_3 = plVar2[1];
        plVar2[1] = (long)param_3;
        if (*plVar2 == 0) goto LAB_00941408;
      }
      else {
        plVar2 = param_3;
      }
      *plVar4 = (long)plVar2;
      param_3 = (long *)*plVar2;
      plVar4 = plVar2;
      goto LAB_00941340;
    }
LAB_00941404:
    plVar2 = param_3;
LAB_00941408:
    plVar3[1] = *plVar2;
    *plVar4 = plVar2[1];
    *plVar2 = local_48;
    plVar2[1] = local_50;
  }
  if (*(long *)(lVar1 + 0x28) != local_18) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return plVar2;
}

