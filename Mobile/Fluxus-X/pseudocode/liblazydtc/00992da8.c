/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00992da8
 */

/* ix::WebSocketPerMessageDeflateOptions::generateHeader() */

void __thiscall
ix::WebSocketPerMessageDeflateOptions::generateHeader(WebSocketPerMessageDeflateOptions *this)

{
  long lVar1;
  basic_ostream *pbVar2;
  undefined **local_180;
  undefined **ppuStack_178;
  locale alStack_170 [8];
  undefined8 local_168;
  undefined8 uStack_160;
  undefined8 local_158;
  undefined8 uStack_150;
  undefined8 local_148;
  undefined8 uStack_140;
  ulong local_138;
  undefined8 uStack_130;
  void *local_128;
  undefined8 uStack_120;
  undefined4 local_118;
  undefined **local_110 [17];
  undefined8 local_88;
  undefined4 local_80;
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  local_180 = &PTR_FUN_00c4e508;
  local_110[0] = &PTR__basic_istream_00c4e640;
                    /* try { // try from 00992e18 to 00992e23 has its CatchHandler @ 00992fc4 */
  std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
  local_88 = 0;
  local_80 = 0xffffffff;
  local_110[0] = &PTR_FUN_00c4e530;
  ppuStack_178 = &PTR__basic_streambuf_00c4e728;
  local_180 = &PTR_FUN_00c4e508;
  std::__ndk1::locale::locale(alStack_170);
  uStack_140 = 0;
  local_148 = 0;
  uStack_150 = 0;
  local_158 = 0;
  uStack_160 = 0;
  local_168 = 0;
  uStack_120 = 0;
  local_128 = (void *)0x0;
  uStack_130 = 0;
  local_138 = 0;
  ppuStack_178 = &PTR_LAB_00c4e678;
  local_118 = 0x18;
                    /* try { // try from 00992e98 to 00992f3b has its CatchHandler @ 00992fcc */
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            ((basic_ostream *)&local_180,"Sec-WebSocket-Extensions: permessage-deflate",0x2c);
  if (this[1] != (WebSocketPerMessageDeflateOptions)0x0) {
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              ((basic_ostream *)&local_180,"; client_no_context_takeover",0x1c);
  }
  if (this[2] != (WebSocketPerMessageDeflateOptions)0x0) {
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              ((basic_ostream *)&local_180,"; server_no_context_takeover",0x1c);
  }
  pbVar2 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     ((basic_ostream *)&local_180,"; server_max_window_bits=",0x19);
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar2,(uint)(byte)this[4]);
  pbVar2 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     ((basic_ostream *)&local_180,"; client_max_window_bits=",0x19);
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar2,(uint)(byte)this[3]);
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            ((basic_ostream *)&local_180,"\r\n",2);
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str();
  local_110[0] = &PTR_FUN_00c4e530;
  local_180 = &PTR_FUN_00c4e508;
  ppuStack_178 = &PTR_LAB_00c4e678;
  if ((local_138 & 1) != 0) {
    operator_delete(local_128);
  }
  ppuStack_178 = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale(alStack_170);
  std::__ndk1::ios_base::~ios_base((ios_base *)local_110);
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

