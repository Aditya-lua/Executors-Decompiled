/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b93f48
 */

int mbedtls_ecp_check_pubkey(int *param_1,long param_2)

{
  long lVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  undefined1 *puVar6;
  int *piVar7;
  undefined1 auStack_68 [16];
  undefined1 auStack_58 [16];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  iVar3 = mbedtls_mpi_cmp_int(param_2 + 0x20,1);
  if (iVar3 == 0) {
    if (*(long *)(param_1 + 0xe) == 0) {
      iVar3 = -0x4f80;
      goto LAB_00b93f88;
    }
    if (*(long *)(param_1 + 0x12) == 0) {
      uVar5 = mbedtls_mpi_size(param_2);
      if ((uVar5 <= *(long *)(param_1 + 0x20) + 7U >> 3) &&
         (iVar3 = mbedtls_mpi_cmp_int(param_2,0), -1 < iVar3)) {
        piVar7 = param_1 + 2;
        iVar4 = *param_1;
        mbedtls_mpi_init(auStack_58);
        iVar3 = mbedtls_mpi_copy(auStack_58,param_2);
        while (iVar3 == 0) {
          iVar3 = mbedtls_mpi_cmp_mpi(auStack_58,piVar7);
          if (iVar3 < 0) {
            iVar3 = mbedtls_mpi_cmp_int(auStack_58,1);
            if ((iVar3 < 1) ||
               ((iVar4 == 9 &&
                ((iVar3 = mbedtls_mpi_cmp_mpi(auStack_58,&PTR_DAT_00ca85d0), iVar3 == 0 ||
                 (iVar3 = mbedtls_mpi_cmp_mpi(auStack_58,&PTR_DAT_00ca85e0), iVar3 == 0)))))) {
              iVar3 = -0x4c80;
            }
            else {
              iVar3 = mbedtls_mpi_add_int(auStack_58,auStack_58,1);
              if (iVar3 == 0) {
                iVar4 = mbedtls_mpi_cmp_mpi(auStack_58,piVar7);
                iVar3 = -0x4c80;
                if (iVar4 != 0) {
                  iVar3 = 0;
                }
              }
            }
            break;
          }
          iVar3 = mbedtls_mpi_sub_mpi(auStack_58,auStack_58,piVar7);
        }
        puVar6 = auStack_58;
LAB_00b940f4:
        mbedtls_mpi_free(puVar6);
        goto LAB_00b93f88;
      }
    }
    else {
      iVar3 = mbedtls_mpi_cmp_int(param_2,0);
      if (-1 < iVar3) {
        lVar1 = param_2 + 0x10;
        iVar3 = mbedtls_mpi_cmp_int(lVar1,0);
        if (-1 < iVar3) {
          iVar3 = mbedtls_mpi_cmp_mpi(param_2,param_1 + 2);
          if ((iVar3 < 0) && (iVar3 = mbedtls_mpi_cmp_mpi(lVar1,param_1 + 2), iVar3 < 0)) {
            mbedtls_mpi_init(auStack_58);
            mbedtls_mpi_init(auStack_68);
            iVar3 = FUN_00b953d4(param_1,auStack_58,lVar1,lVar1);
            if ((iVar3 == 0) && (iVar3 = FUN_00b952ac(param_1,auStack_68,param_2), iVar3 == 0)) {
              iVar4 = mbedtls_mpi_cmp_mpi(auStack_58,auStack_68);
              iVar3 = 0;
              if (iVar4 != 0) {
                iVar3 = -0x4c80;
              }
            }
            mbedtls_mpi_free(auStack_58);
            puVar6 = auStack_68;
            goto LAB_00b940f4;
          }
        }
      }
    }
  }
  iVar3 = -0x4c80;
LAB_00b93f88:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

