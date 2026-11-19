/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f37c
 */

uint DH_test_flags(long param_1,uint param_2)

{
  return *(uint *)(param_1 + 0x80) & param_2;
}

