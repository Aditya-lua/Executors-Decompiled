/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba8b34
 */

int mbedtls_rsa_copy(long param_1,long param_2)

{
  int iVar1;
  
  *(undefined8 *)(param_1 + 8) = *(undefined8 *)(param_2 + 8);
  iVar1 = mbedtls_mpi_copy(param_1 + 0x10,param_2 + 0x10);
  if (iVar1 == 0) {
    iVar1 = mbedtls_mpi_copy(param_1 + 0x20,param_2 + 0x20);
    if (iVar1 == 0) {
      iVar1 = mbedtls_mpi_copy(param_1 + 0x30,param_2 + 0x30);
      if (iVar1 == 0) {
        iVar1 = mbedtls_mpi_copy(param_1 + 0x40,param_2 + 0x40);
        if (iVar1 == 0) {
          iVar1 = mbedtls_mpi_copy(param_1 + 0x50,param_2 + 0x50);
          if (iVar1 == 0) {
            iVar1 = mbedtls_mpi_copy(param_1 + 0x60,param_2 + 0x60);
            if (iVar1 == 0) {
              iVar1 = mbedtls_mpi_copy(param_1 + 0x70,param_2 + 0x70);
              if (iVar1 == 0) {
                iVar1 = mbedtls_mpi_copy(param_1 + 0x80,param_2 + 0x80);
                if (iVar1 == 0) {
                  iVar1 = mbedtls_mpi_copy(param_1 + 0xa0,param_2 + 0xa0);
                  if (iVar1 == 0) {
                    iVar1 = mbedtls_mpi_copy(param_1 + 0xb0,param_2 + 0xb0);
                    if (iVar1 == 0) {
                      iVar1 = mbedtls_mpi_copy(param_1 + 0x90,param_2 + 0x90);
                      if (iVar1 == 0) {
                        iVar1 = mbedtls_mpi_copy(param_1 + 0xc0,param_2 + 0xc0);
                        if (iVar1 == 0) {
                          iVar1 = mbedtls_mpi_copy(param_1 + 0xd0,param_2 + 0xd0);
                          if (iVar1 == 0) {
                            *(undefined8 *)(param_1 + 0xe0) = *(undefined8 *)(param_2 + 0xe0);
                            return 0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  mbedtls_rsa_free(param_1);
  return iVar1;
}

