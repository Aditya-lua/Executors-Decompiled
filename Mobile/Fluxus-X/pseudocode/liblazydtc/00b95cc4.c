/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b95cc4
 */

void FUN_00b95cc4(long param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  int iVar2;
  long lVar3;
  int iVar4;
  undefined1 auStack_58 [16];
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  mbedtls_mpi_init(auStack_58);
  iVar4 = mbedtls_mpi_random(auStack_58,2,param_1 + 8,param_3,param_4);
  if ((iVar4 == 0) &&
     (iVar4 = FUN_00b953d4(param_1,param_2 + 0x20,param_2 + 0x20,auStack_58), iVar4 == 0)) {
    lVar1 = param_2 + 0x10;
    iVar4 = FUN_00b953d4(param_1,lVar1,lVar1,auStack_58);
    if ((iVar4 == 0) &&
       ((iVar4 = FUN_00b953d4(param_1,auStack_58,auStack_58,auStack_58), iVar4 == 0 &&
        (iVar4 = FUN_00b953d4(param_1,param_2,param_2,auStack_58), iVar4 == 0)))) {
      iVar4 = FUN_00b953d4(param_1,lVar1,lVar1,auStack_58);
    }
  }
  mbedtls_mpi_free(auStack_58);
  iVar2 = -0x4d00;
  if (iVar4 != -0xe) {
    iVar2 = iVar4;
  }
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar2);
  }
  return;
}

