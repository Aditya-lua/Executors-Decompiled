/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b26f4
 */

int SSL_set_trust(SSL *s,int trust)

{
  int iVar1;
  
  iVar1 = X509_VERIFY_PARAM_set_trust((X509_VERIFY_PARAM *)s[1].tlsext_ecpointformatlist,trust);
  return iVar1;
}

