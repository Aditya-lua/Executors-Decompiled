/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2d870
 */

void ossl_blake2s256_init(undefined8 param_1)

{
  undefined1 auStack_40 [32];
  
  ossl_blake2s_param_init(auStack_40);
  ossl_blake2s_init(param_1,auStack_40);
  return;
}

