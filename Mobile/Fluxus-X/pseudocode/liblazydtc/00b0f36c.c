/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f36c
 */

stack_st_X509 * X509_STORE_CTX_get1_chain(X509_STORE_CTX *ctx)

{
  long lVar1;
  stack_st_X509 *psVar2;
  
  lVar1._0_4_ = ctx->valid;
  lVar1._4_4_ = ctx->last_untrusted;
  if (lVar1 == 0) {
    return (stack_st_X509 *)0x0;
  }
  psVar2 = (stack_st_X509 *)X509_chain_up_ref();
  return psVar2;
}

