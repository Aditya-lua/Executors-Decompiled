/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d460
 */

/* ix::WebSocket::setPingMessage(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, ix::SendMessageKind) */

void __thiscall
ix::WebSocket::setPingMessage
          (WebSocket *this,
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *param_1,
          undefined4 param_3)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this_00;
  ulong uVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar2;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  this_00 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
            (this + 0x4b0);
  if (this_00 != param_1) {
    uVar1 = *(ulong *)(param_1 + 8);
    pbVar2 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (param_1 + 0x10);
    if (((byte)*param_1 & 1) == 0) {
      pbVar2 = param_1 + 1;
      uVar1 = (ulong)((byte)*param_1 >> 1);
    }
                    /* try { // try from 0098d4b0 to 0098d4c7 has its CatchHandler @ 0098d4e0 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign(this_00,(char *)pbVar2,uVar1);
  }
  WebSocketTransport::setPingMessage((WebSocketTransport *)this,this_00,param_3);
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return;
}

