/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7d94
 */

undefined8 SSL_set_record_padding_callback(long param_1,undefined8 param_2)

{
  if (*(BIO **)(param_1 + 0x20) != (BIO *)0x0) {
    BIO_next(*(BIO **)(param_1 + 0x20));
  }
  *(undefined8 *)(param_1 + 0x1d50) = param_2;
  return 1;
}

