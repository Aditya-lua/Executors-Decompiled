/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009976ec
 */

/* ix::WebSocketTransport::setPingMessage(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, ix::SendMessageKind) */

void __thiscall
ix::WebSocketTransport::setPingMessage
          (WebSocketTransport *this,
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *param_1,
          undefined4 param_3)

{
  ulong uVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar2;
  
  this[0x281] = (WebSocketTransport)0x1;
  if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      (this + 0x288) != param_1) {
    uVar1 = *(ulong *)(param_1 + 8);
    pbVar2 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (param_1 + 0x10);
    if (((byte)*param_1 & 1) == 0) {
      pbVar2 = param_1 + 1;
      uVar1 = (ulong)((byte)*param_1 >> 1);
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (this + 0x288),(char *)pbVar2,uVar1);
  }
  *(undefined4 *)(this + 0x2a0) = param_3;
  return;
}

