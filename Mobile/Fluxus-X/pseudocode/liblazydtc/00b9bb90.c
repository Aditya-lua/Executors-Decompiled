/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9bb90
 */

int mbedtls_ecdsa_verify_restartable
              (uint *param_1,undefined8 param_2,ulong param_3,undefined8 param_4,undefined8 param_5,
              undefined8 param_6)

{
  long lVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  uint *puVar6;
  undefined1 auStack_c8 [48];
  undefined1 auStack_98 [16];
  undefined1 auStack_88 [16];
  undefined1 auStack_78 [16];
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  mbedtls_ecp_point_init(auStack_c8);
  mbedtls_mpi_init(auStack_68);
  mbedtls_mpi_init(auStack_78);
  mbedtls_mpi_init(auStack_88);
  mbedtls_mpi_init(auStack_98);
  if (((*param_1 | 4) == 0xd) || (puVar6 = param_1 + 0x1a, *(long *)puVar6 == 0)) {
    iVar3 = -0x4f80;
    goto LAB_00b9bc68;
  }
  iVar3 = mbedtls_mpi_cmp_int(param_5,1);
  if ((iVar3 < 0) ||
     (((iVar3 = mbedtls_mpi_cmp_mpi(param_5,puVar6), -1 < iVar3 ||
       (iVar3 = mbedtls_mpi_cmp_int(param_6,1), iVar3 < 0)) ||
      (iVar3 = mbedtls_mpi_cmp_mpi(param_6,puVar6), -1 < iVar3)))) {
LAB_00b9bc3c:
    iVar3 = -0x4e00;
  }
  else {
    uVar5 = *(long *)(param_1 + 0x20) + 7U >> 3;
    if (param_3 <= uVar5) {
      uVar5 = param_3;
    }
    iVar3 = mbedtls_mpi_read_binary(auStack_68,param_2,uVar5);
    if ((((iVar3 == 0) &&
         ((lVar1 = uVar5 * 8 - *(ulong *)(param_1 + 0x20),
          !(*(ulong *)(param_1 + 0x20) <= uVar5 * 8 && lVar1 != 0) ||
          (iVar3 = mbedtls_mpi_shift_r(auStack_68,lVar1), iVar3 == 0)))) &&
        ((iVar3 = mbedtls_mpi_cmp_mpi(auStack_68,puVar6), iVar3 < 0 ||
         (iVar3 = mbedtls_mpi_sub_mpi(auStack_68,auStack_68,puVar6), iVar3 == 0)))) &&
       (((iVar3 = mbedtls_mpi_inv_mod(auStack_78,param_6,puVar6), iVar3 == 0 &&
         (iVar3 = mbedtls_mpi_mul_mpi(auStack_88,auStack_68,auStack_78), iVar3 == 0)) &&
        ((iVar3 = mbedtls_mpi_mod_mpi(auStack_88,auStack_88,puVar6), iVar3 == 0 &&
         (((iVar3 = mbedtls_mpi_mul_mpi(auStack_98,param_5,auStack_78), iVar3 == 0 &&
           (iVar3 = mbedtls_mpi_mod_mpi(auStack_98,auStack_98,puVar6), iVar3 == 0)) &&
          (iVar3 = mbedtls_ecp_muladd_restartable
                             (param_1,auStack_c8,auStack_88,param_1 + 0xe,auStack_98,param_4,0),
          iVar3 == 0)))))))) {
      iVar3 = mbedtls_ecp_is_zero(auStack_c8);
      if (iVar3 != 0) goto LAB_00b9bc3c;
      iVar3 = mbedtls_mpi_mod_mpi(auStack_c8,auStack_c8,puVar6);
      if (iVar3 == 0) {
        iVar4 = mbedtls_mpi_cmp_mpi(auStack_c8,param_5);
        iVar3 = 0;
        if (iVar4 != 0) {
          iVar3 = -0x4e00;
        }
      }
    }
  }
  mbedtls_ecp_point_free(auStack_c8);
  mbedtls_mpi_free(auStack_68);
  mbedtls_mpi_free(auStack_78);
  mbedtls_mpi_free(auStack_88);
  mbedtls_mpi_free(auStack_98);
LAB_00b9bc68:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

