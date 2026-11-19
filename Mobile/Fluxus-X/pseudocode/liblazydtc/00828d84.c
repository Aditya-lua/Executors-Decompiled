/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00828d84
 */

long * FUN_00828d84(undefined8 *param_1,long *param_2,long *param_3,long *param_4,int *param_5)

{
  int iVar1;
  bool bVar2;
  long *plVar3;
  long *plVar4;
  long *plVar5;
  long *plVar6;
  
  plVar5 = param_1 + 1;
  if (plVar5 != param_2) {
    iVar1 = *param_5;
    if ((int)param_2[4] <= iVar1) {
      if (iVar1 <= (int)param_2[4]) {
        *param_3 = (long)param_2;
        *param_4 = (long)param_2;
        return param_4;
      }
      plVar4 = (long *)param_2[1];
      if (plVar4 == (long *)0x0) {
        plVar6 = param_2;
        do {
          plVar3 = (long *)plVar6[2];
          bVar2 = plVar6 != (long *)*plVar3;
          plVar6 = plVar3;
        } while (bVar2);
      }
      else {
        plVar6 = plVar4;
        do {
          plVar3 = plVar6;
          plVar6 = (long *)*plVar3;
        } while ((long *)*plVar3 != (long *)0x0);
      }
      if ((plVar3 == plVar5) || (iVar1 < (int)plVar3[4])) {
        if (plVar4 == (long *)0x0) {
          *param_3 = (long)param_2;
          return param_2 + 1;
        }
        *param_3 = (long)plVar3;
        return plVar3;
      }
      plVar4 = plVar5;
      plVar6 = (long *)*plVar5;
      if ((long *)*plVar5 != (long *)0x0) {
        do {
          while( true ) {
            plVar5 = plVar6;
            if (iVar1 < (int)plVar5[4]) break;
            if (iVar1 <= (int)plVar5[4]) goto LAB_00828f14;
            plVar4 = plVar5 + 1;
            plVar6 = (long *)*plVar4;
            if ((long *)*plVar4 == (long *)0x0) goto LAB_00828f14;
          }
          plVar4 = plVar5;
          plVar6 = (long *)*plVar5;
        } while ((long *)*plVar5 != (long *)0x0);
      }
LAB_00828f14:
      *param_3 = (long)plVar5;
      return plVar4;
    }
  }
  plVar4 = (long *)*param_2;
  if ((long *)*param_1 == param_2) {
    plVar6 = param_2;
  }
  else {
    if (plVar4 == (long *)0x0) {
      plVar3 = param_2;
      do {
        plVar6 = (long *)plVar3[2];
        bVar2 = plVar3 == (long *)*plVar6;
        plVar3 = plVar6;
      } while (bVar2);
    }
    else {
      plVar3 = plVar4;
      do {
        plVar6 = plVar3;
        plVar3 = (long *)plVar6[1];
      } while ((long *)plVar6[1] != (long *)0x0);
    }
    iVar1 = *param_5;
    if (iVar1 <= (int)plVar6[4]) {
      plVar4 = plVar5;
      plVar6 = (long *)*plVar5;
      if ((long *)*plVar5 != (long *)0x0) {
        do {
          while( true ) {
            plVar5 = plVar6;
            if (iVar1 < (int)plVar5[4]) break;
            if (iVar1 <= (int)plVar5[4]) goto LAB_00828e70;
            plVar4 = plVar5 + 1;
            plVar6 = (long *)*plVar4;
            if ((long *)*plVar4 == (long *)0x0) goto LAB_00828e70;
          }
          plVar4 = plVar5;
          plVar6 = (long *)*plVar5;
        } while ((long *)*plVar5 != (long *)0x0);
      }
LAB_00828e70:
      *param_3 = (long)plVar5;
      return plVar4;
    }
  }
  if (plVar4 == (long *)0x0) {
    *param_3 = (long)param_2;
    return param_2;
  }
  *param_3 = (long)plVar6;
  return plVar6 + 1;
}

