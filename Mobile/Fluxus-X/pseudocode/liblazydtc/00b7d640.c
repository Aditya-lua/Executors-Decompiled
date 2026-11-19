/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d640
 */

void mbedtls_mpi_init(undefined8 *param_1)

{
  *(undefined4 *)(param_1 + 1) = 1;
  *param_1 = 0;
  return;
}

