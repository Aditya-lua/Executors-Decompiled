/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a899c
 */

bool FUN_008a899c(long *param_1,long param_2,char *param_3)

{
  bool bVar1;
  int iVar2;
  char *__s1;
  ulong uVar3;
  
  bVar1 = false;
  if ((param_2 != 0) && (*(int *)(param_2 + 8) == DAT_00d1b020)) {
    __s1 = *(char **)(param_2 + 0x20);
    if (param_1[5] != 0) {
      uVar3 = ((ulong)__s1 >> 4 ^ (ulong)__s1 >> 9) * -0x61c8864680b583eb >>
              ((ulong)*(byte *)(param_1 + 6) & 0x3f);
      if ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0) {
        do {
          if (*(char **)(*param_1 + uVar3 * 0x10) == __s1) {
            if (*(int *)(*param_1 + uVar3 * 0x10 + 8) != 0) {
              return false;
            }
            if (__s1 == (char *)0x0) {
              return false;
            }
            goto LAB_008a8a40;
          }
          uVar3 = uVar3 + 1 & param_1[4] - 1U;
        } while ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0);
      }
    }
    if (__s1 == (char *)0x0) {
      bVar1 = false;
    }
    else {
LAB_008a8a40:
      iVar2 = strcmp(__s1,param_3);
      bVar1 = iVar2 == 0;
    }
  }
  return bVar1;
}

