/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b77ee0
 */

void mbedtls_gcm_crypt_and_tag
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
               undefined8 param_9)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_50 [8];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  iVar2 = mbedtls_gcm_starts(param_1,param_2,param_4,param_5);
  if (((iVar2 == 0) && (iVar2 = mbedtls_gcm_update_ad(param_1,param_6,param_7), iVar2 == 0)) &&
     (iVar2 = mbedtls_gcm_update(param_1,param_8,param_3,param_9,param_3,auStack_50), iVar2 == 0)) {
    mbedtls_gcm_finish(param_1);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

