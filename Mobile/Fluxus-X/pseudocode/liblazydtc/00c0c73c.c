/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0c73c
 */

float FUN_00c0c73c(char *param_1,char *param_2,undefined4 *param_3)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  float fVar4;
  float fVar5;
  char *local_28;
  
  if (param_1 == param_2) {
    fVar5 = 0.0;
  }
  else {
    piVar3 = (int *)__errno();
    iVar1 = *piVar3;
    *piVar3 = 0;
    if (((DAT_00d270f8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d270f8), iVar2 != 0)) {
                    /* try { // try from 00c0c810 to 00c0c823 has its CatchHandler @ 00c0c83c */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    fVar4 = strtof(param_1,&local_28);
    if (*piVar3 == 0) {
      fVar5 = 0.0;
      *piVar3 = iVar1;
      if (local_28 == param_2) {
        return fVar4;
      }
    }
    else {
      fVar5 = 0.0;
      if ((local_28 == param_2) && (fVar5 = fVar4, *piVar3 != 0x22)) {
        return fVar4;
      }
    }
  }
  *param_3 = 4;
  return fVar5;
}

