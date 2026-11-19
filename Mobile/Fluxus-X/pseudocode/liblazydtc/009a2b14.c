/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a2b14
 */

/* ix::WebSocketPerMessageDeflateCompressor::compress(std::__ndk1::vector<unsigned char,
   std::__ndk1::allocator<unsigned char> > const&, std::__ndk1::vector<unsigned char,
   std::__ndk1::allocator<unsigned char> >&) */

bool ix::WebSocketPerMessageDeflateCompressor::compress(vector *param_1,vector *param_2)

{
  bool bVar1;
  vector *in_x2;
  
  bVar1 = compressData<std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>,std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>>
                    ((WebSocketPerMessageDeflateCompressor *)param_1,param_2,in_x2);
  return bVar1;
}

