/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0ba28
 */

void X509_STORE_set_verify_cb(X509_STORE *ctx,verify_cb *verify_cb)

{
  ctx->verify_cb = (_func_1844 *)verify_cb;
  return;
}

