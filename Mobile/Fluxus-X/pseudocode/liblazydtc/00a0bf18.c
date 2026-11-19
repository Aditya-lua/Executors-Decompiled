/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0bf18
 */

int COMP_expand_block(COMP_CTX *ctx,uchar *out,int olen,uchar *in,int ilen)

{
  int iVar1;
  _func_572 *p_Var2;
  
  p_Var2 = ctx->meth->expand;
  if (p_Var2 == (_func_572 *)0x0) {
    iVar1 = -1;
  }
  else {
    iVar1 = (*p_Var2)(ctx,out,olen,in,ilen);
    if (0 < iVar1) {
      ctx->expand_out = ctx->expand_out + (long)iVar1;
      ctx->expand_in = ctx->expand_in + (long)ilen;
    }
  }
  return iVar1;
}

