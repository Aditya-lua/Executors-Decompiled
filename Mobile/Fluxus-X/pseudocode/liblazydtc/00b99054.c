/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b99054
 */

void mbedtls_psa_cipher_encrypt
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
               undefined8 param_5,ulong param_6,undefined8 param_7,undefined8 param_8,long param_9,
               long param_10,long *param_11)

{
  void *__dest;
  long lVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  size_t local_e0;
  long local_d8;
  uint local_d0;
  byte local_cc;
  undefined1 auStack_c8 [48];
  long local_98;
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  memset(&local_d0,0,0x68);
  iVar3 = FUN_00b98a78(&local_d0,param_1,param_2,param_4,1);
  if (iVar3 != 0) goto LAB_00b990c8;
  if (param_6 != 0) {
    if (local_cc != param_6) {
      iVar3 = -0x87;
      goto LAB_00b990c8;
    }
    mbedtls_cipher_set_iv(auStack_c8,param_5,param_6);
    iVar3 = mbedtls_to_psa_error();
    if (iVar3 != 0) goto LAB_00b990c8;
  }
  iVar3 = mbedtls_psa_cipher_update(&local_d0,param_7,param_8,param_9,param_10,&local_d8);
  lVar2 = local_d8;
  if (iVar3 != 0) goto LAB_00b990c8;
  __dest = (void *)0x0;
  if (param_9 != 0) {
    __dest = (void *)(param_9 + local_d8);
  }
  if ((local_98 == 0) || ((local_d0 | 0x400) != 0x4404400)) {
    mbedtls_cipher_finish(auStack_c8,auStack_68,&local_e0);
    iVar3 = mbedtls_to_psa_error();
    if (iVar3 == 0) {
      if (local_e0 != 0) {
        if ((ulong)(param_10 - lVar2) < local_e0) {
          iVar3 = -0x8a;
          goto LAB_00b9920c;
        }
        memcpy(__dest,auStack_68,local_e0);
      }
      iVar3 = 0;
    }
  }
  else {
    iVar3 = -0x87;
  }
LAB_00b9920c:
  mbedtls_platform_zeroize(auStack_68,0x10);
  if (iVar3 == 0) {
    *param_11 = local_e0 + local_d8;
  }
LAB_00b990c8:
  if ((local_d0 & 0x7f000000) == 0x4000000) {
    mbedtls_cipher_free(auStack_c8);
    iVar4 = 0;
  }
  else {
    iVar4 = -0x89;
  }
  if (iVar3 != 0) {
    iVar4 = iVar3;
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar4);
  }
  return;
}

