/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a206b4
 */

void DSA_clear_flags(long param_1,uint param_2)

{
  *(uint *)(param_1 + 0x78) = *(uint *)(param_1 + 0x78) & (param_2 ^ 0xffffffff);
  return;
}

