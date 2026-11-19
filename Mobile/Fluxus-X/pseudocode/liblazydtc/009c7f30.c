/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c7f30
 */

int SSL_CTX_set_client_cert_engine(SSL_CTX *ctx,ENGINE *e)

{
  int iVar1;
  ENGINE_SSL_CLIENT_CERT_PTR pEVar2;
  
  iVar1 = ENGINE_init(e);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("ssl/tls_depr.c",0x4f,"SSL_CTX_set_client_cert_engine");
    ERR_set_error(0x14,0x80026,0);
  }
  else {
    pEVar2 = ENGINE_get_ssl_client_cert_function(e);
    if (pEVar2 != (ENGINE_SSL_CLIENT_CERT_PTR)0x0) {
      ctx->tlsext_opaque_prf_input_callback_arg = e;
      return 1;
    }
    ERR_new();
    ERR_set_debug("ssl/tls_depr.c",0x53,"SSL_CTX_set_client_cert_engine");
    ERR_set_error(0x14,0x14b,0);
    ENGINE_finish(e);
  }
  return 0;
}

