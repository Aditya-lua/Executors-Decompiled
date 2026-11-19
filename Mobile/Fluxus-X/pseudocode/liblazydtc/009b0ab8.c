/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0ab8
 */

char * SSL_CIPHER_get_name(SSL_CIPHER *c)

{
  if (c == (SSL_CIPHER *)0x0) {
    return "(NONE)";
  }
  return c->name;
}

