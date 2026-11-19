/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00999ec0
 */

/* ix::WebSocketTransport::wakeUpFromPoll(unsigned long) */

uint ix::WebSocketTransport::wakeUpFromPoll(ulong param_1)

{
  uint uVar1;
  
  std::__ndk1::mutex::lock((mutex *)(param_1 + 0xb8));
                    /* try { // try from 00999ee8 to 00999eef has its CatchHandler @ 00999f10 */
  uVar1 = Socket::wakeUpFromPoll(*(ulong *)(param_1 + 0xb0));
  std::__ndk1::mutex::unlock((mutex *)(param_1 + 0xb8));
  return uVar1 & 1;
}

