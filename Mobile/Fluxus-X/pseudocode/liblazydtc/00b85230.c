/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b85230
 */

void mbedtls_mpi_core_to_mont_rep
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  mbedtls_mpi_core_montmul(param_1,param_2,param_6,param_4,param_3,param_4,param_5,param_7);
  return;
}

