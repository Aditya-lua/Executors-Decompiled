/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8483c
 */

void mbedtls_mpi_core_get_mont_r2_unsafe(undefined8 param_1,long param_2)

{
  int iVar1;
  
  iVar1 = mbedtls_mpi_lset(param_1,1);
  if (((iVar1 == 0) &&
      (iVar1 = mbedtls_mpi_shift_l(param_1,(ulong)*(ushort *)(param_2 + 10) << 7), iVar1 == 0)) &&
     (iVar1 = mbedtls_mpi_mod_mpi(param_1,param_1,param_2), iVar1 == 0)) {
    mbedtls_mpi_shrink(param_1,*(undefined2 *)(param_2 + 10));
    return;
  }
  return;
}

