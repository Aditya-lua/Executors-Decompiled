/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae72ec
 */

void SRP_user_pwd_free(undefined8 *param_1)

{
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  BN_free((BIGNUM *)param_1[1]);
  BN_clear_free((BIGNUM *)param_1[2]);
  CRYPTO_free((void *)*param_1);
  CRYPTO_free((void *)param_1[5]);
  CRYPTO_free(param_1);
  return;
}

