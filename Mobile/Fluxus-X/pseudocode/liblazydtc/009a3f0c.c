/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a3f0c
 */

/* ix::SocketOpenSSL::openSSLCheckServerCert(ssl_st*, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&)
    */

bool __thiscall
ix::SocketOpenSSL::openSSLCheckServerCert
          (SocketOpenSSL *this,ssl_st *param_1,basic_string_conflict *param_2,
          basic_string_conflict *param_3)

{
  X509 *a;
  
  a = (X509 *)SSL_get1_peer_certificate(param_1);
  if (a == (X509 *)0x0) {
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_3
           ,"OpenSSL failed - peer didn\'t present a X509 certificate.",0x38);
  }
  else {
    X509_free(a);
  }
  return a != (X509 *)0x0;
}

