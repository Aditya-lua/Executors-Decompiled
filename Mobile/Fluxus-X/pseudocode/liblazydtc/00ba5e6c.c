/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba5e6c
 */

ulong mbedtls_rsa_import_raw
                (long param_1,long param_2,undefined8 param_3,long param_4,undefined8 param_5,
                long param_6,undefined8 param_7,long param_8,undefined8 param_9,long param_10,
                undefined8 param_11)

{
  ulong uVar1;
  undefined8 uVar2;
  
  if (param_2 != 0) {
    uVar1 = mbedtls_mpi_read_binary(param_1 + 0x10);
    if ((int)uVar1 != 0) goto LAB_00ba5f28;
    uVar2 = mbedtls_mpi_size(param_1 + 0x10);
    *(undefined8 *)(param_1 + 8) = uVar2;
  }
  if (((param_4 != 0) &&
      (uVar1 = mbedtls_mpi_read_binary(param_1 + 0x40,param_4,param_5), (int)uVar1 != 0)) ||
     ((param_6 != 0 &&
      (uVar1 = mbedtls_mpi_read_binary(param_1 + 0x50,param_6,param_7), (int)uVar1 != 0))))
  goto LAB_00ba5f28;
  if (param_8 == 0) {
    if (param_10 == 0) {
      return 0;
    }
LAB_00ba5f14:
    uVar1 = mbedtls_mpi_read_binary(param_1 + 0x20,param_10,param_11);
  }
  else {
    uVar1 = mbedtls_mpi_read_binary(param_1 + 0x30,param_8,param_9);
    if ((param_10 != 0) && ((int)uVar1 == 0)) goto LAB_00ba5f14;
  }
  if ((int)uVar1 == 0) {
    return uVar1;
  }
LAB_00ba5f28:
  return (ulong)((int)uVar1 - 0x4080);
}

