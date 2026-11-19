/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a5094
 */

/* ix::SocketOpenSSL::connect(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, int, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, std::__ndk1::function<bool ()>
   const&) */

undefined8 __thiscall
ix::SocketOpenSSL::connect
          (SocketOpenSSL *this,basic_string_conflict *param_1,int param_2,
          basic_string_conflict *param_3,function *param_4)

{
  mutex *this_00;
  int iVar1;
  SSL_METHOD *meth;
  SSL_CTX *ctx;
  ulong uVar2;
  SSL *s;
  undefined8 uVar3;
  basic_string_conflict *extraout_x1;
  basic_string_conflict *extraout_x1_00;
  basic_string_conflict *pbVar4;
  
  this_00 = (mutex *)(this + 0xe0);
  std::__ndk1::mutex::lock(this_00);
  if ((_openSSLInitializationSuccessful & 1) == 0) {
                    /* try { // try from 009a50d8 to 009a519f has its CatchHandler @ 009a5260 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_3
           ,"OPENSSL_init_ssl failure",0x18);
  }
  else {
    iVar1 = SocketConnect::connect(param_1,param_2,param_3,param_4);
    *(int *)(this + 8) = iVar1;
    if (*(int *)(this + 8) != -1) {
      meth = (SSL_METHOD *)TLS_client_method();
      if (meth == (SSL_METHOD *)0x0) {
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 param_3,"SSLv23_client_method failure",0x1c);
      }
      else {
        *(SSL_METHOD **)(this + 0x50) = meth;
        ctx = SSL_CTX_new(meth);
        if (ctx != (SSL_CTX *)0x0) {
          SSL_CTX_ctrl(ctx,0x21,3,(void *)0x0);
          SSL_CTX_set_options(ctx,0x22400000);
          *(SSL_CTX **)(this + 0x48) = ctx;
          uVar2 = handleTLSOptions((basic_string_conflict *)this);
          if ((uVar2 & 1) == 0) goto LAB_009a5210;
          s = SSL_new(*(SSL_CTX **)(this + 0x48));
          *(SSL **)(this + 0x40) = s;
          if (s != (SSL *)0x0) {
            SSL_set_fd(s,*(int *)(this + 8));
            pbVar4 = *(basic_string_conflict **)(param_1 + 0x10);
            if (((byte)*param_1 & 1) == 0) {
              pbVar4 = param_1 + 1;
            }
            SSL_ctrl(*(SSL **)(this + 0x40),0x37,0,pbVar4);
            pbVar4 = extraout_x1;
            if (this[0xb9] == (SocketOpenSSL)0x0) {
                    /* try { // try from 009a51ac to 009a51cf has its CatchHandler @ 009a525c */
              uVar3 = SSL_get0_param(*(undefined8 *)(this + 0x40));
              uVar2 = (ulong)((byte)*param_1 >> 1);
              pbVar4 = param_1 + 1;
              if (((byte)*param_1 & 1) != 0) {
                uVar2 = *(ulong *)(param_1 + 8);
                pbVar4 = *(basic_string_conflict **)(param_1 + 0x10);
              }
              X509_VERIFY_PARAM_set1_host(uVar3,pbVar4,uVar2);
              pbVar4 = extraout_x1_00;
            }
                    /* try { // try from 009a51d0 to 009a524b has its CatchHandler @ 009a5260 */
            uVar2 = openSSLClientHandshake(this,pbVar4,param_3,param_4);
            std::__ndk1::mutex::unlock(this_00);
            if ((uVar2 & 1) == 0) {
              close(this);
              return 0;
            }
            return 1;
          }
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)param_3,"OpenSSL failed to connect",0x19);
          SSL_CTX_free(*(SSL_CTX **)(this + 0x48));
        }
      }
      *(undefined8 *)(this + 0x48) = 0;
    }
  }
LAB_009a5210:
  std::__ndk1::mutex::unlock(this_00);
  return 0;
}

