/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00998024
 */

/* ix::WebSocketTransport::close(unsigned short, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, unsigned long, bool) */

void __thiscall
ix::WebSocketTransport::close
          (WebSocketTransport *this,ushort param_1,basic_string_conflict *param_2,ulong param_3,
          bool param_4)

{
  mutex *this_00;
  basic_string_conflict *pbVar1;
  ulong uVar2;
  undefined8 uVar3;
  
  this[0x240] = (WebSocketTransport)0x1;
  if ((*(int *)(this + 0xe0) == 0) || (*(int *)(this + 0xe0) == 1)) {
    this_00 = (mutex *)(this + 0xb8);
    std::__ndk1::mutex::lock(this_00);
    if (*(Socket **)(this + 0xb0) != (Socket *)0x0) {
                    /* try { // try from 00998084 to 00998087 has its CatchHandler @ 009981cc */
      uVar2 = Socket::isWakeUpFromPollSupported(*(Socket **)(this + 0xb0));
      std::__ndk1::mutex::unlock(this_00);
      if ((uVar2 & 1) == 0) {
        return;
      }
      std::__ndk1::mutex::lock(this_00);
                    /* try { // try from 009980b0 to 009980b7 has its CatchHandler @ 009981c4 */
      Socket::wakeUpFromPoll(*(ulong *)(this + 0xb0));
    }
  }
  else {
    if (param_3 == 0) {
      if (((byte)*param_2 & 1) == 0) {
        param_3 = (ulong)((byte)*param_2 >> 1);
      }
      else {
        param_3 = *(ulong *)(param_2 + 8);
      }
    }
    std::__ndk1::mutex::lock((mutex *)(this + 0x138));
    if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
        (this + 0x120) !=
        (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_2) {
      uVar2 = *(ulong *)(param_2 + 8);
      pbVar1 = *(basic_string_conflict **)(param_2 + 0x10);
      if (((byte)*param_2 & 1) == 0) {
        pbVar1 = param_2 + 1;
        uVar2 = (ulong)((byte)*param_2 >> 1);
      }
                    /* try { // try from 00998118 to 0099811b has its CatchHandler @ 009981b8 */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             (this + 0x120),(char *)pbVar1,uVar2);
    }
    std::__ndk1::mutex::unlock((mutex *)(this + 0x138));
    *(ushort *)(this + 0x160) = param_1;
    *(ulong *)(this + 0x168) = param_3;
    this[0x170] = (WebSocketTransport)param_4;
    std::__ndk1::mutex::lock((mutex *)(this + 0x244));
    uVar3 = std::__ndk1::chrono::steady_clock::now();
    *(undefined8 *)(this + 0x270) = uVar3;
    std::__ndk1::mutex::unlock((mutex *)(this + 0x244));
    if (*(int *)(this + 0xe0) != 0) {
      *(int *)(this + 0xe0) = 0;
    }
    sendCloseFrame(this,param_1,param_2);
    std::__ndk1::mutex::lock((mutex *)(this + 0xb8));
                    /* try { // try from 00998198 to 0099819f has its CatchHandler @ 009981c8 */
    Socket::wakeUpFromPoll(*(ulong *)(this + 0xb0));
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0xb8));
  return;
}

