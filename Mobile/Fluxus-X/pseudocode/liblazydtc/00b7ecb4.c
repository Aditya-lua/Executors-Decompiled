/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7ecb4
 */

undefined8 mbedtls_mpi_shift_r(undefined8 *param_1,undefined8 param_2)

{
  if (*(short *)((long)param_1 + 10) != 0) {
    mbedtls_mpi_core_shift_r(*param_1,*(short *)((long)param_1 + 10),param_2);
  }
  return 0;
}

