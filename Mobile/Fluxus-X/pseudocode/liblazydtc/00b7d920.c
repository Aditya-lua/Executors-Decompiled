/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d920
 */

undefined8 mbedtls_mpi_lset(undefined8 *param_1,long param_2)

{
  long lVar1;
  size_t __n;
  void *__dest;
  void *__src;
  
  if ((ulong)*(ushort *)((long)param_1 + 10) == 0) {
    __dest = calloc(1,8);
    if (__dest == (void *)0x0) {
      return 0xfffffff0;
    }
    __src = (void *)*param_1;
    if (__src != (void *)0x0) {
      memcpy(__dest,__src,0);
      mbedtls_zeroize_and_free(__src,0);
    }
    __n = 8;
    *param_1 = __dest;
    *(undefined2 *)((long)param_1 + 10) = 1;
  }
  else {
    __dest = (void *)*param_1;
    __n = (ulong)*(ushort *)((long)param_1 + 10) << 3;
  }
  memset(__dest,0,__n);
  lVar1 = -param_2;
  if (-1 < param_2) {
    lVar1 = param_2;
  }
  *(long *)*param_1 = lVar1;
  *(ushort *)(param_1 + 1) = (ushort)(param_2 >> 0x3f) | 1;
  return 0;
}

