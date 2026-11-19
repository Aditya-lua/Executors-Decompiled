/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aceac
 */

void SSL_CTX_set_client_CA_list(SSL_CTX *ctx,stack_st_X509_NAME *name_list)

{
  OPENSSL_sk_pop_free(ctx->cert,X509_NAME_free);
  ctx->cert = (cert_st *)name_list;
  return;
}

