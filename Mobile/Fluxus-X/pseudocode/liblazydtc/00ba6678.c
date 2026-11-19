/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6678
 */

undefined8
mbedtls_rsa_export_raw
          (long param_1,long param_2,undefined8 param_3,long param_4,undefined8 param_5,long param_6
          ,undefined8 param_7,long param_8,undefined8 param_9,long param_10,undefined8 param_11)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x10,0);
  if (((((((iVar1 != 0) && (iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x40,0), iVar1 != 0)) &&
         (iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x50,0), iVar1 != 0)) &&
        ((iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x30,0), iVar1 != 0 &&
         (iVar1 = mbedtls_mpi_cmp_int(param_1 + 0x20,0), iVar1 != 0)))) ||
       ((uVar2 = 0xffffbf80, param_4 == 0 && ((param_6 == 0 && (param_8 == 0)))))) &&
      ((param_2 == 0 ||
       (uVar2 = mbedtls_mpi_write_binary(param_1 + 0x10,param_2,param_3), (int)uVar2 == 0)))) &&
     (((param_4 == 0 ||
       (uVar2 = mbedtls_mpi_write_binary(param_1 + 0x40,param_4,param_5), (int)uVar2 == 0)) &&
      ((param_6 == 0 ||
       (uVar2 = mbedtls_mpi_write_binary(param_1 + 0x50,param_6,param_7), (int)uVar2 == 0)))))) {
    if (param_8 == 0) {
      if (param_10 != 0) goto LAB_00ba67c4;
      uVar2 = 0;
    }
    else {
      uVar2 = mbedtls_mpi_write_binary(param_1 + 0x30,param_8,param_9);
      if ((param_10 != 0) && ((int)uVar2 == 0)) {
LAB_00ba67c4:
        uVar2 = mbedtls_mpi_write_binary(param_1 + 0x20,param_10,param_11);
        return uVar2;
      }
    }
  }
  return uVar2;
}

