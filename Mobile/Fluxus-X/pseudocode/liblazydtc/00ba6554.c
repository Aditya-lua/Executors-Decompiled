/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6554
 */

undefined8 FUN_00ba6554(long param_1,int param_2)

{
  long lVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  
  lVar4 = *(long *)(param_1 + 8);
  lVar1 = param_1 + 0x10;
  lVar3 = mbedtls_mpi_size(lVar1);
  if (lVar4 != lVar3) {
    return 0xffffbf80;
  }
  if (0x400 < *(ulong *)(param_1 + 8)) {
    return 0xffffbf80;
  }
  iVar2 = mbedtls_mpi_cmp_int(lVar1,0);
  if (iVar2 < 1) {
    return 0xffffbf80;
  }
  iVar2 = mbedtls_mpi_get_bit(lVar1,0);
  if (iVar2 == 0) {
    return 0xffffbf80;
  }
  if (param_2 != 0) {
    iVar2 = mbedtls_mpi_cmp_int(param_1 + 0x40,0);
    if (iVar2 < 1) {
      return 0xffffbf80;
    }
    iVar2 = mbedtls_mpi_get_bit(param_1 + 0x40,0);
    if (iVar2 == 0) {
      return 0xffffbf80;
    }
    iVar2 = mbedtls_mpi_cmp_int(param_1 + 0x50,0);
    if (iVar2 < 1) {
      return 0xffffbf80;
    }
    iVar2 = mbedtls_mpi_get_bit(param_1 + 0x50,0);
    if (iVar2 == 0) {
      return 0xffffbf80;
    }
  }
  iVar2 = mbedtls_mpi_cmp_int(param_1 + 0x20,0);
  if ((iVar2 < 1) ||
     ((param_2 != 0 &&
      (((iVar2 = mbedtls_mpi_cmp_int(param_1 + 0x60,0), iVar2 < 1 ||
        (iVar2 = mbedtls_mpi_cmp_int(param_1 + 0x70,0), iVar2 < 1)) ||
       (iVar2 = mbedtls_mpi_cmp_int(param_1 + 0x80,0), iVar2 < 1)))))) {
    return 0xffffbf80;
  }
  return 0;
}

