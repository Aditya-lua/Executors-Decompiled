/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca730
 */

void ossl_rand_pool_reattach(undefined8 *param_1,void *param_2)

{
  *param_1 = param_2;
  OPENSSL_cleanse(param_2,param_1[1]);
  param_1[1] = 0;
  return;
}

