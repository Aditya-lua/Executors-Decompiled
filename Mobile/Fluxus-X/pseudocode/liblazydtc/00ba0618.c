/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba0618
 */

int mbedtls_ecjpake_setup
              (undefined4 *param_1,uint param_2,undefined4 param_3,undefined4 param_4,
              undefined8 param_5,undefined8 param_6)

{
  int iVar1;
  long lVar2;
  
  if (param_2 < 2) {
    param_1[0x32] = param_2;
    lVar2 = mbedtls_md_info_from_type(param_3);
    if (lVar2 == 0) {
      iVar1 = -0x5080;
    }
    else {
      *param_1 = param_3;
      iVar1 = mbedtls_ecp_group_load(param_1 + 2,param_4);
      if (iVar1 == 0) {
        iVar1 = mbedtls_mpi_read_binary(param_1 + 0x78,param_5,param_6);
        if (iVar1 == 0) {
          return 0;
        }
      }
      mbedtls_ecjpake_free(param_1);
    }
  }
  else {
    iVar1 = -0x4f80;
  }
  return iVar1;
}

