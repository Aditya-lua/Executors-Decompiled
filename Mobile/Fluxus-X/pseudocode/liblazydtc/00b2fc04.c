/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2fc04
 */

void ossl_blake2s_param_set_personal(long param_1,void *param_2,size_t param_3)

{
  memcpy((void *)(param_1 + 0x18),param_2,param_3);
  memset((void *)(param_1 + 0x18 + param_3),0,8 - param_3);
  return;
}

