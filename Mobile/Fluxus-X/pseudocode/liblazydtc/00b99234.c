/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b99234
 */

void mbedtls_psa_cipher_decrypt
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
               long param_5,long param_6,long param_7,long param_8,long *param_9)

{
  long lVar1;
  void *__dest;
  long lVar2;
  size_t sVar3;
  int iVar4;
  int iVar5;
  ulong uVar6;
  size_t local_d8;
  uint local_d0;
  byte local_cc;
  undefined1 auStack_c8 [48];
  long local_98;
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  memset(&local_d0,0,0x68);
  iVar4 = FUN_00b98a78(&local_d0,param_1,param_2,param_4,0);
  if (iVar4 != 0) goto LAB_00b992a8;
  if (local_cc == 0) {
    uVar6 = 0;
  }
  else {
    mbedtls_cipher_set_iv(auStack_c8,param_5);
    iVar4 = mbedtls_to_psa_error();
    if (iVar4 != 0) goto LAB_00b992a8;
    uVar6 = (ulong)local_cc;
  }
  lVar1 = 0;
  if (param_5 != 0) {
    lVar1 = param_5 + uVar6;
  }
  iVar4 = mbedtls_psa_cipher_update(&local_d0,lVar1,param_6 - uVar6,param_7,param_8,&local_d8);
  sVar3 = local_d8;
  if (iVar4 != 0) goto LAB_00b992a8;
  __dest = (void *)0x0;
  if (param_7 != 0) {
    __dest = (void *)(param_7 + local_d8);
  }
  if ((local_98 == 0) || ((local_d0 | 0x400) != 0x4404400)) {
    mbedtls_cipher_finish(auStack_c8,auStack_68,&local_d8);
    iVar4 = mbedtls_to_psa_error();
    if (iVar4 == 0) {
      if (local_d8 != 0) {
        if (param_8 - sVar3 < local_d8) {
          iVar4 = -0x8a;
          goto LAB_00b993e8;
        }
        memcpy(__dest,auStack_68,local_d8);
      }
      iVar4 = 0;
    }
  }
  else {
    iVar4 = -0x87;
  }
LAB_00b993e8:
  mbedtls_platform_zeroize(auStack_68,0x10);
  if (iVar4 == 0) {
    *param_9 = local_d8 + sVar3;
  }
LAB_00b992a8:
  if ((local_d0 & 0x7f000000) == 0x4000000) {
    mbedtls_cipher_free(auStack_c8);
    iVar5 = 0;
  }
  else {
    iVar5 = -0x89;
  }
  if (iVar4 != 0) {
    iVar5 = iVar4;
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar5);
  }
  return;
}

