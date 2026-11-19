/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b85204
 */

long mbedtls_mpi_core_check_zero_ct(ulong *param_1,long param_2)

{
  ulong uVar1;
  
  uVar1 = 0;
  for (; param_2 != 0; param_2 = param_2 + -1) {
    uVar1 = *param_1 | uVar1;
    param_1 = param_1 + 1;
  }
  return (long)(-uVar1 | uVar1) >> 0x3f;
}

