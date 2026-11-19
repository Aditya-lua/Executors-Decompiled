/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0c96c
 */

double FUN_00c0c96c(char *param_1,char *param_2,undefined4 *param_3)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  double dVar4;
  char *local_48;
  
  if (param_1 == param_2) {
    *param_3 = 4;
    return 0.0;
  }
  piVar3 = (int *)__errno();
  iVar1 = *piVar3;
  *piVar3 = 0;
  if (((DAT_00d270f8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d270f8), iVar2 != 0)) {
                    /* try { // try from 00c0ca50 to 00c0ca63 has its CatchHandler @ 00c0ca78 */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
  dVar4 = strtold_l(param_1,&local_48,DAT_00d270f0);
  if (*piVar3 == 0) {
    *piVar3 = iVar1;
    if (local_48 == param_2) {
      return dVar4;
    }
  }
  else if (local_48 == param_2) {
    if (*piVar3 != 0x22) {
      return dVar4;
    }
    goto LAB_00c0ca1c;
  }
  dVar4 = 0.0;
LAB_00c0ca1c:
  *param_3 = 4;
  return dVar4;
}

