/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099a338
 */

/* ix::WebSocketTransport::sendOnSocket() */

undefined8 __thiscall ix::WebSocketTransport::sendOnSocket(WebSocketTransport *this)

{
  mutex *this_00;
  void *__dest;
  size_t __n;
  long lVar1;
  ulong uVar2;
  void *pvVar3;
  undefined8 uVar4;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x68));
  if (*(long *)(this + 0x58) != *(long *)(this + 0x50)) {
    this_00 = (mutex *)(this + 0xb8);
    do {
                    /* try { // try from 0099a390 to 0099a397 has its CatchHandler @ 0099a468 */
      std::__ndk1::mutex::lock(this_00);
                    /* try { // try from 0099a3ac to 0099a3af has its CatchHandler @ 0099a458 */
      lVar1 = (**(code **)(**(long **)(this + 0xb0) + 0x28))
                        (*(long **)(this + 0xb0),*(long *)(this + 0x50),
                         *(long *)(this + 0x58) - *(long *)(this + 0x50));
      std::__ndk1::mutex::unlock(this_00);
      if (lVar1 < 0) {
                    /* try { // try from 0099a400 to 0099a40f has its CatchHandler @ 0099a454 */
        uVar2 = Socket::isWaitNeeded();
        if ((uVar2 & 1) == 0) {
LAB_0099a408:
          std::__ndk1::mutex::lock(this_00);
                    /* try { // try from 0099a41c to 0099a41f has its CatchHandler @ 0099a450 */
          (**(code **)(**(long **)(this + 0xb0) + 0x20))();
          std::__ndk1::mutex::unlock(this_00);
          if (*(int *)(this + 0xe0) == 0) {
            uVar4 = 0;
          }
          else {
                    /* try { // try from 0099a434 to 0099a43f has its CatchHandler @ 0099a454 */
            setReadyState(this,1);
            uVar4 = 0;
          }
          goto LAB_0099a36c;
        }
        break;
      }
      if (lVar1 == 0) goto LAB_0099a408;
      __dest = *(void **)(this + 0x50);
      __n = *(long *)(this + 0x58) - ((long)__dest + lVar1);
      if (__n == 0) {
        pvVar3 = __dest;
      }
      else {
        memmove(__dest,(void *)((long)__dest + lVar1),__n);
        pvVar3 = *(void **)(this + 0x50);
      }
      *(void **)(this + 0x58) = (void *)((long)__dest + __n);
    } while (pvVar3 != (void *)((long)__dest + __n));
  }
  uVar4 = 1;
LAB_0099a36c:
  std::__ndk1::mutex::unlock((mutex *)(this + 0x68));
  return uVar4;
}

