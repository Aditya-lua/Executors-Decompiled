/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c34020
 */

void SSL_CTX_set_client_CA_list(SSL_CTX *ctx,stack_st_X509_NAME *name_list)

{
  SSL_CTX_set_client_CA_list(ctx,name_list);
  return;
}

