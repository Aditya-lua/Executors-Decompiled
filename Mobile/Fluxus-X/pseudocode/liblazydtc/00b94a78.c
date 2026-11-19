/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b94a78
 */

undefined8 mbedtls_ecp_export(undefined4 *param_1,long param_2,long param_3,long param_4)

{
  undefined8 uVar1;
  
  if ((((param_2 == 0) || (uVar1 = mbedtls_ecp_group_load(param_2,*param_1), (int)uVar1 == 0)) &&
      ((param_3 == 0 || (uVar1 = mbedtls_mpi_copy(param_3,param_1 + 0x30), (int)uVar1 == 0)))) &&
     ((param_4 == 0 ||
      (((uVar1 = mbedtls_mpi_copy(param_4,param_1 + 0x34), (int)uVar1 == 0 &&
        (uVar1 = mbedtls_mpi_copy(param_4 + 0x10,param_1 + 0x38), (int)uVar1 == 0)) &&
       (uVar1 = mbedtls_mpi_copy(param_4 + 0x20,param_1 + 0x3c), (int)uVar1 == 0)))))) {
    uVar1 = 0;
  }
  return uVar1;
}

