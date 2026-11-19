/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b84e18
 */

long mbedtls_mpi_core_exp_mod_working_limbs(long param_1,long param_2)

{
  long lVar1;
  
  lVar1 = 3;
  if ((ulong)(param_2 * 0x40) < 0x50) {
    lVar1 = 1;
  }
  return (param_1 << 1 | 1U) + param_1 + (param_1 << lVar1);
}

