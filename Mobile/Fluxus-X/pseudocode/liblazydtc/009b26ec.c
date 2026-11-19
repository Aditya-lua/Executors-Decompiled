/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b26ec
 */

int SSL_CTX_set_trust(SSL_CTX *s,int trust)

{
  int iVar1;
  
  iVar1 = X509_VERIFY_PARAM_set_trust(*(X509_VERIFY_PARAM **)(s->tlsext_tick_key_name + 8),trust);
  return iVar1;
}

