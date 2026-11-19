/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a22c
 */

void X509_LOOKUP_free(X509_LOOKUP *ctx)

{
  _func_1835 *p_Var1;
  
  if (ctx == (X509_LOOKUP *)0x0) {
    return;
  }
  if ((ctx->method != (X509_LOOKUP_METHOD *)0x0) &&
     (p_Var1 = ctx->method->free, p_Var1 != (_func_1835 *)0x0)) {
    (*p_Var1)(ctx);
  }
  CRYPTO_free(ctx);
  return;
}

