/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e5eec
 */

stack_st_X509_NAME * get_ca_names(SSL *param_1)

{
  int iVar1;
  stack_st_X509_NAME *psVar2;
  
  if (((param_1->server == 0) ||
      (psVar2 = SSL_get_client_CA_list(param_1), psVar2 == (stack_st_X509_NAME *)0x0)) ||
     (iVar1 = OPENSSL_sk_num(), iVar1 == 0)) {
    psVar2 = (stack_st_X509_NAME *)SSL_get0_CA_list(param_1);
    return psVar2;
  }
  return psVar2;
}

