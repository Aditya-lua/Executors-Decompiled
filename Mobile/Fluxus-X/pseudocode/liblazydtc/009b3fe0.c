/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3fe0
 */

int SSL_get_read_ahead(SSL *s)

{
  return *(int *)&s[4].client_CA;
}

