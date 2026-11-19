/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9e3ac
 */

int mbedtls_psa_mac_verify_finish(int *param_1,undefined8 param_2,ulong param_3)

{
  long lVar1;
  int iVar2;
  int iVar3;
  undefined1 auStack_78 [64];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (*param_1 == 0) {
    iVar2 = -0x89;
  }
  else if (param_3 < 0x41) {
    iVar2 = FUN_00b9e1e0(param_1,auStack_78,param_3);
    if (iVar2 == 0) {
      iVar3 = mbedtls_ct_memcmp(param_2,auStack_78,param_3);
      iVar2 = 0;
      if (iVar3 != 0) {
        iVar2 = -0x95;
      }
    }
    mbedtls_platform_zeroize(auStack_78,0x40);
  }
  else {
    iVar2 = -0x87;
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

