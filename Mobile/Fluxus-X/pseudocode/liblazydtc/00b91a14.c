/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91a14
 */

void mbedtls_ecp_keypair_init(undefined4 *param_1)

{
  *param_1 = 0;
  mbedtls_mpi_init(param_1 + 2);
  mbedtls_mpi_init(param_1 + 6);
  mbedtls_mpi_init(param_1 + 10);
  mbedtls_mpi_init(param_1 + 0xe);
  mbedtls_mpi_init(param_1 + 0x12);
  mbedtls_mpi_init(param_1 + 0x16);
  mbedtls_mpi_init(param_1 + 0x1a);
  *(undefined8 *)(param_1 + 0x1e) = 0;
  *(undefined8 *)(param_1 + 0x20) = 0;
  param_1[0x22] = 0;
  *(undefined8 *)(param_1 + 0x2c) = 0;
  *(undefined8 *)(param_1 + 0x2e) = 0;
  *(undefined8 *)(param_1 + 0x28) = 0;
  *(undefined8 *)(param_1 + 0x2a) = 0;
  *(undefined8 *)(param_1 + 0x24) = 0;
  *(undefined8 *)(param_1 + 0x26) = 0;
  mbedtls_mpi_init(param_1 + 0x30);
  mbedtls_mpi_init(param_1 + 0x34);
  mbedtls_mpi_init(param_1 + 0x38);
  mbedtls_mpi_init(param_1 + 0x3c);
  return;
}

