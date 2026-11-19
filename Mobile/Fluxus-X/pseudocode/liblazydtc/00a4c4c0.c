/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4c4c0
 */

void ossl_curve448_scalar_destroy(void *param_1)

{
  OPENSSL_cleanse(param_1,0x38);
  return;
}

