/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6878
 */

void mbedtls_rsa_get_bitlen(long param_1)

{
  mbedtls_mpi_bitlen(param_1 + 0x10);
  return;
}

