/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d1b4
 */

/* ix::WebSocket::setUrl(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall ix::WebSocket::setUrl(WebSocket *this,basic_string_conflict *param_1)

{
  ulong uVar1;
  basic_string_conflict *pbVar2;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      (this + 0x2e0) !=
      (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_1) {
    uVar1 = *(ulong *)(param_1 + 8);
    pbVar2 = *(basic_string_conflict **)(param_1 + 0x10);
    if (((byte)*param_1 & 1) == 0) {
      pbVar2 = param_1 + 1;
      uVar1 = (ulong)((byte)*param_1 >> 1);
    }
                    /* try { // try from 0098d1fc to 0098d1ff has its CatchHandler @ 0098d214 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (this + 0x2e0),(char *)pbVar2,uVar1);
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return;
}

