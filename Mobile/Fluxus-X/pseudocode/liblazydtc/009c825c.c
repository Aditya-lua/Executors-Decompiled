/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c825c
 */

bool ssl_srp_ctx_free_intern(long param_1)

{
  if (param_1 != 0) {
    CRYPTO_free(*(void **)(param_1 + 0xbf0));
    CRYPTO_free(*(void **)(param_1 + 0xc38));
    BN_free(*(BIGNUM **)(param_1 + 0xbf8));
    BN_free(*(BIGNUM **)(param_1 + 0xc00));
    BN_free(*(BIGNUM **)(param_1 + 0xc08));
    BN_free(*(BIGNUM **)(param_1 + 0xc10));
    BN_free(*(BIGNUM **)(param_1 + 0xc18));
    BN_free(*(BIGNUM **)(param_1 + 0xc20));
    BN_free(*(BIGNUM **)(param_1 + 0xc28));
    BN_free(*(BIGNUM **)(param_1 + 0xc30));
    memset((void *)(param_1 + 0xbd0),0,0x80);
    *(undefined4 *)(param_1 + 0xc40) = 0x400;
  }
  return param_1 != 0;
}

