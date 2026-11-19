/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009811ec
 */

/* ix::ConnectionState::getRemotePort() */

undefined4 __thiscall ix::ConnectionState::getRemotePort(ConnectionState *this)

{
  return *(undefined4 *)(this + 0x78);
}

