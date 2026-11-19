/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aa2b8
 */

undefined8 FUN_008aa2b8(long param_1)

{
  if (*(long *)(param_1 + 0x50) == *(long *)(param_1 + 0x20)) {
    return *(undefined8 *)(param_1 + 0x78);
  }
  return *(undefined8 *)(**(long **)(*(long *)(param_1 + 0x50) + 8) + 0x10);
}

