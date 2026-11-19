/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91c54
 */

void mbedtls_ecp_set_zero(long param_1)

{
  int iVar1;
  
  iVar1 = mbedtls_mpi_lset(param_1,1);
  if ((iVar1 == 0) && (iVar1 = mbedtls_mpi_lset(param_1 + 0x10,1), iVar1 == 0)) {
    mbedtls_mpi_lset(param_1 + 0x20,0);
    return;
  }
  return;
}

