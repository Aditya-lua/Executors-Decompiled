/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7d58
 */

void SSL_CTX_set_record_padding_callback_arg(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 1000) = param_2;
  return;
}

