/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac78f8
 */

void ossl_rand_cleanup_entropy(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  CRYPTO_secure_clear_free(param_2,param_3,"crypto/rand/prov_seed.c",0x2c);
  return;
}

