/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ad3d8
 */

stack_st_X509_NAME * SSL_load_client_CA_file(char *file)

{
  stack_st_X509_NAME *psVar1;
  
  psVar1 = (stack_st_X509_NAME *)SSL_load_client_CA_file_ex(file,0,0);
  return psVar1;
}

