/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8ba00
 */

undefined8 FUN_00a8ba00(long param_1,long param_2,void *param_3)

{
  int iVar1;
  long lVar2;
  
  lVar2 = EVP_CIPHER_CTX_get_cipher_data();
  if (param_2 != 0 || param_3 != (void *)0x0) {
    if (param_2 != 0) {
      iVar1 = EVP_CIPHER_CTX_get_key_length(param_1);
      iVar1 = ossl_aria_set_encrypt_key(param_2,iVar1 << 3,lVar2);
      CRYPTO_ccm128_init(lVar2 + 0x138,*(undefined4 *)(lVar2 + 300),*(undefined4 *)(lVar2 + 0x128),
                         lVar2,ossl_aria_encrypt);
      if (iVar1 < 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/e_aria.c",0x210,"aria_ccm_init_key");
        ERR_set_error(6,0xb0,0);
        return 0;
      }
      *(undefined8 *)(lVar2 + 0x170) = 0;
      *(undefined4 *)(lVar2 + 0x118) = 1;
    }
    if (param_3 != (void *)0x0) {
      memcpy((void *)(param_1 + 0x28),param_3,0xf - (long)*(int *)(lVar2 + 0x128));
      *(undefined4 *)(lVar2 + 0x11c) = 1;
    }
  }
  return 1;
}

