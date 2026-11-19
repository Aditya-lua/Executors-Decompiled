/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3f58
 */

size_t SSL_get_peer_finished(SSL *s,void *buf,size_t count)

{
  BIO *__n;
  BIO *pBVar1;
  
  pBVar1 = s[1].wbio;
  __n = pBVar1;
  if (count <= pBVar1) {
    __n = (BIO *)count;
  }
  memcpy(buf,&s->tlsext_opaque_prf_input_len,(size_t)__n);
  return (size_t)pBVar1;
}

