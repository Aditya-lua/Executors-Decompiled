/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7f164
 */

undefined8 mbedtls_mpi_sub_abs(long *param_1,long *param_2,long *param_3)

{
  long lVar1;
  ushort uVar2;
  size_t __nmemb;
  void *__dest;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  void *__src;
  size_t sVar6;
  
  uVar4 = (ulong)*(ushort *)((long)param_3 + 10);
  do {
    uVar5 = uVar4;
    uVar4 = uVar5 - 1;
    if (uVar4 == 0xffffffffffffffff) {
      __nmemb = (size_t)*(ushort *)((long)param_2 + 10);
      uVar5 = 0;
      goto LAB_00b7f1d0;
    }
  } while (*(long *)(*param_3 + uVar4 * 8) == 0);
  __nmemb = (size_t)*(ushort *)((long)param_2 + 10);
  if (uVar5 <= __nmemb) {
LAB_00b7f1d0:
    if (10000 < (uint)__nmemb) {
      return 0xfffffff0;
    }
    uVar2 = *(ushort *)((long)param_1 + 10);
    uVar4 = (ulong)uVar2;
    sVar6 = __nmemb;
    if ((uint)uVar2 < (uint)__nmemb) {
      __dest = calloc(__nmemb,8);
      if (__dest == (void *)0x0) {
        return 0xfffffff0;
      }
      __src = (void *)*param_1;
      if (__src != (void *)0x0) {
        sVar6 = (ulong)uVar2 << 3;
        memcpy(__dest,__src,sVar6);
        mbedtls_zeroize_and_free(__src,sVar6);
      }
      *(short *)((long)param_1 + 10) = (short)__nmemb;
      *param_1 = (long)__dest;
      sVar6 = (size_t)*(ushort *)((long)param_2 + 10);
      uVar4 = __nmemb;
    }
    if ((param_2 != param_1) && (uVar5 <= sVar6 && sVar6 - uVar5 != 0)) {
      memcpy((void *)(*param_1 + uVar5 * 8),(void *)(*param_2 + uVar5 * 8),(sVar6 - uVar5) * 8);
      uVar4 = (ulong)*(ushort *)((long)param_1 + 10);
      sVar6 = (size_t)*(ushort *)((long)param_2 + 10);
    }
    if ((uint)sVar6 < (uint)uVar4) {
      memset((void *)(*param_1 + sVar6 * 8),0,(uVar4 - sVar6) * 8);
    }
    lVar3 = mbedtls_mpi_core_sub(*param_1,*param_2,*param_3,uVar5);
    if ((lVar3 == 0) ||
       (lVar1 = *param_1 + uVar5 * 8,
       lVar3 = mbedtls_mpi_core_sub_int(lVar1,lVar1,lVar3,*(ushort *)((long)param_1 + 10) - uVar5),
       lVar3 == 0)) {
      *(undefined2 *)(param_1 + 1) = 1;
      return 0;
    }
  }
  return 0xfffffff6;
}

