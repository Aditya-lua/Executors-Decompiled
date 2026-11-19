/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2687c
 */

undefined8 ossl_siv128_cleanup(void *param_1)

{
  if (param_1 != (void *)0x0) {
    EVP_CIPHER_CTX_free(*(EVP_CIPHER_CTX **)((long)param_1 + 0x20));
    *(undefined8 *)((long)param_1 + 0x20) = 0;
    EVP_MAC_CTX_free(*(undefined8 *)((long)param_1 + 0x30));
    *(undefined8 *)((long)param_1 + 0x30) = 0;
    EVP_MAC_free(*(undefined8 *)((long)param_1 + 0x28));
    *(undefined8 *)((long)param_1 + 0x28) = 0;
    OPENSSL_cleanse(param_1,0x10);
    OPENSSL_cleanse((void *)((long)param_1 + 0x10),0x10);
    *(undefined8 *)((long)param_1 + 0x38) = 0x1ffffffff;
  }
  return 1;
}

