/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f038
 */

/* WARNING: Removing unreachable block (ram,0x00a9ef84) */

undefined8 OSSL_PARAM_set_size_t(long param_1,ulong param_2)

{
  int iVar1;
  size_t __n;
  ulong uVar2;
  size_t __n_00;
  ulong *__dest;
  ulong uStack_28;
  
  uStack_28 = param_2;
  if (param_1 == 0) {
    return 0;
  }
  iVar1 = *(int *)(param_1 + 8);
  *(undefined8 *)(param_1 + 0x20) = 0;
  if (iVar1 == 1) {
    __dest = *(ulong **)(param_1 + 0x10);
    *(undefined8 *)(param_1 + 0x20) = 8;
    if (__dest == (ulong *)0x0) {
      return 1;
    }
    __n = *(ulong *)(param_1 + 0x18);
    __n_00 = __n - 8;
    if (__n_00 == 0) {
      if ((long)param_2 < 0) {
        return 0;
      }
      goto LAB_00a9eee0;
    }
    if (__n == 4) {
      uVar2 = param_2 >> 0x1f;
      goto joined_r0x00a9ee54;
    }
    *(undefined8 *)(param_1 + 0x20) = 8;
    if (8 < __n) goto LAB_00a9ef10;
    if (-__n != -8) {
      uVar2 = 0;
      do {
        if (*(char *)((long)&uStack_28 + uVar2 + __n) != '\0') goto LAB_00a9ef88;
        uVar2 = uVar2 + 1;
      } while (uVar2 < -__n + 8);
    }
  }
  else {
    if (iVar1 == 3) {
      *(undefined8 *)(param_1 + 0x20) = 8;
      if (param_2 >> 0x35 != 0) {
        return 0;
      }
      if (*(long *)(param_1 + 0x18) == 8) {
        **(double **)(param_1 + 0x10) = (double)param_2;
        return 1;
      }
      return 0;
    }
    if (iVar1 != 2) {
      return 0;
    }
    __dest = *(ulong **)(param_1 + 0x10);
    *(undefined8 *)(param_1 + 0x20) = 8;
    if (__dest == (ulong *)0x0) {
      return 1;
    }
    __n = *(ulong *)(param_1 + 0x18);
    __n_00 = __n - 8;
    if (__n_00 == 0) {
LAB_00a9eee0:
      *__dest = param_2;
      return 1;
    }
    if (__n == 4) {
      uVar2 = param_2 >> 0x20;
joined_r0x00a9ee54:
      if (uVar2 == 0) {
        *(undefined8 *)(param_1 + 0x20) = 4;
        *(int *)__dest = (int)param_2;
        return 1;
      }
      return 0;
    }
    *(undefined8 *)(param_1 + 0x20) = 8;
    if (8 < __n) {
LAB_00a9ef10:
      memset(__dest + 1,0,__n_00);
      *__dest = param_2;
      goto LAB_00a9ef74;
    }
    if (-__n != -8) {
      uVar2 = 0;
      do {
        if (*(char *)((long)&uStack_28 + uVar2 + __n) != '\0') {
LAB_00a9ef88:
          *(undefined8 *)(param_1 + 0x20) = 8;
          return 0;
        }
        uVar2 = uVar2 + 1;
      } while (uVar2 < -__n + 8);
    }
  }
  memcpy(__dest,&uStack_28,__n);
LAB_00a9ef74:
  *(undefined8 *)(param_1 + 0x20) = *(undefined8 *)(param_1 + 0x18);
  return 1;
}

