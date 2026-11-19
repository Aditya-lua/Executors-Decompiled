/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b79580
 */

int mbedtls_md_hmac(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   undefined8 param_5,undefined8 param_6)

{
  long lVar1;
  int iVar2;
  long local_70 [4];
  
  lVar1 = tpidr_el0;
  local_70[3] = *(long *)(lVar1 + 0x28);
  if (param_1 == 0) {
    iVar2 = -0x5100;
  }
  else {
    local_70[0] = 0;
    local_70[1] = 0;
    local_70[2] = 0;
    iVar2 = mbedtls_md_setup(local_70,param_1,1);
    if (iVar2 == 0) {
      iVar2 = mbedtls_md_hmac_starts(local_70,param_2,param_3);
      if (iVar2 == 0) {
        if ((local_70[0] == 0) || (local_70[2] == 0)) {
          iVar2 = -0x5100;
        }
        else {
          iVar2 = mbedtls_md_update(local_70,param_4,param_5);
          if (iVar2 == 0) {
            iVar2 = mbedtls_md_hmac_finish(local_70,param_6);
          }
        }
      }
    }
    mbedtls_md_free(local_70);
  }
  if (*(long *)(lVar1 + 0x28) != local_70[3]) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

