/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00875ec8
 */

long FUN_00875ec8(long param_1)

{
  return *(long *)(param_1 + 0x38) - *(long *)(param_1 + 0x30) >> 2;
}

