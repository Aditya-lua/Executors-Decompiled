/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8b218
 */

undefined8 FUN_00a8b218(undefined8 param_1,long param_2,void *param_3)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  lVar2 = EVP_CIPHER_CTX_get_cipher_data();
  if (param_2 == 0 && param_3 == (void *)0x0) {
    uVar3 = 1;
  }
  else if (param_2 == 0) {
    if (*(int *)(lVar2 + 0x118) == 0) {
      memcpy(*(void **)(lVar2 + 0x2d8),param_3,(long)*(int *)(lVar2 + 0x2e0));
    }
    else {
      CRYPTO_gcm128_setiv(lVar2 + 0x120,param_3,(long)*(int *)(lVar2 + 0x2e0));
    }
    uVar3 = 1;
    *(undefined4 *)(lVar2 + 0x11c) = 1;
    *(undefined4 *)(lVar2 + 0x2e8) = 0;
  }
  else {
    iVar1 = EVP_CIPHER_CTX_get_key_length(param_1);
    iVar1 = ossl_aria_set_encrypt_key(param_2,iVar1 << 3,lVar2);
    CRYPTO_gcm128_init(lVar2 + 0x120,lVar2,ossl_aria_encrypt);
    if (iVar1 < 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/e_aria.c",0xe6,"aria_gcm_init_key");
      ERR_set_error(6,0xb0,0);
      uVar3 = 0;
    }
    else {
      if ((param_3 != (void *)0x0) ||
         ((*(int *)(lVar2 + 0x11c) != 0 &&
          (param_3 = *(void **)(lVar2 + 0x2d8), param_3 != (void *)0x0)))) {
        CRYPTO_gcm128_setiv(lVar2 + 0x120,param_3,(long)*(int *)(lVar2 + 0x2e0));
        *(undefined4 *)(lVar2 + 0x11c) = 1;
      }
      uVar3 = 1;
      *(undefined4 *)(lVar2 + 0x118) = 1;
    }
  }
  return uVar3;
}

