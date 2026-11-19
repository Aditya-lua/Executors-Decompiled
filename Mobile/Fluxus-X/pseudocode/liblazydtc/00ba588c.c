/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba588c
 */

int mbedtls_rsa_import(long param_1,long param_2,long param_3,long param_4,long param_5,long param_6
                      )

{
  int iVar1;
  undefined8 uVar2;
  
  if ((((((param_2 == 0) || (iVar1 = mbedtls_mpi_copy(param_1 + 0x10,param_2), iVar1 == 0)) &&
        ((param_3 == 0 || (iVar1 = mbedtls_mpi_copy(param_1 + 0x40,param_3), iVar1 == 0)))) &&
       ((param_4 == 0 || (iVar1 = mbedtls_mpi_copy(param_1 + 0x50,param_4), iVar1 == 0)))) &&
      ((param_5 == 0 || (iVar1 = mbedtls_mpi_copy(param_1 + 0x30,param_5), iVar1 == 0)))) &&
     ((param_6 == 0 || (iVar1 = mbedtls_mpi_copy(param_1 + 0x20,param_6), iVar1 == 0)))) {
    if (param_2 == 0) {
      iVar1 = 0;
    }
    else {
      uVar2 = mbedtls_mpi_size(param_1 + 0x10);
      iVar1 = 0;
      *(undefined8 *)(param_1 + 8) = uVar2;
    }
  }
  else {
    iVar1 = iVar1 + -0x4080;
  }
  return iVar1;
}

