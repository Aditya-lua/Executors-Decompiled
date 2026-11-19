/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009982b4
 */

/* ix::WebSocketTransport::receiveFromSocket() */

undefined8 __thiscall ix::WebSocketTransport::receiveFromSocket(WebSocketTransport *this)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  
  lVar1 = (**(code **)(**(long **)(this + 0xb0) + 0x30))
                    (*(long **)(this + 0xb0),*(long *)(this + 0x20),
                     *(long *)(this + 0x28) - *(long *)(this + 0x20));
  if (-1 < lVar1) {
    do {
      if (lVar1 == 0) goto LAB_00998328;
      std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::
      insert<std::__ndk1::__wrap_iter<unsigned_char*>>
                ((vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *)(this + 0x38),
                 *(undefined8 *)(this + 0x40),*(long *)(this + 0x20),*(long *)(this + 0x20) + lVar1)
      ;
      lVar1 = (**(code **)(**(long **)(this + 0xb0) + 0x30))
                        (*(long **)(this + 0xb0),*(long *)(this + 0x20),
                         *(long *)(this + 0x28) - *(long *)(this + 0x20));
    } while (-1 < lVar1);
  }
  uVar2 = Socket::isWaitNeeded();
  if ((uVar2 & 1) == 0) {
LAB_00998328:
    std::__ndk1::mutex::lock((mutex *)(this + 0xb8));
                    /* try { // try from 00998340 to 00998343 has its CatchHandler @ 0099835c */
    (**(code **)(**(long **)(this + 0xb0) + 0x20))();
    std::__ndk1::mutex::unlock((mutex *)(this + 0xb8));
    uVar3 = 0;
  }
  else {
    uVar3 = 1;
  }
  return uVar3;
}

