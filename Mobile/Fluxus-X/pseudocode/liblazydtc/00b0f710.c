/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f710
 */

void X509_STORE_CTX_cleanup(X509_STORE_CTX *ctx)

{
  undefined8 uVar1;
  X509_NAME *in_x1;
  long lVar2;
  
  if (ctx->lookup_crls != (_func_1865 *)0x0) {
    (*ctx->lookup_crls)(ctx,in_x1);
    ctx->lookup_crls = (_func_1865 *)0x0;
  }
  if ((X509_VERIFY_PARAM *)ctx->crls != (X509_VERIFY_PARAM *)0x0) {
    lVar2._0_4_ = ctx->current_crl_score;
    lVar2._4_4_ = ctx->current_reasons;
    if (lVar2 == 0) {
      X509_VERIFY_PARAM_free((X509_VERIFY_PARAM *)ctx->crls);
    }
    ctx->crls = (stack_st_X509_CRL *)0x0;
  }
  X509_policy_tree_free((X509_POLICY_TREE *)ctx->chain);
  ctx->chain = (stack_st_X509 *)0x0;
  uVar1._0_4_ = ctx->valid;
  uVar1._4_4_ = ctx->last_untrusted;
  OPENSSL_sk_pop_free(uVar1,X509_free);
  ctx->valid = 0;
  ctx->last_untrusted = 0;
  CRYPTO_free_ex_data(5,ctx,(CRYPTO_EX_DATA *)&ctx->parent);
  ctx->parent = (X509_STORE_CTX *)0x0;
  (ctx->ex_data).sk = (stack_st_void *)0x0;
  return;
}

