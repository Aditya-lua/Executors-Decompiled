/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7ab8
 */

int SSL_CTX_set_ex_data(SSL_CTX *ssl,int idx,void *data)

{
  int iVar1;
  
  iVar1 = CRYPTO_set_ex_data((CRYPTO_EX_DATA *)&ssl->sha1,idx,data);
  return iVar1;
}

