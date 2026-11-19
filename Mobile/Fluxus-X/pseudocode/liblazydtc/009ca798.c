/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca798
 */

void RECORD_LAYER_release(undefined8 *param_1)

{
  if (param_1[4] != 0) {
    ssl3_release_read_buffer(*param_1);
  }
  if (param_1[3] != 0) {
    ssl3_release_write_buffer(*param_1);
  }
  SSL3_RECORD_release(param_1 + 0xca,0x20);
  return;
}

