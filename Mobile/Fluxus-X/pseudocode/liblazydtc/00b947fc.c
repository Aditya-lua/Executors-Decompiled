/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b947fc
 */

undefined8 mbedtls_ecp_write_key_ext(long param_1,ulong *param_2,undefined8 param_3,ulong param_4)

{
  undefined8 uVar1;
  ulong uVar2;
  
  uVar2 = *(long *)(param_1 + 0x80) + 7U >> 3;
  if (param_4 < uVar2) {
    *param_2 = 0;
    return 0xffffb100;
  }
  *param_2 = uVar2;
  if (*(short *)(param_1 + 0xca) == 0) {
    return 0xffffb080;
  }
  if (*(long *)(param_1 + 0x38) == 0) {
    return 0xffffff92;
  }
  if (*(long *)(param_1 + 0x48) == 0) {
    uVar1 = mbedtls_mpi_write_binary_le(param_1 + 0xc0,param_3,uVar2);
    return uVar1;
  }
  uVar1 = mbedtls_mpi_write_binary();
  return uVar1;
}

