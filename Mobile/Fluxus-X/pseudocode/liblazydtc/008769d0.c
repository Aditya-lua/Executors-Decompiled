/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008769d0
 */

ulong FUN_008769d0(long param_1)

{
  return (ulong)(*(long *)(param_1 + 0x38) - *(long *)(param_1 + 0x30)) >> 2;
}

