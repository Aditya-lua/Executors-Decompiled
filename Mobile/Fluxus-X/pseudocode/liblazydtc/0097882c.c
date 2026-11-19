/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097882c
 */

/* ix::HttpClient::urlEncode(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall ix::HttpClient::urlEncode(HttpClient *this,basic_string_conflict *param_1)

{
  ulong uVar1;
  basic_string_conflict *pbVar2;
  basic_string_conflict bVar3;
  long lVar4;
  int iVar5;
  basic_ostream *this_00;
  void *pvVar6;
  uint uVar7;
  basic_string_conflict local_184 [4];
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
  undefined **local_110 [4];
  undefined4 local_f0 [26];
  undefined8 local_88;
  undefined4 local_80;
  long local_78;
  
  lVar4 = tpidr_el0;
  local_78 = *(long *)(lVar4 + 0x28);
  pvVar6 = (void *)((ulong)&local_180 | 8);
  local_180 = &PTR__basic_ostream_00c517c8;
  local_110[0] = &PTR__basic_ostream_00c517f0;
                    /* try { // try from 00978884 to 0097888f has its CatchHandler @ 00978a90 */
  std::__ndk1::ios_base::init((ios_base *)local_110,pvVar6);
  local_88 = 0;
  local_80 = 0xffffffff;
  local_110[0] = &PTR_FUN_00c51798;
  ppuStack_178 = &PTR__basic_streambuf_00c4e728;
  local_180 = &PTR_FUN_00c51770;
  std::__ndk1::locale::locale(alStack_170);
  local_118 = 0x10;
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
  *(undefined4 *)((long)local_f0 + (long)local_180[-3]) = 0x30;
  *(uint *)((long)&ppuStack_178 + (long)local_180[-3]) =
       *(uint *)((long)&ppuStack_178 + (long)local_180[-3]) & 0xffffffb5 | 8;
  uVar1 = *(ulong *)(param_1 + 8);
  pbVar2 = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)*param_1 & 1) == 0) {
    pbVar2 = param_1 + 1;
    uVar1 = (ulong)((byte)*param_1 >> 1);
  }
  for (; uVar1 != 0; uVar1 = uVar1 - 1) {
    bVar3 = *pbVar2;
    uVar7 = (uint)(byte)bVar3;
    iVar5 = isalnum(uVar7);
    if ((((iVar5 == 0) && (1 < uVar7 - 0x2d)) && (uVar7 != 0x7e)) && (uVar7 != 0x5f)) {
      local_184[0] = (basic_string_conflict)0x25;
      *(uint *)((long)pvVar6 + (long)local_180[-3]) =
           *(uint *)((long)pvVar6 + (long)local_180[-3]) | 0x4000;
                    /* try { // try from 0097898c to 0097899b has its CatchHandler @ 00978a9c */
      this_00 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          ((basic_ostream *)&local_180,(char *)local_184,1);
      *(undefined8 *)(this_00 + *(long *)(*(long *)this_00 + -0x18) + 0x18) = 2;
                    /* try { // try from 009789b0 to 009789b7 has its CatchHandler @ 00978a98 */
      std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                ((basic_ostream<char,std::__ndk1::char_traits<char>> *)this_00,(uint)(byte)bVar3);
      *(uint *)((long)pvVar6 + (long)local_180[-3]) =
           *(uint *)((long)pvVar6 + (long)local_180[-3]) & 0xffffbfff;
    }
    else {
                    /* try { // try from 009789e4 to 009789f3 has its CatchHandler @ 00978a9c */
      local_184[0] = bVar3;
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                ((basic_ostream *)&local_180,(char *)local_184,1);
    }
    pbVar2 = pbVar2 + 1;
  }
                    /* try { // try from 00978a00 to 00978a0b has its CatchHandler @ 00978a8c */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str();
  local_110[0] = &PTR_FUN_00c51798;
  local_180 = &PTR_FUN_00c51770;
  ppuStack_178 = &PTR_LAB_00c4e678;
  if ((local_138 & 1) != 0) {
    operator_delete(local_128);
  }
  ppuStack_178 = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale(alStack_170);
  std::__ndk1::ios_base::~ios_base((ios_base *)local_110);
  if (*(long *)(lVar4 + 0x28) != local_78) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

