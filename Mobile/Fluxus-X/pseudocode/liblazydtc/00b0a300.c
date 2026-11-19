/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a300
 */

int X509_LOOKUP_ctrl(X509_LOOKUP *ctx,int cmd,char *argc,long argl,char **ret)

{
  int iVar1;
  X509_LOOKUP_METHOD *pXVar2;
  
  pXVar2 = ctx->method;
  if (pXVar2 == (X509_LOOKUP_METHOD *)0x0) {
    return -1;
  }
  if (pXVar2[1].new_item != (_func_1834 *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00b0a318. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    iVar1 = (*pXVar2[1].new_item)(ctx);
    return iVar1;
  }
  if (pXVar2->ctrl == (_func_1838 *)0x0) {
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x00b0a32c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*pXVar2->ctrl)(ctx,cmd,argc,argl,ret);
  return iVar1;
}

