/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00992d28
 */

/* ix::WebSocketPerMessageDeflateOptions::startsWith(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&) */

ulong ix::WebSocketPerMessageDeflateOptions::startsWith
                (basic_string_conflict *param_1,basic_string_conflict *param_2)

{
  ulong uVar1;
  size_t __n;
  basic_string_conflict *__s2;
  basic_string_conflict bVar2;
  long lVar3;
  int iVar4;
  long lVar5;
  basic_ostream *pbVar6;
  ulong uVar7;
  basic_string_conflict *__s1;
  undefined **ppuStack_1a0;
  undefined **ppuStack_198;
  locale alStack_190 [8];
  undefined8 uStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  ulong uStack_158;
  undefined8 uStack_150;
  void *pvStack_148;
  undefined8 uStack_140;
  undefined4 uStack_138;
  undefined **appuStack_130 [17];
  undefined8 uStack_a8;
  undefined4 uStack_a0;
  long lStack_90;
  
  __s2 = *(basic_string_conflict **)(param_2 + 0x10);
  bVar2 = *param_1;
  uVar7 = (ulong)((byte)*param_2 >> 1);
  if (((byte)*param_2 & 1) == 0) {
    __s2 = param_2 + 1;
  }
  else {
    uVar7 = *(ulong *)(param_2 + 8);
  }
  uVar1 = (ulong)((byte)bVar2 >> 1);
  if (((byte)bVar2 & 1) != 0) {
    uVar1 = *(ulong *)(param_1 + 8);
  }
  if (uVar7 == 0xffffffffffffffff) {
    lVar5 = std::__ndk1::__basic_string_common<true>::__throw_out_of_range();
    lVar3 = tpidr_el0;
    lStack_90 = *(long *)(lVar3 + 0x28);
    ppuStack_1a0 = &PTR_FUN_00c4e508;
    appuStack_130[0] = &PTR__basic_istream_00c4e640;
    std::__ndk1::ios_base::init((ios_base *)appuStack_130,&ppuStack_198);
    uStack_a8 = 0;
    uStack_a0 = 0xffffffff;
    appuStack_130[0] = &PTR_FUN_00c4e530;
    ppuStack_198 = &PTR__basic_streambuf_00c4e728;
    ppuStack_1a0 = &PTR_FUN_00c4e508;
    std::__ndk1::locale::locale(alStack_190);
    uStack_160 = 0;
    uStack_168 = 0;
    uStack_170 = 0;
    uStack_178 = 0;
    uStack_180 = 0;
    uStack_188 = 0;
    uStack_140 = 0;
    pvStack_148 = (void *)0x0;
    uStack_150 = 0;
    uStack_158 = 0;
    ppuStack_198 = &PTR_LAB_00c4e678;
    uStack_138 = 0x18;
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              ((basic_ostream *)&ppuStack_1a0,"Sec-WebSocket-Extensions: permessage-deflate",0x2c);
    if (*(char *)(lVar5 + 1) != '\0') {
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                ((basic_ostream *)&ppuStack_1a0,"; client_no_context_takeover",0x1c);
    }
    if (*(char *)(lVar5 + 2) != '\0') {
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                ((basic_ostream *)&ppuStack_1a0,"; server_no_context_takeover",0x1c);
    }
    pbVar6 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                       ((basic_ostream *)&ppuStack_1a0,"; server_max_window_bits=",0x19);
    std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
              ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar6,
               (uint)*(byte *)(lVar5 + 4));
    pbVar6 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                       ((basic_ostream *)&ppuStack_1a0,"; client_max_window_bits=",0x19);
    std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
              ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar6,
               (uint)*(byte *)(lVar5 + 3));
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              ((basic_ostream *)&ppuStack_1a0,"\r\n",2);
    std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    str();
    appuStack_130[0] = &PTR_FUN_00c4e530;
    ppuStack_1a0 = &PTR_FUN_00c4e508;
    ppuStack_198 = &PTR_LAB_00c4e678;
    if ((uStack_158 & 1) != 0) {
      operator_delete(pvStack_148);
    }
    ppuStack_198 = &PTR__basic_streambuf_00c4e728;
    std::__ndk1::locale::~locale(alStack_190);
    uVar7 = std::__ndk1::ios_base::~ios_base((ios_base *)appuStack_130);
    if (*(long *)(lVar3 + 0x28) != lStack_90) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    return uVar7;
  }
  __n = uVar1;
  if (uVar7 <= uVar1) {
    __n = uVar7;
  }
  if (__n != 0) {
    __s1 = *(basic_string_conflict **)(param_1 + 0x10);
    if (((byte)bVar2 & 1) == 0) {
      __s1 = param_1 + 1;
    }
    iVar4 = memcmp(__s1,__s2,__n);
    if (iVar4 != 0) goto LAB_00992d90;
  }
  iVar4 = -(uint)(uVar1 < uVar7);
LAB_00992d90:
  return (ulong)(iVar4 == 0);
}

