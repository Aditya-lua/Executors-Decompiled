/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009beabc
 */

long SSL_CTX_set_timeout(SSL_CTX *ctx,long t)

{
  _func_3088 *p_Var1;
  
  p_Var1 = (_func_3088 *)0x0;
  if (ctx != (SSL_CTX *)0x0) {
    p_Var1 = ctx->remove_session_cb;
    ctx->remove_session_cb = (_func_3088 *)t;
  }
  return (long)p_Var1;
}

