/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca700
 */

void RECORD_LAYER_clear(undefined8 *param_1)

{
  param_1[0x20e] = 0;
  param_1[0x210] = 0;
  *(undefined4 *)(param_1 + 0x211) = 0;
  *(undefined4 *)(param_1 + 0x20d) = 0;
  param_1[0x20a] = 0;
  *(undefined4 *)((long)param_1 + 0xc) = 0xf0;
  param_1[0x20c] = 0;
  param_1[0x20b] = 0;
  param_1[0x213] = 0;
  param_1[0x212] = 0;
  SSL3_BUFFER_clear(param_1 + 4);
  ssl3_release_write_buffer(*param_1);
  param_1[2] = 0;
  SSL3_RECORD_clear(param_1 + 0xca,0x20);
  param_1[0x215] = 0;
  param_1[0x214] = 0;
  if (param_1[0x217] == 0) {
    return;
  }
  DTLS_RECORD_LAYER_clear(param_1);
  return;
}

