/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00987340
 */

/* ix::DNSLookup::setErrMsg(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall ix::DNSLookup::setErrMsg(DNSLookup *this,basic_string_conflict *param_1)

{
  ulong uVar1;
  basic_string_conflict *pbVar2;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x88));
  if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      (this + 0x70) !=
      (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_1) {
    uVar1 = *(ulong *)(param_1 + 8);
    pbVar2 = *(basic_string_conflict **)(param_1 + 0x10);
    if (((byte)*param_1 & 1) == 0) {
      pbVar2 = param_1 + 1;
      uVar1 = (ulong)((byte)*param_1 >> 1);
    }
                    /* try { // try from 00987388 to 0098738b has its CatchHandler @ 009873a0 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (this + 0x70),(char *)pbVar2,uVar1);
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0x88));
  return;
}

