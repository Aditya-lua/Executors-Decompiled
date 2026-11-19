/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbfec
 */

void BIO_set_callback_arg(BIO *b,char *arg)

{
  *(char **)&b->flags = arg;
  return;
}

