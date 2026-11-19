/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009933a8
 */

/* ix::WebSocketServer::~WebSocketServer() */

void __thiscall ix::WebSocketServer::~WebSocketServer(WebSocketServer *this)

{
  ~WebSocketServer(this);
  operator_delete(this);
  return;
}

