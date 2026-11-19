/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba156c
 */

bool mbedtls_ecjpake_self_test(int param_1)

{
  long lVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  bool bVar4;
  int iVar5;
  uint uVar6;
  uint uVar7;
  long lVar8;
  ulong uVar9;
  undefined *puVar10;
  undefined *puVar11;
  size_t local_6b0;
  size_t local_6a8;
  undefined4 local_6a0 [2];
  undefined1 auStack_698 [56];
  undefined1 auStack_660 [136];
  int local_5d8;
  undefined4 local_5d4;
  undefined1 auStack_5d0 [48];
  undefined1 auStack_5a0 [48];
  undefined1 auStack_570 [48];
  undefined1 auStack_540 [48];
  undefined1 auStack_510 [48];
  undefined1 auStack_4e0 [16];
  undefined1 auStack_4d0 [16];
  undefined1 auStack_4c0 [16];
  undefined4 local_4b0 [2];
  undefined1 auStack_4a8 [56];
  undefined1 auStack_470 [136];
  int local_3e8;
  undefined4 local_3e4;
  undefined1 auStack_3e0 [48];
  undefined1 auStack_3b0 [48];
  undefined1 auStack_380 [48];
  undefined1 auStack_350 [48];
  undefined1 auStack_320 [48];
  undefined1 auStack_2f0 [16];
  undefined1 auStack_2e0 [16];
  undefined1 auStack_2d0 [16];
  undefined *local_2c0 [6];
  undefined1 auStack_290 [32];
  undefined1 auStack_270 [512];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  local_4b0[0] = 0;
  mbedtls_ecp_group_init(auStack_4a8);
  local_3e4 = 0;
  mbedtls_ecp_point_init();
  mbedtls_ecp_point_init(auStack_3b0);
  mbedtls_ecp_point_init(auStack_380);
  mbedtls_ecp_point_init(auStack_350);
  mbedtls_ecp_point_init(auStack_320);
  mbedtls_mpi_init(auStack_2f0);
  mbedtls_mpi_init(auStack_2e0);
  mbedtls_mpi_init(auStack_2d0);
  local_6a0[0] = 0;
  mbedtls_ecp_group_init();
  local_5d4 = 0;
  mbedtls_ecp_point_init();
  mbedtls_ecp_point_init();
  mbedtls_ecp_point_init();
  mbedtls_ecp_point_init();
  mbedtls_ecp_point_init();
  mbedtls_mpi_init();
  mbedtls_mpi_init();
  mbedtls_mpi_init();
  if (param_1 != 0) {
    printf("  ECJPAKE test #0 (setup): ");
  }
  local_3e8 = 0;
  lVar8 = mbedtls_md_info_from_type(9);
  if (lVar8 != 0) {
    local_4b0[0] = 9;
    iVar5 = mbedtls_ecp_group_load(auStack_4a8,3);
    if ((iVar5 == 0) && (iVar5 = mbedtls_mpi_read_binary(auStack_2d0,&DAT_00787acd,0xf), iVar5 == 0)
       ) {
      local_5d8 = 1;
      lVar8 = mbedtls_md_info_from_type(9);
      uVar6 = 1;
      if (lVar8 == 0) goto LAB_00ba1fb8;
      local_6a0[0] = 9;
      iVar5 = mbedtls_ecp_group_load(auStack_698,3);
      if ((iVar5 == 0) &&
         (iVar5 = mbedtls_mpi_read_binary(auStack_4c0,&DAT_00787acd,0xf), iVar5 == 0)) {
        if (param_1 != 0) {
          puts("passed");
          printf("  ECJPAKE test #1 (random handshake): ");
        }
        iVar5 = mbedtls_ecjpake_write_round_one
                          (local_4b0,auStack_270,0x200,&local_6a8,FUN_00ba1fc4,0);
        uVar3 = local_5d4;
        uVar2 = local_6a0[0];
        uVar7 = 1;
        if (iVar5 != 0) goto LAB_00ba17d4;
        puVar10 = (&PTR_s_client_00cab448)[1 - local_5d8];
        local_2c0[0] = auStack_270;
        puVar11 = local_2c0[0] + local_6a8;
        iVar5 = FUN_00ba0b44(local_6a0[0],auStack_698,local_5d4,auStack_660,auStack_570,puVar10,
                             local_2c0,puVar11);
        if ((iVar5 == 0) &&
           (((iVar5 = FUN_00ba0b44(uVar2,auStack_698,uVar3,auStack_660,auStack_540,puVar10,local_2c0
                                   ,puVar11), iVar5 != 0 || (local_2c0[0] == puVar11)) &&
            (iVar5 == 0)))) {
          iVar5 = mbedtls_ecjpake_write_round_one
                            (local_6a0,auStack_270,0x200,&local_6a8,FUN_00ba1fc4,0);
          uVar3 = local_3e4;
          uVar2 = local_4b0[0];
          uVar7 = 1;
          if (iVar5 != 0) goto LAB_00ba17d4;
          puVar10 = (&PTR_s_client_00cab448)[1 - local_3e8];
          local_2c0[0] = auStack_270;
          puVar11 = local_2c0[0] + local_6a8;
          iVar5 = FUN_00ba0b44(local_4b0[0],auStack_4a8,local_3e4,auStack_470,auStack_380,puVar10,
                               local_2c0,puVar11);
          if ((((iVar5 == 0) &&
               ((iVar5 = FUN_00ba0b44(uVar2,auStack_4a8,uVar3,auStack_470,auStack_350,puVar10,
                                      local_2c0,puVar11), iVar5 != 0 || (local_2c0[0] == puVar11))))
              && (iVar5 == 0)) &&
             (((iVar5 = mbedtls_ecjpake_write_round_two
                                  (local_6a0,auStack_270,0x200,&local_6a8,FUN_00ba1fc4,0),
               iVar5 == 0 &&
               (iVar5 = mbedtls_ecjpake_read_round_two(local_4b0,auStack_270,local_6a8), iVar5 == 0)
               ) && ((iVar5 = mbedtls_ecjpake_derive_secret
                                        (local_4b0,auStack_290,0x20,&local_6b0,FUN_00ba1fc4,0),
                     iVar5 == 0 &&
                     ((((iVar5 = mbedtls_ecjpake_write_round_two
                                           (local_4b0,auStack_270,0x200,&local_6a8,FUN_00ba1fc4,0),
                        iVar5 == 0 &&
                        (iVar5 = mbedtls_ecjpake_read_round_two(local_6a0,auStack_270,local_6a8),
                        iVar5 == 0)) &&
                       (iVar5 = mbedtls_ecjpake_derive_secret
                                          (local_6a0,auStack_270,0x200,&local_6a8,FUN_00ba1fc4,0),
                       iVar5 == 0)) &&
                      ((local_6a8 == local_6b0 &&
                       (iVar5 = memcmp(auStack_270,auStack_290,local_6a8), iVar5 == 0)))))))))) {
            if (param_1 != 0) {
              puts("passed");
              printf("  ECJPAKE test #2 (reference handshake): ");
            }
            uVar7 = mbedtls_mpi_read_binary(auStack_2f0,&DAT_00787adc,0x20);
            if ((((uVar7 != 0) ||
                 (uVar7 = mbedtls_mpi_read_binary(auStack_2e0,&DAT_00787afc,0x20), uVar7 != 0)) ||
                ((uVar7 = mbedtls_ecp_mul(auStack_4a8,auStack_3e0,auStack_2f0,auStack_470,
                                          &LAB_00ba226c,0), uVar7 != 0 ||
                 (((uVar7 = mbedtls_ecp_mul(auStack_4a8,auStack_3b0,auStack_2e0,auStack_470,
                                            &LAB_00ba226c,0), uVar7 != 0 ||
                   (uVar7 = mbedtls_mpi_read_binary(auStack_4e0,&DAT_00787b1c,0x20), uVar7 != 0)) ||
                  (uVar7 = mbedtls_mpi_read_binary(auStack_4d0,&DAT_00787b3c,0x20), uVar7 != 0))))))
               || ((uVar7 = mbedtls_ecp_mul(auStack_698,auStack_5d0,auStack_4e0,auStack_660,
                                            &LAB_00ba226c,0), uVar7 != 0 ||
                   (uVar7 = mbedtls_ecp_mul(auStack_698,auStack_5a0,auStack_4d0,auStack_660,
                                            &LAB_00ba226c,0), uVar3 = local_5d4,
                   uVar2 = local_6a0[0], uVar7 != 0)))) goto LAB_00ba17d4;
            puVar11 = (&PTR_s_client_00cab448)[1 - local_5d8];
            local_2c0[0] = &DAT_00787b5c;
            iVar5 = FUN_00ba0b44(local_6a0[0],auStack_698,local_5d4,auStack_660,auStack_570,puVar11,
                                 local_2c0,&DAT_00787ca6);
            if ((iVar5 == 0) &&
               ((iVar5 = FUN_00ba0b44(uVar2,auStack_698,uVar3,auStack_660,auStack_540,puVar11,
                                      local_2c0,&DAT_00787ca6), uVar3 = local_3e4,
                uVar2 = local_4b0[0], iVar5 != 0 || (local_2c0[0] == &DAT_00787ca6)))) {
              uVar7 = 1;
              if (iVar5 != 0) goto LAB_00ba17d4;
              puVar11 = (&PTR_s_client_00cab448)[1 - local_3e8];
              local_2c0[0] = &DAT_00787ca6;
              iVar5 = FUN_00ba0b44(local_4b0[0],auStack_4a8,local_3e4,auStack_470,auStack_380,
                                   puVar11,local_2c0,&DAT_00787df0);
              if (((iVar5 == 0) &&
                  (((iVar5 = FUN_00ba0b44(uVar2,auStack_4a8,uVar3,auStack_470,auStack_350,puVar11,
                                          local_2c0,&DAT_00787df0), iVar5 != 0 ||
                    (local_2c0[0] == &DAT_00787df0)) && (iVar5 == 0)))) &&
                 ((iVar5 = mbedtls_ecjpake_read_round_two(local_4b0,&DAT_00787df0,0xa8), iVar5 == 0
                  && (iVar5 = mbedtls_ecjpake_read_round_two(local_6a0,&DAT_00787e98,0xa5),
                     iVar5 == 0)))) {
                iVar5 = mbedtls_ecjpake_derive_secret
                                  (local_6a0,auStack_270,0x200,&local_6a8,FUN_00ba1fc4,0);
                uVar7 = 1;
                uVar6 = 1;
                if (iVar5 == 0) {
                  if (local_6a8 != 0x20) goto LAB_00ba17d4;
                  iVar5 = memcmp(auStack_270,&DAT_00787f3d,0x20);
                  if (iVar5 != 0) goto LAB_00ba17d0;
                  mbedtls_ecp_point_init(local_2c0);
                  iVar5 = FUN_00ba1398(local_6a0,local_2c0,FUN_00ba1fc4,0);
                  if (iVar5 == 0) {
                    iVar5 = mbedtls_ecp_point_write_binary
                                      (auStack_698,local_2c0,local_5d4,&local_6a8,auStack_270,0x200)
                    ;
                  }
                  mbedtls_ecp_point_free(local_2c0);
                  uVar7 = 1;
                  uVar6 = 1;
                  if (iVar5 == 0) {
                    if (local_6a8 != 0x41) goto LAB_00ba17d4;
                    iVar5 = memcmp(auStack_270,&DAT_00787f5d,0x41);
                    if (iVar5 != 0) goto LAB_00ba17d0;
                    memset(auStack_270,0,0x41);
                    iVar5 = mbedtls_ecjpake_derive_secret
                                      (local_4b0,auStack_270,0x200,&local_6a8,FUN_00ba1fc4,0);
                    uVar7 = 1;
                    uVar6 = 1;
                    if (iVar5 == 0) {
                      if (local_6a8 != 0x20) goto LAB_00ba17d4;
                      iVar5 = memcmp(auStack_270,&DAT_00787f3d,0x20);
                      if (iVar5 != 0) goto LAB_00ba17d0;
                      mbedtls_ecp_point_init(local_2c0);
                      iVar5 = FUN_00ba1398(local_4b0,local_2c0,FUN_00ba1fc4,0);
                      if (iVar5 == 0) {
                        iVar5 = mbedtls_ecp_point_write_binary
                                          (auStack_4a8,local_2c0,local_3e4,&local_6a8,auStack_270,
                                           0x200);
                      }
                      mbedtls_ecp_point_free(local_2c0);
                      uVar7 = 1;
                      uVar6 = 1;
                      if (iVar5 == 0) {
                        if (local_6a8 != 0x41) goto LAB_00ba17d4;
                        iVar5 = memcmp(auStack_270,&DAT_00787f5d,0x41);
                        uVar6 = (uint)(iVar5 != 0);
                        if (iVar5 == 0) {
                          uVar7 = 0;
                          if (param_1 != 0) {
                            puts("passed");
                            uVar7 = 0;
                          }
                          goto LAB_00ba17d4;
                        }
                      }
                    }
                  }
                }
LAB_00ba1fb8:
                uVar7 = uVar6;
                goto LAB_00ba17d4;
              }
            }
          }
        }
      }
      else {
        local_6a0[0] = 0;
        mbedtls_ecp_group_free(auStack_698);
        mbedtls_ecp_point_free(auStack_5d0);
        mbedtls_ecp_point_free(auStack_5a0);
        mbedtls_ecp_point_free(auStack_570);
        mbedtls_ecp_point_free(auStack_540);
        mbedtls_ecp_point_free(auStack_510);
        mbedtls_mpi_free(auStack_4e0);
        mbedtls_mpi_free(auStack_4d0);
        mbedtls_mpi_free(auStack_4c0);
      }
    }
    else {
      local_4b0[0] = 0;
      mbedtls_ecp_group_free(auStack_4a8);
      mbedtls_ecp_point_free(auStack_3e0);
      mbedtls_ecp_point_free(auStack_3b0);
      mbedtls_ecp_point_free(auStack_380);
      mbedtls_ecp_point_free(auStack_350);
      mbedtls_ecp_point_free(auStack_320);
      mbedtls_mpi_free(auStack_2f0);
      mbedtls_mpi_free(auStack_2e0);
      mbedtls_mpi_free(auStack_2d0);
    }
  }
LAB_00ba17d0:
  uVar7 = 1;
LAB_00ba17d4:
  local_4b0[0] = 0;
  mbedtls_ecp_group_free(auStack_4a8);
  mbedtls_ecp_point_free(auStack_3e0);
  mbedtls_ecp_point_free(auStack_3b0);
  mbedtls_ecp_point_free(auStack_380);
  mbedtls_ecp_point_free(auStack_350);
  mbedtls_ecp_point_free(auStack_320);
  mbedtls_mpi_free(auStack_2f0);
  mbedtls_mpi_free(auStack_2e0);
  mbedtls_mpi_free(auStack_2d0);
  local_6a0[0] = 0;
  mbedtls_ecp_group_free(auStack_698);
  mbedtls_ecp_point_free(auStack_5d0);
  mbedtls_ecp_point_free(auStack_5a0);
  mbedtls_ecp_point_free(auStack_570);
  mbedtls_ecp_point_free(auStack_540);
  mbedtls_ecp_point_free(auStack_510);
  mbedtls_mpi_free(auStack_4e0);
  mbedtls_mpi_free(auStack_4d0);
  uVar9 = mbedtls_mpi_free(auStack_4c0);
  bVar4 = uVar7 != 0;
  if ((uVar7 != 0) && (param_1 != 0)) {
    uVar6 = puts("failed");
    uVar9 = (ulong)uVar6;
    bVar4 = true;
  }
  if (param_1 != 0) {
    uVar6 = putchar(10);
    uVar9 = (ulong)uVar6;
  }
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar9);
  }
  return bVar4;
}

