/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f324
 */

int X509_STORE_CTX_set_ex_data(X509_STORE_CTX *ctx,int idx,void *data)

{
  int iVar1;
  
  iVar1 = CRYPTO_set_ex_data((CRYPTO_EX_DATA *)&ctx->parent,idx,data);
  return iVar1;
}

