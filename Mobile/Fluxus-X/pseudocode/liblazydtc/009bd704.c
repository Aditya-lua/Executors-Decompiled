/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd704
 */

uint SSL_SESSION_get_compress_id(SSL_SESSION *s)

{
  return *(uint *)(s[1].krb5_client_princ + 0xc);
}

