/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099b130
 */

/* ix::WebSocketHandshake::WebSocketHandshake(std::__ndk1::atomic<bool>&,
   std::__ndk1::unique_ptr<ix::Socket, std::__ndk1::default_delete<ix::Socket> >&,
   std::__ndk1::unique_ptr<ix::WebSocketPerMessageDeflate,
   std::__ndk1::default_delete<ix::WebSocketPerMessageDeflate> >&,
   ix::WebSocketPerMessageDeflateOptions&, std::__ndk1::atomic<bool>&) */

void __thiscall
ix::WebSocketHandshake::WebSocketHandshake
          (WebSocketHandshake *this,atomic *param_1,unique_ptr *param_2,unique_ptr *param_3,
          WebSocketPerMessageDeflateOptions *param_4,atomic *param_5)

{
  *(atomic **)this = param_1;
  *(unique_ptr **)(this + 8) = param_2;
  *(unique_ptr **)(this + 0x10) = param_3;
  *(WebSocketPerMessageDeflateOptions **)(this + 0x18) = param_4;
  *(atomic **)(this + 0x20) = param_5;
  return;
}

