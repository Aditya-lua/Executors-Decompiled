/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a6eb0
 */

void dtls1_stop_timer(SSL *param_1)

{
  BIO *bp;
  X509_EXTENSIONS *pXVar1;
  
  pXVar1 = param_1[1].tlsext_ocsp_exts;
  *(undefined4 *)&pXVar1[0xf].stack.data = 0;
  pXVar1[0xf].stack.sorted = 0;
  pXVar1[0xf].stack.num_alloc = 0;
  pXVar1[0xf].stack.comp = (_func_257 *)0x0;
  param_1[1].tlsext_ocsp_exts[0x10].stack.num = 1000000;
  bp = SSL_get_rbio(param_1);
  BIO_ctrl(bp,0x2d,0,&param_1[1].tlsext_ocsp_exts[0xf].stack.sorted);
  dtls1_clear_sent_buffer(param_1);
  return;
}

