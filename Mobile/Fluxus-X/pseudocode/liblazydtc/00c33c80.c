/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c33c80
 */

bool __thiscall
ix::WebSocketPerMessageDeflateCompressor::
compressData<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
          (WebSocketPerMessageDeflateCompressor *this,basic_string_conflict *param_1,
          basic_string_conflict *param_2)

{
  bool bVar1;
  
  bVar1 = compressData<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                    (this,param_1,param_2);
  return bVar1;
}

