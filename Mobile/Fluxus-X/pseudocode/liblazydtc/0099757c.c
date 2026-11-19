/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099757c
 */

/* ix::WebSocketTransport::initTimePointsAfterConnect() */

void __thiscall ix::WebSocketTransport::initTimePointsAfterConnect(WebSocketTransport *this)

{
  undefined8 uVar1;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x2b0));
  uVar1 = std::__ndk1::chrono::steady_clock::now();
  *(undefined8 *)(this + 0x2d8) = uVar1;
  std::__ndk1::mutex::unlock((mutex *)(this + 0x2b0));
  return;
}

