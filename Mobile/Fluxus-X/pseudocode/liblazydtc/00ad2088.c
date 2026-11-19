/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2088
 */

void RSA_clear_flags(long param_1,uint param_2)

{
  *(uint *)(param_1 + 0xa4) = *(uint *)(param_1 + 0xa4) & (param_2 ^ 0xffffffff);
  return;
}

