/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3f98
 */

int SSL_get_verify_depth(SSL *s)

{
  int iVar1;
  
  iVar1 = X509_VERIFY_PARAM_get_depth((X509_VERIFY_PARAM *)s[1].tlsext_ecpointformatlist);
  return iVar1;
}

