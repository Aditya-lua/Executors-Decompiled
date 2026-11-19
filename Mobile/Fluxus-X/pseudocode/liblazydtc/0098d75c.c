/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d75c
 */

/* ix::WebSocket::disablePerMessageDeflate() */

void __thiscall ix::WebSocket::disablePerMessageDeflate(WebSocket *this)

{
  long lVar1;
  undefined4 local_40;
  WebSocket local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
                    /* try { // try from 0098d79c to 0098d7b7 has its CatchHandler @ 0098d7f8 */
  WebSocketPerMessageDeflateOptions::WebSocketPerMessageDeflateOptions
            ((WebSocketPerMessageDeflateOptions *)&local_40,false,false,false,'\x0f','\x0f');
  this[0x314] = local_3c;
  *(undefined4 *)(this + 0x310) = local_40;
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

