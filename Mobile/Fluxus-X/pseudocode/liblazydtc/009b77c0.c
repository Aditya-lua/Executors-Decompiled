/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b77c0
 */

int SSL_CTX_set_default_verify_paths(SSL_CTX *ctx)

{
  int iVar1;
  
  iVar1 = X509_STORE_set_default_paths_ex
                    (ctx->session_cache_size,ctx->method,ctx[1].tlsext_ticket_key_cb);
  return iVar1;
}

