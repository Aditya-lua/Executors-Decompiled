/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a21f8
 */

/* ix::WebSocketPerMessageDeflate::compress(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&)
    */

void ix::WebSocketPerMessageDeflate::compress
               (basic_string_conflict *param_1,basic_string_conflict *param_2)

{
  WebSocketPerMessageDeflateCompressor::compress(*(basic_string_conflict **)param_1,param_2);
  return;
}

