/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bea10
 */

X509 * SSL_SESSION_get0_peer(SSL_SESSION *s)

{
  return *(X509 **)(s[1].session_id + 0x18);
}

