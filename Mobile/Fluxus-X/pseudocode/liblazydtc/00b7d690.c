/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d690
 */

undefined8 mbedtls_mpi_shrink(long *param_1,size_t param_2)

{
  ulong uVar1;
  void *__dest;
  ulong uVar2;
  void *__src;
  ulong uVar3;
  
  if (10000 < param_2) {
    return 0xfffffff0;
  }
  uVar3 = (ulong)*(ushort *)((long)param_1 + 10);
  uVar2 = uVar3;
  if (param_2 <= uVar3 && uVar3 != param_2) {
    do {
      uVar1 = uVar2;
      uVar2 = uVar1 - 1;
      if (uVar2 == 0) break;
    } while (*(long *)(*param_1 + uVar2 * 8) == 0);
    if (param_2 <= uVar1) {
      param_2 = uVar1;
    }
    __dest = calloc(param_2,8);
    if (__dest == (void *)0x0) {
      return 0xfffffff0;
    }
    __src = (void *)*param_1;
    if (__src == (void *)0x0) goto LAB_00b7d770;
    memcpy(__dest,__src,param_2 << 3);
  }
  else {
    if (param_2 <= uVar3) {
      return 0;
    }
    __dest = calloc(param_2,8);
    if (__dest == (void *)0x0) {
      return 0xfffffff0;
    }
    __src = (void *)*param_1;
    if (__src == (void *)0x0) goto LAB_00b7d770;
    memcpy(__dest,__src,uVar3 << 3);
  }
  mbedtls_zeroize_and_free(__src,uVar3 << 3);
LAB_00b7d770:
  *(short *)((long)param_1 + 10) = (short)param_2;
  *param_1 = (long)__dest;
  return 0;
}

