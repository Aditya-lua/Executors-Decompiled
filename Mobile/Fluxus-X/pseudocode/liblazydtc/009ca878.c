/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca878
 */

bool RECORD_LAYER_write_pending(long param_1)

{
  if (*(long *)(param_1 + 0x18) == 0) {
    return false;
  }
  return *(long *)(param_1 + *(long *)(param_1 + 0x18) * 0x30 + 0x40) != 0;
}

