/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c7ed8
 */

int tls_engine_load_ssl_client_cert(SSL *param_1,X509 **param_2,EVP_PKEY **param_3)

{
  int iVar1;
  stack_st_X509_NAME *ca_dn;
  ENGINE *e;
  
  e = *(ENGINE **)(*(long *)&param_1[3].ex_data.dummy + 0x200);
  ca_dn = SSL_get_client_CA_list(param_1);
  iVar1 = ENGINE_load_ssl_client_cert
                    (e,param_1,ca_dn,param_2,param_3,(stack_st_X509 **)0x0,(UI_METHOD *)0x0,
                     (void *)0x0);
  return iVar1;
}

