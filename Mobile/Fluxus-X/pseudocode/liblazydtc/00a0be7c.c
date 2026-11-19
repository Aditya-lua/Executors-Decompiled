/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0be7c
 */

void COMP_CTX_free(COMP_CTX *ctx)

{
  _func_570 *p_Var1;
  
  if (ctx == (COMP_CTX *)0x0) {
    return;
  }
  p_Var1 = ctx->meth->finish;
  if (p_Var1 != (_func_570 *)0x0) {
    (*p_Var1)(ctx);
  }
  CRYPTO_free(ctx);
  return;
}

