/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7930
 */

int SSL_CTX_load_verify_locations(SSL_CTX *ctx,char *CAfile,char *CApath)

{
  int iVar1;
  int iVar2;
  
  iVar1 = 0;
  if (((CAfile != (char *)0x0 || CApath != (char *)0x0) &&
      ((CAfile == (char *)0x0 ||
       (iVar2 = X509_STORE_load_file_ex
                          (ctx->session_cache_size,CAfile,ctx->method,ctx[1].tlsext_ticket_key_cb),
       iVar1 = 0, iVar2 != 0)))) &&
     ((CApath == (char *)0x0 ||
      (iVar2 = X509_STORE_load_path(ctx->session_cache_size,CApath), iVar1 = 0, iVar2 != 0)))) {
    iVar1 = 1;
  }
  return iVar1;
}

