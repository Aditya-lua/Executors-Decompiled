/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b935f4
 */

int mbedtls_ecp_muladd_restartable
              (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
              undefined8 param_5,undefined8 param_6)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_d8 [16];
  undefined1 auStack_c8 [16];
  undefined1 auStack_b8 [16];
  undefined1 auStack_a8 [16];
  undefined1 auStack_98 [16];
  undefined1 auStack_88 [16];
  undefined1 auStack_78 [16];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if ((*(long *)(param_1 + 0x38) == 0) || (*(long *)(param_1 + 0x48) == 0)) {
    iVar2 = -0x4e80;
  }
  else {
    mbedtls_mpi_init(auStack_d8);
    mbedtls_mpi_init();
    mbedtls_mpi_init();
    mbedtls_mpi_init(auStack_a8);
    mbedtls_mpi_init(auStack_98);
    mbedtls_mpi_init(auStack_88);
    mbedtls_mpi_init(auStack_78);
    iVar2 = FUN_00b9377c(param_1,auStack_d8,param_3,param_4);
    if (iVar2 == 0) {
      iVar2 = FUN_00b9377c(param_1,param_2,param_5,param_6);
      if (iVar2 == 0) {
        iVar2 = FUN_00b93970(param_1,param_2,auStack_d8,param_2,auStack_a8);
        if (iVar2 == 0) {
          iVar2 = FUN_00b93e20(param_1,param_2);
        }
      }
    }
    mbedtls_mpi_free(auStack_a8);
    mbedtls_mpi_free(auStack_98);
    mbedtls_mpi_free(auStack_88);
    mbedtls_mpi_free(auStack_78);
    mbedtls_mpi_free(auStack_d8);
    mbedtls_mpi_free(auStack_c8);
    mbedtls_mpi_free(auStack_b8);
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

