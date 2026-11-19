/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009944e0
 */

/* ix::WebSocketServer::listenAndStart() */

bool __thiscall ix::WebSocketServer::listenAndStart(WebSocketServer *this)

{
  long lVar1;
  long lVar2;
  char local_48;
  byte local_40;
  void *local_30;
  
  lVar1 = tpidr_el0;
  lVar2 = *(long *)(lVar1 + 0x28);
  SocketServer::listen();
  if (local_48 != '\0') {
                    /* try { // try from 00994510 to 00994517 has its CatchHandler @ 00994564 */
    SocketServer::start((SocketServer *)this);
  }
  if ((local_40 & 1) != 0) {
    operator_delete(local_30);
  }
  if (*(long *)(lVar1 + 0x28) != lVar2) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return local_48 != '\0';
}

