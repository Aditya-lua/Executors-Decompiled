/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6e1c
 */

int SSL_want(SSL *s)

{
  return s->rwstate;
}

