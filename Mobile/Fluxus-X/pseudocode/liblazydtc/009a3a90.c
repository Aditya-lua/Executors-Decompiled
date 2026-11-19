/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a3a90
 */

/* ix::SocketOpenSSL::getSSLError(int) */

void ix::SocketOpenSSL::getSSLError(int param_1)

{
  int iVar1;
  undefined8 *puVar2;
  ulong uVar3;
  size_t sVar4;
  int in_w1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  undefined1 uVar5;
  undefined2 uVar6;
  char *pcVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  
  iVar1 = SSL_get_error(*(SSL **)((ulong)(uint)param_1 + 0x40),in_w1);
  if (iVar1 - 7U < 2) {
    *(undefined8 *)in_x8 = 0;
    *(undefined8 *)(in_x8 + 8) = 0;
    *(undefined8 *)(in_x8 + 0x10) = 0;
    puVar2 = operator_new(0x30);
    *(undefined8 **)(in_x8 + 0x10) = puVar2;
    uVar5 = 0x65;
    uVar6 = 0x7275;
    pcVar7 = "OpenSSL failed - connection failure";
LAB_009a3ae0:
    uVar9 = *(undefined8 *)(pcVar7 + 8);
    uVar8 = *(undefined8 *)pcVar7;
    uVar11 = *(undefined8 *)(pcVar7 + 0x18);
    uVar10 = *(undefined8 *)(pcVar7 + 0x10);
    *(undefined1 *)((long)puVar2 + 0x22) = uVar5;
    *(undefined2 *)(puVar2 + 4) = uVar6;
    *(undefined8 *)(in_x8 + 8) = 0x23;
    *(undefined8 *)in_x8 = 0x31;
    puVar2[1] = uVar9;
    *puVar2 = uVar8;
    puVar2[3] = uVar11;
    puVar2[2] = uVar10;
    *(undefined1 *)((long)puVar2 + 0x23) = 0;
  }
  else {
    switch(iVar1) {
    case 0:
      *(undefined8 *)in_x8 = 0;
      *(undefined8 *)(in_x8 + 8) = 0;
      *(undefined8 *)(in_x8 + 0x10) = 0;
      pcVar7 = operator_new(0x20);
      *(char **)(in_x8 + 0x10) = pcVar7;
      *(undefined8 *)(in_x8 + 8) = 0x19;
      *(undefined8 *)in_x8 = 0x21;
      builtin_strncpy(pcVar7,"OpenSSL failed - err none",0x1a);
      break;
    case 1:
      uVar3 = ERR_get_error();
      *(undefined8 *)(in_x8 + 8) = 0;
      *(undefined8 *)(in_x8 + 0x10) = 0;
      *(undefined8 *)in_x8 = 0;
      *in_x8 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x22;
      in_x8[0x11] = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)
                    0x20;
      *(undefined8 *)(in_x8 + 9) = 0x2d2064656c696166;
      *(undefined8 *)(in_x8 + 1) = 0x204c53536e65704f;
      in_x8[0x12] = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)
                    0x0;
                    /* try { // try from 009a3b98 to 009a3bb7 has its CatchHandler @ 009a3d40 */
      pcVar7 = ERR_error_string(uVar3,(char *)0x0);
      sVar4 = strlen(pcVar7);
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append(in_x8,pcVar7,sVar4);
      break;
    default:
      *(undefined8 *)in_x8 = 0;
      *(undefined8 *)(in_x8 + 8) = 0;
      *(undefined8 *)(in_x8 + 0x10) = 0;
      pcVar7 = operator_new(0x20);
      *(char **)(in_x8 + 0x10) = pcVar7;
      *(undefined8 *)(in_x8 + 8) = 0x1e;
      *(undefined8 *)in_x8 = 0x21;
      builtin_strncpy(pcVar7,"OpenSSL failed - unknown error",0x1f);
      break;
    case 4:
      *(undefined8 *)in_x8 = 0;
      *(undefined8 *)(in_x8 + 8) = 0;
      *(undefined8 *)(in_x8 + 0x10) = 0;
      pcVar7 = operator_new(0x20);
      *(char **)(in_x8 + 0x10) = pcVar7;
      *(undefined8 *)(in_x8 + 8) = 0x1b;
      *(undefined8 *)in_x8 = 0x21;
      builtin_strncpy(pcVar7,"OpenSSL failed - x509 error",0x1c);
      break;
    case 5:
      uVar3 = ERR_get_error();
      if (uVar3 != 0) {
        *(undefined8 *)(in_x8 + 8) = 0;
        *(undefined8 *)(in_x8 + 0x10) = 0;
        *(undefined8 *)in_x8 = 0;
        *in_x8 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)
                 0x22;
        in_x8[0x11] = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       )0x20;
        *(undefined8 *)(in_x8 + 9) = 0x2d2064656c696166;
        *(undefined8 *)(in_x8 + 1) = 0x204c53536e65704f;
        in_x8[0x12] = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       )0x0;
                    /* try { // try from 009a3c70 to 009a3c8f has its CatchHandler @ 009a3d3c */
        pcVar7 = ERR_error_string(uVar3,(char *)0x0);
        sVar4 = strlen(pcVar7);
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::append(in_x8,pcVar7,sVar4);
        return;
      }
      *(undefined8 *)in_x8 = 0;
      *(undefined8 *)(in_x8 + 8) = 0;
      *(undefined8 *)(in_x8 + 0x10) = 0;
      if (in_w1 != 0) {
        pcVar7 = operator_new(0x40);
        *(char **)(in_x8 + 0x10) = pcVar7;
        *(undefined8 *)(in_x8 + 8) = 0x35;
        *(undefined8 *)in_x8 = 0x41;
        builtin_strncpy(pcVar7,"OpenSSL failed - underlying BIO reported an I/O error",0x36);
        return;
      }
      puVar2 = operator_new(0x30);
      uVar5 = 0x46;
      uVar6 = 0x4f45;
      pcVar7 = "OpenSSL failed - received early EOF";
      *(undefined8 **)(in_x8 + 0x10) = puVar2;
      goto LAB_009a3ae0;
    case 6:
      *(undefined8 *)in_x8 = 0;
      *(undefined8 *)(in_x8 + 8) = 0;
      *(undefined8 *)(in_x8 + 0x10) = 0;
      pcVar7 = operator_new(0x30);
      *(char **)(in_x8 + 0x10) = pcVar7;
      pcVar7[0x20] = '\0';
      *(undefined8 *)(in_x8 + 8) = 0x20;
      *(undefined8 *)in_x8 = 0x31;
      builtin_strncpy(pcVar7,"OpenSSL failed - err zero return",0x20);
    }
  }
  return;
}

