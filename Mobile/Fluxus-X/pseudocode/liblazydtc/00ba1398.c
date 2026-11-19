/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba1398
 */

int FUN_00ba1398(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_78 [16];
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  mbedtls_mpi_init(auStack_68);
  mbedtls_mpi_init(auStack_78);
  iVar2 = mbedtls_mpi_lset(auStack_78,1);
  if (iVar2 == 0) {
    iVar2 = FUN_00ba0f6c(auStack_68,0xffffffff,param_1 + 0x1d0,param_1 + 0x1e0,param_1 + 0x70,
                         param_3,param_4);
    if (iVar2 == 0) {
      iVar2 = mbedtls_ecp_muladd(param_1 + 8,param_2,auStack_78,param_1 + 400,auStack_68,
                                 param_1 + 0x160);
      if (iVar2 == 0) {
        iVar2 = mbedtls_ecp_mul(param_1 + 8,param_2,param_1 + 0x1d0,param_2,param_3,param_4);
      }
    }
  }
  mbedtls_mpi_free(auStack_68);
  mbedtls_mpi_free(auStack_78);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

