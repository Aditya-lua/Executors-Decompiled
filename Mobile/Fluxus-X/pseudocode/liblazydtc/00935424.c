/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935424
 */

byte FUN_00935424(long param_1)

{
  return *(byte *)(param_1 + 0x1b1) >> 6 & 1;
}

