/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b26e4
 */

int SSL_set_purpose(SSL *s,int purpose)

{
  int iVar1;
  
  iVar1 = X509_VERIFY_PARAM_set_purpose((X509_VERIFY_PARAM *)s[1].tlsext_ecpointformatlist,purpose);
  return iVar1;
}

