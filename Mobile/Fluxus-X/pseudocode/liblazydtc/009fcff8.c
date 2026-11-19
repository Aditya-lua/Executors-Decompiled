/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fcff8
 */

int BIO_get_retry_reason(BIO *bio)

{
  return *(int *)((long)&bio->ptr + 4);
}

