/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba5bb4
 */

int mbedtls_rsa_check_pubkey(long param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  
  lVar5 = *(long *)(param_1 + 8);
  lVar1 = param_1 + 0x10;
  lVar3 = mbedtls_mpi_size(lVar1);
  if ((((lVar5 == lVar3) && (*(ulong *)(param_1 + 8) < 0x401)) &&
      (iVar2 = mbedtls_mpi_cmp_int(lVar1,0), 0 < iVar2)) &&
     (iVar2 = mbedtls_mpi_get_bit(lVar1,0), iVar2 != 0)) {
    param_1 = param_1 + 0x20;
    iVar2 = mbedtls_mpi_cmp_int(param_1,0);
    if (((0 < iVar2) && (uVar4 = mbedtls_mpi_bitlen(lVar1), 0x7f < uVar4)) &&
       ((iVar2 = mbedtls_mpi_get_bit(param_1,0), iVar2 != 0 &&
        (uVar4 = mbedtls_mpi_bitlen(param_1), 1 < uVar4)))) {
      iVar2 = mbedtls_mpi_cmp_mpi(param_1,lVar1);
      return (iVar2 >> 0x1f & 0x4200U) - 0x4200;
    }
  }
  return -0x4200;
}

