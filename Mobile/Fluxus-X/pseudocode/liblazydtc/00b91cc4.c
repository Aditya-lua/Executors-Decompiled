/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91cc4
 */

undefined8 mbedtls_ecp_point_cmp(long param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = mbedtls_mpi_cmp_mpi();
  if (((iVar1 != 0) || (iVar1 = mbedtls_mpi_cmp_mpi(param_1 + 0x10,param_2 + 0x10), iVar1 != 0)) ||
     (uVar2 = mbedtls_mpi_cmp_mpi(param_1 + 0x20,param_2 + 0x20), (int)uVar2 != 0)) {
    uVar2 = 0xffffb080;
  }
  return uVar2;
}

