/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9afc4
 */

void mbedtls_ecdh_free(undefined1 *param_1)

{
  if (param_1 != (undefined1 *)0x0) {
    if (*(int *)(param_1 + 8) == 1) {
      mbedtls_ecp_group_free(param_1 + 0x10);
      mbedtls_mpi_free(param_1 + 0xd0);
      mbedtls_ecp_point_free(param_1 + 0xe0);
      mbedtls_ecp_point_free(param_1 + 0x110);
      mbedtls_mpi_free(param_1 + 0x140);
    }
    *param_1 = 0;
    *(undefined4 *)(param_1 + 4) = 0;
    *(undefined4 *)(param_1 + 8) = 0;
  }
  return;
}

