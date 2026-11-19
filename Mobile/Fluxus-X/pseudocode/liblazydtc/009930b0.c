/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009930b0
 */

/* ix::WebSocketServer::~WebSocketServer() */

void __thiscall ix::WebSocketServer::~WebSocketServer(WebSocketServer *this)

{
  WebSocketServer *pWVar1;
  code *pcVar2;
  
  *(undefined ***)this = &PTR__WebSocketServer_00c522f0;
                    /* try { // try from 009930d0 to 009930d3 has its CatchHandler @ 00993150 */
  stop(this);
  std::__ndk1::
  __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
  ::destroy((__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
             *)(this + 0x2d8),*(__tree_node **)(this + 0x2e0));
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x2b0));
  pWVar1 = *(WebSocketServer **)(this + 0x2a0);
  if (this + 0x280 == pWVar1) {
    pcVar2 = *(code **)(*(long *)pWVar1 + 0x20);
LAB_00993110:
    (*pcVar2)();
  }
  else if (pWVar1 != (WebSocketServer *)0x0) {
    pcVar2 = *(code **)(*(long *)pWVar1 + 0x28);
    goto LAB_00993110;
  }
  pWVar1 = *(WebSocketServer **)(this + 0x270);
  if (this + 0x250 == pWVar1) {
    pcVar2 = *(code **)(*(long *)pWVar1 + 0x20);
  }
  else {
    if (pWVar1 == (WebSocketServer *)0x0) goto LAB_00993140;
    pcVar2 = *(code **)(*(long *)pWVar1 + 0x28);
  }
  (*pcVar2)();
LAB_00993140:
  SocketServer::~SocketServer((SocketServer *)this);
  return;
}

