/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b94744
 */

undefined8 mbedtls_ecp_write_key(int *param_1,undefined8 param_2,ulong param_3)

{
  undefined8 uVar1;
  
  if (*(long *)(param_1 + 0xe) == 0) {
    return 0xffffff92;
  }
  if (*(long *)(param_1 + 0x12) == 0) {
    if (*param_1 == 9) {
      if (param_3 < 0x20) {
        return 0xffffb100;
      }
    }
    else if ((param_3 < 0x38) && (*param_1 == 0xd)) {
      return 0xffffb100;
    }
    uVar1 = mbedtls_mpi_write_binary_le(param_1 + 0x30,param_2,param_3);
    if ((int)uVar1 != 0) {
      return uVar1;
    }
    if ((*(long *)(param_1 + 0xe) == 0) || (*(long *)(param_1 + 0x12) == 0)) {
      return 0;
    }
  }
  uVar1 = mbedtls_mpi_write_binary(param_1 + 0x30,param_2,param_3);
  return uVar1;
}

