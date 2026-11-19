/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098122c
 */

/* ix::ConnectionState::setRemotePort(int) */

void __thiscall ix::ConnectionState::setRemotePort(ConnectionState *this,int param_1)

{
  *(int *)(this + 0x78) = param_1;
  return;
}

