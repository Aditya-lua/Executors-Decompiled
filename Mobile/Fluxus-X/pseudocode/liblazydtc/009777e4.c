/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009777e4
 */

/* ix::HttpClient::serializeHttpParameters(std::__ndk1::unordered_map<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >,
   std::__ndk1::hash<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, std::__ndk1::equal_to<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > > const&) */

void __thiscall ix::HttpClient::serializeHttpParameters(HttpClient *this,unordered_map *param_1)

{
  ulong uVar1;
  long lVar2;
  char *pcVar3;
  HttpClient *this_00;
  basic_ostream *pbVar4;
  HttpClient *extraout_x0;
  HttpClient *extraout_x0_00;
  long lVar5;
  long lVar6;
  long *plVar7;
  ulong uVar8;
  byte local_1c0 [8];
  ulong local_1b8;
  char *local_1b0;
  byte local_1a8 [8];
  ulong local_1a0;
  char *local_198;
  undefined **local_190;
  undefined8 uStack_188;
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
  
  lVar2 = tpidr_el0;
  lVar6 = *(long *)(lVar2 + 0x28);
  local_180 = &PTR_FUN_00c4e508;
  local_110[0] = &PTR__basic_istream_00c4e640;
  uStack_188 = 0;
  local_190 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 00977858 to 00977863 has its CatchHandler @ 00977a78 */
  std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
  local_88 = 0;
  local_80 = 0xffffffff;
  local_190 = &PTR_LAB_00c4e4e0;
  local_110[0] = &PTR_FUN_00c4e530;
  ppuStack_178 = &PTR__basic_streambuf_00c4e728;
  local_180 = &PTR_FUN_00c4e508;
  this_00 = (HttpClient *)std::__ndk1::locale::locale(alStack_170);
  uStack_140 = 0;
  local_148 = 0;
  uStack_150 = 0;
  local_158 = 0;
  uStack_160 = 0;
  local_168 = 0;
  ppuStack_178 = &PTR_LAB_00c4e678;
  uStack_120 = 0;
  local_128 = (void *)0x0;
  uStack_130 = 0;
  local_138 = 0;
  local_118 = 0x18;
  plVar7 = *(long **)(param_1 + 0x10);
  if (plVar7 != (long *)0x0) {
    lVar5 = *(long *)(param_1 + 0x18);
    uVar8 = 0;
    do {
                    /* try { // try from 0097790c to 00977913 has its CatchHandler @ 00977ab8 */
      urlEncode(this_00,(basic_string_conflict *)(plVar7 + 2));
      uVar1 = (ulong)(local_1a8[0] >> 1);
      pcVar3 = (char *)((ulong)local_1a8 | 1);
      if ((local_1a8[0] & 1) != 0) {
        uVar1 = local_1a0;
        pcVar3 = local_198;
      }
                    /* try { // try from 0097792c to 0097793f has its CatchHandler @ 00977acc */
      pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         ((basic_ostream *)&local_180,pcVar3,uVar1);
      pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar4,"=",1);
                    /* try { // try from 00977948 to 0097794f has its CatchHandler @ 00977ab4 */
      urlEncode((HttpClient *)pbVar4,(basic_string_conflict *)(plVar7 + 5));
      uVar1 = (ulong)(local_1c0[0] >> 1);
      pcVar3 = (char *)((ulong)local_1c0 | 1);
      if ((local_1c0[0] & 1) != 0) {
        uVar1 = local_1b8;
        pcVar3 = local_1b0;
      }
                    /* try { // try from 00977968 to 0097796f has its CatchHandler @ 00977a88 */
      this_00 = (HttpClient *)
                std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar4,pcVar3,uVar1);
      if ((local_1c0[0] & 1) != 0) {
        operator_delete(local_1b0);
        this_00 = extraout_x0;
      }
      if ((local_1a8[0] & 1) != 0) {
        operator_delete(local_198);
        this_00 = extraout_x0_00;
      }
      if (uVar8 < lVar5 - 1U) {
                    /* try { // try from 009779ac to 009779bf has its CatchHandler @ 00977a84 */
        this_00 = (HttpClient *)
                  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            ((basic_ostream *)&local_180,"&",1);
      }
      plVar7 = (long *)*plVar7;
      uVar8 = uVar8 + 1;
    } while (plVar7 != (long *)0x0);
  }
                    /* try { // try from 009779cc to 009779d7 has its CatchHandler @ 00977a68 */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str();
  local_190 = &PTR_LAB_00c4e4e0;
  local_110[0] = &PTR_FUN_00c4e530;
  local_180 = &PTR_FUN_00c4e508;
  ppuStack_178 = &PTR_LAB_00c4e678;
  if ((local_138 & 1) != 0) {
    operator_delete(local_128);
  }
  ppuStack_178 = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale(alStack_170);
  std::__ndk1::ios_base::~ios_base((ios_base *)local_110);
  if (*(long *)(lVar2 + 0x28) != lVar6) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

