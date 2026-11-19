/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b944e8
 */

undefined8 mbedtls_ecp_set_public_key(int param_1,int *param_2,long param_3)

{
  undefined8 uVar1;
  
  if (*param_2 == 0) {
    uVar1 = mbedtls_ecp_group_load(param_2);
    if ((int)uVar1 != 0) {
      return uVar1;
    }
  }
  else if (*param_2 != param_1) {
    return 0xffffb080;
  }
  uVar1 = mbedtls_mpi_copy(param_2 + 0x34,param_3);
  if (((int)uVar1 == 0) &&
     (uVar1 = mbedtls_mpi_copy(param_2 + 0x38,param_3 + 0x10), (int)uVar1 == 0)) {
    uVar1 = mbedtls_mpi_copy(param_2 + 0x3c,param_3 + 0x20);
    return uVar1;
  }
  return uVar1;
}

