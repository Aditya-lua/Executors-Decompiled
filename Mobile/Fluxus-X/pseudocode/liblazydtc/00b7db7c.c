/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7db7c
 */

ulong mbedtls_mpi_size(undefined8 *param_1)

{
  long lVar1;
  
  lVar1 = mbedtls_mpi_core_bitlen(*param_1,*(undefined2 *)((long)param_1 + 10));
  return lVar1 + 7U >> 3;
}

