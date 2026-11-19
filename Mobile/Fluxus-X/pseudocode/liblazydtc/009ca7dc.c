/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca7dc
 */

bool RECORD_LAYER_read_pending(long param_1)

{
  return *(long *)(param_1 + 0x40) != 0;
}

