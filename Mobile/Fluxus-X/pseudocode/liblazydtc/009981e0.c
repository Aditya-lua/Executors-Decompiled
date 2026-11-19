/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009981e0
 */

/* ix::WebSocketTransport::flushSendBuffer() */

undefined8 __thiscall ix::WebSocketTransport::flushSendBuffer(WebSocketTransport *this)

{
  long lVar1;
  long lVar2;
  int iVar3;
  ulong uVar4;
  
  while( true ) {
    std::__ndk1::mutex::lock((mutex *)(this + 0x68));
    lVar1 = *(long *)(this + 0x50);
    lVar2 = *(long *)(this + 0x58);
    std::__ndk1::mutex::unlock((mutex *)(this + 0x68));
    if ((lVar1 == lVar2) || (((byte)this[0x240] & 1) != 0)) break;
    iVar3 = Socket::isReadyToWrite(*(Socket **)(this + 0xb0),10);
    if (iVar3 == 1) {
      uVar4 = sendOnSocket(this);
      if ((uVar4 & 1) == 0) {
        return 0;
      }
    }
    else if (iVar3 == 3) {
      std::__ndk1::mutex::lock((mutex *)(this + 0xb8));
                    /* try { // try from 00998280 to 00998283 has its CatchHandler @ 009982a0 */
      (**(code **)(**(long **)(this + 0xb0) + 0x20))();
      std::__ndk1::mutex::unlock((mutex *)(this + 0xb8));
      setReadyState(this,1);
      return 0;
    }
  }
  return 1;
}

