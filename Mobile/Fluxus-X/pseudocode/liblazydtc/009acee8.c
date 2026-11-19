/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009acee8
 */

void SSL_set_client_CA_list(SSL *s,stack_st_X509_NAME *name_list)

{
  undefined8 uVar1;
  
  uVar1._0_4_ = s[3].first_packet;
  uVar1._4_4_ = s[3].client_version;
  OPENSSL_sk_pop_free(uVar1,X509_NAME_free);
  *(stack_st_X509_NAME **)&s[3].first_packet = name_list;
  return;
}

