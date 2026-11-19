/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b599d8
 */

void ossl_rand_drbg_free(undefined8 *param_1)

{
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  CRYPTO_THREAD_lock_free(*param_1);
  CRYPTO_free(param_1);
  return;
}

