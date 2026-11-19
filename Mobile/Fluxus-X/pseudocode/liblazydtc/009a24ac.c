/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a24ac
 */

/* ix::WebSocketPerMessageDeflateCompressor::compress(ix::IXWebSocketSendData const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&)
    */

bool ix::WebSocketPerMessageDeflateCompressor::compress
               (IXWebSocketSendData *param_1,basic_string_conflict *param_2)

{
  bool bVar1;
  basic_string_conflict *in_x2;
  
  bVar1 = compressData<ix::IXWebSocketSendData,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                    ((WebSocketPerMessageDeflateCompressor *)param_1,(IXWebSocketSendData *)param_2,
                     in_x2);
  return bVar1;
}

