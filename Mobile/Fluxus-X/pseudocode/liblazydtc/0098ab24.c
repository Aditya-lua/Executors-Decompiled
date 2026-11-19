/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ab24
 */

/* ix::SocketServer::getPort() */

undefined4 __thiscall ix::SocketServer::getPort(SocketServer *this)

{
  return *(undefined4 *)(this + 8);
}

