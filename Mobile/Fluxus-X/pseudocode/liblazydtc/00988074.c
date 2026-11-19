/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00988074
 */

/* ix::SocketServer::~SocketServer() */

void __thiscall ix::SocketServer::~SocketServer(SocketServer *this)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x988078);
  (*pcVar1)();
}

