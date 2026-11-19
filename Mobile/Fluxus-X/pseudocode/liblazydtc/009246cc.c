/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009246cc
 */

void FUN_009246cc(long *param_1)

{
  long *plVar1;
  long lVar2;
  long *plVar3;
  
  plVar1 = (long *)*param_1;
  do {
    while( true ) {
      if ((plVar1 == (long *)0x0) || ((ulong)plVar1[2] < (ulong)plVar1[3])) {
        return;
      }
      lVar2 = *plVar1;
      *param_1 = lVar2;
      if ((long *)param_1[1] == plVar1) break;
      plVar3 = (long *)param_1[3];
      if (plVar3 != (long *)0x0) goto LAB_0092471c;
LAB_00924754:
      if (((ulong)param_1[5] < (ulong)param_1[4]) || ((*(byte *)(param_1 + 7) >> 1 & 1) != 0))
      goto LAB_00924780;
      *plVar1 = param_1[2];
      param_1[2] = (long)plVar1;
      plVar1 = (long *)*param_1;
    }
    param_1[1] = lVar2;
    plVar3 = (long *)param_1[3];
    if (plVar3 == (long *)0x0) goto LAB_00924754;
LAB_0092471c:
    if ((ulong)plVar3[2] < (ulong)plVar3[3]) {
      plVar1[2] = 0;
      plVar1[3] = 0;
      *plVar1 = *plVar3;
      *plVar3 = (long)plVar1;
      plVar3[2] = plVar3[2] + 1;
    }
    else {
LAB_00924780:
      (*(code *)PTR_free_00cc4678)();
    }
    param_1[4] = param_1[4] + -1;
    plVar1 = (long *)*param_1;
  } while( true );
}

