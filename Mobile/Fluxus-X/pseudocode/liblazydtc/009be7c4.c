/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be7c4
 */

long SSL_SESSION_get_timeout(SSL_SESSION *s)

{
  long lVar1;
  
  lVar1 = 0;
  if (s != (SSL_SESSION *)0x0) {
    lVar1 = *(long *)(s[1].sid_ctx + 0x14);
  }
  return lVar1;
}

