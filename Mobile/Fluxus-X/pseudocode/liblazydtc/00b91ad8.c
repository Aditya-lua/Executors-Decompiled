/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91ad8
 */

void mbedtls_ecp_group_free(long param_1)

{
  long lVar1;
  void *__ptr;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  
  if (param_1 == 0) {
    return;
  }
  if (*(int *)(param_1 + 0x88) != 1) {
    mbedtls_mpi_free(param_1 + 0x18);
    mbedtls_mpi_free(param_1 + 0x28);
    mbedtls_mpi_free(param_1 + 0x38);
    mbedtls_mpi_free(param_1 + 0x48);
    mbedtls_mpi_free(param_1 + 0x58);
    mbedtls_mpi_free(param_1 + 0x68);
    mbedtls_mpi_free(param_1 + 8);
  }
  __ptr = *(void **)(param_1 + 0xb0);
  if ((__ptr != (void *)0x0) && (uVar2 = *(ulong *)(param_1 + 0xb8), uVar2 != 0)) {
    lVar3 = 0;
    uVar4 = 0;
    do {
      if ((long)__ptr + lVar3 != 0) {
        lVar1 = (long)__ptr + lVar3;
        mbedtls_mpi_free(lVar1);
        mbedtls_mpi_free(lVar1 + 0x10);
        mbedtls_mpi_free(lVar1 + 0x20);
        __ptr = *(void **)(param_1 + 0xb0);
        uVar2 = *(ulong *)(param_1 + 0xb8);
      }
      uVar4 = uVar4 + 1;
      lVar3 = lVar3 + 0x30;
    } while (uVar4 < uVar2);
    free(__ptr);
  }
  mbedtls_platform_zeroize(param_1,0xc0);
  return;
}

