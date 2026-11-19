/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91980
 */

void mbedtls_ecp_point_init(long param_1)

{
  mbedtls_mpi_init();
  mbedtls_mpi_init(param_1 + 0x10);
  mbedtls_mpi_init(param_1 + 0x20);
  return;
}

