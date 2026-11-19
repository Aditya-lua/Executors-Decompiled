/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7aa8
 */

int SSL_set_ex_data(SSL *ssl,int idx,void *data)

{
  int iVar1;
  
  iVar1 = CRYPTO_set_ex_data((CRYPTO_EX_DATA *)&ssl[3].options,idx,data);
  return iVar1;
}

