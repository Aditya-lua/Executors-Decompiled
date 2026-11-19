/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9c154
 */

int mbedtls_ecdsa_from_keypair(long param_1,long param_2)

{
  int iVar1;
  
  iVar1 = mbedtls_ecp_group_copy();
  if (iVar1 == 0) {
    iVar1 = mbedtls_mpi_copy(param_1 + 0xc0,param_2 + 0xc0);
    if (iVar1 == 0) {
      iVar1 = mbedtls_ecp_copy(param_1 + 0xd0,param_2 + 0xd0);
      if (iVar1 == 0) {
        return 0;
      }
    }
  }
  if (param_1 != 0) {
    mbedtls_ecp_keypair_free(param_1);
  }
  return iVar1;
}

