/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba5c8c
 */

void mbedtls_rsa_free(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  mbedtls_mpi_free(param_1 + 0xc0);
  mbedtls_mpi_free(param_1 + 0xd0);
  mbedtls_mpi_free(param_1 + 0x90);
  mbedtls_mpi_free(param_1 + 0x30);
  mbedtls_mpi_free(param_1 + 0x50);
  mbedtls_mpi_free(param_1 + 0x40);
  mbedtls_mpi_free(param_1 + 0x20);
  mbedtls_mpi_free(param_1 + 0x10);
  mbedtls_mpi_free(param_1 + 0xb0);
  mbedtls_mpi_free(param_1 + 0xa0);
  mbedtls_mpi_free(param_1 + 0x80);
  mbedtls_mpi_free(param_1 + 0x70);
  mbedtls_mpi_free(param_1 + 0x60);
  return;
}

