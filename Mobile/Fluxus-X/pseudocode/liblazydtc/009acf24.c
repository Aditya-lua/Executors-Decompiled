/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009acf24
 */

stack_st_X509_NAME * SSL_get_client_CA_list(SSL *s)

{
  void **ppvVar1;
  
  if (s->server == 0) {
    ppvVar1 = &s[1].init_msg;
  }
  else {
    if (*(stack_st_X509_NAME **)&s[3].first_packet != (stack_st_X509_NAME *)0x0) {
      return *(stack_st_X509_NAME **)&s[3].first_packet;
    }
    ppvVar1 = (void **)(*(long *)&s[3].ex_data.dummy + 0x130);
  }
  return *ppvVar1;
}

