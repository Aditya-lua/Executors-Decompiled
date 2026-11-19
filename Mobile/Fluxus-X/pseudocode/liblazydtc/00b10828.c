/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b10828
 */

void X509_STORE_CTX_set_time(X509_STORE_CTX *ctx,ulong flags,time_t t)

{
  X509_VERIFY_PARAM_set_time((X509_VERIFY_PARAM *)ctx->crls,t);
  return;
}

