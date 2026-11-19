/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b26dc
 */

int SSL_CTX_set_purpose(SSL_CTX *s,int purpose)

{
  int iVar1;
  
  iVar1 = X509_VERIFY_PARAM_set_purpose
                    (*(X509_VERIFY_PARAM **)(s->tlsext_tick_key_name + 8),purpose);
  return iVar1;
}

