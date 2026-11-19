/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a8168
 */

undefined8 ssl3_clear(undefined4 *param_1)

{
  undefined8 uVar1;
  
  ssl3_cleanup_key_block();
  CRYPTO_free(*(void **)(param_1 + 0xbe));
  OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0xc2),X509_NAME_free);
  CRYPTO_free(*(void **)(param_1 + 0xd4));
  CRYPTO_clear_free(*(undefined8 *)(param_1 + 0xd8),*(undefined8 *)(param_1 + 0xda),"ssl/s3_lib.c",
                    0xd38);
  CRYPTO_free(*(void **)(param_1 + 0xe4));
  CRYPTO_free(*(void **)(param_1 + 0xe6));
  EVP_PKEY_free(*(EVP_PKEY **)(param_1 + 0xba));
  EVP_PKEY_free(*(EVP_PKEY **)(param_1 + 300));
  ssl3_free_digest_list(param_1);
  CRYPTO_free(*(void **)(param_1 + 0x122));
  CRYPTO_free(*(void **)(param_1 + 0x126));
  memset(param_1 + 0x2a,0,0x410);
  uVar1 = ssl_free_wbio_buffer(param_1);
  if ((int)uVar1 != 0) {
    *param_1 = 0x300;
    CRYPTO_free(*(void **)(param_1 + 0x2c6));
    uVar1 = 1;
    *(undefined8 *)(param_1 + 0x2c8) = 0;
    *(undefined8 *)(param_1 + 0x2c6) = 0;
  }
  return uVar1;
}

