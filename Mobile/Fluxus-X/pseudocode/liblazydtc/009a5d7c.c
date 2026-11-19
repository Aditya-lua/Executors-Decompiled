/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a5d7c
 */

/* ix::SocketTLSOptions::getDescription() const */

void __thiscall ix::SocketTLSOptions::getDescription(SocketTLSOptions *this)

{
  ulong uVar1;
  SocketTLSOptions *pSVar2;
  long lVar3;
  char cVar4;
  basic_ostream *pbVar5;
  long *plVar6;
  basic_ostream<char,std::__ndk1::char_traits<char>> *this_00;
  locale alStack_198 [8];
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
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  local_180 = &PTR_FUN_00c4e508;
  local_110[0] = &PTR__basic_istream_00c4e640;
  uStack_188 = 0;
  local_190 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 009a5dec to 009a5df7 has its CatchHandler @ 009a620c */
  std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
  local_88 = 0;
  local_80 = 0xffffffff;
  local_190 = &PTR_LAB_00c4e4e0;
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
                    /* try { // try from 009a5e6c to 009a5e97 has its CatchHandler @ 009a6238 */
  pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     ((basic_ostream *)&local_180,"TLS Options:",0xc);
  std::__ndk1::ios_base::getloc();
                    /* try { // try from 009a5e98 to 009a5eb7 has its CatchHandler @ 009a6228 */
  plVar6 = (long *)std::__ndk1::locale::use_facet(alStack_198,(id *)&std::__ndk1::ctype<char>::id);
  cVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  std::__ndk1::locale::~locale(alStack_198);
                    /* try { // try from 009a5ec4 to 009a5f1f has its CatchHandler @ 009a6238 */
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5,cVar4);
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5);
  pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     ((basic_ostream *)&local_180,"  certFile = ",0xd);
  uVar1 = *(ulong *)(this + 8);
  pSVar2 = *(SocketTLSOptions **)(this + 0x10);
  if (((byte)*this & 1) == 0) {
    pSVar2 = this + 1;
    uVar1 = (ulong)((byte)*this >> 1);
  }
  pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     (pbVar5,(char *)pSVar2,uVar1);
  std::__ndk1::ios_base::getloc();
                    /* try { // try from 009a5f20 to 009a5f3f has its CatchHandler @ 009a6224 */
  plVar6 = (long *)std::__ndk1::locale::use_facet(alStack_198,(id *)&std::__ndk1::ctype<char>::id);
  cVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  std::__ndk1::locale::~locale(alStack_198);
                    /* try { // try from 009a5f4c to 009a5fab has its CatchHandler @ 009a6238 */
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5,cVar4);
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5);
  pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     ((basic_ostream *)&local_180,"  keyFile  = ",0xd);
  uVar1 = (ulong)((byte)this[0x18] >> 1);
  pSVar2 = this + 0x19;
  if (((byte)this[0x18] & 1) != 0) {
    uVar1 = *(ulong *)(this + 0x20);
    pSVar2 = *(SocketTLSOptions **)(this + 0x28);
  }
  pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     (pbVar5,(char *)pSVar2,uVar1);
  std::__ndk1::ios_base::getloc();
                    /* try { // try from 009a5fac to 009a5fcb has its CatchHandler @ 009a6220 */
  plVar6 = (long *)std::__ndk1::locale::use_facet(alStack_198,(id *)&std::__ndk1::ctype<char>::id);
  cVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  std::__ndk1::locale::~locale(alStack_198);
                    /* try { // try from 009a5fd8 to 009a6037 has its CatchHandler @ 009a6238 */
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5,cVar4);
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5);
  pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     ((basic_ostream *)&local_180,"  caFile   = ",0xd);
  uVar1 = (ulong)((byte)this[0x30] >> 1);
  pSVar2 = this + 0x31;
  if (((byte)this[0x30] & 1) != 0) {
    uVar1 = *(ulong *)(this + 0x38);
    pSVar2 = *(SocketTLSOptions **)(this + 0x40);
  }
  pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     (pbVar5,(char *)pSVar2,uVar1);
  std::__ndk1::ios_base::getloc();
                    /* try { // try from 009a6038 to 009a6057 has its CatchHandler @ 009a621c */
  plVar6 = (long *)std::__ndk1::locale::use_facet(alStack_198,(id *)&std::__ndk1::ctype<char>::id);
  cVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  std::__ndk1::locale::~locale(alStack_198);
                    /* try { // try from 009a6064 to 009a60c3 has its CatchHandler @ 009a6238 */
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5,cVar4);
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5);
  pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     ((basic_ostream *)&local_180,"  ciphers  = ",0xd);
  uVar1 = (ulong)((byte)this[0x48] >> 1);
  pSVar2 = this + 0x49;
  if (((byte)this[0x48] & 1) != 0) {
    uVar1 = *(ulong *)(this + 0x50);
    pSVar2 = *(SocketTLSOptions **)(this + 0x58);
  }
  pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     (pbVar5,(char *)pSVar2,uVar1);
  std::__ndk1::ios_base::getloc();
                    /* try { // try from 009a60c4 to 009a60e3 has its CatchHandler @ 009a6218 */
  plVar6 = (long *)std::__ndk1::locale::use_facet(alStack_198,(id *)&std::__ndk1::ctype<char>::id);
  cVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  std::__ndk1::locale::~locale(alStack_198);
                    /* try { // try from 009a60f0 to 009a6137 has its CatchHandler @ 009a6238 */
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5,cVar4);
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5);
  pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                     ((basic_ostream *)&local_180,"  tls      = ",0xd);
  this_00 = (basic_ostream<char,std::__ndk1::char_traits<char>> *)
            std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                      ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5,(bool)this[0x60]
                      );
  std::__ndk1::ios_base::getloc();
                    /* try { // try from 009a6138 to 009a6157 has its CatchHandler @ 009a6214 */
  plVar6 = (long *)std::__ndk1::locale::use_facet(alStack_198,(id *)&std::__ndk1::ctype<char>::id);
  cVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  std::__ndk1::locale::~locale(alStack_198);
                    /* try { // try from 009a6164 to 009a6183 has its CatchHandler @ 009a6238 */
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put(this_00,cVar4);
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush(this_00);
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
  if (*(long *)(lVar3 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

