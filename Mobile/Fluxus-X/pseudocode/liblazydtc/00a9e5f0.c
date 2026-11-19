/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9e5f0
 */

/* WARNING: Removing unreachable block (ram,0x00a9e7a8) */

undefined8 OSSL_PARAM_set_uint32(long param_1,uint param_2)

{
  int iVar1;
  size_t __n;
  size_t __n_00;
  ulong uVar2;
  ulong *__dest;
  uint local_24;
  
  local_24 = param_2;
  if (param_1 == 0) {
    return 0;
  }
  iVar1 = *(int *)(param_1 + 8);
  *(undefined8 *)(param_1 + 0x20) = 0;
  if (iVar1 == 1) {
    __dest = *(ulong **)(param_1 + 0x10);
    *(undefined8 *)(param_1 + 0x20) = 4;
    if (__dest == (ulong *)0x0) {
      return 1;
    }
    __n = *(ulong *)(param_1 + 0x18);
    if (__n == 8) goto LAB_00a9e6f8;
    __n_00 = __n - 4;
    if (__n_00 == 0) {
      if ((int)param_2 < 0) {
        return 0;
      }
      goto LAB_00a9e6c4;
    }
    *(undefined8 *)(param_1 + 0x20) = 4;
    if (4 < __n) goto LAB_00a9e72c;
    if (-__n != -4) {
      uVar2 = 0;
      do {
        if (*(char *)((long)&local_24 + uVar2 + __n) != '\0') goto LAB_00a9e7ac;
        uVar2 = uVar2 + 1;
      } while (uVar2 < -__n + 4);
    }
  }
  else {
    if (iVar1 == 3) {
      *(undefined8 *)(param_1 + 0x20) = 8;
      if (*(double **)(param_1 + 0x10) == (double *)0x0) {
        return 1;
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
    *(undefined8 *)(param_1 + 0x20) = 4;
    if (__dest == (ulong *)0x0) {
      return 1;
    }
    __n = *(ulong *)(param_1 + 0x18);
    if (__n == 8) {
LAB_00a9e6f8:
      *(undefined8 *)(param_1 + 0x20) = 8;
      *__dest = (ulong)param_2;
      return 1;
    }
    __n_00 = __n - 4;
    if (__n_00 == 0) {
LAB_00a9e6c4:
      *(uint *)__dest = param_2;
      return 1;
    }
    *(undefined8 *)(param_1 + 0x20) = 4;
    if (4 < __n) {
LAB_00a9e72c:
      memset((uint *)((long)__dest + 4),0,__n_00);
      *(uint *)__dest = param_2;
      goto LAB_00a9e790;
    }
    if (-__n != -4) {
      uVar2 = 0;
      do {
        if (*(char *)((long)&local_24 + uVar2 + __n) != '\0') {
LAB_00a9e7ac:
          *(undefined8 *)(param_1 + 0x20) = 4;
          return 0;
        }
        uVar2 = uVar2 + 1;
      } while (uVar2 < -__n + 4);
    }
  }
  memcpy(__dest,&local_24,__n);
LAB_00a9e790:
  *(undefined8 *)(param_1 + 0x20) = *(undefined8 *)(param_1 + 0x18);
  return 1;
}

