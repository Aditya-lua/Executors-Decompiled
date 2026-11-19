/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b36b4
 */

int SSL_set1_param(SSL *ssl,X509_VERIFY_PARAM *vpm)

{
  int iVar1;
  
  iVar1 = X509_VERIFY_PARAM_set1((X509_VERIFY_PARAM *)ssl[1].tlsext_ecpointformatlist,vpm);
  return iVar1;
}

