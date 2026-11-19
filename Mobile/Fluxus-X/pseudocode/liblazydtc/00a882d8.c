/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a882d8
 */

undefined8 FUN_00a882d8(long param_1,uchar *param_2,void *param_3)

{
  int iVar1;
  AES_KEY *key;
  
  key = (AES_KEY *)EVP_CIPHER_CTX_get_cipher_data();
  if (param_2 != (uchar *)0x0 || param_3 != (void *)0x0) {
    if (param_2 != (uchar *)0x0) {
      iVar1 = EVP_CIPHER_CTX_get_key_length(param_1);
      AES_set_encrypt_key(param_2,iVar1 << 3,key);
      CRYPTO_ccm128_init(key[1].rd_key + 9,key[1].rd_key[6],key[1].rd_key[5],key,AES_encrypt);
      key[1].rd_key[0x17] = 0;
      key[1].rd_key[0x18] = 0;
      key[1].rd_key[1] = 1;
    }
    if (param_3 != (void *)0x0) {
      memcpy((void *)(param_1 + 0x28),param_3,0xf - (long)(int)key[1].rd_key[5]);
      key[1].rd_key[2] = 1;
    }
  }
  return 1;
}

