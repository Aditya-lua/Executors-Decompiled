/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7ebc0
 */

void mbedtls_mpi_write_binary(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  mbedtls_mpi_core_write_be(*param_1,*(undefined2 *)((long)param_1 + 10),param_2,param_3);
  return;
}

