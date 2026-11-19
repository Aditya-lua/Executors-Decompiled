/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91ca0
 */

bool mbedtls_ecp_is_zero(long param_1)

{
  int iVar1;
  
  iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x20,0);
  return iVar1 == 0;
}

