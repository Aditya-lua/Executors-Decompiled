/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32930
 */

stack_st_X509 * SSL_get_peer_cert_chain(SSL *s)

{
  stack_st_X509 *psVar1;
  
  psVar1 = SSL_get_peer_cert_chain(s);
  return psVar1;
}

