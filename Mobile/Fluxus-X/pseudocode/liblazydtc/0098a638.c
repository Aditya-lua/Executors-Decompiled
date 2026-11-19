/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098a638
 */

/* ix::SocketServer::stopAcceptingConnections() */

void __thiscall ix::SocketServer::stopAcceptingConnections(SocketServer *this)

{
  this[0x40] = (SocketServer)0x1;
  return;
}

