/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00977dc8
 */

/* ix::HttpClient::serializeHttpFormDataParameters(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::unordered_map<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::hash<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::equal_to<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > > const&, std::__ndk1::unordered_map<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >,
   std::__ndk1::hash<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, std::__ndk1::equal_to<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > > const&) */

void __thiscall
ix::HttpClient::serializeHttpFormDataParameters
          (HttpClient *this,basic_string_conflict *param_1,unordered_map *param_2,
          unordered_map *param_3)

{
  ulong uVar1;
  char *pcVar2;
  basic_string_conflict *pbVar3;
  long lVar4;
  basic_ostream *pbVar5;
  long *plVar6;
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
  
  lVar4 = tpidr_el0;
  local_70 = *(long *)(lVar4 + 0x28);
  local_180 = &PTR_FUN_00c4e508;
  local_110[0] = &PTR__basic_istream_00c4e640;
                    /* try { // try from 00977e40 to 00977e4b has its CatchHandler @ 009781ec */
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
  plVar6 = *(long **)(param_2 + 0x10);
  if (plVar6 != (long *)0x0) {
    do {
                    /* try { // try from 00977ee0 to 00978007 has its CatchHandler @ 009781f8 */
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         ((basic_ostream *)&local_180,"--",2);
      uVar1 = (ulong)((byte)*param_1 >> 1);
      pbVar3 = param_1 + 1;
      if (((byte)*param_1 & 1) != 0) {
        uVar1 = *(ulong *)(param_1 + 8);
        pbVar3 = *(basic_string_conflict **)(param_1 + 0x10);
      }
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,(char *)pbVar3,uVar1);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"\r\n",2);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"Content-Disposition:",0x14);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5," form-data; name=\"",0x12);
      uVar1 = plVar6[3];
      pcVar2 = (char *)plVar6[4];
      if ((*(byte *)(plVar6 + 2) & 1) == 0) {
        pcVar2 = (char *)((long)plVar6 + 0x11);
        uVar1 = (ulong)(*(byte *)(plVar6 + 2) >> 1);
      }
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,pcVar2,uVar1);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"\";",2);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5," filename=\"",0xb);
      uVar1 = (ulong)(*(byte *)(plVar6 + 2) >> 1);
      pcVar2 = (char *)((long)plVar6 + 0x11);
      if ((*(byte *)(plVar6 + 2) & 1) != 0) {
        uVar1 = plVar6[3];
        pcVar2 = (char *)plVar6[4];
      }
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,pcVar2,uVar1);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"\"",1);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"\r\n",2);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"Content-Type: application/octet-stream",0x26);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"\r\n",2);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"\r\n",2);
      uVar1 = (ulong)(*(byte *)(plVar6 + 5) >> 1);
      pcVar2 = (char *)((long)plVar6 + 0x29);
      if ((*(byte *)(plVar6 + 5) & 1) != 0) {
        uVar1 = plVar6[6];
        pcVar2 = (char *)plVar6[7];
      }
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,pcVar2,uVar1);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar5,"\r\n",2);
      plVar6 = (long *)*plVar6;
    } while (plVar6 != (long *)0x0);
  }
  plVar6 = *(long **)(param_3 + 0x10);
  if (plVar6 != (long *)0x0) {
    do {
                    /* try { // try from 00978044 to 0097810b has its CatchHandler @ 009781f4 */
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         ((basic_ostream *)&local_180,"--",2);
      uVar1 = (ulong)((byte)*param_1 >> 1);
      pbVar3 = param_1 + 1;
      if (((byte)*param_1 & 1) != 0) {
        uVar1 = *(ulong *)(param_1 + 8);
        pbVar3 = *(basic_string_conflict **)(param_1 + 0x10);
      }
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,(char *)pbVar3,uVar1);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"\r\n",2);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"Content-Disposition:",0x14);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5," form-data; name=\"",0x12);
      uVar1 = plVar6[3];
      pcVar2 = (char *)plVar6[4];
      if ((*(byte *)(plVar6 + 2) & 1) == 0) {
        pcVar2 = (char *)((long)plVar6 + 0x11);
        uVar1 = (ulong)(*(byte *)(plVar6 + 2) >> 1);
      }
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,pcVar2,uVar1);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"\";",2);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"\r\n",2);
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,"\r\n",2);
      uVar1 = (ulong)(*(byte *)(plVar6 + 5) >> 1);
      pcVar2 = (char *)((long)plVar6 + 0x29);
      if ((*(byte *)(plVar6 + 5) & 1) != 0) {
        uVar1 = plVar6[6];
        pcVar2 = (char *)plVar6[7];
      }
      pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar5,pcVar2,uVar1);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar5,"\r\n",2);
      plVar6 = (long *)*plVar6;
    } while (plVar6 != (long *)0x0);
  }
                    /* try { // try from 00978114 to 0097815b has its CatchHandler @ 009781e8 */
  pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     ((basic_ostream *)&local_180,"--",2);
  uVar1 = *(ulong *)(param_1 + 8);
  pbVar3 = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)*param_1 & 1) == 0) {
    pbVar3 = param_1 + 1;
    uVar1 = (ulong)((byte)*param_1 >> 1);
  }
  pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     (pbVar5,(char *)pbVar3,uVar1);
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar5,"--\r\n",4);
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
  if (*(long *)(lVar4 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

