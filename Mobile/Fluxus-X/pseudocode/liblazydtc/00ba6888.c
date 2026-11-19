/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6888
 */

void mbedtls_rsa_gen_key(long param_1,undefined8 param_2,undefined8 param_3,uint param_4,int param_5
                        )

{
  bool bVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  uint uVar7;
  long lVar8;
  int iVar9;
  int iVar10;
  ulong uVar11;
  undefined8 uVar12;
  undefined1 auStack_98 [16];
  undefined1 auStack_88 [16];
  undefined1 auStack_78 [8];
  short local_70;
  long local_68;
  
  lVar8 = tpidr_el0;
  local_68 = *(long *)(lVar8 + 0x28);
  mbedtls_mpi_init(auStack_78);
  mbedtls_mpi_init(auStack_88);
  mbedtls_mpi_init(auStack_98);
  bVar1 = 0x400 < param_4;
  iVar9 = -0x4080;
  if (((0x3ff < param_4) && ((param_4 & 1) == 0)) && (2 < param_5)) {
    lVar2 = param_1 + 0x20;
    iVar9 = mbedtls_mpi_lset(lVar2,(long)param_5);
    if (iVar9 == 0) {
      lVar3 = param_1 + 0x40;
      uVar7 = param_4 >> 1;
      iVar9 = mbedtls_mpi_gen_prime(lVar3,uVar7,(ulong)bVar1 << 1,param_2,param_3);
      if (iVar9 == 0) {
        lVar4 = param_1 + 0x30;
        lVar5 = param_1 + 0x50;
        do {
          iVar9 = mbedtls_mpi_gen_prime(lVar5,uVar7,(ulong)bVar1 << 1,param_2,param_3);
          if ((iVar9 != 0) || (iVar9 = mbedtls_mpi_sub_mpi(auStack_78,lVar3,lVar5), iVar9 != 0))
          break;
          uVar11 = mbedtls_mpi_bitlen(auStack_78);
          if (uVar7 - 99 < uVar11) {
            if (local_70 < 0) {
              mbedtls_mpi_swap(lVar3,lVar5);
            }
            iVar9 = mbedtls_mpi_sub_int(lVar3,lVar3,1);
            if (((iVar9 != 0) || (iVar9 = mbedtls_mpi_sub_int(lVar5,lVar5,1), iVar9 != 0)) ||
               ((iVar9 = mbedtls_mpi_mul_mpi(auStack_78,lVar3,lVar5), iVar9 != 0 ||
                (iVar9 = mbedtls_mpi_gcd(auStack_88,lVar2,auStack_78), iVar9 != 0)))) break;
            iVar9 = mbedtls_mpi_cmp_int(auStack_88,1);
            if (iVar9 == 0) {
              iVar9 = mbedtls_mpi_gcd(auStack_88,lVar3,lVar5);
              if (((iVar9 != 0) ||
                  (iVar9 = mbedtls_mpi_div_mpi(auStack_98,0,auStack_78,auStack_88), iVar9 != 0)) ||
                 (iVar9 = mbedtls_mpi_inv_mod(lVar4,lVar2,auStack_98), iVar9 != 0)) break;
              uVar11 = mbedtls_mpi_bitlen(lVar4);
              if (param_4 + 1 >> 1 < uVar11) {
                iVar9 = mbedtls_mpi_add_int(lVar3,lVar3,1);
                if ((iVar9 == 0) && (iVar9 = mbedtls_mpi_add_int(lVar5,lVar5,1), iVar9 == 0)) {
                  lVar6 = param_1 + 0x10;
                  iVar9 = mbedtls_mpi_mul_mpi(lVar6,lVar3,lVar5);
                  if (iVar9 == 0) {
                    uVar12 = mbedtls_mpi_size(lVar6);
                    *(undefined8 *)(param_1 + 8) = uVar12;
                    iVar9 = mbedtls_rsa_deduce_crt
                                      (lVar3,lVar5,lVar4,param_1 + 0x60,param_1 + 0x70,
                                       param_1 + 0x80);
                    if (iVar9 == 0) {
                      iVar9 = mbedtls_rsa_check_pubkey(param_1);
                      if ((iVar9 == 0) && (iVar9 = FUN_00ba6554(param_1,1), iVar9 == 0)) {
                        iVar10 = mbedtls_rsa_validate_params(lVar6,lVar3,lVar5,lVar4,lVar2,0,0);
                        iVar9 = -0x4200;
                        if (iVar10 == 0) {
                          iVar10 = mbedtls_rsa_validate_crt
                                             (lVar3,lVar5,lVar4,param_1 + 0x60,param_1 + 0x70,
                                              param_1 + 0x80);
                          iVar9 = 0;
                          if (iVar10 != 0) {
                            iVar9 = -0x4200;
                          }
                        }
                      }
                      else {
                        iVar9 = -0x4200;
                      }
                    }
                  }
                }
                break;
              }
            }
          }
          iVar9 = mbedtls_mpi_gen_prime(lVar3,uVar7,(ulong)bVar1 << 1,param_2,param_3);
        } while (iVar9 == 0);
      }
    }
  }
  mbedtls_mpi_free(auStack_78);
  mbedtls_mpi_free(auStack_88);
  mbedtls_mpi_free(auStack_98);
  if (iVar9 == 0) {
    iVar10 = 0;
  }
  else {
    mbedtls_rsa_free(param_1);
    iVar10 = iVar9 + -0x4180;
    if (0x7f < (uint)-iVar9) {
      iVar10 = iVar9;
    }
  }
  if (*(long *)(lVar8 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar10);
  }
  return;
}

