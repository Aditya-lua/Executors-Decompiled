/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b94b08
 */

uint mbedtls_ecp_self_test(int param_1)

{
  long lVar1;
  uint param1;
  uint uVar2;
  ulong uVar3;
  undefined1 auStack_200 [16];
  undefined1 auStack_1f0 [16];
  undefined1 auStack_1e0 [16];
  undefined1 auStack_1d0 [16];
  undefined1 auStack_1c0 [16];
  undefined1 auStack_1b0 [16];
  undefined1 auStack_1a0 [16];
  undefined4 local_190 [2];
  undefined1 auStack_188 [16];
  undefined1 auStack_178 [16];
  undefined1 auStack_168 [16];
  undefined1 auStack_158 [16];
  undefined1 auStack_148 [16];
  undefined1 auStack_138 [16];
  undefined1 auStack_128 [16];
  undefined8 local_118;
  undefined8 uStack_110;
  undefined4 local_108;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 local_f0;
  undefined8 uStack_e8;
  undefined8 local_e0;
  undefined8 uStack_d8;
  char *local_d0;
  undefined *puStack_c8;
  undefined *local_c0;
  undefined *puStack_b8;
  undefined *local_b0;
  char *pcStack_a8;
  char *local_a0;
  char *pcStack_98;
  undefined *local_90;
  char *pcStack_88;
  char *local_80;
  undefined *puStack_78;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  pcStack_98 = "FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8C";
  local_a0 = "000000000000000000000000000000000000000000000001";
  pcStack_88 = "400000000000000000000000000000000000000000000000";
  local_90 = &UNK_002bebee;
  puStack_78 = &UNK_002d8d29;
  local_80 = "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF";
  puStack_c8 = &UNK_002b4f89;
  local_d0 = "4000000000000000000000000000000000000000000000000000000000000000";
  puStack_b8 = &UNK_002b3152;
  local_c0 = &UNK_002c2ba4;
  pcStack_a8 = "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF8";
  local_b0 = &UNK_002d8d5a;
  local_190[0] = 0;
  mbedtls_mpi_init(auStack_188);
  mbedtls_mpi_init(auStack_178);
  mbedtls_mpi_init(auStack_168);
  mbedtls_mpi_init(auStack_158);
  mbedtls_mpi_init(auStack_148);
  mbedtls_mpi_init(auStack_138);
  mbedtls_mpi_init(auStack_128);
  local_118 = 0;
  uStack_110 = 0;
  local_108 = 0;
  local_e0 = 0;
  uStack_d8 = 0;
  local_f0 = 0;
  uStack_e8 = 0;
  local_100 = 0;
  uStack_f8 = 0;
  mbedtls_mpi_init(auStack_1c0);
  mbedtls_mpi_init(auStack_1b0);
  mbedtls_mpi_init(auStack_1a0);
  mbedtls_mpi_init(auStack_1f0);
  mbedtls_mpi_init(auStack_1e0);
  mbedtls_mpi_init(auStack_1d0);
  mbedtls_mpi_init(auStack_200);
  param1 = mbedtls_ecp_group_load(local_190,1);
  if (param1 == 0) {
    if (param_1 != 0) {
      printf("  ECP SW test #1 (constant op_count, base point G): ");
    }
    param1 = mbedtls_mpi_lset(auStack_200,2);
    if (param1 == 0) {
      param1 = FUN_00b923c4(local_190,auStack_1f0,auStack_200,auStack_158,&LAB_00b94e44,0);
      if ((param1 == 0) &&
         (param1 = FUN_00b94e7c(param_1,local_190,auStack_1c0,auStack_200,auStack_158,&local_a0),
         param1 == 0)) {
        if (param_1 != 0) {
          printf("  ECP SW test #2 (constant op_count, other point): ");
        }
        param1 = FUN_00b94e7c(param_1,local_190,auStack_1c0,auStack_200,auStack_1f0,&local_a0);
        if (param1 == 0) {
          mbedtls_ecp_group_free(local_190);
          mbedtls_mpi_free(auStack_1c0);
          mbedtls_mpi_free(auStack_1b0);
          mbedtls_mpi_free(auStack_1a0);
          if (param_1 != 0) {
            printf("  ECP Montgomery test (constant op_count): ");
          }
          param1 = mbedtls_ecp_group_load(local_190,9);
          if (param1 == 0) {
            param1 = FUN_00b94e7c(param_1,local_190,auStack_1c0,auStack_200,auStack_158,&local_d0);
          }
        }
      }
    }
  }
  if ((param_1 != 0) && ((int)param1 < 0)) {
    printf("Unexpected error, return code = %08X\n",param1);
  }
  mbedtls_ecp_group_free(local_190);
  mbedtls_mpi_free(auStack_1c0);
  mbedtls_mpi_free(auStack_1b0);
  mbedtls_mpi_free(auStack_1a0);
  mbedtls_mpi_free(auStack_1f0);
  mbedtls_mpi_free(auStack_1e0);
  mbedtls_mpi_free(auStack_1d0);
  uVar3 = mbedtls_mpi_free(auStack_200);
  if (param_1 != 0) {
    uVar2 = putchar(10);
    uVar3 = (ulong)uVar2;
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return param1;
}

