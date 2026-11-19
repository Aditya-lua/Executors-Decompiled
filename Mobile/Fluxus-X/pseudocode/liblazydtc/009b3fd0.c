/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3fd0
 */

void SSL_set_verify_depth(SSL *s,int depth)

{
  X509_VERIFY_PARAM_set_depth((X509_VERIFY_PARAM *)s[1].tlsext_ecpointformatlist,depth);
  return;
}

