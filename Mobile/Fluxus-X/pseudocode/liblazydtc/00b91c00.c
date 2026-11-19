/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91c00
 */

void mbedtls_ecp_copy(long param_1,long param_2)

{
  int iVar1;
  
  iVar1 = mbedtls_mpi_copy();
  if ((iVar1 == 0) && (iVar1 = mbedtls_mpi_copy(param_1 + 0x10,param_2 + 0x10), iVar1 == 0)) {
    mbedtls_mpi_copy(param_1 + 0x20,param_2 + 0x20);
    return;
  }
  return;
}

