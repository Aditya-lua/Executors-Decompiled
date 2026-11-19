/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91a98
 */

void mbedtls_ecp_point_free(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  mbedtls_mpi_free(param_1);
  mbedtls_mpi_free(param_1 + 0x10);
  mbedtls_mpi_free(param_1 + 0x20);
  return;
}

