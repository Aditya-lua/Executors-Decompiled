/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7ac0
 */

void * SSL_CTX_get_ex_data(SSL_CTX *ssl,int idx)

{
  void *pvVar1;
  
  pvVar1 = CRYPTO_get_ex_data((CRYPTO_EX_DATA *)&ssl->sha1,idx);
  return pvVar1;
}

