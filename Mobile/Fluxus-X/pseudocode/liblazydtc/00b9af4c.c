/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9af4c
 */

undefined4 mbedtls_ecdh_setup(undefined1 *param_1,undefined4 param_2)

{
  int iVar1;
  undefined4 uVar2;
  
  *param_1 = 0;
  *(undefined4 *)(param_1 + 4) = param_2;
  *(undefined4 *)(param_1 + 8) = 1;
  mbedtls_ecp_group_init(param_1 + 0x10);
  mbedtls_mpi_init(param_1 + 0xd0);
  mbedtls_ecp_point_init(param_1 + 0xe0);
  mbedtls_ecp_point_init(param_1 + 0x110);
  mbedtls_mpi_init(param_1 + 0x140);
  iVar1 = mbedtls_ecp_group_load(param_1 + 0x10,param_2);
  uVar2 = 0;
  if (iVar1 != 0) {
    uVar2 = 0xffffb180;
  }
  return uVar2;
}

