/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a48c0
 */

/* ix::SocketOpenSSL::accept(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&) */

void __thiscall ix::SocketOpenSSL::accept(SocketOpenSSL *this,basic_string_conflict *param_1)

{
  mutex *this_00;
  SocketTLSOptions *this_01;
  basic_string_conflict bVar1;
  long lVar2;
  int iVar3;
  SSL_METHOD *meth;
  SSL_CTX *ctx;
  ulong uVar4;
  char *pcVar5;
  size_t sVar6;
  stack_st_X509_NAME *name_list;
  SSL *s;
  undefined8 uVar7;
  SocketOpenSSL *pSVar8;
  basic_string_conflict *pbVar9;
  void *__src;
  SocketOpenSSL *file;
  void *__dest;
  ulong uVar10;
  ulong local_b0;
  ulong uStack_a8;
  void *local_a0;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_90 [16];
  void *local_80;
  undefined7 uStack_78;
  undefined1 local_71;
  undefined7 uStack_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  this_00 = (mutex *)(this + 0xe0);
  std::__ndk1::mutex::lock(this_00);
  if ((_openSSLInitializationSuccessful & 1) == 0) {
                    /* try { // try from 009a4910 to 009a4923 has its CatchHandler @ 009a5080 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_1
           ,"OPENSSL_init_ssl failure",0x18);
LAB_009a4f84:
    std::__ndk1::mutex::unlock(this_00);
  }
  else {
    if (*(int *)(this + 8) == -1) goto LAB_009a4f84;
                    /* try { // try from 009a4938 to 009a4983 has its CatchHandler @ 009a507c */
    meth = (SSL_METHOD *)TLS_server_method();
    if (meth == (SSL_METHOD *)0x0) {
                    /* try { // try from 009a49b4 to 009a49c7 has its CatchHandler @ 009a507c */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             param_1,"SSLv23_server_method failure",0x1c);
LAB_009a49c8:
      *(undefined8 *)(this + 0x48) = 0;
      goto LAB_009a4f84;
    }
    *(SSL_METHOD **)(this + 0x50) = meth;
    ctx = SSL_CTX_new(meth);
    *(SSL_CTX **)(this + 0x48) = ctx;
    if (ctx == (SSL_CTX *)0x0) goto LAB_009a4f84;
    SSL_CTX_ctrl(ctx,0x21,1,(void *)0x0);
    pbVar9 = (basic_string_conflict *)0x2;
    SSL_CTX_ctrl(*(SSL_CTX **)(this + 0x48),0x21,2,(void *)0x0);
    SSL_CTX_set_options(*(undefined8 *)(this + 0x48),0x82000850);
    if (*(long *)(this + 0x48) == 0) goto LAB_009a4f84;
                    /* try { // try from 009a498c to 009a499b has its CatchHandler @ 009a5080 */
    ERR_clear_error();
    this_01 = (SocketTLSOptions *)(this + 0x58);
    uVar4 = SocketTLSOptions::hasCertAndKey(this_01);
    if ((uVar4 & 1) != 0) {
      if (((byte)this[0x58] & 1) == 0) {
        pSVar8 = this + 0x59;
      }
      else {
        pSVar8 = *(SocketOpenSSL **)(this + 0x68);
      }
                    /* try { // try from 009a49d4 to 009a49d7 has its CatchHandler @ 009a5080 */
      iVar3 = SSL_CTX_use_certificate_chain_file(*(SSL_CTX **)(this + 0x48),(char *)pSVar8);
      if (iVar3 == 1) {
        if (((byte)this[0x70] & 1) == 0) {
          pSVar8 = this + 0x71;
        }
        else {
          pSVar8 = *(SocketOpenSSL **)(this + 0x80);
        }
                    /* try { // try from 009a4a5c to 009a4a63 has its CatchHandler @ 009a5080 */
        pbVar9 = (basic_string_conflict *)0x1;
        iVar3 = SSL_CTX_use_PrivateKey_file(*(SSL_CTX **)(this + 0x48),(char *)pSVar8,1);
        if (iVar3 != 1) {
                    /* try { // try from 009a4a6c to 009a4a6f has its CatchHandler @ 009a5074 */
          uVar4 = ERR_get_error();
                    /* try { // try from 009a4a74 to 009a4a87 has its CatchHandler @ 009a5048 */
          std::__ndk1::operator+
                    ((__ndk1 *)"OpenSSL failed - SSL_CTX_use_PrivateKey_file(\"",
                     (char *)(this + 0x70),pbVar9);
                    /* try { // try from 009a4a88 to 009a4a9b has its CatchHandler @ 009a5044 */
          pbVar9 = (basic_string_conflict *)
                   std::__ndk1::
                   basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                   append(local_90,"\") failed: ",0xb);
          uVar7 = *(undefined8 *)(pbVar9 + 0x10);
          bVar1 = *pbVar9;
          uStack_70 = (undefined7)((ulong)*(undefined8 *)(pbVar9 + 8) >> 8);
          uStack_78 = (undefined7)*(undefined8 *)(pbVar9 + 1);
          local_71 = (undefined1)((ulong)*(undefined8 *)(pbVar9 + 1) >> 0x38);
          *(undefined8 *)pbVar9 = 0;
          *(undefined8 *)(pbVar9 + 8) = 0;
          *(undefined8 *)(pbVar9 + 0x10) = 0;
          if (((byte)*param_1 & 1) == 0) {
            *(undefined2 *)param_1 = 0;
          }
          else {
            **(undefined1 **)(param_1 + 0x10) = 0;
            *(undefined8 *)(param_1 + 8) = 0;
            if (((byte)*param_1 & 1) != 0) {
              operator_delete(*(void **)(param_1 + 0x10));
              *(undefined8 *)param_1 = 0;
            }
          }
          *param_1 = bVar1;
          *(ulong *)(param_1 + 1) = CONCAT17(local_71,uStack_78);
          *(ulong *)(param_1 + 8) = CONCAT71(uStack_70,local_71);
          *(undefined8 *)(param_1 + 0x10) = uVar7;
          uStack_70 = 0;
          uStack_78 = 0;
          local_71 = 0;
          if (((byte)local_90[0] & 1) != 0) {
            operator_delete(local_80);
          }
                    /* try { // try from 009a4b9c to 009a4bbf has its CatchHandler @ 009a5074 */
          pcVar5 = ERR_error_string(uVar4,(char *)0x0);
          pbVar9 = (basic_string_conflict *)strlen(pcVar5);
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)param_1,pcVar5,(ulong)pbVar9);
        }
      }
      else {
                    /* try { // try from 009a49f8 to 009a49fb has its CatchHandler @ 009a5078 */
        uVar4 = ERR_get_error();
                    /* try { // try from 009a4a00 to 009a4a13 has its CatchHandler @ 009a5068 */
        std::__ndk1::operator+
                  ((__ndk1 *)"OpenSSL failed - SSL_CTX_use_certificate_chain_file(\"",
                   (char *)this_01,pbVar9);
                    /* try { // try from 009a4a14 to 009a4a27 has its CatchHandler @ 009a5050 */
        pbVar9 = (basic_string_conflict *)
                 std::__ndk1::
                 basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                 append(local_90,"\") failed: ",0xb);
        uVar7 = *(undefined8 *)(pbVar9 + 0x10);
        bVar1 = *pbVar9;
        uStack_70 = (undefined7)((ulong)*(undefined8 *)(pbVar9 + 8) >> 8);
        uStack_78 = (undefined7)*(undefined8 *)(pbVar9 + 1);
        local_71 = (undefined1)((ulong)*(undefined8 *)(pbVar9 + 1) >> 0x38);
        *(undefined8 *)pbVar9 = 0;
        *(undefined8 *)(pbVar9 + 8) = 0;
        *(undefined8 *)(pbVar9 + 0x10) = 0;
        if (((byte)*param_1 & 1) == 0) {
          *(undefined2 *)param_1 = 0;
        }
        else {
          **(undefined1 **)(param_1 + 0x10) = 0;
          *(undefined8 *)(param_1 + 8) = 0;
          if (((byte)*param_1 & 1) != 0) {
            operator_delete(*(void **)(param_1 + 0x10));
            *(undefined8 *)param_1 = 0;
          }
        }
        *param_1 = bVar1;
        *(ulong *)(param_1 + 1) = CONCAT17(local_71,uStack_78);
        *(ulong *)(param_1 + 8) = CONCAT71(uStack_70,local_71);
        *(undefined8 *)(param_1 + 0x10) = uVar7;
        uStack_70 = 0;
        uStack_78 = 0;
        local_71 = 0;
        if (((byte)local_90[0] & 1) != 0) {
          operator_delete(local_80);
        }
                    /* try { // try from 009a4b20 to 009a4b43 has its CatchHandler @ 009a5078 */
        pcVar5 = ERR_error_string(uVar4,(char *)0x0);
        pbVar9 = (basic_string_conflict *)strlen(pcVar5);
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 param_1,pcVar5,(ulong)pbVar9);
      }
    }
                    /* try { // try from 009a4bc0 to 009a4bf7 has its CatchHandler @ 009a5080 */
    ERR_clear_error();
    uVar4 = SocketTLSOptions::isPeerVerifyDisabled(this_01);
    if ((uVar4 & 1) == 0) {
      uVar4 = SocketTLSOptions::isUsingSystemDefaults(this_01);
      if ((uVar4 & 1) == 0) {
                    /* try { // try from 009a4c40 to 009a4c47 has its CatchHandler @ 009a5080 */
        uVar4 = SocketTLSOptions::isUsingInMemoryCAs(this_01);
        pSVar8 = this + 0x88;
        if ((uVar4 & 1) == 0) {
          if (((byte)*pSVar8 & 1) == 0) {
            file = this + 0x89;
          }
          else {
            file = *(SocketOpenSSL **)(this + 0x98);
          }
                    /* try { // try from 009a4cb8 to 009a4cdf has its CatchHandler @ 009a506c */
          name_list = SSL_load_client_CA_file((char *)file);
          if (name_list == (stack_st_X509_NAME *)0x0) {
                    /* try { // try from 009a4d48 to 009a4d4b has its CatchHandler @ 009a504c */
            uVar4 = ERR_get_error();
                    /* try { // try from 009a4d50 to 009a4d63 has its CatchHandler @ 009a5024 */
            std::__ndk1::operator+
                      ((__ndk1 *)"OpenSSL failed - SSL_load_client_CA_file(\'",(char *)pSVar8,pbVar9
                      );
                    /* try { // try from 009a4d64 to 009a4d77 has its CatchHandler @ 009a5020 */
            pbVar9 = (basic_string_conflict *)
                     std::__ndk1::
                     basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                     ::append(local_90,"\') failed: ",0xb);
            uVar7 = *(undefined8 *)(pbVar9 + 0x10);
            bVar1 = *pbVar9;
            uStack_70 = (undefined7)((ulong)*(undefined8 *)(pbVar9 + 8) >> 8);
            uStack_78 = (undefined7)*(undefined8 *)(pbVar9 + 1);
            local_71 = (undefined1)((ulong)*(undefined8 *)(pbVar9 + 1) >> 0x38);
            *(undefined8 *)pbVar9 = 0;
            *(undefined8 *)(pbVar9 + 8) = 0;
            *(undefined8 *)(pbVar9 + 0x10) = 0;
            if (((byte)*param_1 & 1) == 0) {
              *(undefined2 *)param_1 = 0;
            }
            else {
              **(undefined1 **)(param_1 + 0x10) = 0;
              *(undefined8 *)(param_1 + 8) = 0;
              if (((byte)*param_1 & 1) != 0) {
                operator_delete(*(void **)(param_1 + 0x10));
                *(undefined8 *)param_1 = 0;
              }
            }
            *param_1 = bVar1;
            *(ulong *)(param_1 + 1) = CONCAT17(local_71,uStack_78);
            *(ulong *)(param_1 + 8) = CONCAT71(uStack_70,local_71);
            *(undefined8 *)(param_1 + 0x10) = uVar7;
            uStack_70 = 0;
            uStack_78 = 0;
            local_71 = 0;
            if (((byte)local_90[0] & 1) != 0) {
              operator_delete(local_80);
            }
                    /* try { // try from 009a4e50 to 009a4e73 has its CatchHandler @ 009a504c */
            pcVar5 = ERR_error_string(uVar4,(char *)0x0);
            sVar6 = strlen(pcVar5);
            std::__ndk1::
            basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                      ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        *)param_1,pcVar5,sVar6);
          }
          else {
            SSL_CTX_set_client_CA_list(*(SSL_CTX **)(this + 0x48),name_list);
            pbVar9 = (basic_string_conflict *)0x0;
            iVar3 = SSL_CTX_load_verify_locations
                              (*(SSL_CTX **)(this + 0x48),(char *)file,(char *)0x0);
            if (iVar3 != 1) {
                    /* try { // try from 009a4ce8 to 009a4ceb has its CatchHandler @ 009a5028 */
              uVar4 = ERR_get_error();
                    /* try { // try from 009a4cf0 to 009a4d03 has its CatchHandler @ 009a501c */
              std::__ndk1::operator+
                        ((__ndk1 *)"OpenSSL failed - SSL_CTX_load_verify_locations(\"",
                         (char *)pSVar8,pbVar9);
                    /* try { // try from 009a4d04 to 009a4d17 has its CatchHandler @ 009a5018 */
              pbVar9 = (basic_string_conflict *)
                       std::__ndk1::
                       basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       ::append(local_90,"\") failed: ",0xb);
              uVar7 = *(undefined8 *)(pbVar9 + 0x10);
              bVar1 = *pbVar9;
              uStack_70 = (undefined7)((ulong)*(undefined8 *)(pbVar9 + 8) >> 8);
              uStack_78 = (undefined7)*(undefined8 *)(pbVar9 + 1);
              local_71 = (undefined1)((ulong)*(undefined8 *)(pbVar9 + 1) >> 0x38);
              *(undefined8 *)pbVar9 = 0;
              *(undefined8 *)(pbVar9 + 8) = 0;
              *(undefined8 *)(pbVar9 + 0x10) = 0;
              if (((byte)*param_1 & 1) == 0) {
                *(undefined2 *)param_1 = 0;
              }
              else {
                **(undefined1 **)(param_1 + 0x10) = 0;
                *(undefined8 *)(param_1 + 8) = 0;
                if (((byte)*param_1 & 1) != 0) {
                  operator_delete(*(void **)(param_1 + 0x10));
                  *(undefined8 *)param_1 = 0;
                }
              }
              *param_1 = bVar1;
              *(ulong *)(param_1 + 1) = CONCAT17(local_71,uStack_78);
              *(ulong *)(param_1 + 8) = CONCAT71(uStack_70,local_71);
              *(undefined8 *)(param_1 + 0x10) = uVar7;
              uStack_70 = 0;
              uStack_78 = 0;
              local_71 = 0;
              if (((byte)local_90[0] & 1) != 0) {
                operator_delete(local_80);
              }
                    /* try { // try from 009a4ecc to 009a4eef has its CatchHandler @ 009a5028 */
              pcVar5 = ERR_error_string(uVar4,(char *)0x0);
              sVar6 = strlen(pcVar5);
              std::__ndk1::
              basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                        ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                          *)param_1,pcVar5,sVar6);
            }
          }
        }
        else {
          uStack_a8 = 0;
          local_a0 = (void *)0x0;
          local_b0 = 0;
          if (((byte)*pSVar8 & 1) == 0) {
            local_a0 = *(void **)(this + 0x98);
            uStack_a8 = *(ulong *)(this + 0x90);
            local_b0 = *(ulong *)pSVar8;
          }
          else {
            uVar4 = *(ulong *)(this + 0x90);
            if (0xffffffffffffffef < uVar4) {
                    /* try { // try from 009a5010 to 009a5017 has its CatchHandler @ 009a5080 */
                    /* WARNING: Subroutine does not return */
              std::__ndk1::__basic_string_common<true>::__throw_length_error();
            }
            __src = *(void **)(this + 0x98);
            if (uVar4 < 0x17) {
              __dest = (void *)((ulong)&local_b0 | 1);
              local_b0 = (ulong)(byte)((int)uVar4 << 1);
              if (uVar4 != 0) goto LAB_009a4dc8;
            }
            else {
              uVar10 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 009a4db0 to 009a4db7 has its CatchHandler @ 009a5080 */
              __dest = operator_new(uVar10);
              local_b0 = uVar10 | 1;
              uStack_a8 = uVar4;
              local_a0 = __dest;
LAB_009a4dc8:
              memcpy(__dest,__src,uVar4);
            }
            *(undefined1 *)((long)__dest + uVar4) = 0;
          }
                    /* try { // try from 009a4ddc to 009a4de7 has its CatchHandler @ 009a502c */
          openSSLAddCARootsFromString(this,&local_b0);
          if ((local_b0 & 1) != 0) {
            operator_delete(local_a0);
          }
        }
      }
      else {
        iVar3 = SSL_CTX_set_default_verify_paths(*(SSL_CTX **)(this + 0x48));
        if (iVar3 == 0) {
                    /* try { // try from 009a4bfc to 009a4c3b has its CatchHandler @ 009a5070 */
          uVar4 = ERR_get_error();
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)param_1,"OpenSSL failed - SSL_CTX_default_verify_paths loading failed: ",
                     0x3e);
          pcVar5 = ERR_error_string(uVar4,(char *)0x0);
          sVar6 = strlen(pcVar5);
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)param_1,pcVar5,sVar6);
        }
      }
                    /* try { // try from 009a4ef4 to 009a4ffb has its CatchHandler @ 009a5080 */
      SSL_CTX_set_verify(*(SSL_CTX **)(this + 0x48),3,(callback *)0x0);
      SSL_CTX_set_verify_depth(*(SSL_CTX **)(this + 0x48),4);
    }
    else {
      SSL_CTX_set_verify(*(SSL_CTX **)(this + 0x48),0,(callback *)0x0);
    }
    uVar4 = SocketTLSOptions::isUsingDefaultCiphers(this_01);
    if ((uVar4 & 1) == 0) {
      if (((byte)this[0xa0] & 1) == 0) {
        pSVar8 = this + 0xa1;
      }
      else {
        pSVar8 = *(SocketOpenSSL **)(this + 0xb0);
      }
      iVar3 = SSL_CTX_set_cipher_list(*(SSL_CTX **)(this + 0x48),(char *)pSVar8);
    }
    else {
      pcVar5 = DAT_00d21880;
      if ((DAT_00d21870 & 1) == 0) {
        pcVar5 = &DAT_00d21871;
      }
      iVar3 = SSL_CTX_set_cipher_list(*(SSL_CTX **)(this + 0x48),pcVar5);
    }
    if (iVar3 != 1) goto LAB_009a4f84;
    s = SSL_new(*(SSL_CTX **)(this + 0x48));
    *(SSL **)(this + 0x40) = s;
    if (s == (SSL *)0x0) {
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             param_1,"OpenSSL failed to connect",0x19);
      SSL_CTX_free(*(SSL_CTX **)(this + 0x48));
      goto LAB_009a49c8;
    }
    SSL_set_fd(s,*(int *)(this + 8));
    uVar4 = openSSLServerHandshake(this,param_1);
    std::__ndk1::mutex::unlock(this_00);
    if ((uVar4 & 1) != 0) {
      uVar7 = 1;
      goto LAB_009a4f90;
    }
    close(this);
  }
  uVar7 = 0;
LAB_009a4f90:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar7);
  }
  return;
}

