/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b10820
 */

void X509_STORE_CTX_set_flags(X509_STORE_CTX *ctx,ulong flags)

{
  X509_VERIFY_PARAM_set_flags((X509_VERIFY_PARAM *)ctx->crls,flags);
  return;
}

