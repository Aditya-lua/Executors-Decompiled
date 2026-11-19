/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91d10
 */

void mbedtls_ecp_point_read_string
               (long param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = mbedtls_mpi_read_string();
  if ((iVar1 == 0) && (iVar1 = mbedtls_mpi_read_string(param_1 + 0x10,param_2,param_4), iVar1 == 0))
  {
    mbedtls_mpi_lset(param_1 + 0x20,1);
    return;
  }
  return;
}

