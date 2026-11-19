/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0c5f4
 */

ulonglong FUN_00c0c5f4(char *param_1,char *param_2,undefined4 *param_3,int param_4)

{
  ulonglong uVar1;
  int iVar2;
  char cVar3;
  int iVar4;
  int *piVar5;
  ulonglong uVar6;
  char *local_58;
  
  if ((param_1 != param_2) &&
     ((cVar3 = *param_1, cVar3 != '-' || (param_1 = param_1 + 1, param_1 != param_2)))) {
    piVar5 = (int *)__errno();
    iVar2 = *piVar5;
    *piVar5 = 0;
    if (((DAT_00d270f8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d270f8), iVar4 != 0)) {
                    /* try { // try from 00c0c6fc to 00c0c70f has its CatchHandler @ 00c0c724 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    uVar6 = strtoull_l(param_1,&local_58,param_4,DAT_00d270f0);
    if (*piVar5 == 0) {
      *piVar5 = iVar2;
      if (local_58 == param_2) {
LAB_00c0c6e0:
        uVar1 = -uVar6;
        if (cVar3 != '-') {
          uVar1 = uVar6;
        }
        return uVar1;
      }
    }
    else if (local_58 == param_2) {
      if (*piVar5 != 0x22) goto LAB_00c0c6e0;
      uVar6 = 0xffffffffffffffff;
      goto LAB_00c0c6bc;
    }
  }
  uVar6 = 0;
LAB_00c0c6bc:
  *param_3 = 4;
  return uVar6;
}

