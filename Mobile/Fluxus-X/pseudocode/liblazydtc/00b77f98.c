/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b77f98
 */

void mbedtls_gcm_auth_decrypt
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
               undefined8 param_9,undefined8 param_10)

{
  long lVar1;
  undefined8 uVar2;
  undefined1 auStack_70 [8];
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  uVar2 = mbedtls_gcm_starts(param_1,0);
  if (((int)uVar2 == 0) && (uVar2 = mbedtls_gcm_update_ad(param_1,param_5,param_6), (int)uVar2 == 0)
     ) {
    uVar2 = mbedtls_gcm_update(param_1,param_9,param_2,param_10,param_2,auStack_70);
    if (((int)uVar2 == 0) &&
       ((uVar2 = mbedtls_gcm_finish(param_1), (int)uVar2 == 0 &&
        (uVar2 = mbedtls_ct_memcmp(param_7,auStack_68,param_8), (int)uVar2 != 0)))) {
      mbedtls_platform_zeroize(param_10,param_2);
      uVar2 = 0xffffffee;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

