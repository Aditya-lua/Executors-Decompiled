/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f034
 */

undefined8 OSSL_PARAM_get_size_t(long param_1,ulong *param_2)

{
  int iVar1;
  ulong uVar2;
  ulong *__src;
  size_t __n;
  double dVar3;
  
  if (param_1 == 0) {
    return 0;
  }
  if (param_2 == (ulong *)0x0) {
    return 0;
  }
  iVar1 = *(int *)(param_1 + 8);
  if (iVar1 == 1) {
    __n = *(ulong *)(param_1 + 0x18);
    if (__n == 8) {
      uVar2 = **(ulong **)(param_1 + 0x10);
      if ((long)uVar2 < 0) {
        return 0;
      }
      goto LAB_00a9ed8c;
    }
    if (__n == 4) {
      uVar2 = (ulong)**(int **)(param_1 + 0x10);
      if (**(int **)(param_1 + 0x10) < 0) {
        return 0;
      }
      goto LAB_00a9ed8c;
    }
    __src = *(ulong **)(param_1 + 0x10);
    if (__n < 8) {
LAB_00a9ed44:
      memset((void *)((long)param_2 + __n),0,8 - __n);
      memcpy(param_2,__src,__n);
      return 1;
    }
    uVar2 = 0;
    do {
      if (*(char *)((long)__src + uVar2 + 8) != '\0') {
        return 0;
      }
      uVar2 = uVar2 + 1;
    } while (uVar2 < __n - 8);
  }
  else {
    if (iVar1 == 3) {
      if (*(long *)(param_1 + 0x18) != 8) {
        return 0;
      }
      dVar3 = **(double **)(param_1 + 0x10);
      if (dVar3 < 0.0) {
        return 0;
      }
      if (1.8446744073709552e+19 <= dVar3) {
        return 0;
      }
      uVar2 = (ulong)dVar3;
      if (dVar3 != (double)uVar2) {
        return 0;
      }
      goto LAB_00a9ed8c;
    }
    if (iVar1 != 2) {
      return 0;
    }
    __n = *(ulong *)(param_1 + 0x18);
    if (__n == 8) {
      uVar2 = **(ulong **)(param_1 + 0x10);
      goto LAB_00a9ed8c;
    }
    if (__n == 4) {
      uVar2 = (ulong)**(uint **)(param_1 + 0x10);
      goto LAB_00a9ed8c;
    }
    __src = *(ulong **)(param_1 + 0x10);
    if (__n < 8) goto LAB_00a9ed44;
    uVar2 = 0;
    do {
      if (*(char *)((long)__src + uVar2 + 8) != '\0') {
        return 0;
      }
      uVar2 = uVar2 + 1;
    } while (uVar2 < __n - 8);
  }
  uVar2 = *__src;
LAB_00a9ed8c:
  *param_2 = uVar2;
  return 1;
}

