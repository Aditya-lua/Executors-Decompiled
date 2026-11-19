/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f36c
 */

void DH_clear_flags(long param_1,uint param_2)

{
  *(uint *)(param_1 + 0x80) = *(uint *)(param_1 + 0x80) & (param_2 ^ 0xffffffff);
  return;
}

