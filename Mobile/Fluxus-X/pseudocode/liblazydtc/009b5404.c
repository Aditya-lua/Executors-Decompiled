/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5404
 */

int SSL_renegotiate_pending(SSL *s)

{
  return (int)(*(int *)&s[4].expand != 0);
}

