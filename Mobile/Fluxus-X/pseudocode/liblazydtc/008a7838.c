/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a7838
 */

bool FUN_008a7838(long *param_1,long param_2,char *param_3)

{
  int iVar1;
  char *__s1;
  ulong uVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_2 + 0x20);
  if ((lVar3 != 0) && (*(int *)(lVar3 + 8) == DAT_00d1b020)) {
    __s1 = *(char **)(lVar3 + 0x20);
    if (param_1[5] != 0) {
      uVar2 = ((ulong)__s1 >> 4 ^ (ulong)__s1 >> 9) * -0x61c8864680b583eb >>
              ((ulong)*(byte *)(param_1 + 6) & 0x3f);
      if ((*(ulong *)(param_1[3] + (uVar2 >> 6) * 8) >> (uVar2 & 0x3f) & 1) != 0) {
        do {
          if (*(char **)(*param_1 + uVar2 * 0x10) == __s1) {
            if (*(int *)(*param_1 + uVar2 * 0x10 + 8) != 0) {
              return false;
            }
            if (__s1 == (char *)0x0) {
              return false;
            }
            goto LAB_008a78e4;
          }
          uVar2 = uVar2 + 1 & param_1[4] - 1U;
        } while ((*(ulong *)(param_1[3] + (uVar2 >> 6) * 8) >> (uVar2 & 0x3f) & 1) != 0);
      }
    }
    if (__s1 != (char *)0x0) {
LAB_008a78e4:
      iVar1 = strcmp(__s1,"vector");
      if ((iVar1 == 0) && (*(char **)(param_2 + 0x28) != (char *)0x0)) {
        iVar1 = strcmp(*(char **)(param_2 + 0x28),param_3);
        return iVar1 == 0;
      }
    }
  }
  return false;
}

