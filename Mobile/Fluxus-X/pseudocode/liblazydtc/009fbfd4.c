/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbfd4
 */

void BIO_set_callback(BIO *b,callback *callback)

{
  b->cb_arg = (char *)callback;
  return;
}

