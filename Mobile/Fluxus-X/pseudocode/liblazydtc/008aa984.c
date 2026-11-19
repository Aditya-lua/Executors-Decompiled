/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aa984
 */

ulong FUN_008aa984(long param_1)

{
  return (ulong)(*(long *)(param_1 + 0x68) - *(long *)(param_1 + 0x70)) >> 4;
}

