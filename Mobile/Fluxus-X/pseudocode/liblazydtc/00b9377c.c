/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9377c
 */

int FUN_00b9377c(long param_1,long param_2,undefined8 param_3,long param_4)

{
  long lVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  undefined1 auStack_58 [16];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  mbedtls_mpi_init(auStack_58);
  iVar3 = mbedtls_mpi_cmp_int(param_3,0);
  if (iVar3 == 0) {
    iVar3 = mbedtls_ecp_check_pubkey(param_1,param_4);
    if (((iVar3 == 0) && (iVar3 = mbedtls_mpi_lset(param_2,1), iVar3 == 0)) &&
       (iVar3 = mbedtls_mpi_lset(param_2 + 0x10,1), iVar3 == 0)) {
      iVar3 = mbedtls_mpi_lset(param_2 + 0x20,0);
    }
  }
  else {
    iVar3 = mbedtls_mpi_cmp_int(param_3,1);
    if (iVar3 == 0) {
      iVar3 = mbedtls_ecp_check_pubkey(param_1,param_4);
      if (((iVar3 == 0) && (iVar3 = mbedtls_mpi_copy(param_2,param_4), iVar3 == 0)) &&
         (iVar3 = mbedtls_mpi_copy(param_2 + 0x10,param_4 + 0x10), iVar3 == 0)) {
        iVar3 = mbedtls_mpi_copy(param_2 + 0x20,param_4 + 0x20);
      }
    }
    else {
      iVar3 = mbedtls_mpi_cmp_int(param_3,0xffffffffffffffff);
      if (iVar3 == 0) {
        iVar3 = mbedtls_ecp_check_pubkey(param_1,param_4);
        if ((iVar3 == 0) && (iVar3 = mbedtls_mpi_copy(param_2,param_4), iVar3 == 0)) {
          lVar1 = param_2 + 0x10;
          iVar3 = mbedtls_mpi_copy(lVar1,param_4 + 0x10);
          if ((iVar3 == 0) && (iVar3 = mbedtls_mpi_copy(param_2 + 0x20,param_4 + 0x20), iVar3 == 0))
          {
            iVar4 = mbedtls_mpi_cmp_int(lVar1,0);
            iVar3 = mbedtls_mpi_sub_mpi(auStack_58,param_1 + 8,lVar1);
            if (iVar3 == 0) {
              iVar3 = mbedtls_mpi_safe_cond_assign(lVar1,auStack_58,iVar4 != 0);
            }
          }
        }
      }
      else {
        iVar3 = FUN_00b923c4(param_1,param_2,param_3,param_4,0,0);
      }
    }
  }
  mbedtls_mpi_free(auStack_58);
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

