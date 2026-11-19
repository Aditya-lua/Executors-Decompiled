/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f758
 */

void EC_KEY_clear_flags(EC_KEY *key,int flags)

{
  *(uint *)(key + 0x3c) = *(uint *)(key + 0x3c) & (flags ^ 0xffffffffU);
  *(long *)(key + 0x68) = *(long *)(key + 0x68) + 1;
  return;
}

