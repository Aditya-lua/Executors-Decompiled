/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae7540
 */

void SRP_VBASE_free(undefined8 *param_1)

{
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  OPENSSL_sk_pop_free(*param_1,SRP_user_pwd_free);
  OPENSSL_sk_free(param_1[1]);
  CRYPTO_free((void *)param_1[2]);
  CRYPTO_free(param_1);
  return;
}

