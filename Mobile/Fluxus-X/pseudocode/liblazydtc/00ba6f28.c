/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6f28
 */

void mbedtls_rsa_private(long param_1,long param_2,undefined8 param_3,undefined8 param_4,
                        undefined8 param_5)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  long *plVar7;
  ulong uVar8;
  long lVar9;
  uint uVar10;
  undefined1 auStack_130 [16];
  undefined1 auStack_120 [16];
  undefined1 auStack_110 [16];
  undefined1 auStack_100 [16];
  undefined1 auStack_f0 [16];
  undefined1 auStack_e0 [16];
  undefined1 auStack_d0 [16];
  undefined1 auStack_c0 [16];
  undefined1 auStack_b0 [16];
  undefined8 local_a0 [2];
  undefined8 local_90 [2];
  undefined8 local_80 [2];
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  if ((param_2 == 0) || (iVar4 = FUN_00ba6554(param_1,1), iVar4 != 0)) {
    iVar4 = -0x4080;
  }
  else {
    mbedtls_mpi_init(local_a0);
    mbedtls_mpi_init(auStack_b0);
    mbedtls_mpi_init(auStack_c0);
    mbedtls_mpi_init(auStack_d0);
    mbedtls_mpi_init(auStack_100);
    mbedtls_mpi_init(auStack_110);
    mbedtls_mpi_init(auStack_e0);
    mbedtls_mpi_init(auStack_f0);
    mbedtls_mpi_init(auStack_120);
    mbedtls_mpi_init(auStack_130);
    iVar5 = mbedtls_mpi_read_binary(local_a0,param_4,*(undefined8 *)(param_1 + 8));
    if (iVar5 == 0) {
      puVar1 = (undefined8 *)(param_1 + 0x10);
      iVar4 = mbedtls_mpi_cmp_mpi(local_a0,puVar1);
      if (iVar4 < 0) {
        mbedtls_mpi_init(local_80);
        plVar7 = (long *)(param_1 + 0xd0);
        lVar9 = param_1 + 0xc0;
        if (*plVar7 == 0) {
          uVar10 = 0xffffffff;
          do {
            uVar10 = uVar10 + 1;
            if (10 < uVar10) {
              iVar5 = -0x4480;
              goto LAB_00ba7170;
            }
            iVar5 = mbedtls_mpi_fill_random(plVar7,*(long *)(param_1 + 8) + -1,param_2,param_3);
            if ((((iVar5 != 0) ||
                 (iVar5 = mbedtls_mpi_fill_random
                                    (local_80,*(long *)(param_1 + 8) + -1,param_2,param_3),
                 iVar5 != 0)) || (iVar5 = mbedtls_mpi_mul_mpi(lVar9,plVar7,local_80), iVar5 != 0))
               || (iVar5 = mbedtls_mpi_mod_mpi(lVar9,lVar9,puVar1), iVar5 != 0)) goto LAB_00ba7170;
            iVar5 = mbedtls_mpi_inv_mod(lVar9,lVar9,puVar1);
          } while (iVar5 == -0xe);
          if (((iVar5 == 0) && (iVar5 = mbedtls_mpi_mul_mpi(lVar9,lVar9,local_80), iVar5 == 0)) &&
             (iVar5 = mbedtls_mpi_mod_mpi(lVar9,lVar9,puVar1), iVar5 == 0)) {
            iVar5 = mbedtls_mpi_exp_mod(lVar9,lVar9,param_1 + 0x20,puVar1,param_1 + 0x90);
          }
        }
        else {
          iVar5 = mbedtls_mpi_mul_mpi(lVar9,lVar9,lVar9);
          if (((iVar5 == 0) && (iVar5 = mbedtls_mpi_mod_mpi(lVar9,lVar9,puVar1), iVar5 == 0)) &&
             (iVar5 = mbedtls_mpi_mul_mpi(plVar7,plVar7,plVar7), iVar5 == 0)) {
            iVar5 = mbedtls_mpi_mod_mpi(plVar7,plVar7,puVar1);
          }
        }
LAB_00ba7170:
        mbedtls_mpi_free(local_80);
        if ((((iVar5 == 0) && (iVar5 = mbedtls_mpi_mul_mpi(local_a0,local_a0,lVar9), iVar5 == 0)) &&
            (iVar5 = mbedtls_mpi_mod_mpi(local_a0,local_a0,puVar1), iVar5 == 0)) &&
           (iVar5 = mbedtls_mpi_copy(auStack_120,local_a0), iVar5 == 0)) {
          lVar9 = param_1 + 0x40;
          iVar5 = mbedtls_mpi_sub_int(auStack_b0,lVar9,1);
          if (iVar5 == 0) {
            lVar2 = param_1 + 0x50;
            iVar5 = mbedtls_mpi_sub_int(auStack_c0,lVar2,1);
            if ((((iVar5 == 0) &&
                 (iVar5 = mbedtls_mpi_fill_random(auStack_d0,0x1c,param_2,param_3), iVar5 == 0)) &&
                ((iVar5 = mbedtls_mpi_mul_mpi(auStack_100,auStack_b0,auStack_d0), iVar5 == 0 &&
                 ((iVar5 = mbedtls_mpi_add_mpi(auStack_100,auStack_100,param_1 + 0x60), iVar5 == 0
                  && (iVar5 = mbedtls_mpi_fill_random(auStack_d0,0x1c,param_2,param_3), iVar5 == 0))
                 )))) && ((iVar5 = mbedtls_mpi_mul_mpi(auStack_110,auStack_c0,auStack_d0),
                          iVar5 == 0 &&
                          ((((((iVar5 = mbedtls_mpi_add_mpi(auStack_110,auStack_110,param_1 + 0x70),
                               iVar5 == 0 &&
                               (iVar5 = mbedtls_mpi_exp_mod(auStack_e0,local_a0,auStack_100,lVar9,
                                                            param_1 + 0xa0), iVar5 == 0)) &&
                              (iVar5 = mbedtls_mpi_exp_mod(auStack_f0,local_a0,auStack_110,lVar2,
                                                           param_1 + 0xb0), iVar5 == 0)) &&
                             ((iVar5 = mbedtls_mpi_sub_mpi(local_a0,auStack_e0,auStack_f0),
                              iVar5 == 0 &&
                              (iVar5 = mbedtls_mpi_mul_mpi(auStack_e0,local_a0,param_1 + 0x80),
                              iVar5 == 0)))) &&
                            ((iVar5 = mbedtls_mpi_mod_mpi(local_a0,auStack_e0,lVar9), iVar5 == 0 &&
                             ((iVar5 = mbedtls_mpi_mul_mpi(auStack_e0,local_a0,lVar2), iVar5 == 0 &&
                              (iVar5 = mbedtls_mpi_add_mpi(local_a0,auStack_f0,auStack_e0),
                              iVar5 == 0)))))) &&
                           (iVar5 = mbedtls_mpi_exp_mod(auStack_130,local_a0,param_1 + 0x20,puVar1,
                                                        param_1 + 0x90), iVar5 == 0)))))) {
              iVar4 = mbedtls_mpi_cmp_mpi(auStack_130,auStack_120);
              if (iVar4 == 0) {
                uVar6 = mbedtls_mpi_core_montmul_init(*(undefined8 *)(param_1 + 0x10));
                uVar8 = (ulong)*(ushort *)(param_1 + 0x1a);
                mbedtls_mpi_init(local_80);
                mbedtls_mpi_init(local_90);
                iVar5 = mbedtls_mpi_core_get_mont_r2_unsafe(local_80,puVar1);
                if ((((iVar5 == 0) &&
                     (iVar5 = mbedtls_mpi_grow(local_90,uVar8 << 1 | 1), iVar5 == 0)) &&
                    (iVar5 = mbedtls_mpi_grow(local_a0,uVar8), iVar5 == 0)) &&
                   (iVar5 = mbedtls_mpi_grow(plVar7,uVar8), iVar5 == 0)) {
                  mbedtls_mpi_core_to_mont_rep
                            (local_a0[0],local_a0[0],*puVar1,uVar8,uVar6,local_80[0],local_90[0]);
                  mbedtls_mpi_core_montmul
                            (local_a0[0],local_a0[0],*plVar7,uVar8,*puVar1,uVar8,uVar6,local_90[0]);
                }
                mbedtls_mpi_free(local_80);
                mbedtls_mpi_free(local_90);
                if (iVar5 == 0) {
                  iVar5 = mbedtls_mpi_write_binary(local_a0,param_5,*(undefined8 *)(param_1 + 8));
                }
              }
              else {
                iVar5 = -0x4380;
              }
            }
          }
        }
      }
      else {
        iVar5 = -4;
      }
    }
    mbedtls_mpi_free(auStack_b0);
    mbedtls_mpi_free(auStack_c0);
    mbedtls_mpi_free(auStack_d0);
    mbedtls_mpi_free(auStack_100);
    mbedtls_mpi_free(auStack_110);
    mbedtls_mpi_free(local_a0);
    mbedtls_mpi_free(auStack_e0);
    mbedtls_mpi_free(auStack_f0);
    mbedtls_mpi_free(auStack_130);
    mbedtls_mpi_free(auStack_120);
    iVar4 = iVar5 + -0x4300;
    if (iVar5 < -0x7f || iVar5 == 0) {
      iVar4 = iVar5;
    }
  }
  if (*(long *)(lVar3 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar4);
  }
  return;
}

