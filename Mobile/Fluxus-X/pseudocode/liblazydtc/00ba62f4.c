/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba62f4
 */

undefined8
mbedtls_rsa_export(long param_1,long param_2,long param_3,long param_4,long param_5,long param_6)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x10,0);
  if ((((((((iVar1 != 0) && (iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x40,0), iVar1 != 0)) &&
          (iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x50,0), iVar1 != 0)) &&
         ((iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x30,0), iVar1 != 0 &&
          (iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x20,0), iVar1 != 0)))) ||
        ((uVar2 = 0xffffbf80, param_3 == 0 && ((param_4 == 0 && (param_5 == 0)))))) &&
       ((param_2 == 0 || (uVar2 = mbedtls_mpi_copy(param_2,param_1 + 0x10), (int)uVar2 == 0)))) &&
      ((((param_3 == 0 || (uVar2 = mbedtls_mpi_copy(param_3,param_1 + 0x40), (int)uVar2 == 0)) &&
        ((param_4 == 0 || (uVar2 = mbedtls_mpi_copy(param_4,param_1 + 0x50), (int)uVar2 == 0)))) &&
       ((param_5 == 0 || (uVar2 = mbedtls_mpi_copy(param_5,param_1 + 0x30), (int)uVar2 == 0)))))) &&
     ((param_6 == 0 || (uVar2 = mbedtls_mpi_copy(param_6,param_1 + 0x20), (int)uVar2 == 0)))) {
    uVar2 = 0;
  }
  return uVar2;
}

