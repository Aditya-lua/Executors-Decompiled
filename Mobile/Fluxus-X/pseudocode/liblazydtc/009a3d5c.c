/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a3d5c
 */

/* ix::SocketOpenSSL::openSSLCreateContext(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&) */

SSL_CTX * __thiscall
ix::SocketOpenSSL::openSSLCreateContext(SocketOpenSSL *this,basic_string_conflict *param_1)

{
  SSL_METHOD *meth;
  SSL_CTX *ctx;
  
  meth = (SSL_METHOD *)TLS_client_method();
  if (meth == (SSL_METHOD *)0x0) {
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_1
           ,"SSLv23_client_method failure",0x1c);
    ctx = (SSL_CTX *)0x0;
  }
  else {
    *(SSL_METHOD **)(this + 0x50) = meth;
    ctx = SSL_CTX_new(meth);
    if (ctx != (SSL_CTX *)0x0) {
      SSL_CTX_ctrl(ctx,0x21,3,(void *)0x0);
      SSL_CTX_set_options(ctx,0x22400000);
    }
  }
  return ctx;
}

