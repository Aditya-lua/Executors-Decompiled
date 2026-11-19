/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a3e0
 */

int X509_LOOKUP_by_alias(X509_LOOKUP *ctx,int type,char *str,int len,X509_OBJECT *ret)

{
  int iVar1;
  _func_1842 *UNRECOVERED_JUMPTABLE;
  
  if ((ctx->method == (X509_LOOKUP_METHOD *)0x0) ||
     (UNRECOVERED_JUMPTABLE = ctx->method->get_by_alias, UNRECOVERED_JUMPTABLE == (_func_1842 *)0x0)
     ) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00b0a3f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*UNRECOVERED_JUMPTABLE)(ctx,type,str,len,ret);
  return iVar1;
}

