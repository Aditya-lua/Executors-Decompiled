/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3fc0
 */

void SSL_set_verify(SSL *s,int mode,callback *callback)

{
  s[3].error = mode;
  if (callback != (callback *)0x0) {
    s[3].kssl_ctx = (KSSL_CTX *)callback;
  }
  return;
}

