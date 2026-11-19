/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a41d4
 */

/* ix::SocketOpenSSL::handleTLSOptions(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&) */

void ix::SocketOpenSSL::handleTLSOptions(basic_string_conflict *param_1)

{
  SocketTLSOptions *this;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar1;
  long lVar2;
  int iVar3;
  undefined4 uVar4;
  ulong uVar5;
  undefined8 *puVar6;
  ulong *puVar7;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar8;
  char *pcVar9;
  size_t sVar10;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x1;
  basic_string_conflict *in_x2;
  basic_string_conflict *pbVar11;
  basic_string_conflict *pbVar12;
  undefined8 uVar13;
  void *__src;
  void *__dest;
  ulong uVar14;
  ulong local_d0;
  ulong uStack_c8;
  void *local_c0;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_b8 [16];
  void *local_a8;
  ulong local_a0;
  ulong uStack_98;
  void *local_90;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_80;
  undefined6 uStack_7f;
  undefined1 uStack_79;
  undefined7 uStack_78;
  undefined1 uStack_71;
  void *local_70;
  undefined7 uStack_68;
  undefined1 local_61;
  undefined7 uStack_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  ERR_clear_error();
  this = (SocketTLSOptions *)(param_1 + 0x58);
  uVar5 = SocketTLSOptions::hasCertAndKey(this);
  if ((uVar5 & 1) != 0) {
    if (((byte)param_1[0x58] & 1) == 0) {
      pbVar12 = param_1 + 0x59;
    }
    else {
      pbVar12 = *(basic_string_conflict **)(param_1 + 0x68);
    }
    iVar3 = SSL_CTX_use_certificate_chain_file(*(SSL_CTX **)(param_1 + 0x48),(char *)pbVar12);
    if (iVar3 == 1) {
      if (((byte)param_1[0x70] & 1) == 0) {
        pbVar12 = param_1 + 0x71;
      }
      else {
        pbVar12 = *(basic_string_conflict **)(param_1 + 0x80);
      }
      pbVar11 = (basic_string_conflict *)0x1;
      iVar3 = SSL_CTX_use_PrivateKey_file(*(SSL_CTX **)(param_1 + 0x48),(char *)pbVar12,1);
      if (iVar3 != 1) {
        uVar5 = ERR_get_error();
        std::__ndk1::operator+
                  ((__ndk1 *)"OpenSSL failed - SSL_CTX_use_PrivateKey_file(\"",
                   (char *)(param_1 + 0x70),pbVar11);
                    /* try { // try from 009a4388 to 009a439b has its CatchHandler @ 009a4898 */
        pbVar8 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 std::__ndk1::
                 basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                 append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                         *)&local_a0,"\") failed: ",0xb);
        goto LAB_009a439c;
      }
      iVar3 = SSL_CTX_check_private_key(*(SSL_CTX **)(param_1 + 0x48));
      if (iVar3 != 0) goto LAB_009a4448;
      uVar5 = ERR_get_error();
      std::__ndk1::operator+((__ndk1 *)"OpenSSL failed - cert/key mismatch(\"",(char *)this,pbVar11)
      ;
                    /* try { // try from 009a42c4 to 009a42d7 has its CatchHandler @ 009a486c */
      puVar6 = (undefined8 *)
               std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               append(local_b8,", ",2);
      local_70 = (void *)puVar6[2];
      uVar13 = *puVar6;
      uStack_78 = (undefined7)puVar6[1];
      uStack_71 = (undefined1)((ulong)puVar6[1] >> 0x38);
      local_80 = SUB81(uVar13,0);
      uStack_7f = (undefined6)((ulong)uVar13 >> 8);
      uStack_79 = (undefined1)((ulong)uVar13 >> 0x38);
      puVar6[1] = 0;
      puVar6[2] = 0;
      *puVar6 = 0;
      uVar14 = *(ulong *)(param_1 + 0x78);
      pbVar12 = *(basic_string_conflict **)(param_1 + 0x80);
      if (((byte)param_1[0x70] & 1) == 0) {
        pbVar12 = param_1 + 0x71;
        uVar14 = (ulong)((byte)param_1[0x70] >> 1);
      }
                    /* try { // try from 009a4308 to 009a430f has its CatchHandler @ 009a484c */
      puVar7 = (ulong *)std::__ndk1::
                        basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        ::append(&local_80,(char *)pbVar12,uVar14);
      local_90 = (void *)puVar7[2];
      uStack_98 = puVar7[1];
      local_a0 = *puVar7;
      *puVar7 = 0;
      puVar7[1] = 0;
      puVar7[2] = 0;
                    /* try { // try from 009a4328 to 009a433b has its CatchHandler @ 009a4818 */
      pbVar8 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
               std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       *)&local_a0,"\")",2);
      uVar13 = *(undefined8 *)(pbVar8 + 0x10);
      bVar1 = *pbVar8;
      uStack_60 = (undefined7)((ulong)*(undefined8 *)(pbVar8 + 8) >> 8);
      uStack_68 = (undefined7)*(undefined8 *)(pbVar8 + 1);
      local_61 = (undefined1)((ulong)*(undefined8 *)(pbVar8 + 1) >> 0x38);
      *(undefined8 *)pbVar8 = 0;
      *(undefined8 *)(pbVar8 + 8) = 0;
      *(undefined8 *)(pbVar8 + 0x10) = 0;
      if (((byte)*in_x1 & 1) == 0) {
        *(undefined2 *)in_x1 = 0;
      }
      else {
        **(undefined1 **)(in_x1 + 0x10) = 0;
        *(undefined8 *)(in_x1 + 8) = 0;
        if (((byte)*in_x1 & 1) != 0) {
          operator_delete(*(void **)(in_x1 + 0x10));
          *(undefined8 *)in_x1 = 0;
        }
      }
      *in_x1 = bVar1;
      *(ulong *)(in_x1 + 1) = CONCAT17(local_61,uStack_68);
      *(ulong *)(in_x1 + 8) = CONCAT71(uStack_60,local_61);
      *(undefined8 *)(in_x1 + 0x10) = uVar13;
      uStack_60 = 0;
      uStack_68 = 0;
      local_61 = 0;
      if ((local_a0 & 1) != 0) {
        operator_delete(local_90);
        if (((byte)local_80 & 1) == 0) goto LAB_009a47d8;
LAB_009a47f4:
        operator_delete(local_70);
        if (((byte)local_b8[0] & 1) == 0) goto LAB_009a4424;
        goto LAB_009a4420;
      }
      if (((byte)local_80 & 1) != 0) goto LAB_009a47f4;
LAB_009a47d8:
      if (((byte)local_b8[0] & 1) != 0) goto LAB_009a4420;
    }
    else {
      uVar5 = ERR_get_error();
      std::__ndk1::operator+
                ((__ndk1 *)"OpenSSL failed - SSL_CTX_use_certificate_chain_file(\"",(char *)this,
                 in_x2);
                    /* try { // try from 009a4270 to 009a4283 has its CatchHandler @ 009a48a4 */
      pbVar8 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
               std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       *)&local_a0,"\") failed: ",0xb);
LAB_009a439c:
      bVar1 = *pbVar8;
      uStack_78 = (undefined7)((ulong)*(undefined8 *)(pbVar8 + 8) >> 8);
      uVar13 = *(undefined8 *)(pbVar8 + 1);
      local_80 = SUB81(uVar13,0);
      uStack_7f = (undefined6)((ulong)uVar13 >> 8);
      uStack_79 = (undefined1)((ulong)uVar13 >> 0x38);
      *(undefined8 *)pbVar8 = 0;
      *(undefined8 *)(pbVar8 + 8) = 0;
      uVar13 = *(undefined8 *)(pbVar8 + 0x10);
      *(undefined8 *)(pbVar8 + 0x10) = 0;
      if (((byte)*in_x1 & 1) == 0) {
        *(undefined2 *)in_x1 = 0;
      }
      else {
        **(undefined1 **)(in_x1 + 0x10) = 0;
        *(undefined8 *)(in_x1 + 8) = 0;
        if (((byte)*in_x1 & 1) != 0) {
          operator_delete(*(void **)(in_x1 + 0x10));
          *(undefined8 *)in_x1 = 0;
        }
      }
      *in_x1 = bVar1;
      *(ulong *)(in_x1 + 1) = CONCAT17(uStack_79,CONCAT61(uStack_7f,local_80));
      *(ulong *)(in_x1 + 8) = CONCAT71(uStack_78,uStack_79);
      *(undefined8 *)(in_x1 + 0x10) = uVar13;
      uStack_78 = 0;
      local_80 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0
      ;
      uStack_7f = 0;
      uStack_79 = 0;
      if ((local_a0 & 1) != 0) {
        local_a8 = local_90;
LAB_009a4420:
        operator_delete(local_a8);
      }
    }
LAB_009a4424:
    pcVar9 = ERR_error_string(uVar5,(char *)0x0);
    sVar10 = strlen(pcVar9);
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    append(in_x1,pcVar9,sVar10);
  }
LAB_009a4448:
  ERR_clear_error();
  uVar5 = SocketTLSOptions::isPeerVerifyDisabled(this);
  if ((uVar5 & 1) == 0) {
    uVar5 = SocketTLSOptions::isUsingSystemDefaults(this);
    if ((uVar5 & 1) == 0) {
      uVar5 = SocketTLSOptions::isUsingInMemoryCAs(this);
      if ((uVar5 & 1) != 0) {
        uStack_c8 = 0;
        local_c0 = (void *)0x0;
        local_d0 = 0;
        if (((byte)param_1[0x88] & 1) == 0) {
          local_c0 = *(void **)(param_1 + 0x98);
          uStack_c8 = *(ulong *)(param_1 + 0x90);
          local_d0 = *(ulong *)(param_1 + 0x88);
        }
        else {
          uVar5 = *(ulong *)(param_1 + 0x90);
          if (0xffffffffffffffef < uVar5) {
                    /* WARNING: Subroutine does not return */
            std::__ndk1::__basic_string_common<true>::__throw_length_error();
          }
          __src = *(void **)(param_1 + 0x98);
          if (uVar5 < 0x17) {
            __dest = (void *)((ulong)&local_d0 | 1);
            local_d0 = (ulong)(byte)((int)uVar5 << 1);
            if (uVar5 != 0) goto LAB_009a458c;
          }
          else {
            uVar14 = uVar5 + 0x10 & 0xfffffffffffffff0;
            __dest = operator_new(uVar14);
            local_d0 = uVar14 | 1;
            uStack_c8 = uVar5;
            local_c0 = __dest;
LAB_009a458c:
            memcpy(__dest,__src,uVar5);
          }
          *(undefined1 *)((long)__dest + uVar5) = 0;
        }
                    /* try { // try from 009a45a0 to 009a45ab has its CatchHandler @ 009a4884 */
        openSSLAddCARootsFromString((SocketOpenSSL *)param_1,&local_d0);
        if ((local_d0 & 1) != 0) {
          operator_delete(local_c0);
        }
        goto LAB_009a45bc;
      }
      if (((byte)param_1[0x88] & 1) == 0) {
        pbVar12 = param_1 + 0x89;
      }
      else {
        pbVar12 = *(basic_string_conflict **)(param_1 + 0x98);
      }
      pbVar11 = (basic_string_conflict *)0x0;
      iVar3 = SSL_CTX_load_verify_locations
                        (*(SSL_CTX **)(param_1 + 0x48),(char *)pbVar12,(char *)0x0);
      if (iVar3 == 1) goto LAB_009a45bc;
      uVar5 = ERR_get_error();
      std::__ndk1::operator+
                ((__ndk1 *)"OpenSSL failed - SSL_CTX_load_verify_locations(\"",
                 (char *)(param_1 + 0x88),pbVar11);
                    /* try { // try from 009a4554 to 009a4567 has its CatchHandler @ 009a4880 */
      pbVar8 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
               std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       *)&local_a0,"\") failed: ",0xb);
      goto LAB_009a46a8;
    }
    iVar3 = SSL_CTX_set_default_verify_paths(*(SSL_CTX **)(param_1 + 0x48));
    if (iVar3 != 0) {
LAB_009a45bc:
      pbVar12 = (basic_string_conflict *)&LAB_009a53fc;
      SSL_CTX_set_verify(*(SSL_CTX **)(param_1 + 0x48),1,(callback *)&LAB_009a53fc);
      SSL_CTX_set_verify_depth(*(SSL_CTX **)(param_1 + 0x48),4);
      goto LAB_009a45e0;
    }
    uVar5 = ERR_get_error();
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign(in_x1,"OpenSSL failed - SSL_CTX_default_verify_paths loading failed: ",0x3e);
  }
  else {
    pbVar12 = (basic_string_conflict *)0x0;
    SSL_CTX_set_verify(*(SSL_CTX **)(param_1 + 0x48),0,(callback *)0x0);
LAB_009a45e0:
    uVar5 = SocketTLSOptions::isUsingDefaultCiphers(this);
    if ((uVar5 & 1) == 0) {
      if (((byte)param_1[0xa0] & 1) == 0) {
        pbVar11 = param_1 + 0xa1;
      }
      else {
        pbVar11 = *(basic_string_conflict **)(param_1 + 0xb0);
      }
      iVar3 = SSL_CTX_set_cipher_list(*(SSL_CTX **)(param_1 + 0x48),(char *)pbVar11);
      uVar4 = 1;
      if (iVar3 == 1) goto LAB_009a4758;
      uVar5 = ERR_get_error();
      std::__ndk1::operator+
                ((__ndk1 *)"OpenSSL failed - SSL_CTX_set_cipher_list(\"",(char *)(param_1 + 0xa0),
                 pbVar12);
                    /* try { // try from 009a4694 to 009a46a7 has its CatchHandler @ 009a489c */
      pbVar8 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
               std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       *)&local_a0,"\") failed: ",0xb);
    }
    else {
      pcVar9 = DAT_00d21880;
      if ((DAT_00d21870 & 1) == 0) {
        pcVar9 = &DAT_00d21871;
      }
      iVar3 = SSL_CTX_set_cipher_list(*(SSL_CTX **)(param_1 + 0x48),pcVar9);
      uVar4 = 1;
      if (iVar3 == 1) goto LAB_009a4758;
      uVar5 = ERR_get_error();
      std::__ndk1::operator+
                ((__ndk1 *)"OpenSSL failed - SSL_CTX_set_cipher_list(\"",(char *)&DAT_00d21870,
                 pbVar12);
                    /* try { // try from 009a4638 to 009a464b has its CatchHandler @ 009a48a0 */
      pbVar8 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
               std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       *)&local_a0,"\") failed: ",0xb);
    }
LAB_009a46a8:
    bVar1 = *pbVar8;
    uStack_78 = (undefined7)((ulong)*(undefined8 *)(pbVar8 + 8) >> 8);
    uVar13 = *(undefined8 *)(pbVar8 + 1);
    local_80 = SUB81(uVar13,0);
    uStack_7f = (undefined6)((ulong)uVar13 >> 8);
    uStack_79 = (undefined1)((ulong)uVar13 >> 0x38);
    *(undefined8 *)pbVar8 = 0;
    *(undefined8 *)(pbVar8 + 8) = 0;
    uVar13 = *(undefined8 *)(pbVar8 + 0x10);
    *(undefined8 *)(pbVar8 + 0x10) = 0;
    if (((byte)*in_x1 & 1) == 0) {
      *(undefined2 *)in_x1 = 0;
    }
    else {
      **(undefined1 **)(in_x1 + 0x10) = 0;
      *(undefined8 *)(in_x1 + 8) = 0;
      if (((byte)*in_x1 & 1) != 0) {
        operator_delete(*(void **)(in_x1 + 0x10));
        *(undefined8 *)in_x1 = 0;
      }
    }
    *in_x1 = bVar1;
    *(ulong *)(in_x1 + 1) = CONCAT17(uStack_79,CONCAT61(uStack_7f,local_80));
    *(ulong *)(in_x1 + 8) = CONCAT71(uStack_78,uStack_79);
    *(undefined8 *)(in_x1 + 0x10) = uVar13;
    uStack_78 = 0;
    local_80 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
    uStack_7f = 0;
    uStack_79 = 0;
    if ((local_a0 & 1) != 0) {
      operator_delete(local_90);
    }
  }
  pcVar9 = ERR_error_string(uVar5,(char *)0x0);
  sVar10 = strlen(pcVar9);
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  append(in_x1,pcVar9,sVar10);
  uVar4 = 0;
LAB_009a4758:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

