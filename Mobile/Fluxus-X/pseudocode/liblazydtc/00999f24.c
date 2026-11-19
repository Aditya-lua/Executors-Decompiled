/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00999f24
 */

/* ix::WebSocketTransport::closeSocketAndSwitchToClosedState(unsigned short,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&, unsigned long, bool) */

void __thiscall
ix::WebSocketTransport::closeSocketAndSwitchToClosedState
          (WebSocketTransport *this,ushort param_1,basic_string_conflict *param_2,ulong param_3,
          bool param_4)

{
  ulong uVar1;
  basic_string_conflict *pbVar2;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0xb8));
                    /* try { // try from 00999f64 to 00999f67 has its CatchHandler @ 00999ff4 */
  (**(code **)(**(long **)(this + 0xb0) + 0x20))();
  std::__ndk1::mutex::unlock((mutex *)(this + 0xb8));
  std::__ndk1::mutex::lock((mutex *)(this + 0x138));
  if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      (this + 0x120) !=
      (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_2) {
    uVar1 = *(ulong *)(param_2 + 8);
    pbVar2 = *(basic_string_conflict **)(param_2 + 0x10);
    if (((byte)*param_2 & 1) == 0) {
      pbVar2 = param_2 + 1;
      uVar1 = (ulong)((byte)*param_2 >> 1);
    }
                    /* try { // try from 00999fa0 to 00999fa3 has its CatchHandler @ 00999ff0 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (this + 0x120),(char *)pbVar2,uVar1);
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0x138));
  *(ushort *)(this + 0x160) = param_1;
  *(ulong *)(this + 0x168) = param_3;
  this[0x170] = (WebSocketTransport)param_4;
  setReadyState(this,1);
  this[0x240] = (WebSocketTransport)0x0;
  return;
}

