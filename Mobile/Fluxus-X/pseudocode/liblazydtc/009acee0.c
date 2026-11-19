/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009acee0
 */

stack_st_X509_NAME * SSL_CTX_get_client_CA_list(SSL_CTX *s)

{
  return (stack_st_X509_NAME *)s->cert;
}

