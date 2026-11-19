/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b67218
 */

undefined8
ossl_ccm_generic_auth_decrypt
          (long param_1,undefined8 param_2,void *param_3,size_t param_4,void *param_5,size_t param_6
          )

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 auStack_50 [16];
  
  if (*(long *)(param_1 + 0x88) == 0) {
    iVar1 = CRYPTO_ccm128_decrypt(param_1 + 0x50);
  }
  else {
    iVar1 = CRYPTO_ccm128_decrypt_ccm64();
  }
  if (((iVar1 == 0) && (lVar2 = CRYPTO_ccm128_tag(param_1 + 0x50,auStack_50,param_6), lVar2 != 0))
     && (iVar1 = CRYPTO_memcmp(auStack_50,param_5,param_6), iVar1 == 0)) {
    uVar3 = 1;
  }
  else {
    OPENSSL_cleanse(param_3,param_4);
    uVar3 = 0;
  }
  return uVar3;
}

