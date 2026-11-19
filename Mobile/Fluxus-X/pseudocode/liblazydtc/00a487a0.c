/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a487a0
 */

void ossl_curve448_point_destroy(void *param_1)

{
  OPENSSL_cleanse(param_1,0x100);
  return;
}

