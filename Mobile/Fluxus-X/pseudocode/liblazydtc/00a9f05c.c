/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f05c
 */

undefined8 OSSL_PARAM_get_time_t(long param_1,ulong *param_2)

{
  int iVar1;
  char cVar2;
  uint __c;
  ulong uVar3;
  ulong *__src;
  size_t __n;
  double dVar4;
  
  if (param_1 == 0) {
    return 0;
  }
  if (param_2 == (ulong *)0x0) {
    return 0;
  }
  iVar1 = *(int *)(param_1 + 8);
  if (iVar1 == 3) {
    if (*(long *)(param_1 + 0x18) != 8) {
      return 0;
    }
    dVar4 = **(double **)(param_1 + 0x10);
    if (dVar4 < -9.223372036854776e+18) {
      return 0;
    }
    if (9.223372036854776e+18 <= dVar4) {
      return 0;
    }
    uVar3 = (ulong)dVar4;
    if (dVar4 != (double)(long)uVar3) {
      return 0;
    }
    goto LAB_00a9e984;
  }
  if (iVar1 == 2) {
    __n = *(ulong *)(param_1 + 0x18);
    if (__n == 8) {
      uVar3 = **(ulong **)(param_1 + 0x10);
      if ((long)uVar3 < 0) {
        return 0;
      }
      goto LAB_00a9e984;
    }
    if (__n == 4) {
      uVar3 = (ulong)**(uint **)(param_1 + 0x10);
      goto LAB_00a9e984;
    }
    __src = *(ulong **)(param_1 + 0x10);
    if (__n < 8) {
      __c = 0;
      goto LAB_00a9e910;
    }
    uVar3 = 0;
    do {
      if (*(char *)((long)__src + uVar3 + 8) != '\0') {
        return 0;
      }
      uVar3 = uVar3 + 1;
    } while (uVar3 < __n - 8);
    cVar2 = *(char *)((long)__src + 7);
  }
  else {
    if (iVar1 != 1) {
      return 0;
    }
    __n = *(ulong *)(param_1 + 0x18);
    if (__n == 8) {
      uVar3 = **(ulong **)(param_1 + 0x10);
      goto LAB_00a9e984;
    }
    if (__n == 4) {
      uVar3 = (ulong)**(int **)(param_1 + 0x10);
      goto LAB_00a9e984;
    }
    __src = *(ulong **)(param_1 + 0x10);
    __c = (int)(uint)*(byte *)((long)__src + (__n - 1)) >> 7;
    if (__n < 8) {
LAB_00a9e910:
      memset((void *)((long)param_2 + __n),__c,8 - __n);
      memcpy(param_2,__src,__n);
      return 1;
    }
    uVar3 = 0;
    do {
      if (*(byte *)((long)__src + uVar3 + 8) != __c) {
        return 0;
      }
      uVar3 = uVar3 + 1;
    } while (uVar3 < __n - 8);
    cVar2 = *(char *)((long)__src + 7);
  }
  if (cVar2 < '\0') {
    return 0;
  }
  uVar3 = *__src;
LAB_00a9e984:
  *param_2 = uVar3;
  return 1;
}

