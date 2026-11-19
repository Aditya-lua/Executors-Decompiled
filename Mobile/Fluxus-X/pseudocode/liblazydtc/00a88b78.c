/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a88b78
 */

undefined8 FUN_00a88b78(undefined8 param_1,uchar *param_2,void *param_3)

{
  int iVar1;
  AES_KEY *key;
  undefined8 uVar2;
  
  key = (AES_KEY *)EVP_CIPHER_CTX_get_cipher_data();
  if (param_2 == (uchar *)0x0 && param_3 == (void *)0x0) {
    uVar2 = 1;
  }
  else if (param_2 == (uchar *)0x0) {
    if (key[2].rd_key[2] == 0) {
      memcpy(*(void **)(key[2].rd_key + 0x30),param_3,(long)(int)key[3].rd_key[3]);
    }
    else {
      CRYPTO_ocb128_setiv(key[2].rd_key + 4,param_3,(long)(int)key[3].rd_key[3],
                          (long)(int)key[3].rd_key[4]);
    }
    uVar2 = 1;
    key[2].rd_key[3] = 1;
  }
  else {
    iVar1 = EVP_CIPHER_CTX_get_key_length(param_1);
    AES_set_encrypt_key(param_2,iVar1 << 3,key);
    iVar1 = EVP_CIPHER_CTX_get_key_length(param_1);
    AES_set_decrypt_key(param_2,iVar1 << 3,(AES_KEY *)(key[1].rd_key + 1));
    uVar2 = CRYPTO_ocb128_init(key[2].rd_key + 4,key,(AES_KEY *)(key[1].rd_key + 1),AES_encrypt,
                               AES_decrypt,0);
    if ((int)uVar2 != 0) {
      if ((param_3 != (void *)0x0) ||
         ((key[2].rd_key[3] != 0 &&
          (param_3 = *(void **)(key[2].rd_key + 0x30), param_3 != (void *)0x0)))) {
        iVar1 = CRYPTO_ocb128_setiv(key[2].rd_key + 4,param_3,(long)(int)key[3].rd_key[3],
                                    (long)(int)key[3].rd_key[4]);
        if (iVar1 != 1) {
          return 0;
        }
        key[2].rd_key[3] = 1;
      }
      uVar2 = 1;
      key[2].rd_key[2] = 1;
    }
  }
  return uVar2;
}

