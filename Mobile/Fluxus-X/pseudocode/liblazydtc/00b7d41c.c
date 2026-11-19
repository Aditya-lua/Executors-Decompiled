/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d41c
 */

undefined8 mbedtls_mpi_grow(undefined8 *param_1,ulong param_2)

{
  ushort uVar1;
  void *__dest;
  void *__src;
  size_t __n;
  
  if (param_2 < 0x2711) {
    uVar1 = *(ushort *)((long)param_1 + 10);
    if (param_2 <= uVar1) {
      return 0;
    }
    __dest = calloc(param_2,8);
    if (__dest != (void *)0x0) {
      __src = (void *)*param_1;
      if (__src != (void *)0x0) {
        __n = (ulong)uVar1 << 3;
        memcpy(__dest,__src,__n);
        mbedtls_zeroize_and_free(__src,__n);
      }
      *(short *)((long)param_1 + 10) = (short)param_2;
      *param_1 = __dest;
      return 0;
    }
  }
  return 0xfffffff0;
}

