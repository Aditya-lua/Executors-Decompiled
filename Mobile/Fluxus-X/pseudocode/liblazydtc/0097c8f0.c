/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097c8f0
 */

/* ix::HttpServer::~HttpServer() */

void __thiscall ix::HttpServer::~HttpServer(HttpServer *this)

{
  HttpServer *pHVar1;
  code *pcVar2;
  
  pHVar1 = *(HttpServer **)(this + 0x310);
  *(undefined ***)this = &PTR__HttpServer_00c51a00;
  if (this + 0x2f0 == pHVar1) {
    pcVar2 = *(code **)(*(long *)pHVar1 + 0x20);
  }
  else {
    if (pHVar1 == (HttpServer *)0x0) goto LAB_0097c93c;
    pcVar2 = *(code **)(*(long *)pHVar1 + 0x28);
  }
  (*pcVar2)();
LAB_0097c93c:
  WebSocketServer::~WebSocketServer((WebSocketServer *)this);
  operator_delete(this);
  return;
}

