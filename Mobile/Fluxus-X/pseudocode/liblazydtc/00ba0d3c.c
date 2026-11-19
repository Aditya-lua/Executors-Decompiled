/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba0d3c
 */

int mbedtls_ecjpake_write_round_two
              (undefined4 *param_1,ulong param_2,long param_3,long *param_4,undefined8 param_5,
              undefined8 param_6)

{
  undefined4 *puVar1;
  ulong uVar2;
  long lVar3;
  int iVar4;
  ulong uVar5;
  ulong local_f8;
  undefined1 auStack_f0 [16];
  undefined1 auStack_e0 [48];
  undefined1 auStack_b0 [48];
  long local_80 [2];
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  local_f8 = param_2;
  mbedtls_ecp_point_init(auStack_b0);
  mbedtls_ecp_point_init(auStack_e0);
  mbedtls_mpi_init(auStack_f0);
  puVar1 = param_1 + 2;
  mbedtls_mpi_init(local_80);
  iVar4 = mbedtls_mpi_lset(local_80,1);
  if (iVar4 == 0) {
    iVar4 = mbedtls_ecp_muladd(puVar1,auStack_b0,local_80,param_1 + 0x4c,local_80,param_1 + 0x58);
    if (iVar4 == 0) {
      iVar4 = mbedtls_ecp_muladd(puVar1,auStack_b0,local_80,auStack_b0,local_80,param_1 + 0x34);
    }
  }
  mbedtls_mpi_free(local_80);
  if (iVar4 != 0) goto LAB_00ba0f1c;
  iVar4 = FUN_00ba0f6c(auStack_f0,1,param_1 + 0x74,param_1 + 0x78,param_1 + 0x1c,param_5,param_6);
  if (iVar4 != 0) goto LAB_00ba0f1c;
  iVar4 = mbedtls_ecp_mul(puVar1,auStack_e0,auStack_f0,auStack_b0,param_5,param_6);
  if (iVar4 != 0) goto LAB_00ba0f1c;
  uVar5 = param_2;
  if (param_1[0x32] == 1) {
    if (-1 < param_3) {
      iVar4 = mbedtls_ecp_tls_write_group(puVar1,local_80,param_2,param_3);
      if (iVar4 != 0) goto LAB_00ba0f1c;
      uVar5 = param_2 + local_80[0];
      local_f8 = uVar5;
      goto LAB_00ba0e94;
    }
  }
  else {
LAB_00ba0e94:
    uVar2 = param_2 + param_3;
    if (uVar5 <= uVar2) {
      iVar4 = mbedtls_ecp_tls_write_point
                        (puVar1,auStack_e0,param_1[0x33],local_80,uVar5,uVar2 - uVar5);
      if (iVar4 == 0) {
        local_f8 = uVar5 + local_80[0];
        iVar4 = FUN_00ba1078(*param_1,puVar1,param_1[0x33],auStack_b0,auStack_f0,auStack_e0,
                             (&PTR_s_client_00cab448)[(uint)param_1[0x32]],&local_f8,uVar2,param_5,
                             param_6);
        if (iVar4 == 0) {
          *param_4 = local_f8 - param_2;
        }
      }
      goto LAB_00ba0f1c;
    }
  }
  iVar4 = -0x4f00;
LAB_00ba0f1c:
  mbedtls_ecp_point_free(auStack_b0);
  mbedtls_ecp_point_free(auStack_e0);
  mbedtls_mpi_free(auStack_f0);
  if (*(long *)(lVar3 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

