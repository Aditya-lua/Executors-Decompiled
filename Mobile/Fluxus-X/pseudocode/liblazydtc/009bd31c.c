/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd31c
 */

void * SSL_SESSION_get_ex_data(SSL_SESSION *ss,int idx)

{
  void *pvVar1;
  
  pvVar1 = CRYPTO_get_ex_data((CRYPTO_EX_DATA *)(ss[1].krb5_client_princ + 0x28),idx);
  return pvVar1;
}

