/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac79dc
 */

void ossl_rand_cleanup_nonce(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  CRYPTO_clear_free(param_2,param_3,"crypto/rand/prov_seed.c",0x4b);
  return;
}

