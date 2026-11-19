/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7a6c
 */

bool SSL_SESSION_set1_master_key(long param_1,void *param_2,size_t param_3)

{
  if (param_3 < 0x201) {
    memcpy((void *)(param_1 + 0x50),param_2,param_3);
    *(size_t *)(param_1 + 8) = param_3;
  }
  return param_3 < 0x201;
}

