/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba053c
 */

void mbedtls_ecjpake_init(undefined4 *param_1)

{
  *param_1 = 0;
  mbedtls_ecp_group_init(param_1 + 2);
  param_1[0x33] = 0;
  mbedtls_ecp_point_init(param_1 + 0x34);
  mbedtls_ecp_point_init(param_1 + 0x40);
  mbedtls_ecp_point_init(param_1 + 0x4c);
  mbedtls_ecp_point_init(param_1 + 0x58);
  mbedtls_ecp_point_init(param_1 + 100);
  mbedtls_mpi_init(param_1 + 0x70);
  mbedtls_mpi_init(param_1 + 0x74);
  mbedtls_mpi_init(param_1 + 0x78);
  return;
}

