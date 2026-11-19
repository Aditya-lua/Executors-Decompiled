/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ca24
 */

/* ix::WebSocket::WebSocket() */

void __thiscall ix::WebSocket::WebSocket(WebSocket *this)

{
  long lVar1;
  code *pcVar2;
  undefined **local_a0;
  WebSocket *pWStack_98;
  undefined ***local_80;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  WebSocketTransport::WebSocketTransport((WebSocketTransport *)this);
  *(undefined8 *)(this + 0x2f0) = 0;
  *(undefined8 *)(this + 0x2e8) = 0;
  *(undefined8 *)(this + 0x2e0) = 0;
  *(undefined8 *)(this + 0x308) = 0;
  *(undefined8 *)(this + 0x300) = 0;
  *(WebSocket **)(this + 0x2f8) = this + 0x300;
                    /* try { // try from 0098ca84 to 0098ca9b has its CatchHandler @ 0098cdb0 */
  WebSocketPerMessageDeflateOptions::WebSocketPerMessageDeflateOptions
            ((WebSocketPerMessageDeflateOptions *)(this + 0x310),false,false,false,'\x0f','\x0f');
  memset(this + 0x318,0,0x48);
  this[0x348] = (WebSocket)0xc;
  *(undefined4 *)(this + 0x349) = 0x54535953;
  *(undefined2 *)(this + 0x34d) = 0x4d45;
  this[0x34f] = (WebSocket)0x0;
  *(undefined8 *)(this + 0x370) = 0;
  *(undefined8 *)(this + 0x368) = 0;
  *(undefined8 *)(this + 0x360) = 0;
  this[0x360] = (WebSocket)0xe;
  *(undefined2 *)(this + 0x365) = 0x4c55;
  *(undefined4 *)(this + 0x361) = 0x41464544;
  this[0x367] = (WebSocket)0x54;
  this[0x368] = (WebSocket)0x0;
  *(undefined2 *)(this + 0x378) = 0;
  *(undefined8 *)(this + 0x390) = 0;
  *(undefined8 *)(this + 0x388) = 0;
  *(undefined8 *)(this + 0x380) = 0;
  this[0x398] = (WebSocket)0x0;
  *(undefined8 *)(this + 0x3c0) = 0;
  *(undefined8 *)(this + 0x3a8) = 0;
  *(undefined8 *)(this + 0x3a0) = 0;
  *(undefined8 *)(this + 0x3b8) = 0;
  *(undefined8 *)(this + 0x3b0) = 0;
  *(undefined8 *)(this + 0x3f0) = 0;
  this[0x400] = (WebSocket)0x0;
  *(undefined8 *)(this + 0x430) = 0;
  *(undefined8 *)(this + 0x428) = 0;
  *(undefined8 *)(this + 0x420) = 0;
  *(undefined8 *)(this + 0x418) = 0;
  *(undefined8 *)(this + 0x410) = 0;
  *(undefined8 *)(this + 0x408) = 0;
  this[0x438] = (WebSocket)0x1;
  *(undefined8 *)(this + 0x43c) = 0x100002710;
  memset(this + 0x444,0,0x58);
  *(undefined4 *)(this + 0x49c) = 0x3c;
  *(undefined4 *)(this + 0x4c8) = 2;
  this[0x4a0] = (WebSocket)0x1;
  this[0x4e8] = (WebSocket)0x1;
  *(undefined8 *)(this + 0x4c0) = 0;
  *(undefined8 *)(this + 0x4b8) = 0;
  *(undefined8 *)(this + 0x4b0) = 0;
  *(undefined4 *)(this + 0x4a4) = 0xffffffff;
  *(undefined8 *)(this + 0x4e0) = 0;
  *(undefined8 *)(this + 0x4d8) = 0;
  *(undefined8 *)(this + 0x4d0) = 0;
  local_a0 = &PTR_LAB_00c521c0;
                    /* try { // try from 0098cc00 to 0098cc0b has its CatchHandler @ 0098cc68 */
  pWStack_98 = this;
  local_80 = &local_a0;
  WebSocketTransport::setOnCloseCallback((WebSocketTransport *)this,(function *)&local_a0);
  if (&local_a0 == local_80) {
    pcVar2 = (code *)(*local_80)[4];
  }
  else {
    if (local_80 == (undefined ***)0x0) goto LAB_0098cc34;
    pcVar2 = (code *)(*local_80)[5];
  }
  (*pcVar2)();
LAB_0098cc34:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

