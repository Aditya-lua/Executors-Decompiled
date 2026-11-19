/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0c0d4
 */

longlong FUN_00c0c0d4(char *param_1,char *param_2,undefined4 *param_3,int param_4)

{
  longlong lVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  longlong lVar5;
  char *local_38;
  
  if (param_1 != param_2) {
    piVar4 = (int *)__errno();
    iVar2 = *piVar4;
    *piVar4 = 0;
    if (((DAT_00d270f8 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d270f8), iVar3 != 0)) {
                    /* try { // try from 00c0c1bc to 00c0c1cf has its CatchHandler @ 00c0c1e4 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    lVar5 = strtoll_l(param_1,&local_38,param_4,DAT_00d270f0);
    if (*piVar4 == 0) {
      *piVar4 = iVar2;
      if (local_38 == param_2) {
        return lVar5;
      }
    }
    else if (local_38 == param_2) {
      if (*piVar4 != 0x22) {
        return lVar5;
      }
      *param_3 = 4;
      lVar1 = 0x7fffffffffffffff;
      if (lVar5 < 1) {
        lVar1 = -0x8000000000000000;
      }
      return lVar1;
    }
  }
  *param_3 = 4;
  return 0;
}

