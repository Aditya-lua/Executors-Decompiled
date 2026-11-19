/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7da1c
 */

undefined8 mbedtls_mpi_set_bit(long *param_1,ulong param_2,byte param_3)

{
  void *__dest;
  void *__src;
  ulong uVar1;
  ulong uVar2;
  
  if (1 < param_3) {
    return 0xfffffffc;
  }
  uVar1 = (ulong)*(ushort *)((long)param_1 + 10);
  uVar2 = param_2 >> 6;
  if (uVar1 * 0x40 <= param_2) {
    if (param_3 == 0) {
      return 0;
    }
    if (0x270 < param_2 >> 10) {
      return 0xfffffff0;
    }
    if (uVar1 <= uVar2) {
      __dest = calloc(uVar2 + 1,8);
      if (__dest == (void *)0x0) {
        return 0xfffffff0;
      }
      __src = (void *)*param_1;
      if (__src != (void *)0x0) {
        memcpy(__dest,__src,uVar1 << 3);
        mbedtls_zeroize_and_free(__src,uVar1 << 3);
      }
      *(short *)((long)param_1 + 10) = (short)(uVar2 + 1);
      *param_1 = (long)__dest;
    }
  }
  *(ulong *)(*param_1 + uVar2 * 8) =
       *(ulong *)(*param_1 + uVar2 * 8) & (1L << (param_2 & 0x3f) ^ 0xffffffffffffffffU) |
       (ulong)param_3 << (param_2 & 0x3f);
  return 0;
}

