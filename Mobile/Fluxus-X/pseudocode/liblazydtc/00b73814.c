/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b73814
 */

int mbedtls_ctr_drbg_update(undefined8 param_1,undefined8 param_2,long param_3)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_68 [48];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (param_3 == 0) {
    iVar2 = 0;
  }
  else {
    iVar2 = FUN_00b7389c(auStack_68);
    if (iVar2 == 0) {
      iVar2 = FUN_00b73b88(param_1,auStack_68);
    }
    mbedtls_platform_zeroize(auStack_68,0x30);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

