/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca958
 */

void SSL_CTX_set_default_read_buffer_len(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x1f8) = param_2;
  return;
}

