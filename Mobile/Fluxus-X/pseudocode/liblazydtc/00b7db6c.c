/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7db6c
 */

void mbedtls_mpi_bitlen(undefined8 *param_1)

{
  mbedtls_mpi_core_bitlen(*param_1,*(undefined2 *)((long)param_1 + 10));
  return;
}

