/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9e010
 */

undefined8 OSSL_PARAM_get_int(long param_1,int *param_2)

{
  char cVar1;
  uint __c;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  int *__src;
  size_t __n;
  double dVar5;
  
  if (param_1 == 0) {
    return 0;
  }
  if (param_2 == (int *)0x0) {
    return 0;
  }
  iVar2 = *(int *)(param_1 + 8);
  if (iVar2 == 3) {
    if (*(long *)(param_1 + 0x18) != 8) {
      return 0;
    }
    dVar5 = **(double **)(param_1 + 0x10);
    if (dVar5 < -2147483648.0) {
      return 0;
    }
    if (2147483647.0 < dVar5) {
      return 0;
    }
    iVar2 = (int)dVar5;
    if (dVar5 != (double)iVar2) {
      return 0;
    }
  }
  else {
    if (iVar2 == 2) {
      __n = *(ulong *)(param_1 + 0x18);
      if (__n == 8) {
        uVar4 = **(ulong **)(param_1 + 0x10);
        uVar3 = uVar4 >> 0x1f;
        goto joined_r0x00a9e144;
      }
      if (__n == 4) {
        iVar2 = **(int **)(param_1 + 0x10);
        if (iVar2 < 0) {
          return 0;
        }
        goto LAB_00a9e1f0;
      }
      __src = *(int **)(param_1 + 0x10);
      if (__n < 4) {
        __c = 0;
        goto LAB_00a9e16c;
      }
      if (__n != 4) {
        uVar4 = 0;
        do {
          if (*(char *)((long)__src + uVar4 + 4) != '\0') {
            return 0;
          }
          uVar4 = uVar4 + 1;
        } while (uVar4 < __n - 4);
      }
      cVar1 = *(char *)((long)__src + 3);
    }
    else {
      if (iVar2 != 1) {
        return 0;
      }
      __n = *(ulong *)(param_1 + 0x18);
      if (__n == 8) {
        uVar4 = **(ulong **)(param_1 + 0x10);
        uVar3 = uVar4 + 0x80000000 >> 0x20;
joined_r0x00a9e144:
        if (uVar3 == 0) {
          *param_2 = (int)uVar4;
          return 1;
        }
        return 0;
      }
      if (__n == 4) {
        iVar2 = **(int **)(param_1 + 0x10);
        goto LAB_00a9e1f0;
      }
      __src = *(int **)(param_1 + 0x10);
      __c = (int)(uint)*(byte *)((long)__src + (__n - 1)) >> 7;
      if (__n < 4) {
LAB_00a9e16c:
        memset((void *)((long)param_2 + __n),__c,4 - __n);
        memcpy(param_2,__src,__n);
        return 1;
      }
      if (__n != 4) {
        uVar4 = 0;
        do {
          if (*(byte *)((long)__src + uVar4 + 4) != __c) {
            return 0;
          }
          uVar4 = uVar4 + 1;
        } while (uVar4 < __n - 4);
      }
      cVar1 = *(char *)((long)__src + 3);
    }
    if (cVar1 < '\0') {
      return 0;
    }
    iVar2 = *__src;
  }
LAB_00a9e1f0:
  *param_2 = iVar2;
  return 1;
}

