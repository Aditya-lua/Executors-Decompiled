/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd314
 */

int SSL_SESSION_set_ex_data(SSL_SESSION *ss,int idx,void *data)

{
  int iVar1;
  
  iVar1 = CRYPTO_set_ex_data((CRYPTO_EX_DATA *)(ss[1].krb5_client_princ + 0x28),idx,data);
  return iVar1;
}

