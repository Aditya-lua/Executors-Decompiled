/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00854c90
 */

ulong FUN_00854c90(long param_1)

{
  if (*(long *)(param_1 + 0x60) == *(long *)(param_1 + 0x68)) {
    return 0;
  }
  return (ulong)*(uint *)(*(long *)(param_1 + 0x68) + -4) | 0x100000000;
}

