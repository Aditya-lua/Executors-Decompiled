/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098abdc
 */

/* ix::SocketServer::getBacklog() */

undefined4 __thiscall ix::SocketServer::getBacklog(SocketServer *this)

{
  return *(undefined4 *)(this + 0x28);
}

