/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c9368
 */

void DTLS_RECORD_LAYER_set_write_sequence(long param_1,undefined8 *param_2)

{
  *(undefined8 *)(param_1 + 0x10a8) = *param_2;
  return;
}

