/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b798c
 */

void SSL_set_verify_result(SSL *ssl,long v)

{
  *(long *)&ssl[3].references = v;
  return;
}

