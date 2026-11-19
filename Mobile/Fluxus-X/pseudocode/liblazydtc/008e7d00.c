/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e7d00
 */

/* cpr::Cookie::GetExpiresString() const */

void __thiscall cpr::Cookie::GetExpiresString(Cookie *this)

{
  long lVar1;
  long lVar2;
  tm *local_1e0;
  char *local_1d8;
  time_t local_1d0;
  tm local_1c8;
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
  
  lVar1 = tpidr_el0;
  lVar2 = *(long *)(lVar1 + 0x28);
  local_180 = &PTR_FUN_00c4e508;
  local_110[0] = &PTR__basic_istream_00c4e640;
  uStack_188 = 0;
  local_190 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 008e7d70 to 008e7d7b has its CatchHandler @ 008e7ec8 */
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
  local_1c8.tm_zone = (char *)0x0;
  local_1c8.tm_gmtoff = 0;
  local_1c8.tm_isdst = 0;
  local_1c8._36_4_ = 0;
  local_1c8.tm_wday = 0;
  local_1c8.tm_yday = 0;
  local_1c8.tm_mon = 0;
  local_1c8.tm_year = 0;
  local_1c8.tm_hour = 0;
  local_1c8.tm_mday = 0;
  local_1c8.tm_sec = 0;
  local_1c8.tm_min = 0;
  ppuStack_178 = &PTR_LAB_00c4e678;
  uStack_120 = 0;
  local_128 = (void *)0x0;
  uStack_130 = 0;
  local_138 = 0;
  local_118 = 0x18;
  local_1d0 = std::__ndk1::chrono::system_clock::to_time_t(this + 0x70);
                    /* try { // try from 008e7e08 to 008e7e17 has its CatchHandler @ 008e7ed0 */
  gmtime_r(&local_1d0,&local_1c8);
  local_1d8 = "%a, %d %b %Y %H:%M:%S GMT";
                    /* try { // try from 008e7e30 to 008e7e3b has its CatchHandler @ 008e7ec0 */
  local_1e0 = &local_1c8;
  std::__ndk1::operator<<((basic_ostream *)&local_180,(__iom_t10 *)&local_1e0);
                    /* try { // try from 008e7e3c to 008e7e47 has its CatchHandler @ 008e7ed0 */
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
  if (*(long *)(lVar1 + 0x28) != lVar2) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

