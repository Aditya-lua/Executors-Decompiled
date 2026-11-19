/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6220
 */

ulong mbedtls_rsa_export_crt(long param_1,long param_2,long param_3,long param_4)

{
  int iVar1;
  ulong uVar2;
  
  iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x10,0);
  if ((((iVar1 == 0) || (iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x40,0), iVar1 == 0)) ||
      (iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x50,0), iVar1 == 0)) ||
     ((iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x30,0), iVar1 == 0 ||
      (iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x20,0), iVar1 == 0)))) {
    return 0xffffbf80;
  }
  if (((param_2 == 0) || (uVar2 = mbedtls_mpi_copy(param_2,param_1 + 0x60), (int)uVar2 == 0)) &&
     ((param_3 == 0 || (uVar2 = mbedtls_mpi_copy(param_3,param_1 + 0x70), (int)uVar2 == 0)))) {
    if (param_4 == 0) {
      return 0;
    }
    uVar2 = mbedtls_mpi_copy(param_4,param_1 + 0x80);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
  }
  return (ulong)((int)uVar2 - 0x4080);
}

