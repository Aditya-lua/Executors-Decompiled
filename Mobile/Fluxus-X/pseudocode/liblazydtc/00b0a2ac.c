/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a2ac
 */

int X509_LOOKUP_shutdown(X509_LOOKUP *ctx)

{
  int iVar1;
  _func_1837 *UNRECOVERED_JUMPTABLE;
  
  if (ctx->method == (X509_LOOKUP_METHOD *)0x0) {
    return 0;
  }
  UNRECOVERED_JUMPTABLE = ctx->method->shutdown;
  if (UNRECOVERED_JUMPTABLE == (_func_1837 *)0x0) {
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x00b0a2bc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*UNRECOVERED_JUMPTABLE)(ctx);
  return iVar1;
}

