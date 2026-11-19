/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0c1fc
 */

int FUN_00c0c1fc(char *param_1,char *param_2,undefined4 *param_3,int param_4)

{
  char cVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  ulonglong uVar5;
  char *local_58;
  
  if ((param_1 == param_2) ||
     ((cVar1 = *param_1, cVar1 == '-' && (param_1 = param_1 + 1, param_1 == param_2)))) {
LAB_00c0c2c4:
    iVar2 = 0;
  }
  else {
    piVar4 = (int *)__errno();
    iVar2 = *piVar4;
    *piVar4 = 0;
    if (((DAT_00d270f8 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d270f8), iVar3 != 0)) {
                    /* try { // try from 00c0c314 to 00c0c327 has its CatchHandler @ 00c0c33c */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    uVar5 = strtoull_l(param_1,&local_58,param_4,DAT_00d270f0);
    if (*piVar4 == 0) {
      *piVar4 = iVar2;
      if (local_58 != param_2) goto LAB_00c0c2c4;
      if (uVar5 < 0x10000) goto LAB_00c0c2a8;
    }
    else {
      if (local_58 != param_2) goto LAB_00c0c2c4;
      if ((uVar5 >> 0x10 == 0) && (*piVar4 != 0x22)) {
LAB_00c0c2a8:
        iVar2 = -(int)uVar5;
        if (cVar1 != '-') {
          iVar2 = (int)uVar5;
        }
        return iVar2;
      }
    }
    iVar2 = 0xffff;
  }
  *param_3 = 4;
  return iVar2;
}

