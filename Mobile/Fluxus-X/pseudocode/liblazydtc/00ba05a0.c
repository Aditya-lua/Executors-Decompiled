/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba05a0
 */

void mbedtls_ecjpake_free(undefined4 *param_1)

{
  if (param_1 == (undefined4 *)0x0) {
    return;
  }
  *param_1 = 0;
  mbedtls_ecp_group_free(param_1 + 2);
  mbedtls_ecp_point_free(param_1 + 0x34);
  mbedtls_ecp_point_free(param_1 + 0x40);
  mbedtls_ecp_point_free(param_1 + 0x4c);
  mbedtls_ecp_point_free(param_1 + 0x58);
  mbedtls_ecp_point_free(param_1 + 100);
  mbedtls_mpi_free(param_1 + 0x70);
  mbedtls_mpi_free(param_1 + 0x74);
  mbedtls_mpi_free(param_1 + 0x78);
  return;
}

