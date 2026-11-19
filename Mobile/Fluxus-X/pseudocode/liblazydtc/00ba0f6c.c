/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba0f6c
 */

int FUN_00ba0f6c(long param_1,short param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5
                ,undefined8 param_6,undefined8 param_7)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  mbedtls_mpi_init(auStack_68);
  iVar2 = mbedtls_mpi_fill_random(auStack_68,0x10,param_6,param_7);
  if (iVar2 == 0) {
    iVar2 = mbedtls_mpi_mul_mpi(auStack_68,auStack_68,param_5);
    if (iVar2 == 0) {
      iVar2 = mbedtls_mpi_add_mpi(auStack_68,auStack_68,param_4);
      if (iVar2 == 0) {
        iVar2 = mbedtls_mpi_mul_mpi(param_1,param_3,auStack_68);
        if (iVar2 == 0) {
          *(short *)(param_1 + 8) = *(short *)(param_1 + 8) * param_2;
          iVar2 = mbedtls_mpi_mod_mpi(param_1,param_1,param_5);
        }
      }
    }
  }
  mbedtls_mpi_free(auStack_68);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

