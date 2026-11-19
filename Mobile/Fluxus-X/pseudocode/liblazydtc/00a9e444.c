/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9e444
 */

undefined8 OSSL_PARAM_get_uint32(long param_1,uint *param_2)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  uint *__src;
  size_t __n;
  double dVar4;
  
  if (param_1 == 0) {
    return 0;
  }
  if (param_2 == (uint *)0x0) {
    return 0;
  }
  iVar1 = *(int *)(param_1 + 8);
  if (iVar1 == 1) {
    __n = *(ulong *)(param_1 + 0x18);
    if (__n == 8) {
LAB_00a9e514:
      if (**(ulong **)(param_1 + 0x10) >> 0x20 == 0) {
        *param_2 = (uint)**(ulong **)(param_1 + 0x10);
        return 1;
      }
      return 0;
    }
    if (__n == 4) {
      uVar2 = **(uint **)(param_1 + 0x10);
      if ((int)uVar2 < 0) {
        return 0;
      }
      goto LAB_00a9e5cc;
    }
    __src = *(uint **)(param_1 + 0x10);
    if (__n < 4) {
LAB_00a9e57c:
      memset((void *)((long)param_2 + __n),0,4 - __n);
      memcpy(param_2,__src,__n);
      return 1;
    }
    if (__n != 4) {
      uVar3 = 0;
      do {
        if (*(char *)((long)__src + uVar3 + 4) != '\0') {
          return 0;
        }
        uVar3 = uVar3 + 1;
      } while (uVar3 < __n - 4);
    }
  }
  else {
    if (iVar1 == 3) {
      if (*(long *)(param_1 + 0x18) != 8) {
        return 0;
      }
      dVar4 = **(double **)(param_1 + 0x10);
      if (dVar4 < 0.0) {
        return 0;
      }
      if (4294967295.0 < dVar4) {
        return 0;
      }
      uVar2 = (uint)dVar4;
      if (dVar4 != (double)uVar2) {
        return 0;
      }
      goto LAB_00a9e5cc;
    }
    if (iVar1 != 2) {
      return 0;
    }
    __n = *(ulong *)(param_1 + 0x18);
    if (__n == 8) goto LAB_00a9e514;
    if (__n == 4) {
      uVar2 = **(uint **)(param_1 + 0x10);
      goto LAB_00a9e5cc;
    }
    __src = *(uint **)(param_1 + 0x10);
    if (__n < 4) goto LAB_00a9e57c;
    if (__n != 4) {
      uVar3 = 0;
      do {
        if (*(char *)((long)__src + uVar3 + 4) != '\0') {
          return 0;
        }
        uVar3 = uVar3 + 1;
      } while (uVar3 < __n - 4);
    }
  }
  uVar2 = *__src;
LAB_00a9e5cc:
  *param_2 = uVar2;
  return 1;
}

