/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a2200
 */

/* ix::WebSocketPerMessageDeflate::decompress(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&)
    */

void __thiscall
ix::WebSocketPerMessageDeflate::decompress
          (WebSocketPerMessageDeflate *this,basic_string_conflict *param_1,
          basic_string_conflict *param_2)

{
  WebSocketPerMessageDeflateDecompressor::decompress
            (*(WebSocketPerMessageDeflateDecompressor **)(this + 8),param_1,param_2);
  return;
}

