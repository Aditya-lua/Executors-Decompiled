/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2d8a8
 */

void ossl_blake2b512_init(undefined8 param_1)

{
  undefined1 auStack_60 [64];
  
  ossl_blake2b_param_init(auStack_60);
  ossl_blake2b_init(param_1,auStack_60);
  return;
}

