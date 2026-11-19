/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098abe4
 */

/* ix::SocketServer::getMaxConnections() */

undefined8 __thiscall ix::SocketServer::getMaxConnections(SocketServer *this)

{
  return *(undefined8 *)(this + 0x30);
}

