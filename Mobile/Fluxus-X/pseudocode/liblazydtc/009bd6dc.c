/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd6dc
 */

uchar * SSL_SESSION_get_id(SSL_SESSION *s,uint *len)

{
  if (len != (uint *)0x0) {
    *len = (uint)s->tlsext_tick_lifetime_hint;
  }
  return (uchar *)(s + 1);
}

