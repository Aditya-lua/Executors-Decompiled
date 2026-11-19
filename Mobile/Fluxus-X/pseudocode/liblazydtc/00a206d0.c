/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a206d0
 */

void DSA_set_flags(long param_1,uint param_2)

{
  *(uint *)(param_1 + 0x78) = *(uint *)(param_1 + 0x78) | param_2;
  return;
}

