/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae8f98
 */

ulong FUN_00ae8f98(int *param_1,long param_2,uint param_3,int *param_4)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  long local_38;
  
  if (param_1 != (int *)0x0) {
    iVar2 = *param_1;
    if (iVar2 == 0) {
      return 0xffffffff;
    }
    if (*(__compar_fn_t *)(param_1 + 6) == (__compar_fn_t)0x0) {
      if (0 < iVar2) {
        uVar3 = 0;
        do {
          if (*(long *)(*(long *)(param_1 + 2) + uVar3 * 8) == param_2) {
            if (param_4 == (int *)0x0) {
              return uVar3;
            }
            *param_4 = 1;
            return uVar3;
          }
          uVar3 = uVar3 + 1;
        } while ((long)uVar3 < (long)iVar2);
      }
      if (param_4 == (int *)0x0) {
        return 0xffffffff;
      }
      *param_4 = 0;
      return 0xffffffff;
    }
    local_38 = param_2;
    if (param_1[4] == 0) {
      if (1 < iVar2) {
        qsort(*(void **)(param_1 + 2),(long)iVar2,8,*(__compar_fn_t *)(param_1 + 6));
      }
      param_1[4] = 1;
    }
    if (param_2 == 0) {
      return 0xffffffff;
    }
    uVar1 = param_3 | 2;
    if (param_4 == (int *)0x0) {
      uVar1 = param_3;
    }
    uVar3 = ossl_bsearch(&local_38,*(undefined8 *)(param_1 + 2),*param_1,8,
                         *(undefined8 *)(param_1 + 6),uVar1);
    if (param_4 != (int *)0x0) {
      *param_4 = 0;
      if (uVar3 == 0) {
        return 0xffffffff;
      }
      if ((ulong)(*(long *)(param_1 + 2) + (long)*param_1 * 8) <= uVar3) goto LAB_00ae90c0;
      uVar4 = uVar3;
      do {
        iVar2 = (**(code **)(param_1 + 6))(&local_38,uVar4);
        if (iVar2 != 0) break;
        uVar4 = uVar4 + 8;
        *param_4 = *param_4 + 1;
      } while (uVar4 < (ulong)(*(long *)(param_1 + 2) + (long)*param_1 * 8));
    }
    if (uVar3 != 0) {
LAB_00ae90c0:
      return uVar3 - *(long *)(param_1 + 2) >> 3;
    }
  }
  return 0xffffffff;
}

