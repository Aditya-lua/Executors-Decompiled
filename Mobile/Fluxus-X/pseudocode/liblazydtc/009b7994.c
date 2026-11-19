/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7994
 */

long SSL_get_verify_result(SSL *ssl)

{
  return *(long *)&ssl[3].references;
}

