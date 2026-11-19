/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91bb0
 */

void mbedtls_ecp_keypair_free(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  mbedtls_ecp_group_free(param_1);
  mbedtls_mpi_free(param_1 + 0xc0);
  mbedtls_mpi_free(param_1 + 0xd0);
  mbedtls_mpi_free(param_1 + 0xe0);
  mbedtls_mpi_free(param_1 + 0xf0);
  return;
}

