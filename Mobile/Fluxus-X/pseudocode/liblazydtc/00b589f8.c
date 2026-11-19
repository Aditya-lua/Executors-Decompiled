/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b589f8
 */

void ossl_drbg_clear_seed(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  CRYPTO_secure_clear_free(param_2,param_3,"providers/implementations/rands/drbg.c",0xbf);
  return;
}

