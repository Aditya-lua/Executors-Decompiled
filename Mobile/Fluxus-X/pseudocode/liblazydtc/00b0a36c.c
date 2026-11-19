/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a36c
 */

int X509_LOOKUP_by_subject(X509_LOOKUP *ctx,int type,X509_NAME *name,X509_OBJECT *ret)

{
  int iVar1;
  code *UNRECOVERED_JUMPTABLE;
  X509_LOOKUP_METHOD *pXVar2;
  
  if ((ctx->skip != 0) || (pXVar2 = ctx->method, pXVar2 == (X509_LOOKUP_METHOD *)0x0)) {
    return 0;
  }
  UNRECOVERED_JUMPTABLE = (code *)pXVar2[1].name;
  if (pXVar2->get_by_subject == (_func_1839 *)0x0) {
    if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
      return 0;
    }
  }
  else if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00b0a394. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    iVar1 = (*pXVar2->get_by_subject)(ctx,type,name,ret);
    return iVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x00b0a3a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*UNRECOVERED_JUMPTABLE)();
  return iVar1;
}

