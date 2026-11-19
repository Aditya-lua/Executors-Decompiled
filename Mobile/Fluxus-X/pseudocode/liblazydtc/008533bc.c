/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008533bc
 */

bool FUN_008533bc(long param_1)

{
  return *(char *)(*(long *)(param_1 + 0x18) + (ulong)*(uint *)(param_1 + 0x14)) != '\'';
}

