/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2dc18
 */

void ossl_blake2b_param_set_salt(long param_1,void *param_2,size_t param_3)

{
  memcpy((void *)(param_1 + 0x20),param_2,param_3);
  memset((void *)(param_1 + 0x20 + param_3),0,0x10 - param_3);
  return;
}

