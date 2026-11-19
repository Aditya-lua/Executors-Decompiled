/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3fb0
 */

int SSL_CTX_get_verify_depth(SSL_CTX *ctx)

{
  int iVar1;
  
  iVar1 = X509_VERIFY_PARAM_get_depth(*(X509_VERIFY_PARAM **)(ctx->tlsext_tick_key_name + 8));
  return iVar1;
}

