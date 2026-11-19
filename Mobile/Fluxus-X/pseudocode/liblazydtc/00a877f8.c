/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a877f8
 */

undefined8 FUN_00a877f8(long param_1,uchar *param_2,void *param_3)

{
  AES_KEY *key;
  undefined4 uVar1;
  long lVar2;
  
  key = (AES_KEY *)EVP_CIPHER_CTX_get_cipher_data();
  if (param_2 != (uchar *)0x0 || param_3 != (void *)0x0) {
    if (param_2 == (uchar *)0x0) {
      if (key[1].rd_key[1] == 0) {
        memcpy(*(void **)(key[2].rd_key + 0x34),param_3,(long)(int)key[2].rd_key[0x36]);
      }
      else {
        CRYPTO_gcm128_setiv(key[1].rd_key + 3,param_3,(long)(int)key[2].rd_key[0x36]);
      }
      uVar1 = 0;
      key[1].rd_key[2] = 1;
      lVar2 = 0x2c8;
    }
    else {
      AES_set_encrypt_key(param_2,*(int *)(param_1 + 0x68) << 3,key);
      CRYPTO_gcm128_init(key[1].rd_key + 3,key,AES_encrypt);
      key[3].rd_key[1] = 0;
      key[3].rd_key[2] = 0;
      if ((param_3 == (void *)0x0) &&
         ((key[1].rd_key[2] == 0 ||
          (param_3 = *(void **)(key[2].rd_key + 0x34), param_3 == (void *)0x0)))) {
        uVar1 = 1;
        lVar2 = 0xf8;
      }
      else {
        CRYPTO_gcm128_setiv(key[1].rd_key + 3,param_3,(long)(int)key[2].rd_key[0x36]);
        uVar1 = 1;
        key[1].rd_key[2] = 1;
        lVar2 = 0xf8;
      }
    }
    *(undefined4 *)((long)key->rd_key + lVar2) = uVar1;
  }
  return 1;
}

