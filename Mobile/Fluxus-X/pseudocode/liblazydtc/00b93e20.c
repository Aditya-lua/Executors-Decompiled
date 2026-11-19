/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b93e20
 */

int FUN_00b93e20(long param_1,long param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  int iVar4;
  undefined1 auStack_58 [16];
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  lVar1 = param_2 + 0x20;
  iVar4 = mbedtls_mpi_cmp_int(lVar1,0);
  if (iVar4 == 0) {
    iVar4 = 0;
  }
  else {
    mbedtls_mpi_init(auStack_58);
    iVar4 = mbedtls_mpi_inv_mod(auStack_58,lVar1,param_1 + 8);
    if (iVar4 == 0) {
      lVar2 = param_2 + 0x10;
      iVar4 = FUN_00b953d4(param_1,lVar2,lVar2,auStack_58);
      if (iVar4 == 0) {
        iVar4 = FUN_00b953d4(param_1,auStack_58,auStack_58,auStack_58);
        if (iVar4 == 0) {
          iVar4 = FUN_00b953d4(param_1,param_2,param_2,auStack_58);
          if (iVar4 == 0) {
            iVar4 = FUN_00b953d4(param_1,lVar2,lVar2,auStack_58);
            if (iVar4 == 0) {
              iVar4 = mbedtls_mpi_lset(lVar1,1);
            }
          }
        }
      }
    }
    mbedtls_mpi_free(auStack_58);
  }
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

