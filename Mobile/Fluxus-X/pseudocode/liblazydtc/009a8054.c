/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a8054
 */

void ssl3_free(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  ssl3_cleanup_key_block();
  EVP_PKEY_free(*(EVP_PKEY **)(param_1 + 0x4b0));
  *(undefined8 *)(param_1 + 0x4b0) = 0;
  EVP_PKEY_free(*(EVP_PKEY **)(param_1 + 0x2e8));
  *(undefined8 *)(param_1 + 0x2e8) = 0;
  ssl_evp_cipher_free(*(undefined8 *)(param_1 + 800));
  ssl_evp_md_free(*(undefined8 *)(param_1 + 0x328));
  CRYPTO_free(*(void **)(param_1 + 0x2f8));
  OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0x308),X509_NAME_free);
  CRYPTO_free(*(void **)(param_1 + 0x350));
  CRYPTO_clear_free(*(undefined8 *)(param_1 + 0x360),*(undefined8 *)(param_1 + 0x368),"ssl/s3_lib.c"
                    ,0xd21);
  CRYPTO_free(*(void **)(param_1 + 0x390));
  CRYPTO_free(*(void **)(param_1 + 0x398));
  ssl3_free_digest_list(param_1);
  CRYPTO_free(*(void **)(param_1 + 0x488));
  CRYPTO_free(*(void **)(param_1 + 0x498));
  CRYPTO_free(*(void **)(param_1 + 0x370));
  ssl_srp_ctx_free_intern(param_1);
  memset((void *)(param_1 + 0xa8),0,0x410);
  return;
}

