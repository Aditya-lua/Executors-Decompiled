/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a22b8
 */

/* ix::WebSocketPerMessageDeflateCompressor::compress(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&)
    */

bool ix::WebSocketPerMessageDeflateCompressor::compress
               (basic_string_conflict *param_1,basic_string_conflict *param_2)

{
  bool bVar1;
  basic_string_conflict *in_x2;
  
  bVar1 = compressData<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                    ((WebSocketPerMessageDeflateCompressor *)param_1,param_2,in_x2);
  return bVar1;
}

