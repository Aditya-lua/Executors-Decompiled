/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c368e0
 */

int ENGINE_load_ssl_client_cert
              (ENGINE *e,SSL *s,stack_st_X509_NAME *ca_dn,X509 **pcert,EVP_PKEY **ppkey,
              stack_st_X509 **pother,UI_METHOD *ui_method,void *callback_data)

{
  int iVar1;
  
  iVar1 = ENGINE_load_ssl_client_cert(e,s,ca_dn,pcert,ppkey,pother,ui_method,callback_data);
  return iVar1;
}

