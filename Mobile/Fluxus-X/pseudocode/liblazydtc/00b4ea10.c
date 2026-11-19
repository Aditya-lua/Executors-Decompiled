/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4ea10
 */

void FUN_00b4ea10(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  EC_GROUP_free(*(EC_GROUP **)((long)param_1 + 0x80));
  BN_free(*(BIGNUM **)((long)param_1 + 0x30));
  BN_free(*(BIGNUM **)((long)param_1 + 0x38));
  BN_free(*(BIGNUM **)((long)param_1 + 0x40));
  BN_free(*(BIGNUM **)((long)param_1 + 0x48));
  BN_free(*(BIGNUM **)((long)param_1 + 0x50));
  CRYPTO_free(*(void **)((long)param_1 + 8));
  CRYPTO_free(*(void **)((long)param_1 + 0x28));
  CRYPTO_free(*(void **)((long)param_1 + 0x18));
  CRYPTO_free(*(void **)((long)param_1 + 0x10));
  CRYPTO_free(*(void **)((long)param_1 + 0x60));
  CRYPTO_free(*(void **)((long)param_1 + 0x58));
  CRYPTO_free(param_1);
  return;
}

