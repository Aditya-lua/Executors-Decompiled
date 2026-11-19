/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b10880
 */

void X509_STORE_CTX_set_verify_cb(X509_STORE_CTX *ctx,verify_cb *verify_cb)

{
  ctx->verify = (_func_1855 *)verify_cb;
  return;
}

