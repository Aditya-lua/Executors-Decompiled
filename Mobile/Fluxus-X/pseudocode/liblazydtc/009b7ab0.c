/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7ab0
 */

void * SSL_get_ex_data(SSL *ssl,int idx)

{
  void *pvVar1;
  
  pvVar1 = CRYPTO_get_ex_data((CRYPTO_EX_DATA *)&ssl[3].options,idx);
  return pvVar1;
}

