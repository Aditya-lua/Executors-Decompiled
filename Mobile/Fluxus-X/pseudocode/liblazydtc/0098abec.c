/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098abec
 */

/* ix::SocketServer::getAddressFamily() */

undefined4 __thiscall ix::SocketServer::getAddressFamily(SocketServer *this)

{
  return *(undefined4 *)(this + 0x38);
}

