/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b36ac
 */

int SSL_CTX_set1_param(SSL_CTX *ctx,X509_VERIFY_PARAM *vpm)

{
  int iVar1;
  
  iVar1 = X509_VERIFY_PARAM_set1(*(X509_VERIFY_PARAM **)(ctx->tlsext_tick_key_name + 8),vpm);
  return iVar1;
}

