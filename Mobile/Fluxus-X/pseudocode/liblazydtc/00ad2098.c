/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2098
 */

uint RSA_test_flags(long param_1,uint param_2)

{
  return *(uint *)(param_1 + 0xa4) & param_2;
}

