/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca69c
 */

void ossl_rand_pool_free(undefined8 *param_1)

{
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  if (*(int *)(param_1 + 2) == 0) {
    if (*(int *)((long)param_1 + 0x14) == 0) {
      CRYPTO_clear_free(*param_1,param_1[5],"crypto/rand/rand_pool.c",0x6d);
    }
    else {
      CRYPTO_secure_clear_free();
    }
  }
  CRYPTO_free(param_1);
  return;
}

