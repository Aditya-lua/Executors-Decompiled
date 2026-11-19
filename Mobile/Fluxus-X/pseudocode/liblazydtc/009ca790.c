/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca790
 */

void RECORD_LAYER_reset_write_sequence(long param_1)

{
  *(undefined8 *)(param_1 + 0x10a8) = 0;
  return;
}

