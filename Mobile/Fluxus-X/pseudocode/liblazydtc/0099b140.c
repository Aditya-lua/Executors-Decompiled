/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099b140
 */

/* ix::WebSocketHandshake::insensitiveStringCompare(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&) */

uint __thiscall
ix::WebSocketHandshake::insensitiveStringCompare
          (WebSocketHandshake *this,basic_string_conflict *param_1,basic_string_conflict *param_2)

{
  uint uVar1;
  
  uVar1 = CaseInsensitiveLess::cmp(param_1,param_2);
  return ~uVar1 & 1;
}

