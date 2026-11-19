/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7d60
 */

undefined8 SSL_CTX_get_record_padding_callback_arg(long param_1)

{
  return *(undefined8 *)(param_1 + 1000);
}

