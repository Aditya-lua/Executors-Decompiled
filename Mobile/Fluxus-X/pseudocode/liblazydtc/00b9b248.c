/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9b248
 */

undefined8 mbedtls_ecdh_get_params(undefined1 *param_1,int *param_2,uint param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  if (param_3 < 2) {
    iVar1 = *param_2;
    if (*(int *)(param_1 + 4) == 0) {
      *param_1 = 0;
      *(undefined4 *)(param_1 + 8) = 1;
      *(int *)(param_1 + 4) = iVar1;
      mbedtls_ecp_group_init(param_1 + 0x10);
      mbedtls_mpi_init(param_1 + 0xd0);
      mbedtls_ecp_point_init(param_1 + 0xe0);
      mbedtls_ecp_point_init(param_1 + 0x110);
      mbedtls_mpi_init(param_1 + 0x140);
      iVar1 = mbedtls_ecp_group_load(param_1 + 0x10,iVar1);
      if (iVar1 != 0) {
        return 0xffffb180;
      }
    }
    else if (*(int *)(param_1 + 4) != iVar1) {
      return 0xffffb080;
    }
    if (*(int *)(param_1 + 8) == 1) {
      if (param_3 == 0) {
        uVar2 = mbedtls_ecp_copy(param_1 + 0xe0,param_2 + 0x34);
        if ((int)uVar2 == 0) {
          uVar2 = mbedtls_mpi_copy(param_1 + 0xd0,param_2 + 0x30);
          return uVar2;
        }
        return uVar2;
      }
      if (param_3 == 1) {
        uVar2 = mbedtls_ecp_copy(param_1 + 0x110,param_2 + 0x34);
        return uVar2;
      }
    }
  }
  return 0xffffb080;
}

