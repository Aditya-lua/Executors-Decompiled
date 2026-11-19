/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3fe8
 */

int SSL_pending(SSL *s)

{
  uint uVar1;
  
  uVar1 = (*s->method->ssl_pending)(s);
  if (0x7ffffffe < uVar1) {
    uVar1 = 0x7fffffff;
  }
  return uVar1;
}

