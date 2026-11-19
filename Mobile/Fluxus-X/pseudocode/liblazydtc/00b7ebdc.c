/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7ebdc
 */

undefined8 mbedtls_mpi_shift_l(undefined8 *param_1,long param_2)

{
  ulong uVar1;
  long lVar2;
  void *__dest;
  ulong __nmemb;
  ulong uVar3;
  void *__src;
  
  lVar2 = mbedtls_mpi_core_bitlen(*param_1,*(undefined2 *)((long)param_1 + 10));
  uVar3 = (ulong)*(ushort *)((long)param_1 + 10);
  uVar1 = lVar2 + param_2;
  if (uVar3 << 6 < uVar1) {
    __nmemb = uVar1 >> 6;
    if ((uVar1 & 0x3f) != 0) {
      __nmemb = __nmemb + 1;
    }
    if (10000 < __nmemb) {
      return 0xfffffff0;
    }
    if (uVar3 < __nmemb) {
      __dest = calloc(__nmemb,8);
      if (__dest == (void *)0x0) {
        return 0xfffffff0;
      }
      __src = (void *)*param_1;
      if (__src != (void *)0x0) {
        memcpy(__dest,__src,uVar3 << 3);
        mbedtls_zeroize_and_free(__src,uVar3 << 3);
      }
      uVar3 = __nmemb & 0xffff;
      *(short *)((long)param_1 + 10) = (short)__nmemb;
      *param_1 = __dest;
    }
  }
  mbedtls_mpi_core_shift_l(*param_1,uVar3,param_2);
  return 0;
}

