/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad0c70
 */

void BN_BLINDING_free(BN_BLINDING *b)

{
  if (b == (BN_BLINDING *)0x0) {
    return;
  }
  BN_free(*(BIGNUM **)b);
  BN_free(*(BIGNUM **)(b + 8));
  BN_free(*(BIGNUM **)(b + 0x10));
  BN_free(*(BIGNUM **)(b + 0x18));
  CRYPTO_THREAD_lock_free(*(undefined8 *)(b + 0x48));
  CRYPTO_free(b);
  return;
}

