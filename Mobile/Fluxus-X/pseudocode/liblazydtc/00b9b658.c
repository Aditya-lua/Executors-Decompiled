/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9b658
 */

int mbedtls_ecdsa_sign_restartable
              (uint *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
              undefined8 param_5,ulong param_6,undefined8 param_7,undefined8 param_8,
              undefined8 param_9,undefined8 param_10)

{
  long lVar1;
  long lVar2;
  int iVar3;
  uint uVar4;
  ulong uVar5;
  uint uVar6;
  uint *puVar7;
  undefined1 auStack_d0 [16];
  undefined1 auStack_c0 [16];
  undefined1 auStack_b0 [16];
  undefined1 auStack_a0 [48];
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  if ((*param_1 | 4) != 0xd) {
    puVar7 = param_1 + 0x1a;
    if (*(long *)puVar7 != 0) {
      iVar3 = mbedtls_mpi_cmp_int(param_4,1);
      if ((iVar3 < 0) || (iVar3 = mbedtls_mpi_cmp_mpi(param_4,puVar7), -1 < iVar3)) {
        iVar3 = -0x4c80;
      }
      else {
        mbedtls_ecp_point_init(auStack_a0);
        mbedtls_mpi_init(auStack_b0);
        mbedtls_mpi_init(auStack_c0);
        mbedtls_mpi_init(auStack_d0);
        uVar4 = 0;
        do {
          if (10 < uVar4) {
LAB_00b9b958:
            iVar3 = -0x4d00;
            goto LAB_00b9b95c;
          }
          uVar4 = uVar4 + 1;
          uVar6 = 0xffffffff;
          do {
            uVar6 = uVar6 + 1;
            if (10 < uVar6) goto LAB_00b9b958;
            iVar3 = mbedtls_ecp_gen_privkey(param_1,auStack_b0,param_7,param_8);
            if (iVar3 != 0) goto LAB_00b9b95c;
            iVar3 = mbedtls_ecp_mul_restartable
                              (param_1,auStack_a0,auStack_b0,param_1 + 0xe,param_9,param_10,0);
            if (iVar3 != 0) goto LAB_00b9b95c;
            iVar3 = mbedtls_mpi_mod_mpi(param_2,auStack_a0,puVar7);
            if (iVar3 != 0) goto LAB_00b9b95c;
            iVar3 = mbedtls_mpi_cmp_int(param_2,0);
          } while (iVar3 == 0);
          uVar5 = *(long *)(param_1 + 0x20) + 7U >> 3;
          if (param_6 <= uVar5) {
            uVar5 = param_6;
          }
          iVar3 = mbedtls_mpi_read_binary(auStack_c0,param_5);
          if (iVar3 != 0) goto LAB_00b9b95c;
          lVar1 = uVar5 * 8 - *(ulong *)(param_1 + 0x20);
          if (*(ulong *)(param_1 + 0x20) <= uVar5 * 8 && lVar1 != 0) {
            iVar3 = mbedtls_mpi_shift_r(auStack_c0,lVar1);
            if (iVar3 != 0) goto LAB_00b9b95c;
          }
          iVar3 = mbedtls_mpi_cmp_mpi(auStack_c0,puVar7);
          if (-1 < iVar3) {
            iVar3 = mbedtls_mpi_sub_mpi(auStack_c0,auStack_c0,puVar7);
            if (iVar3 != 0) goto LAB_00b9b95c;
          }
          iVar3 = mbedtls_ecp_gen_privkey(param_1,auStack_d0,param_9,param_10);
          if (iVar3 != 0) goto LAB_00b9b95c;
          iVar3 = mbedtls_mpi_mul_mpi(param_3,param_2,param_4);
          if (iVar3 != 0) goto LAB_00b9b95c;
          iVar3 = mbedtls_mpi_add_mpi(auStack_c0,auStack_c0,param_3);
          if (iVar3 != 0) goto LAB_00b9b95c;
          iVar3 = mbedtls_mpi_mul_mpi(auStack_c0,auStack_c0,auStack_d0);
          if (iVar3 != 0) goto LAB_00b9b95c;
          iVar3 = mbedtls_mpi_mul_mpi(auStack_b0,auStack_b0,auStack_d0);
          if (iVar3 != 0) goto LAB_00b9b95c;
          iVar3 = mbedtls_mpi_mod_mpi(auStack_b0,auStack_b0,puVar7);
          if (iVar3 != 0) goto LAB_00b9b95c;
          iVar3 = mbedtls_mpi_inv_mod(param_3,auStack_b0,puVar7);
          if (iVar3 != 0) goto LAB_00b9b95c;
          iVar3 = mbedtls_mpi_mul_mpi(param_3,param_3,auStack_c0);
          if (iVar3 != 0) goto LAB_00b9b95c;
          iVar3 = mbedtls_mpi_mod_mpi(param_3,param_3,puVar7);
          if (iVar3 != 0) goto LAB_00b9b95c;
          iVar3 = mbedtls_mpi_cmp_int(param_3,0);
        } while (iVar3 == 0);
        iVar3 = 0;
LAB_00b9b95c:
        mbedtls_ecp_point_free(auStack_a0);
        mbedtls_mpi_free(auStack_b0);
        mbedtls_mpi_free(auStack_c0);
        mbedtls_mpi_free(auStack_d0);
      }
      goto LAB_00b9b6b4;
    }
  }
  iVar3 = -0x4f80;
LAB_00b9b6b4:
  if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

