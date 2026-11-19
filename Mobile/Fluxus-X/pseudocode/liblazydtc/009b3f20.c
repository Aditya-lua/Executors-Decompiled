/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3f20
 */

size_t SSL_get_finished(SSL *s,void *buf,size_t count)

{
  void *__n;
  void *pvVar1;
  
  pvVar1 = s->tlsext_opaque_prf_input;
  __n = pvVar1;
  if (count <= pvVar1) {
    __n = (void *)count;
  }
  memcpy(buf,&s->max_cert_list,(size_t)__n);
  return (size_t)pvVar1;
}

