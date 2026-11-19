/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8258
 */

bool SSL_CTX_SRP_CTX_free(long param_1)

{
  if (param_1 != 0) {
    CRYPTO_free(*(void **)(param_1 + 0x338));
    CRYPTO_free(*(void **)(param_1 + 0x380));
    BN_free(*(BIGNUM **)(param_1 + 0x340));
    BN_free(*(BIGNUM **)(param_1 + 0x348));
    BN_free(*(BIGNUM **)(param_1 + 0x350));
    BN_free(*(BIGNUM **)(param_1 + 0x358));
    BN_free(*(BIGNUM **)(param_1 + 0x360));
    BN_free(*(BIGNUM **)(param_1 + 0x368));
    BN_free(*(BIGNUM **)(param_1 + 0x370));
    BN_free(*(BIGNUM **)(param_1 + 0x378));
    memset((void *)(param_1 + 0x318),0,0x80);
    *(undefined4 *)(param_1 + 0x388) = 0x400;
  }
  return param_1 != 0;
}

