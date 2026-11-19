/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0c854
 */

double FUN_00c0c854(char *param_1,char *param_2,undefined4 *param_3)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  double dVar4;
  double dVar5;
  char *local_28;
  
  if (param_1 == param_2) {
    dVar5 = 0.0;
  }
  else {
    piVar3 = (int *)__errno();
    iVar1 = *piVar3;
    *piVar3 = 0;
    if (((DAT_00d270f8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d270f8), iVar2 != 0)) {
                    /* try { // try from 00c0c928 to 00c0c93b has its CatchHandler @ 00c0c954 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    dVar4 = strtod(param_1,&local_28);
    if (*piVar3 == 0) {
      dVar5 = 0.0;
      *piVar3 = iVar1;
      if (local_28 == param_2) {
        return dVar4;
      }
    }
    else {
      dVar5 = 0.0;
      if ((local_28 == param_2) && (dVar5 = dVar4, *piVar3 != 0x22)) {
        return dVar4;
      }
    }
  }
  *param_3 = 4;
  return dVar5;
}

